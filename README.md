# Graphase
Create awesome and scalable GraphQL webservices just defining types :)

> Note: *A important step of this project of my CS graduate degree.*

## Goal
Create a powerful tool for develop easy GraphQL webservices.

### Steps
- [ ] Transform JavaScript/Typescript Model layer into GraphQL Type Schema. It is the project scope.
- [ ] Generate resolvers. It is a big problem.
- [ ] Creates a VCS of the generated GraphQL Schema.
- [ ] Easy deployment into production using Serverless framework or Heroku CLI.

## Important Concepts
### GraphQL (https://graphql.org/learn/)

GraphQL Documentation: https://graphql.org/
GraphQL Specification: https://graphql.github.io/graphql-spec/

> Note: *This project is based on June 2018 Edition Spec*.

GraphQL is a query language designed to build client applications by providing an intuitive and flexible syntax and system for describing their data requirements and interactions.

GraphQL is not a programming language capable of arbitrary computation, but is instead a language used to query application servers that have capabilities defined in this specification. GraphQL does not mandate a particular programming language or storage system for application servers that implement it. Instead, application servers take their capabilities and map them to a uniform language, type system, and philosophy that GraphQL encodes. This provides a unified interface friendly to product development and a powerful platform for tool‐building.

#### Operations
There are three types of operations that GraphQL models:
- query – a read‐only fetch.
- mutation – a write followed by a fetch.
- subscription – a long‐lived request that fetches data in response to source events.

Each operation is represented by an optional operation name and a selection set.

For example, this mutation operation might “like” a story and then retrieve the new number of likes:

```GraphQL
mutation {
  likeStory(storyID: 12345) {
    story {
      likeCount
    }
  }
}
```

#### Selection Sets
An operation selects the set of information it needs, and will receive exactly that information and nothing more, avoiding over‐fetching and under‐fetching data.

```GraphQL
{
  id
  firstName
  lastName
}
```

In this query, the id, firstName, and lastName fields form a selection set. Selection sets may also contain fragment references.

#### Fields
A selection set is primarily composed of fields. A field describes one discrete piece of information available to request within a selection set.

Some fields describe complex data or relationships to other data. In order to further explore this data, a field may itself contain a selection set, allowing for deeply nested requests. All GraphQL operations must specify their selections down to fields which return scalar values to ensure an unambiguously shaped response.

For example, this operation selects fields of complex data and relationships down to scalar values.

```GraphQL
{
  me {
    id
    firstName
    lastName
    birthday {
      month
      day
    }
    friends {
      name
    }
  }
}
```

Fields in the top‐level selection set of an operation often represent some information that is globally accessible to your application and its current viewer. Some typical examples of these top fields include references to a current logged‐in viewer, or accessing certain types of data referenced by a unique identifier.

### Arguments

Fields are conceptually functions which return values, and occasionally accept arguments which alter their behavior. These arguments often map directly to function arguments within a GraphQL server’s implementation.

In this example, we want to query a specific user (requested via the `id` argument) and their profile picture of a specific `size`:

```GraphQL
{
  user(id: 4) {
    id
    name
    profilePic(size: 100)
  }
}
```

Many arguments can exist for a given field:

```GraphQL
{
  user(id: 4) {
    id
    name
    profilePic(width: 100, height: 50)
  }
}
```

Arguments may be provided in any syntactic order and maintain identical semantic meaning.

These two queries are semantically identical:

```GraphQL
{
  picture(width: 200, height: 100)
}
```
```GraphQL
{
  picture(height: 100, width: 200)
}
```

#### Field Alias
By default, the key in the response object will use the field name queried. However, you can define a different name by specifying an alias.

In this example, we can fetch two profile pictures of different sizes and ensure the resulting object will not have duplicate keys:
```GraphQL
{
  user(id: 4) {
    id
    name
    smallPic: profilePic(size: 64)
    bigPic: profilePic(size: 1024)
  }
}
```

Which returns the result:
```GraphQL
{
  "user": {
    "id": 4,
    "name": "Mark Zuckerberg",
    "smallPic": "https://cdn.site.io/pic-4-64.jpg",
    "bigPic": "https://cdn.site.io/pic-4-1024.jpg"
  }
}
```

#### Fragments
Fragments are the primary unit of composition in GraphQL.

Fragments allow for the reuse of common repeated selections of fields, reducing duplicated text in the document. Inline Fragments can be used directly within a selection to condition upon a type condition when querying against an interface or union.

For example, if we wanted to fetch some common information about mutual friends as well as friends of some user:

```GraphQL
query noFragments {
  user(id: 4) {
    friends(first: 10) {
      id
      name
      profilePic(size: 50)
    }
    mutualFriends(first: 10) {
      id
      name
      profilePic(size: 50)
    }
  }
}
```

```GraphQL
query withFragments {
  user(id: 4) {
    friends(first: 10) {
      ...friendFields
    }
    mutualFriends(first: 10) {
      ...friendFields
    }
  }
}

fragment friendFields on User {
  id
  name
  profilePic(size: 50)
}
```

##### Type Conditions

Fragments must specify the type they apply to. In this example, `friendFields` can be used in the context of querying a `User`.

Fragments cannot be specified on any input value (scalar, enumeration, or input object).

Fragments can be specified on object types, interfaces, and unions.

Selections within fragments only return values when concrete type of the object it is operating on matches the type of the fragment.

For example in this query on the Facebook data model:

```GraphQL
query FragmentTyping {
  profiles(handles: ["zuck", "cocacola"]) {
    handle
    ...userFragment
    ...pageFragment
  }
}

fragment userFragment on User {
  friends {
    count
  }
}

fragment pageFragment on Page {
  likers {
    count
  }
}
```

It returns:

```GraphQL
{
  "profiles": [
    {
      "handle": "zuck",
      "friends": { "count" : 1234 }
    },
    {
      "handle": "cocacola",
      "likers": { "count" : 90234512 }
    }
  ]
}
```

#### Input Values

Field and directive arguments accept input values of various literal primitives; input values can be scalars, enumeration values, lists, or input objects.

If not defined as constant, input values can be specified as a variable. List and inputs objects may also contain variables (unless defined to be constant).

#### Variables

A GraphQL query can be parameterized with variables, maximizing query reuse, and avoiding costly string building in clients at runtime.

If not defined as constant, a *Variable* can be supplied for an input value.

Variables must be defined at the top of an operation and are in scope throughout the execution of that operation.

In this example, we want to fetch a profile picture size based on the size of a particular device:

```GraphQL
query getZuckProfile($devicePicSize: Int) {
  user(id: 4) {
    id
    name
    profilePic(size: $devicePicSize)
  }
}
```

Values for those variables are provided to a GraphQL service along with a request so they may be substituted during execution. If providing JSON for the variables’ values, we could run this query and request profilePic of size `60` width:

```GraphQL
{
  "devicePicSize": 60
}
```

#### Type References

GraphQL describes the types of data expected by query variables. Input types may be lists of another input type, or a non‐null variant of any other input type.

- *Name* - returns an object of a scalar/named type or null;

```GraphQL
type User { 
    id: ID
    mainStory: Story
}
```

- *Array* - returns an orray of a scalar/named type or null;

```GraphQL
type User { 
    stories: [Story]
}
```

- *NonNullable* - returns an object or array of a scalar/named type;

```GraphQL
type User { 
    id: ID!
}
```

#### Directives
Directives provide a way to describe alternate runtime execution and type validation behavior in a GraphQL document.

In some cases, you need to provide options to alter GraphQL’s execution behavior in ways field arguments will not suffice, such as conditionally including or skipping a field. Directives provide this by describing additional information to the executor.

Directives have a name along with a list of arguments which may accept values of any input type.

Directives can be used to describe additional information for types, fields, fragments and operations.

As future versions of GraphQL adopt new configurable execution capabilities, they may be exposed via directives.

### JavaScript and Typescript

## Example

```nodejs
@GraphQLType()
interface User {
    id: String;
    name: String;
}

@GraphQLType()
interface Story {
    id: String;
    likeCount: Number;
}

@GraphQLQueries()
interface UserQueries {
    allUsers(): [User];
    me(): User;
}

@GraphQLMutation()
interface StoryMutations {
    likeStory(storyID: Number): Story
}

@GraphQLMutations()
interface UserMutations {
    addUser(): User|void;
    removeUser(): boolean;
}
```

Generates

```GraphQL
type User {
    id: ID
    name: String
}

type Query {
    allUsers: [User]
    me: User
}

type Mutations {
    addUser: User
    removeUser: Bool
}
```

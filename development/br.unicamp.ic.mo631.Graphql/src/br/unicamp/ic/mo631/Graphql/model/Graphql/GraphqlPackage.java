/**
 */
package br.unicamp.ic.mo631.Graphql.model.Graphql;

import java.lang.String;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlFactory
 * @model kind="package"
 * @generated
 */
public interface GraphqlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Graphql";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/Graphql";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Graphql";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphqlPackage eINSTANCE = br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.TypeImpl
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.AttributeImpl
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ARRAY = 1;

	/**
	 * The feature id for the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_NULLABLE = 2;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.SchemaImpl
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 1;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.ScalarTypeImpl <em>Scalar Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.ScalarTypeImpl
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getScalarType()
	 * @generated
	 */
	int SCALAR_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_TYPE__ATTRIBUTE = TYPE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Scalar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scalar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.SystemTypeImpl <em>System Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.SystemTypeImpl
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getSystemType()
	 * @generated
	 */
	int SYSTEM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__ATTRIBUTE = TYPE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.IntImpl <em>Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.IntImpl
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getInt()
	 * @generated
	 */
	int INT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT__NAME = SCALAR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT__ATTRIBUTE = SCALAR_TYPE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION_COUNT = SCALAR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.FloatImpl
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__NAME = SCALAR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__ATTRIBUTE = SCALAR_TYPE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OPERATION_COUNT = SCALAR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.StringImpl
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getString()
	 * @generated
	 */
	int STRING = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__NAME = SCALAR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__ATTRIBUTE = SCALAR_TYPE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = SCALAR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.BooleanImpl
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__NAME = SCALAR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__ATTRIBUTE = SCALAR_TYPE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = SCALAR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.IDImpl <em>ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.IDImpl
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getID()
	 * @generated
	 */
	int ID = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__NAME = SCALAR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__ATTRIBUTE = SCALAR_TYPE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = SCALAR_TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.EnumImpl
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ATTRIBUTE = TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Enumvalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ENUMVALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.EnumValueImpl
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Type#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Type#getAttribute()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Attribute();

	/**
	 * Returns the meta object for class '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Attribute#isIsArray <em>Is Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Array</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Attribute#isIsArray()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsArray();

	/**
	 * Returns the meta object for the attribute '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Attribute#isIsNullable <em>Is Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nullable</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Attribute#isIsNullable()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsNullable();

	/**
	 * Returns the meta object for the attribute '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Attribute#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Attribute#getTypeName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_TypeName();

	/**
	 * Returns the meta object for class '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Schema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Schema#getType()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Type();

	/**
	 * Returns the meta object for the attribute '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for class '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.ScalarType <em>Scalar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Type</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.ScalarType
	 * @generated
	 */
	EClass getScalarType();

	/**
	 * Returns the meta object for class '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Type</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.SystemType
	 * @generated
	 */
	EClass getSystemType();

	/**
	 * Returns the meta object for class '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Int
	 * @generated
	 */
	EClass getInt();

	/**
	 * Returns the meta object for class '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for class '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.ID
	 * @generated
	 */
	EClass getID();

	/**
	 * Returns the meta object for class '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Enum#getEnumvalue <em>Enumvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumvalue</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.Enum#getEnumvalue()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Enumvalue();

	/**
	 * Returns the meta object for class '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.EnumValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.EnumValue#getValue()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.EnumValue#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.EnumValue#getNumber()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Number();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphqlFactory getGraphqlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.TypeImpl
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__ATTRIBUTE = eINSTANCE.getType_Attribute();

		/**
		 * The meta object literal for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.AttributeImpl
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_ARRAY = eINSTANCE.getAttribute_IsArray();

		/**
		 * The meta object literal for the '<em><b>Is Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_NULLABLE = eINSTANCE.getAttribute_IsNullable();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE_NAME = eINSTANCE.getAttribute_TypeName();

		/**
		 * The meta object literal for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.SchemaImpl
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__TYPE = eINSTANCE.getSchema_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.ScalarTypeImpl <em>Scalar Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.ScalarTypeImpl
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getScalarType()
		 * @generated
		 */
		EClass SCALAR_TYPE = eINSTANCE.getScalarType();

		/**
		 * The meta object literal for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.SystemTypeImpl <em>System Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.SystemTypeImpl
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getSystemType()
		 * @generated
		 */
		EClass SYSTEM_TYPE = eINSTANCE.getSystemType();

		/**
		 * The meta object literal for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.IntImpl <em>Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.IntImpl
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getInt()
		 * @generated
		 */
		EClass INT = eINSTANCE.getInt();

		/**
		 * The meta object literal for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.FloatImpl
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.StringImpl
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.BooleanImpl
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.IDImpl <em>ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.IDImpl
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getID()
		 * @generated
		 */
		EClass ID = eINSTANCE.getID();

		/**
		 * The meta object literal for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.EnumImpl
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Enumvalue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__ENUMVALUE = eINSTANCE.getEnum_Enumvalue();

		/**
		 * The meta object literal for the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.EnumValueImpl
		 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.impl.GraphqlPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__VALUE = eINSTANCE.getEnumValue_Value();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__NUMBER = eINSTANCE.getEnumValue_Number();

	}

} //GraphqlPackage

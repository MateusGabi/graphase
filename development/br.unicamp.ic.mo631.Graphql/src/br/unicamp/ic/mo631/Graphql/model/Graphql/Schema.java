/**
 */
package br.unicamp.ic.mo631.Graphql.model.Graphql;

import java.lang.String;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Schema#getType <em>Type</em>}</li>
 *   <li>{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Schema#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link br.unicamp.ic.mo631.Graphql.model.Graphql.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlPackage#getSchema_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Type> getType();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlPackage#getSchema_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Schema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Schema

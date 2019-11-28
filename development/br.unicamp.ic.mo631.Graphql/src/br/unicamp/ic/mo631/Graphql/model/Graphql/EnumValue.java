/**
 */
package br.unicamp.ic.mo631.Graphql.model.Graphql;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unicamp.ic.mo631.Graphql.model.Graphql.EnumValue#getValue <em>Value</em>}</li>
 *   <li>{@link br.unicamp.ic.mo631.Graphql.model.Graphql.EnumValue#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlPackage#getEnumValue()
 * @model
 * @generated
 */
public interface EnumValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlPackage#getEnumValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.EnumValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlPackage#getEnumValue_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link br.unicamp.ic.mo631.Graphql.model.Graphql.EnumValue#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

} // EnumValue

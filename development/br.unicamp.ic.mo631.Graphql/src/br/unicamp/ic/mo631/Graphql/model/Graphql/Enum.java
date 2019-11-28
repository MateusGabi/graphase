/**
 */
package br.unicamp.ic.mo631.Graphql.model.Graphql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unicamp.ic.mo631.Graphql.model.Graphql.Enum#getEnumvalue <em>Enumvalue</em>}</li>
 * </ul>
 *
 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends Type {
	/**
	 * Returns the value of the '<em><b>Enumvalue</b></em>' containment reference list.
	 * The list contents are of type {@link br.unicamp.ic.mo631.Graphql.model.Graphql.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumvalue</em>' containment reference list.
	 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlPackage#getEnum_Enumvalue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnumValue> getEnumvalue();

} // Enum

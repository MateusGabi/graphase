/**
 */
package br.unicamp.ic.mo631.Graphql.model.Graphql.impl;

import br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlPackage;
import br.unicamp.ic.mo631.Graphql.model.Graphql.ScalarType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scalar Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ScalarTypeImpl extends TypeImpl implements ScalarType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalarTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphqlPackage.Literals.SCALAR_TYPE;
	}

} //ScalarTypeImpl

/**
 */
package br.unicamp.ic.mo631.Graphql.model.Graphql.impl;

import br.unicamp.ic.mo631.Graphql.model.Graphql.EnumValue;
import br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.unicamp.ic.mo631.Graphql.model.Graphql.impl.EnumImpl#getEnumvalue <em>Enumvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumImpl extends TypeImpl implements br.unicamp.ic.mo631.Graphql.model.Graphql.Enum {
	/**
	 * The cached value of the '{@link #getEnumvalue() <em>Enumvalue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumvalue()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumValue> enumvalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphqlPackage.Literals.ENUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumValue> getEnumvalue() {
		if (enumvalue == null) {
			enumvalue = new EObjectContainmentEList<EnumValue>(EnumValue.class, this, GraphqlPackage.ENUM__ENUMVALUE);
		}
		return enumvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphqlPackage.ENUM__ENUMVALUE:
				return ((InternalEList<?>)getEnumvalue()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphqlPackage.ENUM__ENUMVALUE:
				return getEnumvalue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphqlPackage.ENUM__ENUMVALUE:
				getEnumvalue().clear();
				getEnumvalue().addAll((Collection<? extends EnumValue>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphqlPackage.ENUM__ENUMVALUE:
				getEnumvalue().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphqlPackage.ENUM__ENUMVALUE:
				return enumvalue != null && !enumvalue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumImpl

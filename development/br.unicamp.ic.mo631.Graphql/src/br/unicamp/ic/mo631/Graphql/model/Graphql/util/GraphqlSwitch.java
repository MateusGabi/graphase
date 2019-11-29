/**
 */
package br.unicamp.ic.mo631.Graphql.model.Graphql.util;

import br.unicamp.ic.mo631.Graphql.model.Graphql.Attribute;
import br.unicamp.ic.mo631.Graphql.model.Graphql.EnumValue;
import br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlPackage;
import br.unicamp.ic.mo631.Graphql.model.Graphql.ID;
import br.unicamp.ic.mo631.Graphql.model.Graphql.Int;
import br.unicamp.ic.mo631.Graphql.model.Graphql.ScalarType;
import br.unicamp.ic.mo631.Graphql.model.Graphql.Schema;
import br.unicamp.ic.mo631.Graphql.model.Graphql.SystemType;
import br.unicamp.ic.mo631.Graphql.model.Graphql.Type;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlPackage
 * @generated
 */
public class GraphqlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraphqlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphqlSwitch() {
		if (modelPackage == null) {
			modelPackage = GraphqlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GraphqlPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphqlPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphqlPackage.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphqlPackage.SCALAR_TYPE: {
				ScalarType scalarType = (ScalarType)theEObject;
				T result = caseScalarType(scalarType);
				if (result == null) result = caseType(scalarType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphqlPackage.SYSTEM_TYPE: {
				SystemType systemType = (SystemType)theEObject;
				T result = caseSystemType(systemType);
				if (result == null) result = caseType(systemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphqlPackage.INT: {
				Int int_ = (Int)theEObject;
				T result = caseInt(int_);
				if (result == null) result = caseScalarType(int_);
				if (result == null) result = caseType(int_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphqlPackage.FLOAT: {
				br.unicamp.ic.mo631.Graphql.model.Graphql.Float float_ = (br.unicamp.ic.mo631.Graphql.model.Graphql.Float)theEObject;
				T result = caseFloat(float_);
				if (result == null) result = caseScalarType(float_);
				if (result == null) result = caseType(float_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphqlPackage.STRING: {
				br.unicamp.ic.mo631.Graphql.model.Graphql.String string = (br.unicamp.ic.mo631.Graphql.model.Graphql.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseScalarType(string);
				if (result == null) result = caseType(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphqlPackage.BOOLEAN: {
				br.unicamp.ic.mo631.Graphql.model.Graphql.Boolean boolean_ = (br.unicamp.ic.mo631.Graphql.model.Graphql.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseScalarType(boolean_);
				if (result == null) result = caseType(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphqlPackage.ID: {
				ID id = (ID)theEObject;
				T result = caseID(id);
				if (result == null) result = caseScalarType(id);
				if (result == null) result = caseType(id);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphqlPackage.ENUM: {
				br.unicamp.ic.mo631.Graphql.model.Graphql.Enum enum_ = (br.unicamp.ic.mo631.Graphql.model.Graphql.Enum)theEObject;
				T result = caseEnum(enum_);
				if (result == null) result = caseType(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphqlPackage.ENUM_VALUE: {
				EnumValue enumValue = (EnumValue)theEObject;
				T result = caseEnumValue(enumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarType(ScalarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemType(SystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInt(Int object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat(br.unicamp.ic.mo631.Graphql.model.Graphql.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(br.unicamp.ic.mo631.Graphql.model.Graphql.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(br.unicamp.ic.mo631.Graphql.model.Graphql.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID(ID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(br.unicamp.ic.mo631.Graphql.model.Graphql.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumValue(EnumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GraphqlSwitch

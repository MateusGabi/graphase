/**
 */
package br.unicamp.ic.mo631.Graphql.model.Graphql.tests;

import br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlFactory;
import br.unicamp.ic.mo631.Graphql.model.Graphql.SystemType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemTypeTest extends TypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemTypeTest.class);
	}

	/**
	 * Constructs a new System Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemType getFixture() {
		return (SystemType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphqlFactory.eINSTANCE.createSystemType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SystemTypeTest

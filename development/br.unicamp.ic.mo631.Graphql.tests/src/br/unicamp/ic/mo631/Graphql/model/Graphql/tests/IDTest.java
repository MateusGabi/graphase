/**
 */
package br.unicamp.ic.mo631.Graphql.model.Graphql.tests;

import br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlFactory;
import br.unicamp.ic.mo631.Graphql.model.Graphql.ID;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ID</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IDTest extends ScalarTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IDTest.class);
	}

	/**
	 * Constructs a new ID test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ID test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ID getFixture() {
		return (ID)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphqlFactory.eINSTANCE.createID());
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

} //IDTest

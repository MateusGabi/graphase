/**
 */
package br.unicamp.ic.mo631.Graphql.model.Graphql.tests;

import br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Float</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FloatTest extends ScalarTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FloatTest.class);
	}

	/**
	 * Constructs a new Float test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Float test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected br.unicamp.ic.mo631.Graphql.model.Graphql.Float getFixture() {
		return (br.unicamp.ic.mo631.Graphql.model.Graphql.Float)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphqlFactory.eINSTANCE.createFloat());
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

} //FloatTest

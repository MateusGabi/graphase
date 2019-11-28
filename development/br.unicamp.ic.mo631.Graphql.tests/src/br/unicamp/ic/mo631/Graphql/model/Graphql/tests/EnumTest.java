/**
 */
package br.unicamp.ic.mo631.Graphql.model.Graphql.tests;

import br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumTest extends TypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumTest.class);
	}

	/**
	 * Constructs a new Enum test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Enum test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected br.unicamp.ic.mo631.Graphql.model.Graphql.Enum getFixture() {
		return (br.unicamp.ic.mo631.Graphql.model.Graphql.Enum)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphqlFactory.eINSTANCE.createEnum());
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

} //EnumTest

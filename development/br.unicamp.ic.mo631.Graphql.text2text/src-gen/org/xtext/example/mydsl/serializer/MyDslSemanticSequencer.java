/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.serializer;

import br.unicamp.ic.mo631.Graphql.model.Graphql.Attribute;
import br.unicamp.ic.mo631.Graphql.model.Graphql.EnumValue;
import br.unicamp.ic.mo631.Graphql.model.Graphql.GraphqlPackage;
import br.unicamp.ic.mo631.Graphql.model.Graphql.Schema;
import br.unicamp.ic.mo631.Graphql.model.Graphql.SystemType;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GraphqlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GraphqlPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case GraphqlPackage.ENUM:
				sequence_Enum(context, (br.unicamp.ic.mo631.Graphql.model.Graphql.Enum) semanticObject); 
				return; 
			case GraphqlPackage.ENUM_VALUE:
				sequence_EnumValue(context, (EnumValue) semanticObject); 
				return; 
			case GraphqlPackage.SCHEMA:
				sequence_Schema(context, (Schema) semanticObject); 
				return; 
			case GraphqlPackage.SYSTEM_TYPE:
				sequence_SystemType(context, (SystemType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (
	 *         (name=EString typeName=EString isNullable?='!') | 
	 *         (name=EString typeName=EString isArray?=' @list') | 
	 *         (name=EString typeName=EString isArray?=']' isNullable?='!') | 
	 *         (name=EString typeName=EString)
	 *     )
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumValue returns EnumValue
	 *
	 * Constraint:
	 *     (value=EString? number=Int1?)
	 */
	protected void sequence_EnumValue(ISerializationContext context, EnumValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Enum
	 *     Enum returns Enum
	 *
	 * Constraint:
	 *     (name=EString attribute+=Attribute attribute+=Attribute* enumvalue+=EnumValue enumvalue+=EnumValue*)
	 */
	protected void sequence_Enum(ISerializationContext context, br.unicamp.ic.mo631.Graphql.model.Graphql.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Schema returns Schema
	 *
	 * Constraint:
	 *     (name=EString type+=Type type+=Type*)
	 */
	protected void sequence_Schema(ISerializationContext context, Schema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns SystemType
	 *     SystemType returns SystemType
	 *
	 * Constraint:
	 *     (name=EString+ attribute+=Attribute attribute+=Attribute*)
	 */
	protected void sequence_SystemType(ISerializationContext context, SystemType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

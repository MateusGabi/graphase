/*
 * generated by Xtext 2.19.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleSchema
entryRuleSchema
:
{ before(grammarAccess.getSchemaRule()); }
	 ruleSchema
{ after(grammarAccess.getSchemaRule()); } 
	 EOF 
;

// Rule Schema
ruleSchema 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSchemaAccess().getGroup()); }
		(rule__Schema__Group__0)
		{ after(grammarAccess.getSchemaAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getGroup()); }
		(rule__Attribute__Group__0)
		{ after(grammarAccess.getAttributeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSystemType
entryRuleSystemType
:
{ before(grammarAccess.getSystemTypeRule()); }
	 ruleSystemType
{ after(grammarAccess.getSystemTypeRule()); } 
	 EOF 
;

// Rule SystemType
ruleSystemType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSystemTypeAccess().getGroup()); }
		(rule__SystemType__Group__0)
		{ after(grammarAccess.getSystemTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInt0
entryRuleInt0
:
{ before(grammarAccess.getInt0Rule()); }
	 ruleInt0
{ after(grammarAccess.getInt0Rule()); } 
	 EOF 
;

// Rule Int0
ruleInt0 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInt0Access().getIntKeyword()); }
		'Int'
		{ after(grammarAccess.getInt0Access().getIntKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFloat
entryRuleFloat
:
{ before(grammarAccess.getFloatRule()); }
	 ruleFloat
{ after(grammarAccess.getFloatRule()); } 
	 EOF 
;

// Rule Float
ruleFloat 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFloatAccess().getFloatKeyword()); }
		'Float'
		{ after(grammarAccess.getFloatAccess().getFloatKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleString0
entryRuleString0
:
{ before(grammarAccess.getString0Rule()); }
	 ruleString0
{ after(grammarAccess.getString0Rule()); } 
	 EOF 
;

// Rule String0
ruleString0 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getString0Access().getStringKeyword()); }
		'String'
		{ after(grammarAccess.getString0Access().getStringKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBoolean
entryRuleBoolean
:
{ before(grammarAccess.getBooleanRule()); }
	 ruleBoolean
{ after(grammarAccess.getBooleanRule()); } 
	 EOF 
;

// Rule Boolean
ruleBoolean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanAccess().getBooleanKeyword()); }
		'Boolean'
		{ after(grammarAccess.getBooleanAccess().getBooleanKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleID0
entryRuleID0
:
{ before(grammarAccess.getID0Rule()); }
	 ruleID0
{ after(grammarAccess.getID0Rule()); } 
	 EOF 
;

// Rule ID0
ruleID0 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getID0Access().getIDKeyword()); }
		'ID'
		{ after(grammarAccess.getID0Access().getIDKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnum
entryRuleEnum
:
{ before(grammarAccess.getEnumRule()); }
	 ruleEnum
{ after(grammarAccess.getEnumRule()); } 
	 EOF 
;

// Rule Enum
ruleEnum 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumAccess().getGroup()); }
		(rule__Enum__Group__0)
		{ after(grammarAccess.getEnumAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumValue
entryRuleEnumValue
:
{ before(grammarAccess.getEnumValueRule()); }
	 ruleEnumValue
{ after(grammarAccess.getEnumValueRule()); } 
	 EOF 
;

// Rule EnumValue
ruleEnumValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumValueAccess().getGroup()); }
		(rule__EnumValue__Group__0)
		{ after(grammarAccess.getEnumValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInt1
entryRuleInt1
:
{ before(grammarAccess.getInt1Rule()); }
	 ruleInt1
{ after(grammarAccess.getInt1Rule()); } 
	 EOF 
;

// Rule Int1
ruleInt1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInt1Access().getIntKeyword()); }
		'Int'
		{ after(grammarAccess.getInt1Access().getIntKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getSystemTypeParserRuleCall_0()); }
		ruleSystemType
		{ after(grammarAccess.getTypeAccess().getSystemTypeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getInt0ParserRuleCall_1()); }
		ruleInt0
		{ after(grammarAccess.getTypeAccess().getInt0ParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getFloatParserRuleCall_2()); }
		ruleFloat
		{ after(grammarAccess.getTypeAccess().getFloatParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getString0ParserRuleCall_3()); }
		ruleString0
		{ after(grammarAccess.getTypeAccess().getString0ParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getBooleanParserRuleCall_4()); }
		ruleBoolean
		{ after(grammarAccess.getTypeAccess().getBooleanParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getID0ParserRuleCall_5()); }
		ruleID0
		{ after(grammarAccess.getTypeAccess().getID0ParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getEnumParserRuleCall_6()); }
		ruleEnum
		{ after(grammarAccess.getTypeAccess().getEnumParserRuleCall_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Schema__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Schema__Group__0__Impl
	rule__Schema__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Schema__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchemaAccess().getSchemaKeyword_0()); }
	'Schema {'
	{ after(grammarAccess.getSchemaAccess().getSchemaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Schema__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Schema__Group__1__Impl
	rule__Schema__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Schema__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchemaAccess().getNameKeyword_1()); }
	'name:'
	{ after(grammarAccess.getSchemaAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Schema__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Schema__Group__2__Impl
	rule__Schema__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Schema__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchemaAccess().getNameAssignment_2()); }
	(rule__Schema__NameAssignment_2)
	{ after(grammarAccess.getSchemaAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Schema__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Schema__Group__3__Impl
	rule__Schema__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Schema__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Schema__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Schema__Group__4__Impl
	rule__Schema__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Schema__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchemaAccess().getTypeAssignment_4()); }
	(rule__Schema__TypeAssignment_4)
	{ after(grammarAccess.getSchemaAccess().getTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Schema__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Schema__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Schema__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchemaAccess().getTypeAssignment_5()); }
	(rule__Schema__TypeAssignment_5)*
	{ after(grammarAccess.getSchemaAccess().getTypeAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getNameAssignment_0()); }
	(rule__Attribute__NameAssignment_0)
	{ after(grammarAccess.getAttributeAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getAttributeAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getTypeNameAssignment_2()); }
	(rule__Attribute__TypeNameAssignment_2)
	{ after(grammarAccess.getAttributeAccess().getTypeNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SystemType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemType__Group__0__Impl
	rule__SystemType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSystemTypeAccess().getTypeKeyword_0()); }
		('type ')
		{ after(grammarAccess.getSystemTypeAccess().getTypeKeyword_0()); }
	)
	(
		{ before(grammarAccess.getSystemTypeAccess().getTypeKeyword_0()); }
		('type ')*
		{ after(grammarAccess.getSystemTypeAccess().getTypeKeyword_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemType__Group__1__Impl
	rule__SystemType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSystemTypeAccess().getNameAssignment_1()); }
		(rule__SystemType__NameAssignment_1)
		{ after(grammarAccess.getSystemTypeAccess().getNameAssignment_1()); }
	)
	(
		{ before(grammarAccess.getSystemTypeAccess().getNameAssignment_1()); }
		(rule__SystemType__NameAssignment_1)*
		{ after(grammarAccess.getSystemTypeAccess().getNameAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemType__Group__2__Impl
	rule__SystemType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemTypeAccess().getSpaceLeftCurlyBracketKeyword_2()); }
	' {'
	{ after(grammarAccess.getSystemTypeAccess().getSpaceLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemType__Group__3__Impl
	rule__SystemType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemTypeAccess().getAttributeAssignment_3()); }
	(rule__SystemType__AttributeAssignment_3)
	{ after(grammarAccess.getSystemTypeAccess().getAttributeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemType__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemType__Group__4__Impl
	rule__SystemType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemType__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemTypeAccess().getAttributeAssignment_4()); }
	(rule__SystemType__AttributeAssignment_4)*
	{ after(grammarAccess.getSystemTypeAccess().getAttributeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemType__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemType__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemType__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemTypeAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getSystemTypeAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Enum__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__0__Impl
	rule__Enum__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getEnumKeyword_0()); }
	'Enum'
	{ after(grammarAccess.getEnumAccess().getEnumKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__1__Impl
	rule__Enum__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getNameAssignment_1()); }
	(rule__Enum__NameAssignment_1)
	{ after(grammarAccess.getEnumAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__2__Impl
	rule__Enum__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__3__Impl
	rule__Enum__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getAttributeKeyword_3()); }
	'attribute'
	{ after(grammarAccess.getEnumAccess().getAttributeKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__4__Impl
	rule__Enum__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__5__Impl
	rule__Enum__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getAttributeAssignment_5()); }
	(rule__Enum__AttributeAssignment_5)
	{ after(grammarAccess.getEnumAccess().getAttributeAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__6__Impl
	rule__Enum__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getGroup_6()); }
	(rule__Enum__Group_6__0)*
	{ after(grammarAccess.getEnumAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__7__Impl
	rule__Enum__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__8__Impl
	rule__Enum__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getEnumvalueKeyword_8()); }
	'enumvalue'
	{ after(grammarAccess.getEnumAccess().getEnumvalueKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__9__Impl
	rule__Enum__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_9()); }
	'{'
	{ after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__10__Impl
	rule__Enum__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getEnumvalueAssignment_10()); }
	(rule__Enum__EnumvalueAssignment_10)
	{ after(grammarAccess.getEnumAccess().getEnumvalueAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__11__Impl
	rule__Enum__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getGroup_11()); }
	(rule__Enum__Group_11__0)*
	{ after(grammarAccess.getEnumAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__12__Impl
	rule__Enum__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_12()); }
	'}'
	{ after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_13()); }
	'}'
	{ after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Enum__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group_6__0__Impl
	rule__Enum__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getCommaKeyword_6_0()); }
	','
	{ after(grammarAccess.getEnumAccess().getCommaKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getAttributeAssignment_6_1()); }
	(rule__Enum__AttributeAssignment_6_1)
	{ after(grammarAccess.getEnumAccess().getAttributeAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Enum__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group_11__0__Impl
	rule__Enum__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getCommaKeyword_11_0()); }
	','
	{ after(grammarAccess.getEnumAccess().getCommaKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group_11__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getEnumvalueAssignment_11_1()); }
	(rule__Enum__EnumvalueAssignment_11_1)
	{ after(grammarAccess.getEnumAccess().getEnumvalueAssignment_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumValue__Group__0__Impl
	rule__EnumValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumValueAccess().getEnumValueAction_0()); }
	()
	{ after(grammarAccess.getEnumValueAccess().getEnumValueAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumValue__Group__1__Impl
	rule__EnumValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumValueAccess().getEnumValueKeyword_1()); }
	'EnumValue'
	{ after(grammarAccess.getEnumValueAccess().getEnumValueKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumValue__Group__2__Impl
	rule__EnumValue__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumValueAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getEnumValueAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumValue__Group__3__Impl
	rule__EnumValue__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumValueAccess().getGroup_3()); }
	(rule__EnumValue__Group_3__0)?
	{ after(grammarAccess.getEnumValueAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumValue__Group__4__Impl
	rule__EnumValue__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumValueAccess().getGroup_4()); }
	(rule__EnumValue__Group_4__0)?
	{ after(grammarAccess.getEnumValueAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumValue__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumValueAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getEnumValueAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumValue__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumValue__Group_3__0__Impl
	rule__EnumValue__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumValueAccess().getValueKeyword_3_0()); }
	'value'
	{ after(grammarAccess.getEnumValueAccess().getValueKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumValue__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumValueAccess().getValueAssignment_3_1()); }
	(rule__EnumValue__ValueAssignment_3_1)
	{ after(grammarAccess.getEnumValueAccess().getValueAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumValue__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumValue__Group_4__0__Impl
	rule__EnumValue__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumValueAccess().getNumberKeyword_4_0()); }
	'number'
	{ after(grammarAccess.getEnumValueAccess().getNumberKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumValue__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumValueAccess().getNumberAssignment_4_1()); }
	(rule__EnumValue__NumberAssignment_4_1)
	{ after(grammarAccess.getEnumValueAccess().getNumberAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Schema__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSchemaAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getSchemaAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Schema__TypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSchemaAccess().getTypeTypeParserRuleCall_4_0()); }
		ruleType
		{ after(grammarAccess.getSchemaAccess().getTypeTypeParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Schema__TypeAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSchemaAccess().getTypeTypeParserRuleCall_5_0()); }
		ruleType
		{ after(grammarAccess.getSchemaAccess().getTypeTypeParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0()); }
		ruleEString
		{ after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__TypeNameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getTypeNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getAttributeAccess().getTypeNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemType__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSystemTypeAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getSystemTypeAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemType__AttributeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSystemTypeAccess().getAttributeAttributeParserRuleCall_3_0()); }
		ruleAttribute
		{ after(grammarAccess.getSystemTypeAccess().getAttributeAttributeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemType__AttributeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSystemTypeAccess().getAttributeAttributeParserRuleCall_4_0()); }
		ruleAttribute
		{ after(grammarAccess.getSystemTypeAccess().getAttributeAttributeParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getEnumAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__AttributeAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumAccess().getAttributeAttributeParserRuleCall_5_0()); }
		ruleAttribute
		{ after(grammarAccess.getEnumAccess().getAttributeAttributeParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__AttributeAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumAccess().getAttributeAttributeParserRuleCall_6_1_0()); }
		ruleAttribute
		{ after(grammarAccess.getEnumAccess().getAttributeAttributeParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__EnumvalueAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumAccess().getEnumvalueEnumValueParserRuleCall_10_0()); }
		ruleEnumValue
		{ after(grammarAccess.getEnumAccess().getEnumvalueEnumValueParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__EnumvalueAssignment_11_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumAccess().getEnumvalueEnumValueParserRuleCall_11_1_0()); }
		ruleEnumValue
		{ after(grammarAccess.getEnumAccess().getEnumvalueEnumValueParserRuleCall_11_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__ValueAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumValueAccess().getValueEStringParserRuleCall_3_1_0()); }
		ruleEString
		{ after(grammarAccess.getEnumValueAccess().getValueEStringParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValue__NumberAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumValueAccess().getNumberInt1ParserRuleCall_4_1_0()); }
		ruleInt1
		{ after(grammarAccess.getEnumValueAccess().getNumberInt1ParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

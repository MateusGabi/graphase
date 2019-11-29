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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Int'", "'Float'", "'String'", "'Boolean'", "'ID'", "'Schema {'", "'name:'", "'}'", "':'", "'type '", "' {'", "'Enum'", "'{'", "'attribute'", "'enumvalue'", "','", "'EnumValue'", "'value'", "'number'", "'!'", "']'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


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



    // $ANTLR start "entryRuleSchema"
    // InternalMyDsl.g:53:1: entryRuleSchema : ruleSchema EOF ;
    public final void entryRuleSchema() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleSchema EOF )
            // InternalMyDsl.g:55:1: ruleSchema EOF
            {
             before(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getSchemaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalMyDsl.g:62:1: ruleSchema : ( ( rule__Schema__Group__0 ) ) ;
    public final void ruleSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Schema__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Schema__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Schema__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Schema__Group__0 )
            {
             before(grammarAccess.getSchemaAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Schema__Group__0 )
            // InternalMyDsl.g:69:4: rule__Schema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleType EOF )
            // InternalMyDsl.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleEString EOF )
            // InternalMyDsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAttribute EOF )
            // InternalMyDsl.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:137:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Attribute__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Attribute__Alternatives )
            // InternalMyDsl.g:144:4: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleSystemType"
    // InternalMyDsl.g:153:1: entryRuleSystemType : ruleSystemType EOF ;
    public final void entryRuleSystemType() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleSystemType EOF )
            // InternalMyDsl.g:155:1: ruleSystemType EOF
            {
             before(grammarAccess.getSystemTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemType();

            state._fsp--;

             after(grammarAccess.getSystemTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemType"


    // $ANTLR start "ruleSystemType"
    // InternalMyDsl.g:162:1: ruleSystemType : ( ( rule__SystemType__Group__0 ) ) ;
    public final void ruleSystemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__SystemType__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__SystemType__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__SystemType__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__SystemType__Group__0 )
            {
             before(grammarAccess.getSystemTypeAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__SystemType__Group__0 )
            // InternalMyDsl.g:169:4: rule__SystemType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemType"


    // $ANTLR start "entryRuleInt0"
    // InternalMyDsl.g:178:1: entryRuleInt0 : ruleInt0 EOF ;
    public final void entryRuleInt0() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleInt0 EOF )
            // InternalMyDsl.g:180:1: ruleInt0 EOF
            {
             before(grammarAccess.getInt0Rule()); 
            pushFollow(FOLLOW_1);
            ruleInt0();

            state._fsp--;

             after(grammarAccess.getInt0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // InternalMyDsl.g:187:1: ruleInt0 : ( 'Int' ) ;
    public final void ruleInt0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( 'Int' ) )
            // InternalMyDsl.g:192:2: ( 'Int' )
            {
            // InternalMyDsl.g:192:2: ( 'Int' )
            // InternalMyDsl.g:193:3: 'Int'
            {
             before(grammarAccess.getInt0Access().getIntKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getInt0Access().getIntKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleFloat"
    // InternalMyDsl.g:203:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleFloat EOF )
            // InternalMyDsl.g:205:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalMyDsl.g:212:1: ruleFloat : ( 'Float' ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( 'Float' ) )
            // InternalMyDsl.g:217:2: ( 'Float' )
            {
            // InternalMyDsl.g:217:2: ( 'Float' )
            // InternalMyDsl.g:218:3: 'Float'
            {
             before(grammarAccess.getFloatAccess().getFloatKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getFloatKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleString0"
    // InternalMyDsl.g:228:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleString0 EOF )
            // InternalMyDsl.g:230:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalMyDsl.g:237:1: ruleString0 : ( 'String' ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( 'String' ) )
            // InternalMyDsl.g:242:2: ( 'String' )
            {
            // InternalMyDsl.g:242:2: ( 'String' )
            // InternalMyDsl.g:243:3: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getString0Access().getStringKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleBoolean"
    // InternalMyDsl.g:253:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleBoolean EOF )
            // InternalMyDsl.g:255:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalMyDsl.g:262:1: ruleBoolean : ( 'Boolean' ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( 'Boolean' ) )
            // InternalMyDsl.g:267:2: ( 'Boolean' )
            {
            // InternalMyDsl.g:267:2: ( 'Boolean' )
            // InternalMyDsl.g:268:3: 'Boolean'
            {
             before(grammarAccess.getBooleanAccess().getBooleanKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBooleanAccess().getBooleanKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleID0"
    // InternalMyDsl.g:278:1: entryRuleID0 : ruleID0 EOF ;
    public final void entryRuleID0() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleID0 EOF )
            // InternalMyDsl.g:280:1: ruleID0 EOF
            {
             before(grammarAccess.getID0Rule()); 
            pushFollow(FOLLOW_1);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getID0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleID0"


    // $ANTLR start "ruleID0"
    // InternalMyDsl.g:287:1: ruleID0 : ( 'ID' ) ;
    public final void ruleID0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( 'ID' ) )
            // InternalMyDsl.g:292:2: ( 'ID' )
            {
            // InternalMyDsl.g:292:2: ( 'ID' )
            // InternalMyDsl.g:293:3: 'ID'
            {
             before(grammarAccess.getID0Access().getIDKeyword()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getID0Access().getIDKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleID0"


    // $ANTLR start "entryRuleEnum"
    // InternalMyDsl.g:303:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleEnum EOF )
            // InternalMyDsl.g:305:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalMyDsl.g:312:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Enum__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Enum__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Enum__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Enum__Group__0 )
            // InternalMyDsl.g:319:4: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumValue"
    // InternalMyDsl.g:328:1: entryRuleEnumValue : ruleEnumValue EOF ;
    public final void entryRuleEnumValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleEnumValue EOF )
            // InternalMyDsl.g:330:1: ruleEnumValue EOF
            {
             before(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getEnumValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalMyDsl.g:337:1: ruleEnumValue : ( ( rule__EnumValue__Group__0 ) ) ;
    public final void ruleEnumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__EnumValue__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__EnumValue__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__EnumValue__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__EnumValue__Group__0 )
            {
             before(grammarAccess.getEnumValueAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__EnumValue__Group__0 )
            // InternalMyDsl.g:344:4: rule__EnumValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleInt1"
    // InternalMyDsl.g:353:1: entryRuleInt1 : ruleInt1 EOF ;
    public final void entryRuleInt1() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleInt1 EOF )
            // InternalMyDsl.g:355:1: ruleInt1 EOF
            {
             before(grammarAccess.getInt1Rule()); 
            pushFollow(FOLLOW_1);
            ruleInt1();

            state._fsp--;

             after(grammarAccess.getInt1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInt1"


    // $ANTLR start "ruleInt1"
    // InternalMyDsl.g:362:1: ruleInt1 : ( 'Int' ) ;
    public final void ruleInt1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( 'Int' ) )
            // InternalMyDsl.g:367:2: ( 'Int' )
            {
            // InternalMyDsl.g:367:2: ( 'Int' )
            // InternalMyDsl.g:368:3: 'Int'
            {
             before(grammarAccess.getInt1Access().getIntKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getInt1Access().getIntKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInt1"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:377:1: rule__Type__Alternatives : ( ( ruleSystemType ) | ( ruleInt0 ) | ( ruleFloat ) | ( ruleString0 ) | ( ruleBoolean ) | ( ruleID0 ) | ( ruleEnum ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:381:1: ( ( ruleSystemType ) | ( ruleInt0 ) | ( ruleFloat ) | ( ruleString0 ) | ( ruleBoolean ) | ( ruleID0 ) | ( ruleEnum ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 11:
                {
                alt1=2;
                }
                break;
            case 12:
                {
                alt1=3;
                }
                break;
            case 13:
                {
                alt1=4;
                }
                break;
            case 14:
                {
                alt1=5;
                }
                break;
            case 15:
                {
                alt1=6;
                }
                break;
            case 22:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:382:2: ( ruleSystemType )
                    {
                    // InternalMyDsl.g:382:2: ( ruleSystemType )
                    // InternalMyDsl.g:383:3: ruleSystemType
                    {
                     before(grammarAccess.getTypeAccess().getSystemTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSystemTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:388:2: ( ruleInt0 )
                    {
                    // InternalMyDsl.g:388:2: ( ruleInt0 )
                    // InternalMyDsl.g:389:3: ruleInt0
                    {
                     before(grammarAccess.getTypeAccess().getInt0ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInt0();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getInt0ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:394:2: ( ruleFloat )
                    {
                    // InternalMyDsl.g:394:2: ( ruleFloat )
                    // InternalMyDsl.g:395:3: ruleFloat
                    {
                     before(grammarAccess.getTypeAccess().getFloatParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFloat();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getFloatParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:400:2: ( ruleString0 )
                    {
                    // InternalMyDsl.g:400:2: ( ruleString0 )
                    // InternalMyDsl.g:401:3: ruleString0
                    {
                     before(grammarAccess.getTypeAccess().getString0ParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleString0();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getString0ParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:406:2: ( ruleBoolean )
                    {
                    // InternalMyDsl.g:406:2: ( ruleBoolean )
                    // InternalMyDsl.g:407:3: ruleBoolean
                    {
                     before(grammarAccess.getTypeAccess().getBooleanParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:412:2: ( ruleID0 )
                    {
                    // InternalMyDsl.g:412:2: ( ruleID0 )
                    // InternalMyDsl.g:413:3: ruleID0
                    {
                     before(grammarAccess.getTypeAccess().getID0ParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleID0();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getID0ParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:418:2: ( ruleEnum )
                    {
                    // InternalMyDsl.g:418:2: ( ruleEnum )
                    // InternalMyDsl.g:419:3: ruleEnum
                    {
                     before(grammarAccess.getTypeAccess().getEnumParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:428:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:433:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:433:2: ( RULE_STRING )
                    // InternalMyDsl.g:434:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:439:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:439:2: ( RULE_ID )
                    // InternalMyDsl.g:440:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives"
    // InternalMyDsl.g:449:1: rule__Attribute__Alternatives : ( ( ( rule__Attribute__Group_0__0 ) ) | ( ( rule__Attribute__Group_1__0 ) ) | ( ( rule__Attribute__Group_2__0 ) ) | ( ( rule__Attribute__Group_3__0 ) ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( ( ( rule__Attribute__Group_0__0 ) ) | ( ( rule__Attribute__Group_1__0 ) ) | ( ( rule__Attribute__Group_2__0 ) ) | ( ( rule__Attribute__Group_3__0 ) ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:454:2: ( ( rule__Attribute__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:454:2: ( ( rule__Attribute__Group_0__0 ) )
                    // InternalMyDsl.g:455:3: ( rule__Attribute__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_0()); 
                    // InternalMyDsl.g:456:3: ( rule__Attribute__Group_0__0 )
                    // InternalMyDsl.g:456:4: rule__Attribute__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:460:2: ( ( rule__Attribute__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:460:2: ( ( rule__Attribute__Group_1__0 ) )
                    // InternalMyDsl.g:461:3: ( rule__Attribute__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_1()); 
                    // InternalMyDsl.g:462:3: ( rule__Attribute__Group_1__0 )
                    // InternalMyDsl.g:462:4: rule__Attribute__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:466:2: ( ( rule__Attribute__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:466:2: ( ( rule__Attribute__Group_2__0 ) )
                    // InternalMyDsl.g:467:3: ( rule__Attribute__Group_2__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_2()); 
                    // InternalMyDsl.g:468:3: ( rule__Attribute__Group_2__0 )
                    // InternalMyDsl.g:468:4: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:472:2: ( ( rule__Attribute__Group_3__0 ) )
                    {
                    // InternalMyDsl.g:472:2: ( ( rule__Attribute__Group_3__0 ) )
                    // InternalMyDsl.g:473:3: ( rule__Attribute__Group_3__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_3()); 
                    // InternalMyDsl.g:474:3: ( rule__Attribute__Group_3__0 )
                    // InternalMyDsl.g:474:4: rule__Attribute__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__Schema__Group__0"
    // InternalMyDsl.g:482:1: rule__Schema__Group__0 : rule__Schema__Group__0__Impl rule__Schema__Group__1 ;
    public final void rule__Schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:486:1: ( rule__Schema__Group__0__Impl rule__Schema__Group__1 )
            // InternalMyDsl.g:487:2: rule__Schema__Group__0__Impl rule__Schema__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Schema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__0"


    // $ANTLR start "rule__Schema__Group__0__Impl"
    // InternalMyDsl.g:494:1: rule__Schema__Group__0__Impl : ( 'Schema {' ) ;
    public final void rule__Schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:498:1: ( ( 'Schema {' ) )
            // InternalMyDsl.g:499:1: ( 'Schema {' )
            {
            // InternalMyDsl.g:499:1: ( 'Schema {' )
            // InternalMyDsl.g:500:2: 'Schema {'
            {
             before(grammarAccess.getSchemaAccess().getSchemaKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getSchemaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__0__Impl"


    // $ANTLR start "rule__Schema__Group__1"
    // InternalMyDsl.g:509:1: rule__Schema__Group__1 : rule__Schema__Group__1__Impl rule__Schema__Group__2 ;
    public final void rule__Schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:513:1: ( rule__Schema__Group__1__Impl rule__Schema__Group__2 )
            // InternalMyDsl.g:514:2: rule__Schema__Group__1__Impl rule__Schema__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Schema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__1"


    // $ANTLR start "rule__Schema__Group__1__Impl"
    // InternalMyDsl.g:521:1: rule__Schema__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:525:1: ( ( 'name:' ) )
            // InternalMyDsl.g:526:1: ( 'name:' )
            {
            // InternalMyDsl.g:526:1: ( 'name:' )
            // InternalMyDsl.g:527:2: 'name:'
            {
             before(grammarAccess.getSchemaAccess().getNameKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__1__Impl"


    // $ANTLR start "rule__Schema__Group__2"
    // InternalMyDsl.g:536:1: rule__Schema__Group__2 : rule__Schema__Group__2__Impl rule__Schema__Group__3 ;
    public final void rule__Schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( rule__Schema__Group__2__Impl rule__Schema__Group__3 )
            // InternalMyDsl.g:541:2: rule__Schema__Group__2__Impl rule__Schema__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Schema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__2"


    // $ANTLR start "rule__Schema__Group__2__Impl"
    // InternalMyDsl.g:548:1: rule__Schema__Group__2__Impl : ( ( rule__Schema__NameAssignment_2 ) ) ;
    public final void rule__Schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:552:1: ( ( ( rule__Schema__NameAssignment_2 ) ) )
            // InternalMyDsl.g:553:1: ( ( rule__Schema__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:553:1: ( ( rule__Schema__NameAssignment_2 ) )
            // InternalMyDsl.g:554:2: ( rule__Schema__NameAssignment_2 )
            {
             before(grammarAccess.getSchemaAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:555:2: ( rule__Schema__NameAssignment_2 )
            // InternalMyDsl.g:555:3: rule__Schema__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Schema__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__2__Impl"


    // $ANTLR start "rule__Schema__Group__3"
    // InternalMyDsl.g:563:1: rule__Schema__Group__3 : rule__Schema__Group__3__Impl rule__Schema__Group__4 ;
    public final void rule__Schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( rule__Schema__Group__3__Impl rule__Schema__Group__4 )
            // InternalMyDsl.g:568:2: rule__Schema__Group__3__Impl rule__Schema__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Schema__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__3"


    // $ANTLR start "rule__Schema__Group__3__Impl"
    // InternalMyDsl.g:575:1: rule__Schema__Group__3__Impl : ( '}' ) ;
    public final void rule__Schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:579:1: ( ( '}' ) )
            // InternalMyDsl.g:580:1: ( '}' )
            {
            // InternalMyDsl.g:580:1: ( '}' )
            // InternalMyDsl.g:581:2: '}'
            {
             before(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__3__Impl"


    // $ANTLR start "rule__Schema__Group__4"
    // InternalMyDsl.g:590:1: rule__Schema__Group__4 : rule__Schema__Group__4__Impl rule__Schema__Group__5 ;
    public final void rule__Schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:594:1: ( rule__Schema__Group__4__Impl rule__Schema__Group__5 )
            // InternalMyDsl.g:595:2: rule__Schema__Group__4__Impl rule__Schema__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Schema__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__4"


    // $ANTLR start "rule__Schema__Group__4__Impl"
    // InternalMyDsl.g:602:1: rule__Schema__Group__4__Impl : ( ( rule__Schema__TypeAssignment_4 ) ) ;
    public final void rule__Schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:606:1: ( ( ( rule__Schema__TypeAssignment_4 ) ) )
            // InternalMyDsl.g:607:1: ( ( rule__Schema__TypeAssignment_4 ) )
            {
            // InternalMyDsl.g:607:1: ( ( rule__Schema__TypeAssignment_4 ) )
            // InternalMyDsl.g:608:2: ( rule__Schema__TypeAssignment_4 )
            {
             before(grammarAccess.getSchemaAccess().getTypeAssignment_4()); 
            // InternalMyDsl.g:609:2: ( rule__Schema__TypeAssignment_4 )
            // InternalMyDsl.g:609:3: rule__Schema__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Schema__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__4__Impl"


    // $ANTLR start "rule__Schema__Group__5"
    // InternalMyDsl.g:617:1: rule__Schema__Group__5 : rule__Schema__Group__5__Impl ;
    public final void rule__Schema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( rule__Schema__Group__5__Impl )
            // InternalMyDsl.g:622:2: rule__Schema__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__5"


    // $ANTLR start "rule__Schema__Group__5__Impl"
    // InternalMyDsl.g:628:1: rule__Schema__Group__5__Impl : ( ( rule__Schema__TypeAssignment_5 )* ) ;
    public final void rule__Schema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( ( ( rule__Schema__TypeAssignment_5 )* ) )
            // InternalMyDsl.g:633:1: ( ( rule__Schema__TypeAssignment_5 )* )
            {
            // InternalMyDsl.g:633:1: ( ( rule__Schema__TypeAssignment_5 )* )
            // InternalMyDsl.g:634:2: ( rule__Schema__TypeAssignment_5 )*
            {
             before(grammarAccess.getSchemaAccess().getTypeAssignment_5()); 
            // InternalMyDsl.g:635:2: ( rule__Schema__TypeAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=15)||LA4_0==20||LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:635:3: rule__Schema__TypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Schema__TypeAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group_0__0"
    // InternalMyDsl.g:644:1: rule__Attribute__Group_0__0 : rule__Attribute__Group_0__0__Impl rule__Attribute__Group_0__1 ;
    public final void rule__Attribute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:1: ( rule__Attribute__Group_0__0__Impl rule__Attribute__Group_0__1 )
            // InternalMyDsl.g:649:2: rule__Attribute__Group_0__0__Impl rule__Attribute__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_0__0"


    // $ANTLR start "rule__Attribute__Group_0__0__Impl"
    // InternalMyDsl.g:656:1: rule__Attribute__Group_0__0__Impl : ( ( rule__Attribute__NameAssignment_0_0 ) ) ;
    public final void rule__Attribute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:660:1: ( ( ( rule__Attribute__NameAssignment_0_0 ) ) )
            // InternalMyDsl.g:661:1: ( ( rule__Attribute__NameAssignment_0_0 ) )
            {
            // InternalMyDsl.g:661:1: ( ( rule__Attribute__NameAssignment_0_0 ) )
            // InternalMyDsl.g:662:2: ( rule__Attribute__NameAssignment_0_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0_0()); 
            // InternalMyDsl.g:663:2: ( rule__Attribute__NameAssignment_0_0 )
            // InternalMyDsl.g:663:3: rule__Attribute__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_0__0__Impl"


    // $ANTLR start "rule__Attribute__Group_0__1"
    // InternalMyDsl.g:671:1: rule__Attribute__Group_0__1 : rule__Attribute__Group_0__1__Impl rule__Attribute__Group_0__2 ;
    public final void rule__Attribute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( rule__Attribute__Group_0__1__Impl rule__Attribute__Group_0__2 )
            // InternalMyDsl.g:676:2: rule__Attribute__Group_0__1__Impl rule__Attribute__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_0__1"


    // $ANTLR start "rule__Attribute__Group_0__1__Impl"
    // InternalMyDsl.g:683:1: rule__Attribute__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:687:1: ( ( ':' ) )
            // InternalMyDsl.g:688:1: ( ':' )
            {
            // InternalMyDsl.g:688:1: ( ':' )
            // InternalMyDsl.g:689:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_0__1__Impl"


    // $ANTLR start "rule__Attribute__Group_0__2"
    // InternalMyDsl.g:698:1: rule__Attribute__Group_0__2 : rule__Attribute__Group_0__2__Impl rule__Attribute__Group_0__3 ;
    public final void rule__Attribute__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( rule__Attribute__Group_0__2__Impl rule__Attribute__Group_0__3 )
            // InternalMyDsl.g:703:2: rule__Attribute__Group_0__2__Impl rule__Attribute__Group_0__3
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_0__2"


    // $ANTLR start "rule__Attribute__Group_0__2__Impl"
    // InternalMyDsl.g:710:1: rule__Attribute__Group_0__2__Impl : ( ( rule__Attribute__TypeNameAssignment_0_2 ) ) ;
    public final void rule__Attribute__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:714:1: ( ( ( rule__Attribute__TypeNameAssignment_0_2 ) ) )
            // InternalMyDsl.g:715:1: ( ( rule__Attribute__TypeNameAssignment_0_2 ) )
            {
            // InternalMyDsl.g:715:1: ( ( rule__Attribute__TypeNameAssignment_0_2 ) )
            // InternalMyDsl.g:716:2: ( rule__Attribute__TypeNameAssignment_0_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeNameAssignment_0_2()); 
            // InternalMyDsl.g:717:2: ( rule__Attribute__TypeNameAssignment_0_2 )
            // InternalMyDsl.g:717:3: rule__Attribute__TypeNameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeNameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_0__2__Impl"


    // $ANTLR start "rule__Attribute__Group_0__3"
    // InternalMyDsl.g:725:1: rule__Attribute__Group_0__3 : rule__Attribute__Group_0__3__Impl ;
    public final void rule__Attribute__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( rule__Attribute__Group_0__3__Impl )
            // InternalMyDsl.g:730:2: rule__Attribute__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_0__3"


    // $ANTLR start "rule__Attribute__Group_0__3__Impl"
    // InternalMyDsl.g:736:1: rule__Attribute__Group_0__3__Impl : ( ( rule__Attribute__IsNullableAssignment_0_3 ) ) ;
    public final void rule__Attribute__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( ( ( rule__Attribute__IsNullableAssignment_0_3 ) ) )
            // InternalMyDsl.g:741:1: ( ( rule__Attribute__IsNullableAssignment_0_3 ) )
            {
            // InternalMyDsl.g:741:1: ( ( rule__Attribute__IsNullableAssignment_0_3 ) )
            // InternalMyDsl.g:742:2: ( rule__Attribute__IsNullableAssignment_0_3 )
            {
             before(grammarAccess.getAttributeAccess().getIsNullableAssignment_0_3()); 
            // InternalMyDsl.g:743:2: ( rule__Attribute__IsNullableAssignment_0_3 )
            // InternalMyDsl.g:743:3: rule__Attribute__IsNullableAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__IsNullableAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getIsNullableAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_0__3__Impl"


    // $ANTLR start "rule__Attribute__Group_1__0"
    // InternalMyDsl.g:752:1: rule__Attribute__Group_1__0 : rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 ;
    public final void rule__Attribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 )
            // InternalMyDsl.g:757:2: rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__0"


    // $ANTLR start "rule__Attribute__Group_1__0__Impl"
    // InternalMyDsl.g:764:1: rule__Attribute__Group_1__0__Impl : ( ( rule__Attribute__NameAssignment_1_0 ) ) ;
    public final void rule__Attribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:768:1: ( ( ( rule__Attribute__NameAssignment_1_0 ) ) )
            // InternalMyDsl.g:769:1: ( ( rule__Attribute__NameAssignment_1_0 ) )
            {
            // InternalMyDsl.g:769:1: ( ( rule__Attribute__NameAssignment_1_0 ) )
            // InternalMyDsl.g:770:2: ( rule__Attribute__NameAssignment_1_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1_0()); 
            // InternalMyDsl.g:771:2: ( rule__Attribute__NameAssignment_1_0 )
            // InternalMyDsl.g:771:3: rule__Attribute__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_1__1"
    // InternalMyDsl.g:779:1: rule__Attribute__Group_1__1 : rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 ;
    public final void rule__Attribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 )
            // InternalMyDsl.g:784:2: rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__1"


    // $ANTLR start "rule__Attribute__Group_1__1__Impl"
    // InternalMyDsl.g:791:1: rule__Attribute__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:795:1: ( ( ':' ) )
            // InternalMyDsl.g:796:1: ( ':' )
            {
            // InternalMyDsl.g:796:1: ( ':' )
            // InternalMyDsl.g:797:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group_1__2"
    // InternalMyDsl.g:806:1: rule__Attribute__Group_1__2 : rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3 ;
    public final void rule__Attribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3 )
            // InternalMyDsl.g:811:2: rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__2"


    // $ANTLR start "rule__Attribute__Group_1__2__Impl"
    // InternalMyDsl.g:818:1: rule__Attribute__Group_1__2__Impl : ( ( rule__Attribute__TypeNameAssignment_1_2 ) ) ;
    public final void rule__Attribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:822:1: ( ( ( rule__Attribute__TypeNameAssignment_1_2 ) ) )
            // InternalMyDsl.g:823:1: ( ( rule__Attribute__TypeNameAssignment_1_2 ) )
            {
            // InternalMyDsl.g:823:1: ( ( rule__Attribute__TypeNameAssignment_1_2 ) )
            // InternalMyDsl.g:824:2: ( rule__Attribute__TypeNameAssignment_1_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeNameAssignment_1_2()); 
            // InternalMyDsl.g:825:2: ( rule__Attribute__TypeNameAssignment_1_2 )
            // InternalMyDsl.g:825:3: rule__Attribute__TypeNameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeNameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__2__Impl"


    // $ANTLR start "rule__Attribute__Group_1__3"
    // InternalMyDsl.g:833:1: rule__Attribute__Group_1__3 : rule__Attribute__Group_1__3__Impl ;
    public final void rule__Attribute__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( rule__Attribute__Group_1__3__Impl )
            // InternalMyDsl.g:838:2: rule__Attribute__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__3"


    // $ANTLR start "rule__Attribute__Group_1__3__Impl"
    // InternalMyDsl.g:844:1: rule__Attribute__Group_1__3__Impl : ( ( rule__Attribute__IsArrayAssignment_1_3 ) ) ;
    public final void rule__Attribute__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( ( ( rule__Attribute__IsArrayAssignment_1_3 ) ) )
            // InternalMyDsl.g:849:1: ( ( rule__Attribute__IsArrayAssignment_1_3 ) )
            {
            // InternalMyDsl.g:849:1: ( ( rule__Attribute__IsArrayAssignment_1_3 ) )
            // InternalMyDsl.g:850:2: ( rule__Attribute__IsArrayAssignment_1_3 )
            {
             before(grammarAccess.getAttributeAccess().getIsArrayAssignment_1_3()); 
            // InternalMyDsl.g:851:2: ( rule__Attribute__IsArrayAssignment_1_3 )
            // InternalMyDsl.g:851:3: rule__Attribute__IsArrayAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__IsArrayAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getIsArrayAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__3__Impl"


    // $ANTLR start "rule__Attribute__Group_2__0"
    // InternalMyDsl.g:860:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalMyDsl.g:865:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__0"


    // $ANTLR start "rule__Attribute__Group_2__0__Impl"
    // InternalMyDsl.g:872:1: rule__Attribute__Group_2__0__Impl : ( ( rule__Attribute__NameAssignment_2_0 ) ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:876:1: ( ( ( rule__Attribute__NameAssignment_2_0 ) ) )
            // InternalMyDsl.g:877:1: ( ( rule__Attribute__NameAssignment_2_0 ) )
            {
            // InternalMyDsl.g:877:1: ( ( rule__Attribute__NameAssignment_2_0 ) )
            // InternalMyDsl.g:878:2: ( rule__Attribute__NameAssignment_2_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2_0()); 
            // InternalMyDsl.g:879:2: ( rule__Attribute__NameAssignment_2_0 )
            // InternalMyDsl.g:879:3: rule__Attribute__NameAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2__1"
    // InternalMyDsl.g:887:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 )
            // InternalMyDsl.g:892:2: rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__1"


    // $ANTLR start "rule__Attribute__Group_2__1__Impl"
    // InternalMyDsl.g:899:1: rule__Attribute__Group_2__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:903:1: ( ( ':' ) )
            // InternalMyDsl.g:904:1: ( ':' )
            {
            // InternalMyDsl.g:904:1: ( ':' )
            // InternalMyDsl.g:905:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group_2__2"
    // InternalMyDsl.g:914:1: rule__Attribute__Group_2__2 : rule__Attribute__Group_2__2__Impl rule__Attribute__Group_2__3 ;
    public final void rule__Attribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( rule__Attribute__Group_2__2__Impl rule__Attribute__Group_2__3 )
            // InternalMyDsl.g:919:2: rule__Attribute__Group_2__2__Impl rule__Attribute__Group_2__3
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__2"


    // $ANTLR start "rule__Attribute__Group_2__2__Impl"
    // InternalMyDsl.g:926:1: rule__Attribute__Group_2__2__Impl : ( ( rule__Attribute__TypeNameAssignment_2_2 ) ) ;
    public final void rule__Attribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:930:1: ( ( ( rule__Attribute__TypeNameAssignment_2_2 ) ) )
            // InternalMyDsl.g:931:1: ( ( rule__Attribute__TypeNameAssignment_2_2 ) )
            {
            // InternalMyDsl.g:931:1: ( ( rule__Attribute__TypeNameAssignment_2_2 ) )
            // InternalMyDsl.g:932:2: ( rule__Attribute__TypeNameAssignment_2_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeNameAssignment_2_2()); 
            // InternalMyDsl.g:933:2: ( rule__Attribute__TypeNameAssignment_2_2 )
            // InternalMyDsl.g:933:3: rule__Attribute__TypeNameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeNameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__2__Impl"


    // $ANTLR start "rule__Attribute__Group_2__3"
    // InternalMyDsl.g:941:1: rule__Attribute__Group_2__3 : rule__Attribute__Group_2__3__Impl rule__Attribute__Group_2__4 ;
    public final void rule__Attribute__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( rule__Attribute__Group_2__3__Impl rule__Attribute__Group_2__4 )
            // InternalMyDsl.g:946:2: rule__Attribute__Group_2__3__Impl rule__Attribute__Group_2__4
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__3"


    // $ANTLR start "rule__Attribute__Group_2__3__Impl"
    // InternalMyDsl.g:953:1: rule__Attribute__Group_2__3__Impl : ( ( rule__Attribute__IsArrayAssignment_2_3 ) ) ;
    public final void rule__Attribute__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:957:1: ( ( ( rule__Attribute__IsArrayAssignment_2_3 ) ) )
            // InternalMyDsl.g:958:1: ( ( rule__Attribute__IsArrayAssignment_2_3 ) )
            {
            // InternalMyDsl.g:958:1: ( ( rule__Attribute__IsArrayAssignment_2_3 ) )
            // InternalMyDsl.g:959:2: ( rule__Attribute__IsArrayAssignment_2_3 )
            {
             before(grammarAccess.getAttributeAccess().getIsArrayAssignment_2_3()); 
            // InternalMyDsl.g:960:2: ( rule__Attribute__IsArrayAssignment_2_3 )
            // InternalMyDsl.g:960:3: rule__Attribute__IsArrayAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__IsArrayAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getIsArrayAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__3__Impl"


    // $ANTLR start "rule__Attribute__Group_2__4"
    // InternalMyDsl.g:968:1: rule__Attribute__Group_2__4 : rule__Attribute__Group_2__4__Impl ;
    public final void rule__Attribute__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( rule__Attribute__Group_2__4__Impl )
            // InternalMyDsl.g:973:2: rule__Attribute__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__4"


    // $ANTLR start "rule__Attribute__Group_2__4__Impl"
    // InternalMyDsl.g:979:1: rule__Attribute__Group_2__4__Impl : ( ( rule__Attribute__IsNullableAssignment_2_4 ) ) ;
    public final void rule__Attribute__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:983:1: ( ( ( rule__Attribute__IsNullableAssignment_2_4 ) ) )
            // InternalMyDsl.g:984:1: ( ( rule__Attribute__IsNullableAssignment_2_4 ) )
            {
            // InternalMyDsl.g:984:1: ( ( rule__Attribute__IsNullableAssignment_2_4 ) )
            // InternalMyDsl.g:985:2: ( rule__Attribute__IsNullableAssignment_2_4 )
            {
             before(grammarAccess.getAttributeAccess().getIsNullableAssignment_2_4()); 
            // InternalMyDsl.g:986:2: ( rule__Attribute__IsNullableAssignment_2_4 )
            // InternalMyDsl.g:986:3: rule__Attribute__IsNullableAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__IsNullableAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getIsNullableAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__4__Impl"


    // $ANTLR start "rule__Attribute__Group_3__0"
    // InternalMyDsl.g:995:1: rule__Attribute__Group_3__0 : rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 ;
    public final void rule__Attribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 )
            // InternalMyDsl.g:1000:2: rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__0"


    // $ANTLR start "rule__Attribute__Group_3__0__Impl"
    // InternalMyDsl.g:1007:1: rule__Attribute__Group_3__0__Impl : ( ( rule__Attribute__NameAssignment_3_0 ) ) ;
    public final void rule__Attribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1011:1: ( ( ( rule__Attribute__NameAssignment_3_0 ) ) )
            // InternalMyDsl.g:1012:1: ( ( rule__Attribute__NameAssignment_3_0 ) )
            {
            // InternalMyDsl.g:1012:1: ( ( rule__Attribute__NameAssignment_3_0 ) )
            // InternalMyDsl.g:1013:2: ( rule__Attribute__NameAssignment_3_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_3_0()); 
            // InternalMyDsl.g:1014:2: ( rule__Attribute__NameAssignment_3_0 )
            // InternalMyDsl.g:1014:3: rule__Attribute__NameAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__0__Impl"


    // $ANTLR start "rule__Attribute__Group_3__1"
    // InternalMyDsl.g:1022:1: rule__Attribute__Group_3__1 : rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 ;
    public final void rule__Attribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 )
            // InternalMyDsl.g:1027:2: rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__1"


    // $ANTLR start "rule__Attribute__Group_3__1__Impl"
    // InternalMyDsl.g:1034:1: rule__Attribute__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1038:1: ( ( ':' ) )
            // InternalMyDsl.g:1039:1: ( ':' )
            {
            // InternalMyDsl.g:1039:1: ( ':' )
            // InternalMyDsl.g:1040:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group_3__2"
    // InternalMyDsl.g:1049:1: rule__Attribute__Group_3__2 : rule__Attribute__Group_3__2__Impl ;
    public final void rule__Attribute__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( rule__Attribute__Group_3__2__Impl )
            // InternalMyDsl.g:1054:2: rule__Attribute__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__2"


    // $ANTLR start "rule__Attribute__Group_3__2__Impl"
    // InternalMyDsl.g:1060:1: rule__Attribute__Group_3__2__Impl : ( ( rule__Attribute__TypeNameAssignment_3_2 ) ) ;
    public final void rule__Attribute__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1064:1: ( ( ( rule__Attribute__TypeNameAssignment_3_2 ) ) )
            // InternalMyDsl.g:1065:1: ( ( rule__Attribute__TypeNameAssignment_3_2 ) )
            {
            // InternalMyDsl.g:1065:1: ( ( rule__Attribute__TypeNameAssignment_3_2 ) )
            // InternalMyDsl.g:1066:2: ( rule__Attribute__TypeNameAssignment_3_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeNameAssignment_3_2()); 
            // InternalMyDsl.g:1067:2: ( rule__Attribute__TypeNameAssignment_3_2 )
            // InternalMyDsl.g:1067:3: rule__Attribute__TypeNameAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeNameAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeNameAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__2__Impl"


    // $ANTLR start "rule__SystemType__Group__0"
    // InternalMyDsl.g:1076:1: rule__SystemType__Group__0 : rule__SystemType__Group__0__Impl rule__SystemType__Group__1 ;
    public final void rule__SystemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( rule__SystemType__Group__0__Impl rule__SystemType__Group__1 )
            // InternalMyDsl.g:1081:2: rule__SystemType__Group__0__Impl rule__SystemType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SystemType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__Group__0"


    // $ANTLR start "rule__SystemType__Group__0__Impl"
    // InternalMyDsl.g:1088:1: rule__SystemType__Group__0__Impl : ( ( ( 'type ' ) ) ( ( 'type ' )* ) ) ;
    public final void rule__SystemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1092:1: ( ( ( ( 'type ' ) ) ( ( 'type ' )* ) ) )
            // InternalMyDsl.g:1093:1: ( ( ( 'type ' ) ) ( ( 'type ' )* ) )
            {
            // InternalMyDsl.g:1093:1: ( ( ( 'type ' ) ) ( ( 'type ' )* ) )
            // InternalMyDsl.g:1094:2: ( ( 'type ' ) ) ( ( 'type ' )* )
            {
            // InternalMyDsl.g:1094:2: ( ( 'type ' ) )
            // InternalMyDsl.g:1095:3: ( 'type ' )
            {
             before(grammarAccess.getSystemTypeAccess().getTypeKeyword_0()); 
            // InternalMyDsl.g:1096:3: ( 'type ' )
            // InternalMyDsl.g:1096:4: 'type '
            {
            match(input,20,FOLLOW_11); 

            }

             after(grammarAccess.getSystemTypeAccess().getTypeKeyword_0()); 

            }

            // InternalMyDsl.g:1099:2: ( ( 'type ' )* )
            // InternalMyDsl.g:1100:3: ( 'type ' )*
            {
             before(grammarAccess.getSystemTypeAccess().getTypeKeyword_0()); 
            // InternalMyDsl.g:1101:3: ( 'type ' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:1101:4: 'type '
            	    {
            	    match(input,20,FOLLOW_11); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSystemTypeAccess().getTypeKeyword_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__Group__0__Impl"


    // $ANTLR start "rule__SystemType__Group__1"
    // InternalMyDsl.g:1110:1: rule__SystemType__Group__1 : rule__SystemType__Group__1__Impl rule__SystemType__Group__2 ;
    public final void rule__SystemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1114:1: ( rule__SystemType__Group__1__Impl rule__SystemType__Group__2 )
            // InternalMyDsl.g:1115:2: rule__SystemType__Group__1__Impl rule__SystemType__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__SystemType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__Group__1"


    // $ANTLR start "rule__SystemType__Group__1__Impl"
    // InternalMyDsl.g:1122:1: rule__SystemType__Group__1__Impl : ( ( ( rule__SystemType__NameAssignment_1 ) ) ( ( rule__SystemType__NameAssignment_1 )* ) ) ;
    public final void rule__SystemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1126:1: ( ( ( ( rule__SystemType__NameAssignment_1 ) ) ( ( rule__SystemType__NameAssignment_1 )* ) ) )
            // InternalMyDsl.g:1127:1: ( ( ( rule__SystemType__NameAssignment_1 ) ) ( ( rule__SystemType__NameAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1127:1: ( ( ( rule__SystemType__NameAssignment_1 ) ) ( ( rule__SystemType__NameAssignment_1 )* ) )
            // InternalMyDsl.g:1128:2: ( ( rule__SystemType__NameAssignment_1 ) ) ( ( rule__SystemType__NameAssignment_1 )* )
            {
            // InternalMyDsl.g:1128:2: ( ( rule__SystemType__NameAssignment_1 ) )
            // InternalMyDsl.g:1129:3: ( rule__SystemType__NameAssignment_1 )
            {
             before(grammarAccess.getSystemTypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1130:3: ( rule__SystemType__NameAssignment_1 )
            // InternalMyDsl.g:1130:4: rule__SystemType__NameAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__SystemType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemTypeAccess().getNameAssignment_1()); 

            }

            // InternalMyDsl.g:1133:2: ( ( rule__SystemType__NameAssignment_1 )* )
            // InternalMyDsl.g:1134:3: ( rule__SystemType__NameAssignment_1 )*
            {
             before(grammarAccess.getSystemTypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1135:3: ( rule__SystemType__NameAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1135:4: rule__SystemType__NameAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SystemType__NameAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSystemTypeAccess().getNameAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__Group__1__Impl"


    // $ANTLR start "rule__SystemType__Group__2"
    // InternalMyDsl.g:1144:1: rule__SystemType__Group__2 : rule__SystemType__Group__2__Impl rule__SystemType__Group__3 ;
    public final void rule__SystemType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1148:1: ( rule__SystemType__Group__2__Impl rule__SystemType__Group__3 )
            // InternalMyDsl.g:1149:2: rule__SystemType__Group__2__Impl rule__SystemType__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SystemType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__Group__2"


    // $ANTLR start "rule__SystemType__Group__2__Impl"
    // InternalMyDsl.g:1156:1: rule__SystemType__Group__2__Impl : ( ' {' ) ;
    public final void rule__SystemType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1160:1: ( ( ' {' ) )
            // InternalMyDsl.g:1161:1: ( ' {' )
            {
            // InternalMyDsl.g:1161:1: ( ' {' )
            // InternalMyDsl.g:1162:2: ' {'
            {
             before(grammarAccess.getSystemTypeAccess().getSpaceLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSystemTypeAccess().getSpaceLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__Group__2__Impl"


    // $ANTLR start "rule__SystemType__Group__3"
    // InternalMyDsl.g:1171:1: rule__SystemType__Group__3 : rule__SystemType__Group__3__Impl rule__SystemType__Group__4 ;
    public final void rule__SystemType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1175:1: ( rule__SystemType__Group__3__Impl rule__SystemType__Group__4 )
            // InternalMyDsl.g:1176:2: rule__SystemType__Group__3__Impl rule__SystemType__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__SystemType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__Group__3"


    // $ANTLR start "rule__SystemType__Group__3__Impl"
    // InternalMyDsl.g:1183:1: rule__SystemType__Group__3__Impl : ( ( rule__SystemType__AttributeAssignment_3 ) ) ;
    public final void rule__SystemType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1187:1: ( ( ( rule__SystemType__AttributeAssignment_3 ) ) )
            // InternalMyDsl.g:1188:1: ( ( rule__SystemType__AttributeAssignment_3 ) )
            {
            // InternalMyDsl.g:1188:1: ( ( rule__SystemType__AttributeAssignment_3 ) )
            // InternalMyDsl.g:1189:2: ( rule__SystemType__AttributeAssignment_3 )
            {
             before(grammarAccess.getSystemTypeAccess().getAttributeAssignment_3()); 
            // InternalMyDsl.g:1190:2: ( rule__SystemType__AttributeAssignment_3 )
            // InternalMyDsl.g:1190:3: rule__SystemType__AttributeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SystemType__AttributeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemTypeAccess().getAttributeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__Group__3__Impl"


    // $ANTLR start "rule__SystemType__Group__4"
    // InternalMyDsl.g:1198:1: rule__SystemType__Group__4 : rule__SystemType__Group__4__Impl rule__SystemType__Group__5 ;
    public final void rule__SystemType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1202:1: ( rule__SystemType__Group__4__Impl rule__SystemType__Group__5 )
            // InternalMyDsl.g:1203:2: rule__SystemType__Group__4__Impl rule__SystemType__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__SystemType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__Group__4"


    // $ANTLR start "rule__SystemType__Group__4__Impl"
    // InternalMyDsl.g:1210:1: rule__SystemType__Group__4__Impl : ( ( rule__SystemType__AttributeAssignment_4 )* ) ;
    public final void rule__SystemType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1214:1: ( ( ( rule__SystemType__AttributeAssignment_4 )* ) )
            // InternalMyDsl.g:1215:1: ( ( rule__SystemType__AttributeAssignment_4 )* )
            {
            // InternalMyDsl.g:1215:1: ( ( rule__SystemType__AttributeAssignment_4 )* )
            // InternalMyDsl.g:1216:2: ( rule__SystemType__AttributeAssignment_4 )*
            {
             before(grammarAccess.getSystemTypeAccess().getAttributeAssignment_4()); 
            // InternalMyDsl.g:1217:2: ( rule__SystemType__AttributeAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1217:3: rule__SystemType__AttributeAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SystemType__AttributeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSystemTypeAccess().getAttributeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__Group__4__Impl"


    // $ANTLR start "rule__SystemType__Group__5"
    // InternalMyDsl.g:1225:1: rule__SystemType__Group__5 : rule__SystemType__Group__5__Impl ;
    public final void rule__SystemType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1229:1: ( rule__SystemType__Group__5__Impl )
            // InternalMyDsl.g:1230:2: rule__SystemType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__Group__5"


    // $ANTLR start "rule__SystemType__Group__5__Impl"
    // InternalMyDsl.g:1236:1: rule__SystemType__Group__5__Impl : ( '}' ) ;
    public final void rule__SystemType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( ( '}' ) )
            // InternalMyDsl.g:1241:1: ( '}' )
            {
            // InternalMyDsl.g:1241:1: ( '}' )
            // InternalMyDsl.g:1242:2: '}'
            {
             before(grammarAccess.getSystemTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSystemTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__Group__5__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // InternalMyDsl.g:1252:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1256:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalMyDsl.g:1257:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // InternalMyDsl.g:1264:1: rule__Enum__Group__0__Impl : ( 'Enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1268:1: ( ( 'Enum' ) )
            // InternalMyDsl.g:1269:1: ( 'Enum' )
            {
            // InternalMyDsl.g:1269:1: ( 'Enum' )
            // InternalMyDsl.g:1270:2: 'Enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // InternalMyDsl.g:1279:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1283:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalMyDsl.g:1284:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // InternalMyDsl.g:1291:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1295:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1296:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1296:1: ( ( rule__Enum__NameAssignment_1 ) )
            // InternalMyDsl.g:1297:2: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1298:2: ( rule__Enum__NameAssignment_1 )
            // InternalMyDsl.g:1298:3: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enum__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // InternalMyDsl.g:1306:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1310:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalMyDsl.g:1311:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // InternalMyDsl.g:1318:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( ( '{' ) )
            // InternalMyDsl.g:1323:1: ( '{' )
            {
            // InternalMyDsl.g:1323:1: ( '{' )
            // InternalMyDsl.g:1324:2: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // InternalMyDsl.g:1333:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1337:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // InternalMyDsl.g:1338:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // InternalMyDsl.g:1345:1: rule__Enum__Group__3__Impl : ( 'attribute' ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1349:1: ( ( 'attribute' ) )
            // InternalMyDsl.g:1350:1: ( 'attribute' )
            {
            // InternalMyDsl.g:1350:1: ( 'attribute' )
            // InternalMyDsl.g:1351:2: 'attribute'
            {
             before(grammarAccess.getEnumAccess().getAttributeKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getAttributeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // InternalMyDsl.g:1360:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1364:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // InternalMyDsl.g:1365:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Enum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // InternalMyDsl.g:1372:1: rule__Enum__Group__4__Impl : ( '{' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1376:1: ( ( '{' ) )
            // InternalMyDsl.g:1377:1: ( '{' )
            {
            // InternalMyDsl.g:1377:1: ( '{' )
            // InternalMyDsl.g:1378:2: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__Enum__Group__5"
    // InternalMyDsl.g:1387:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl rule__Enum__Group__6 ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1391:1: ( rule__Enum__Group__5__Impl rule__Enum__Group__6 )
            // InternalMyDsl.g:1392:2: rule__Enum__Group__5__Impl rule__Enum__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Enum__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__5"


    // $ANTLR start "rule__Enum__Group__5__Impl"
    // InternalMyDsl.g:1399:1: rule__Enum__Group__5__Impl : ( ( rule__Enum__AttributeAssignment_5 ) ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1403:1: ( ( ( rule__Enum__AttributeAssignment_5 ) ) )
            // InternalMyDsl.g:1404:1: ( ( rule__Enum__AttributeAssignment_5 ) )
            {
            // InternalMyDsl.g:1404:1: ( ( rule__Enum__AttributeAssignment_5 ) )
            // InternalMyDsl.g:1405:2: ( rule__Enum__AttributeAssignment_5 )
            {
             before(grammarAccess.getEnumAccess().getAttributeAssignment_5()); 
            // InternalMyDsl.g:1406:2: ( rule__Enum__AttributeAssignment_5 )
            // InternalMyDsl.g:1406:3: rule__Enum__AttributeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Enum__AttributeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getAttributeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__5__Impl"


    // $ANTLR start "rule__Enum__Group__6"
    // InternalMyDsl.g:1414:1: rule__Enum__Group__6 : rule__Enum__Group__6__Impl rule__Enum__Group__7 ;
    public final void rule__Enum__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1418:1: ( rule__Enum__Group__6__Impl rule__Enum__Group__7 )
            // InternalMyDsl.g:1419:2: rule__Enum__Group__6__Impl rule__Enum__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Enum__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__6"


    // $ANTLR start "rule__Enum__Group__6__Impl"
    // InternalMyDsl.g:1426:1: rule__Enum__Group__6__Impl : ( ( rule__Enum__Group_6__0 )* ) ;
    public final void rule__Enum__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1430:1: ( ( ( rule__Enum__Group_6__0 )* ) )
            // InternalMyDsl.g:1431:1: ( ( rule__Enum__Group_6__0 )* )
            {
            // InternalMyDsl.g:1431:1: ( ( rule__Enum__Group_6__0 )* )
            // InternalMyDsl.g:1432:2: ( rule__Enum__Group_6__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_6()); 
            // InternalMyDsl.g:1433:2: ( rule__Enum__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1433:3: rule__Enum__Group_6__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Enum__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__6__Impl"


    // $ANTLR start "rule__Enum__Group__7"
    // InternalMyDsl.g:1441:1: rule__Enum__Group__7 : rule__Enum__Group__7__Impl rule__Enum__Group__8 ;
    public final void rule__Enum__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1445:1: ( rule__Enum__Group__7__Impl rule__Enum__Group__8 )
            // InternalMyDsl.g:1446:2: rule__Enum__Group__7__Impl rule__Enum__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Enum__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__7"


    // $ANTLR start "rule__Enum__Group__7__Impl"
    // InternalMyDsl.g:1453:1: rule__Enum__Group__7__Impl : ( '}' ) ;
    public final void rule__Enum__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1457:1: ( ( '}' ) )
            // InternalMyDsl.g:1458:1: ( '}' )
            {
            // InternalMyDsl.g:1458:1: ( '}' )
            // InternalMyDsl.g:1459:2: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__7__Impl"


    // $ANTLR start "rule__Enum__Group__8"
    // InternalMyDsl.g:1468:1: rule__Enum__Group__8 : rule__Enum__Group__8__Impl rule__Enum__Group__9 ;
    public final void rule__Enum__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1472:1: ( rule__Enum__Group__8__Impl rule__Enum__Group__9 )
            // InternalMyDsl.g:1473:2: rule__Enum__Group__8__Impl rule__Enum__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Enum__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__8"


    // $ANTLR start "rule__Enum__Group__8__Impl"
    // InternalMyDsl.g:1480:1: rule__Enum__Group__8__Impl : ( 'enumvalue' ) ;
    public final void rule__Enum__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1484:1: ( ( 'enumvalue' ) )
            // InternalMyDsl.g:1485:1: ( 'enumvalue' )
            {
            // InternalMyDsl.g:1485:1: ( 'enumvalue' )
            // InternalMyDsl.g:1486:2: 'enumvalue'
            {
             before(grammarAccess.getEnumAccess().getEnumvalueKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getEnumvalueKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__8__Impl"


    // $ANTLR start "rule__Enum__Group__9"
    // InternalMyDsl.g:1495:1: rule__Enum__Group__9 : rule__Enum__Group__9__Impl rule__Enum__Group__10 ;
    public final void rule__Enum__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1499:1: ( rule__Enum__Group__9__Impl rule__Enum__Group__10 )
            // InternalMyDsl.g:1500:2: rule__Enum__Group__9__Impl rule__Enum__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__Enum__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__9"


    // $ANTLR start "rule__Enum__Group__9__Impl"
    // InternalMyDsl.g:1507:1: rule__Enum__Group__9__Impl : ( '{' ) ;
    public final void rule__Enum__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1511:1: ( ( '{' ) )
            // InternalMyDsl.g:1512:1: ( '{' )
            {
            // InternalMyDsl.g:1512:1: ( '{' )
            // InternalMyDsl.g:1513:2: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__9__Impl"


    // $ANTLR start "rule__Enum__Group__10"
    // InternalMyDsl.g:1522:1: rule__Enum__Group__10 : rule__Enum__Group__10__Impl rule__Enum__Group__11 ;
    public final void rule__Enum__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1526:1: ( rule__Enum__Group__10__Impl rule__Enum__Group__11 )
            // InternalMyDsl.g:1527:2: rule__Enum__Group__10__Impl rule__Enum__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__Enum__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__10"


    // $ANTLR start "rule__Enum__Group__10__Impl"
    // InternalMyDsl.g:1534:1: rule__Enum__Group__10__Impl : ( ( rule__Enum__EnumvalueAssignment_10 ) ) ;
    public final void rule__Enum__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1538:1: ( ( ( rule__Enum__EnumvalueAssignment_10 ) ) )
            // InternalMyDsl.g:1539:1: ( ( rule__Enum__EnumvalueAssignment_10 ) )
            {
            // InternalMyDsl.g:1539:1: ( ( rule__Enum__EnumvalueAssignment_10 ) )
            // InternalMyDsl.g:1540:2: ( rule__Enum__EnumvalueAssignment_10 )
            {
             before(grammarAccess.getEnumAccess().getEnumvalueAssignment_10()); 
            // InternalMyDsl.g:1541:2: ( rule__Enum__EnumvalueAssignment_10 )
            // InternalMyDsl.g:1541:3: rule__Enum__EnumvalueAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Enum__EnumvalueAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getEnumvalueAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__10__Impl"


    // $ANTLR start "rule__Enum__Group__11"
    // InternalMyDsl.g:1549:1: rule__Enum__Group__11 : rule__Enum__Group__11__Impl rule__Enum__Group__12 ;
    public final void rule__Enum__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1553:1: ( rule__Enum__Group__11__Impl rule__Enum__Group__12 )
            // InternalMyDsl.g:1554:2: rule__Enum__Group__11__Impl rule__Enum__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__Enum__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__11"


    // $ANTLR start "rule__Enum__Group__11__Impl"
    // InternalMyDsl.g:1561:1: rule__Enum__Group__11__Impl : ( ( rule__Enum__Group_11__0 )* ) ;
    public final void rule__Enum__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1565:1: ( ( ( rule__Enum__Group_11__0 )* ) )
            // InternalMyDsl.g:1566:1: ( ( rule__Enum__Group_11__0 )* )
            {
            // InternalMyDsl.g:1566:1: ( ( rule__Enum__Group_11__0 )* )
            // InternalMyDsl.g:1567:2: ( rule__Enum__Group_11__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_11()); 
            // InternalMyDsl.g:1568:2: ( rule__Enum__Group_11__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1568:3: rule__Enum__Group_11__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Enum__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__11__Impl"


    // $ANTLR start "rule__Enum__Group__12"
    // InternalMyDsl.g:1576:1: rule__Enum__Group__12 : rule__Enum__Group__12__Impl rule__Enum__Group__13 ;
    public final void rule__Enum__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1580:1: ( rule__Enum__Group__12__Impl rule__Enum__Group__13 )
            // InternalMyDsl.g:1581:2: rule__Enum__Group__12__Impl rule__Enum__Group__13
            {
            pushFollow(FOLLOW_5);
            rule__Enum__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__12"


    // $ANTLR start "rule__Enum__Group__12__Impl"
    // InternalMyDsl.g:1588:1: rule__Enum__Group__12__Impl : ( '}' ) ;
    public final void rule__Enum__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1592:1: ( ( '}' ) )
            // InternalMyDsl.g:1593:1: ( '}' )
            {
            // InternalMyDsl.g:1593:1: ( '}' )
            // InternalMyDsl.g:1594:2: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__12__Impl"


    // $ANTLR start "rule__Enum__Group__13"
    // InternalMyDsl.g:1603:1: rule__Enum__Group__13 : rule__Enum__Group__13__Impl ;
    public final void rule__Enum__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1607:1: ( rule__Enum__Group__13__Impl )
            // InternalMyDsl.g:1608:2: rule__Enum__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__13"


    // $ANTLR start "rule__Enum__Group__13__Impl"
    // InternalMyDsl.g:1614:1: rule__Enum__Group__13__Impl : ( '}' ) ;
    public final void rule__Enum__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( ( '}' ) )
            // InternalMyDsl.g:1619:1: ( '}' )
            {
            // InternalMyDsl.g:1619:1: ( '}' )
            // InternalMyDsl.g:1620:2: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_13()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__13__Impl"


    // $ANTLR start "rule__Enum__Group_6__0"
    // InternalMyDsl.g:1630:1: rule__Enum__Group_6__0 : rule__Enum__Group_6__0__Impl rule__Enum__Group_6__1 ;
    public final void rule__Enum__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1634:1: ( rule__Enum__Group_6__0__Impl rule__Enum__Group_6__1 )
            // InternalMyDsl.g:1635:2: rule__Enum__Group_6__0__Impl rule__Enum__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Enum__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_6__0"


    // $ANTLR start "rule__Enum__Group_6__0__Impl"
    // InternalMyDsl.g:1642:1: rule__Enum__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1646:1: ( ( ',' ) )
            // InternalMyDsl.g:1647:1: ( ',' )
            {
            // InternalMyDsl.g:1647:1: ( ',' )
            // InternalMyDsl.g:1648:2: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_6__0__Impl"


    // $ANTLR start "rule__Enum__Group_6__1"
    // InternalMyDsl.g:1657:1: rule__Enum__Group_6__1 : rule__Enum__Group_6__1__Impl ;
    public final void rule__Enum__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1661:1: ( rule__Enum__Group_6__1__Impl )
            // InternalMyDsl.g:1662:2: rule__Enum__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_6__1"


    // $ANTLR start "rule__Enum__Group_6__1__Impl"
    // InternalMyDsl.g:1668:1: rule__Enum__Group_6__1__Impl : ( ( rule__Enum__AttributeAssignment_6_1 ) ) ;
    public final void rule__Enum__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( ( ( rule__Enum__AttributeAssignment_6_1 ) ) )
            // InternalMyDsl.g:1673:1: ( ( rule__Enum__AttributeAssignment_6_1 ) )
            {
            // InternalMyDsl.g:1673:1: ( ( rule__Enum__AttributeAssignment_6_1 ) )
            // InternalMyDsl.g:1674:2: ( rule__Enum__AttributeAssignment_6_1 )
            {
             before(grammarAccess.getEnumAccess().getAttributeAssignment_6_1()); 
            // InternalMyDsl.g:1675:2: ( rule__Enum__AttributeAssignment_6_1 )
            // InternalMyDsl.g:1675:3: rule__Enum__AttributeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Enum__AttributeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getAttributeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_6__1__Impl"


    // $ANTLR start "rule__Enum__Group_11__0"
    // InternalMyDsl.g:1684:1: rule__Enum__Group_11__0 : rule__Enum__Group_11__0__Impl rule__Enum__Group_11__1 ;
    public final void rule__Enum__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1688:1: ( rule__Enum__Group_11__0__Impl rule__Enum__Group_11__1 )
            // InternalMyDsl.g:1689:2: rule__Enum__Group_11__0__Impl rule__Enum__Group_11__1
            {
            pushFollow(FOLLOW_20);
            rule__Enum__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_11__0"


    // $ANTLR start "rule__Enum__Group_11__0__Impl"
    // InternalMyDsl.g:1696:1: rule__Enum__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1700:1: ( ( ',' ) )
            // InternalMyDsl.g:1701:1: ( ',' )
            {
            // InternalMyDsl.g:1701:1: ( ',' )
            // InternalMyDsl.g:1702:2: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_11_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_11__0__Impl"


    // $ANTLR start "rule__Enum__Group_11__1"
    // InternalMyDsl.g:1711:1: rule__Enum__Group_11__1 : rule__Enum__Group_11__1__Impl ;
    public final void rule__Enum__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1715:1: ( rule__Enum__Group_11__1__Impl )
            // InternalMyDsl.g:1716:2: rule__Enum__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_11__1"


    // $ANTLR start "rule__Enum__Group_11__1__Impl"
    // InternalMyDsl.g:1722:1: rule__Enum__Group_11__1__Impl : ( ( rule__Enum__EnumvalueAssignment_11_1 ) ) ;
    public final void rule__Enum__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( ( ( rule__Enum__EnumvalueAssignment_11_1 ) ) )
            // InternalMyDsl.g:1727:1: ( ( rule__Enum__EnumvalueAssignment_11_1 ) )
            {
            // InternalMyDsl.g:1727:1: ( ( rule__Enum__EnumvalueAssignment_11_1 ) )
            // InternalMyDsl.g:1728:2: ( rule__Enum__EnumvalueAssignment_11_1 )
            {
             before(grammarAccess.getEnumAccess().getEnumvalueAssignment_11_1()); 
            // InternalMyDsl.g:1729:2: ( rule__Enum__EnumvalueAssignment_11_1 )
            // InternalMyDsl.g:1729:3: rule__Enum__EnumvalueAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Enum__EnumvalueAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getEnumvalueAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_11__1__Impl"


    // $ANTLR start "rule__EnumValue__Group__0"
    // InternalMyDsl.g:1738:1: rule__EnumValue__Group__0 : rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1 ;
    public final void rule__EnumValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1742:1: ( rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1 )
            // InternalMyDsl.g:1743:2: rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EnumValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__0"


    // $ANTLR start "rule__EnumValue__Group__0__Impl"
    // InternalMyDsl.g:1750:1: rule__EnumValue__Group__0__Impl : ( () ) ;
    public final void rule__EnumValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1754:1: ( ( () ) )
            // InternalMyDsl.g:1755:1: ( () )
            {
            // InternalMyDsl.g:1755:1: ( () )
            // InternalMyDsl.g:1756:2: ()
            {
             before(grammarAccess.getEnumValueAccess().getEnumValueAction_0()); 
            // InternalMyDsl.g:1757:2: ()
            // InternalMyDsl.g:1757:3: 
            {
            }

             after(grammarAccess.getEnumValueAccess().getEnumValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__0__Impl"


    // $ANTLR start "rule__EnumValue__Group__1"
    // InternalMyDsl.g:1765:1: rule__EnumValue__Group__1 : rule__EnumValue__Group__1__Impl rule__EnumValue__Group__2 ;
    public final void rule__EnumValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1769:1: ( rule__EnumValue__Group__1__Impl rule__EnumValue__Group__2 )
            // InternalMyDsl.g:1770:2: rule__EnumValue__Group__1__Impl rule__EnumValue__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__EnumValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__1"


    // $ANTLR start "rule__EnumValue__Group__1__Impl"
    // InternalMyDsl.g:1777:1: rule__EnumValue__Group__1__Impl : ( 'EnumValue' ) ;
    public final void rule__EnumValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1781:1: ( ( 'EnumValue' ) )
            // InternalMyDsl.g:1782:1: ( 'EnumValue' )
            {
            // InternalMyDsl.g:1782:1: ( 'EnumValue' )
            // InternalMyDsl.g:1783:2: 'EnumValue'
            {
             before(grammarAccess.getEnumValueAccess().getEnumValueKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEnumValueAccess().getEnumValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__1__Impl"


    // $ANTLR start "rule__EnumValue__Group__2"
    // InternalMyDsl.g:1792:1: rule__EnumValue__Group__2 : rule__EnumValue__Group__2__Impl rule__EnumValue__Group__3 ;
    public final void rule__EnumValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1796:1: ( rule__EnumValue__Group__2__Impl rule__EnumValue__Group__3 )
            // InternalMyDsl.g:1797:2: rule__EnumValue__Group__2__Impl rule__EnumValue__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__EnumValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__2"


    // $ANTLR start "rule__EnumValue__Group__2__Impl"
    // InternalMyDsl.g:1804:1: rule__EnumValue__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1808:1: ( ( '{' ) )
            // InternalMyDsl.g:1809:1: ( '{' )
            {
            // InternalMyDsl.g:1809:1: ( '{' )
            // InternalMyDsl.g:1810:2: '{'
            {
             before(grammarAccess.getEnumValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEnumValueAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__2__Impl"


    // $ANTLR start "rule__EnumValue__Group__3"
    // InternalMyDsl.g:1819:1: rule__EnumValue__Group__3 : rule__EnumValue__Group__3__Impl rule__EnumValue__Group__4 ;
    public final void rule__EnumValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1823:1: ( rule__EnumValue__Group__3__Impl rule__EnumValue__Group__4 )
            // InternalMyDsl.g:1824:2: rule__EnumValue__Group__3__Impl rule__EnumValue__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__EnumValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__3"


    // $ANTLR start "rule__EnumValue__Group__3__Impl"
    // InternalMyDsl.g:1831:1: rule__EnumValue__Group__3__Impl : ( ( rule__EnumValue__Group_3__0 )? ) ;
    public final void rule__EnumValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1835:1: ( ( ( rule__EnumValue__Group_3__0 )? ) )
            // InternalMyDsl.g:1836:1: ( ( rule__EnumValue__Group_3__0 )? )
            {
            // InternalMyDsl.g:1836:1: ( ( rule__EnumValue__Group_3__0 )? )
            // InternalMyDsl.g:1837:2: ( rule__EnumValue__Group_3__0 )?
            {
             before(grammarAccess.getEnumValueAccess().getGroup_3()); 
            // InternalMyDsl.g:1838:2: ( rule__EnumValue__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1838:3: rule__EnumValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumValue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumValueAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__3__Impl"


    // $ANTLR start "rule__EnumValue__Group__4"
    // InternalMyDsl.g:1846:1: rule__EnumValue__Group__4 : rule__EnumValue__Group__4__Impl rule__EnumValue__Group__5 ;
    public final void rule__EnumValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1850:1: ( rule__EnumValue__Group__4__Impl rule__EnumValue__Group__5 )
            // InternalMyDsl.g:1851:2: rule__EnumValue__Group__4__Impl rule__EnumValue__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__EnumValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__4"


    // $ANTLR start "rule__EnumValue__Group__4__Impl"
    // InternalMyDsl.g:1858:1: rule__EnumValue__Group__4__Impl : ( ( rule__EnumValue__Group_4__0 )? ) ;
    public final void rule__EnumValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1862:1: ( ( ( rule__EnumValue__Group_4__0 )? ) )
            // InternalMyDsl.g:1863:1: ( ( rule__EnumValue__Group_4__0 )? )
            {
            // InternalMyDsl.g:1863:1: ( ( rule__EnumValue__Group_4__0 )? )
            // InternalMyDsl.g:1864:2: ( rule__EnumValue__Group_4__0 )?
            {
             before(grammarAccess.getEnumValueAccess().getGroup_4()); 
            // InternalMyDsl.g:1865:2: ( rule__EnumValue__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1865:3: rule__EnumValue__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumValue__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumValueAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__4__Impl"


    // $ANTLR start "rule__EnumValue__Group__5"
    // InternalMyDsl.g:1873:1: rule__EnumValue__Group__5 : rule__EnumValue__Group__5__Impl ;
    public final void rule__EnumValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1877:1: ( rule__EnumValue__Group__5__Impl )
            // InternalMyDsl.g:1878:2: rule__EnumValue__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__5"


    // $ANTLR start "rule__EnumValue__Group__5__Impl"
    // InternalMyDsl.g:1884:1: rule__EnumValue__Group__5__Impl : ( '}' ) ;
    public final void rule__EnumValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( ( '}' ) )
            // InternalMyDsl.g:1889:1: ( '}' )
            {
            // InternalMyDsl.g:1889:1: ( '}' )
            // InternalMyDsl.g:1890:2: '}'
            {
             before(grammarAccess.getEnumValueAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEnumValueAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__5__Impl"


    // $ANTLR start "rule__EnumValue__Group_3__0"
    // InternalMyDsl.g:1900:1: rule__EnumValue__Group_3__0 : rule__EnumValue__Group_3__0__Impl rule__EnumValue__Group_3__1 ;
    public final void rule__EnumValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1904:1: ( rule__EnumValue__Group_3__0__Impl rule__EnumValue__Group_3__1 )
            // InternalMyDsl.g:1905:2: rule__EnumValue__Group_3__0__Impl rule__EnumValue__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__EnumValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group_3__0"


    // $ANTLR start "rule__EnumValue__Group_3__0__Impl"
    // InternalMyDsl.g:1912:1: rule__EnumValue__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__EnumValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1916:1: ( ( 'value' ) )
            // InternalMyDsl.g:1917:1: ( 'value' )
            {
            // InternalMyDsl.g:1917:1: ( 'value' )
            // InternalMyDsl.g:1918:2: 'value'
            {
             before(grammarAccess.getEnumValueAccess().getValueKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEnumValueAccess().getValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group_3__0__Impl"


    // $ANTLR start "rule__EnumValue__Group_3__1"
    // InternalMyDsl.g:1927:1: rule__EnumValue__Group_3__1 : rule__EnumValue__Group_3__1__Impl ;
    public final void rule__EnumValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1931:1: ( rule__EnumValue__Group_3__1__Impl )
            // InternalMyDsl.g:1932:2: rule__EnumValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group_3__1"


    // $ANTLR start "rule__EnumValue__Group_3__1__Impl"
    // InternalMyDsl.g:1938:1: rule__EnumValue__Group_3__1__Impl : ( ( rule__EnumValue__ValueAssignment_3_1 ) ) ;
    public final void rule__EnumValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( ( ( rule__EnumValue__ValueAssignment_3_1 ) ) )
            // InternalMyDsl.g:1943:1: ( ( rule__EnumValue__ValueAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1943:1: ( ( rule__EnumValue__ValueAssignment_3_1 ) )
            // InternalMyDsl.g:1944:2: ( rule__EnumValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getEnumValueAccess().getValueAssignment_3_1()); 
            // InternalMyDsl.g:1945:2: ( rule__EnumValue__ValueAssignment_3_1 )
            // InternalMyDsl.g:1945:3: rule__EnumValue__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group_3__1__Impl"


    // $ANTLR start "rule__EnumValue__Group_4__0"
    // InternalMyDsl.g:1954:1: rule__EnumValue__Group_4__0 : rule__EnumValue__Group_4__0__Impl rule__EnumValue__Group_4__1 ;
    public final void rule__EnumValue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1958:1: ( rule__EnumValue__Group_4__0__Impl rule__EnumValue__Group_4__1 )
            // InternalMyDsl.g:1959:2: rule__EnumValue__Group_4__0__Impl rule__EnumValue__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__EnumValue__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumValue__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group_4__0"


    // $ANTLR start "rule__EnumValue__Group_4__0__Impl"
    // InternalMyDsl.g:1966:1: rule__EnumValue__Group_4__0__Impl : ( 'number' ) ;
    public final void rule__EnumValue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1970:1: ( ( 'number' ) )
            // InternalMyDsl.g:1971:1: ( 'number' )
            {
            // InternalMyDsl.g:1971:1: ( 'number' )
            // InternalMyDsl.g:1972:2: 'number'
            {
             before(grammarAccess.getEnumValueAccess().getNumberKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnumValueAccess().getNumberKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group_4__0__Impl"


    // $ANTLR start "rule__EnumValue__Group_4__1"
    // InternalMyDsl.g:1981:1: rule__EnumValue__Group_4__1 : rule__EnumValue__Group_4__1__Impl ;
    public final void rule__EnumValue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1985:1: ( rule__EnumValue__Group_4__1__Impl )
            // InternalMyDsl.g:1986:2: rule__EnumValue__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group_4__1"


    // $ANTLR start "rule__EnumValue__Group_4__1__Impl"
    // InternalMyDsl.g:1992:1: rule__EnumValue__Group_4__1__Impl : ( ( rule__EnumValue__NumberAssignment_4_1 ) ) ;
    public final void rule__EnumValue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( ( ( rule__EnumValue__NumberAssignment_4_1 ) ) )
            // InternalMyDsl.g:1997:1: ( ( rule__EnumValue__NumberAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1997:1: ( ( rule__EnumValue__NumberAssignment_4_1 ) )
            // InternalMyDsl.g:1998:2: ( rule__EnumValue__NumberAssignment_4_1 )
            {
             before(grammarAccess.getEnumValueAccess().getNumberAssignment_4_1()); 
            // InternalMyDsl.g:1999:2: ( rule__EnumValue__NumberAssignment_4_1 )
            // InternalMyDsl.g:1999:3: rule__EnumValue__NumberAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__NumberAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueAccess().getNumberAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group_4__1__Impl"


    // $ANTLR start "rule__Schema__NameAssignment_2"
    // InternalMyDsl.g:2008:1: rule__Schema__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Schema__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2012:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2013:2: ( ruleEString )
            {
            // InternalMyDsl.g:2013:2: ( ruleEString )
            // InternalMyDsl.g:2014:3: ruleEString
            {
             before(grammarAccess.getSchemaAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__NameAssignment_2"


    // $ANTLR start "rule__Schema__TypeAssignment_4"
    // InternalMyDsl.g:2023:1: rule__Schema__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__Schema__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2027:1: ( ( ruleType ) )
            // InternalMyDsl.g:2028:2: ( ruleType )
            {
            // InternalMyDsl.g:2028:2: ( ruleType )
            // InternalMyDsl.g:2029:3: ruleType
            {
             before(grammarAccess.getSchemaAccess().getTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getTypeTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__TypeAssignment_4"


    // $ANTLR start "rule__Schema__TypeAssignment_5"
    // InternalMyDsl.g:2038:1: rule__Schema__TypeAssignment_5 : ( ruleType ) ;
    public final void rule__Schema__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2042:1: ( ( ruleType ) )
            // InternalMyDsl.g:2043:2: ( ruleType )
            {
            // InternalMyDsl.g:2043:2: ( ruleType )
            // InternalMyDsl.g:2044:3: ruleType
            {
             before(grammarAccess.getSchemaAccess().getTypeTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getTypeTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__TypeAssignment_5"


    // $ANTLR start "rule__Attribute__NameAssignment_0_0"
    // InternalMyDsl.g:2053:1: rule__Attribute__NameAssignment_0_0 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2058:2: ( ruleEString )
            {
            // InternalMyDsl.g:2058:2: ( ruleEString )
            // InternalMyDsl.g:2059:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0_0"


    // $ANTLR start "rule__Attribute__TypeNameAssignment_0_2"
    // InternalMyDsl.g:2068:1: rule__Attribute__TypeNameAssignment_0_2 : ( ruleEString ) ;
    public final void rule__Attribute__TypeNameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2072:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2073:2: ( ruleEString )
            {
            // InternalMyDsl.g:2073:2: ( ruleEString )
            // InternalMyDsl.g:2074:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getTypeNameEStringParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeNameEStringParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeNameAssignment_0_2"


    // $ANTLR start "rule__Attribute__IsNullableAssignment_0_3"
    // InternalMyDsl.g:2083:1: rule__Attribute__IsNullableAssignment_0_3 : ( ( '!' ) ) ;
    public final void rule__Attribute__IsNullableAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2087:1: ( ( ( '!' ) ) )
            // InternalMyDsl.g:2088:2: ( ( '!' ) )
            {
            // InternalMyDsl.g:2088:2: ( ( '!' ) )
            // InternalMyDsl.g:2089:3: ( '!' )
            {
             before(grammarAccess.getAttributeAccess().getIsNullableExclamationMarkKeyword_0_3_0()); 
            // InternalMyDsl.g:2090:3: ( '!' )
            // InternalMyDsl.g:2091:4: '!'
            {
             before(grammarAccess.getAttributeAccess().getIsNullableExclamationMarkKeyword_0_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsNullableExclamationMarkKeyword_0_3_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsNullableExclamationMarkKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__IsNullableAssignment_0_3"


    // $ANTLR start "rule__Attribute__NameAssignment_1_0"
    // InternalMyDsl.g:2102:1: rule__Attribute__NameAssignment_1_0 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2106:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2107:2: ( ruleEString )
            {
            // InternalMyDsl.g:2107:2: ( ruleEString )
            // InternalMyDsl.g:2108:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1_0"


    // $ANTLR start "rule__Attribute__TypeNameAssignment_1_2"
    // InternalMyDsl.g:2117:1: rule__Attribute__TypeNameAssignment_1_2 : ( ruleEString ) ;
    public final void rule__Attribute__TypeNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2121:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2122:2: ( ruleEString )
            {
            // InternalMyDsl.g:2122:2: ( ruleEString )
            // InternalMyDsl.g:2123:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getTypeNameEStringParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeNameEStringParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeNameAssignment_1_2"


    // $ANTLR start "rule__Attribute__IsArrayAssignment_1_3"
    // InternalMyDsl.g:2132:1: rule__Attribute__IsArrayAssignment_1_3 : ( ( ']' ) ) ;
    public final void rule__Attribute__IsArrayAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2136:1: ( ( ( ']' ) ) )
            // InternalMyDsl.g:2137:2: ( ( ']' ) )
            {
            // InternalMyDsl.g:2137:2: ( ( ']' ) )
            // InternalMyDsl.g:2138:3: ( ']' )
            {
             before(grammarAccess.getAttributeAccess().getIsArrayRightSquareBracketKeyword_1_3_0()); 
            // InternalMyDsl.g:2139:3: ( ']' )
            // InternalMyDsl.g:2140:4: ']'
            {
             before(grammarAccess.getAttributeAccess().getIsArrayRightSquareBracketKeyword_1_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsArrayRightSquareBracketKeyword_1_3_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsArrayRightSquareBracketKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__IsArrayAssignment_1_3"


    // $ANTLR start "rule__Attribute__NameAssignment_2_0"
    // InternalMyDsl.g:2151:1: rule__Attribute__NameAssignment_2_0 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2155:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2156:2: ( ruleEString )
            {
            // InternalMyDsl.g:2156:2: ( ruleEString )
            // InternalMyDsl.g:2157:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2_0"


    // $ANTLR start "rule__Attribute__TypeNameAssignment_2_2"
    // InternalMyDsl.g:2166:1: rule__Attribute__TypeNameAssignment_2_2 : ( ruleEString ) ;
    public final void rule__Attribute__TypeNameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2171:2: ( ruleEString )
            {
            // InternalMyDsl.g:2171:2: ( ruleEString )
            // InternalMyDsl.g:2172:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getTypeNameEStringParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeNameEStringParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeNameAssignment_2_2"


    // $ANTLR start "rule__Attribute__IsArrayAssignment_2_3"
    // InternalMyDsl.g:2181:1: rule__Attribute__IsArrayAssignment_2_3 : ( ( ']' ) ) ;
    public final void rule__Attribute__IsArrayAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2185:1: ( ( ( ']' ) ) )
            // InternalMyDsl.g:2186:2: ( ( ']' ) )
            {
            // InternalMyDsl.g:2186:2: ( ( ']' ) )
            // InternalMyDsl.g:2187:3: ( ']' )
            {
             before(grammarAccess.getAttributeAccess().getIsArrayRightSquareBracketKeyword_2_3_0()); 
            // InternalMyDsl.g:2188:3: ( ']' )
            // InternalMyDsl.g:2189:4: ']'
            {
             before(grammarAccess.getAttributeAccess().getIsArrayRightSquareBracketKeyword_2_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsArrayRightSquareBracketKeyword_2_3_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsArrayRightSquareBracketKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__IsArrayAssignment_2_3"


    // $ANTLR start "rule__Attribute__IsNullableAssignment_2_4"
    // InternalMyDsl.g:2200:1: rule__Attribute__IsNullableAssignment_2_4 : ( ( '!' ) ) ;
    public final void rule__Attribute__IsNullableAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( ( ( '!' ) ) )
            // InternalMyDsl.g:2205:2: ( ( '!' ) )
            {
            // InternalMyDsl.g:2205:2: ( ( '!' ) )
            // InternalMyDsl.g:2206:3: ( '!' )
            {
             before(grammarAccess.getAttributeAccess().getIsNullableExclamationMarkKeyword_2_4_0()); 
            // InternalMyDsl.g:2207:3: ( '!' )
            // InternalMyDsl.g:2208:4: '!'
            {
             before(grammarAccess.getAttributeAccess().getIsNullableExclamationMarkKeyword_2_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsNullableExclamationMarkKeyword_2_4_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsNullableExclamationMarkKeyword_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__IsNullableAssignment_2_4"


    // $ANTLR start "rule__Attribute__NameAssignment_3_0"
    // InternalMyDsl.g:2219:1: rule__Attribute__NameAssignment_3_0 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2223:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2224:2: ( ruleEString )
            {
            // InternalMyDsl.g:2224:2: ( ruleEString )
            // InternalMyDsl.g:2225:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_3_0"


    // $ANTLR start "rule__Attribute__TypeNameAssignment_3_2"
    // InternalMyDsl.g:2234:1: rule__Attribute__TypeNameAssignment_3_2 : ( ruleEString ) ;
    public final void rule__Attribute__TypeNameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2238:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2239:2: ( ruleEString )
            {
            // InternalMyDsl.g:2239:2: ( ruleEString )
            // InternalMyDsl.g:2240:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getTypeNameEStringParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeNameEStringParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeNameAssignment_3_2"


    // $ANTLR start "rule__SystemType__NameAssignment_1"
    // InternalMyDsl.g:2249:1: rule__SystemType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SystemType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2253:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2254:2: ( ruleEString )
            {
            // InternalMyDsl.g:2254:2: ( ruleEString )
            // InternalMyDsl.g:2255:3: ruleEString
            {
             before(grammarAccess.getSystemTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemTypeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__NameAssignment_1"


    // $ANTLR start "rule__SystemType__AttributeAssignment_3"
    // InternalMyDsl.g:2264:1: rule__SystemType__AttributeAssignment_3 : ( ruleAttribute ) ;
    public final void rule__SystemType__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2268:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:2269:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:2269:2: ( ruleAttribute )
            // InternalMyDsl.g:2270:3: ruleAttribute
            {
             before(grammarAccess.getSystemTypeAccess().getAttributeAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSystemTypeAccess().getAttributeAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__AttributeAssignment_3"


    // $ANTLR start "rule__SystemType__AttributeAssignment_4"
    // InternalMyDsl.g:2279:1: rule__SystemType__AttributeAssignment_4 : ( ruleAttribute ) ;
    public final void rule__SystemType__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2283:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:2284:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:2284:2: ( ruleAttribute )
            // InternalMyDsl.g:2285:3: ruleAttribute
            {
             before(grammarAccess.getSystemTypeAccess().getAttributeAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSystemTypeAccess().getAttributeAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__AttributeAssignment_4"


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // InternalMyDsl.g:2294:1: rule__Enum__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2298:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2299:2: ( ruleEString )
            {
            // InternalMyDsl.g:2299:2: ( ruleEString )
            // InternalMyDsl.g:2300:3: ruleEString
            {
             before(grammarAccess.getEnumAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__NameAssignment_1"


    // $ANTLR start "rule__Enum__AttributeAssignment_5"
    // InternalMyDsl.g:2309:1: rule__Enum__AttributeAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Enum__AttributeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2313:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:2314:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:2314:2: ( ruleAttribute )
            // InternalMyDsl.g:2315:3: ruleAttribute
            {
             before(grammarAccess.getEnumAccess().getAttributeAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getAttributeAttributeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__AttributeAssignment_5"


    // $ANTLR start "rule__Enum__AttributeAssignment_6_1"
    // InternalMyDsl.g:2324:1: rule__Enum__AttributeAssignment_6_1 : ( ruleAttribute ) ;
    public final void rule__Enum__AttributeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2328:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:2329:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:2329:2: ( ruleAttribute )
            // InternalMyDsl.g:2330:3: ruleAttribute
            {
             before(grammarAccess.getEnumAccess().getAttributeAttributeParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getAttributeAttributeParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__AttributeAssignment_6_1"


    // $ANTLR start "rule__Enum__EnumvalueAssignment_10"
    // InternalMyDsl.g:2339:1: rule__Enum__EnumvalueAssignment_10 : ( ruleEnumValue ) ;
    public final void rule__Enum__EnumvalueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2343:1: ( ( ruleEnumValue ) )
            // InternalMyDsl.g:2344:2: ( ruleEnumValue )
            {
            // InternalMyDsl.g:2344:2: ( ruleEnumValue )
            // InternalMyDsl.g:2345:3: ruleEnumValue
            {
             before(grammarAccess.getEnumAccess().getEnumvalueEnumValueParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getEnumvalueEnumValueParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__EnumvalueAssignment_10"


    // $ANTLR start "rule__Enum__EnumvalueAssignment_11_1"
    // InternalMyDsl.g:2354:1: rule__Enum__EnumvalueAssignment_11_1 : ( ruleEnumValue ) ;
    public final void rule__Enum__EnumvalueAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2358:1: ( ( ruleEnumValue ) )
            // InternalMyDsl.g:2359:2: ( ruleEnumValue )
            {
            // InternalMyDsl.g:2359:2: ( ruleEnumValue )
            // InternalMyDsl.g:2360:3: ruleEnumValue
            {
             before(grammarAccess.getEnumAccess().getEnumvalueEnumValueParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getEnumvalueEnumValueParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__EnumvalueAssignment_11_1"


    // $ANTLR start "rule__EnumValue__ValueAssignment_3_1"
    // InternalMyDsl.g:2369:1: rule__EnumValue__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__EnumValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2373:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2374:2: ( ruleEString )
            {
            // InternalMyDsl.g:2374:2: ( ruleEString )
            // InternalMyDsl.g:2375:3: ruleEString
            {
             before(grammarAccess.getEnumValueAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumValueAccess().getValueEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__ValueAssignment_3_1"


    // $ANTLR start "rule__EnumValue__NumberAssignment_4_1"
    // InternalMyDsl.g:2384:1: rule__EnumValue__NumberAssignment_4_1 : ( ruleInt1 ) ;
    public final void rule__EnumValue__NumberAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2388:1: ( ( ruleInt1 ) )
            // InternalMyDsl.g:2389:2: ( ruleInt1 )
            {
            // InternalMyDsl.g:2389:2: ( ruleInt1 )
            // InternalMyDsl.g:2390:3: ruleInt1
            {
             before(grammarAccess.getEnumValueAccess().getNumberInt1ParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInt1();

            state._fsp--;

             after(grammarAccess.getEnumValueAccess().getNumberInt1ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__NumberAssignment_4_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\4\uffff\2\6\1\uffff\1\12\3\uffff";
    static final String dfa_3s = "\1\4\2\23\3\4\1\uffff\1\4\3\uffff";
    static final String dfa_4s = "\1\5\2\23\1\5\2\37\1\uffff\1\36\3\uffff";
    static final String dfa_5s = "\6\uffff\1\4\1\uffff\1\1\1\3\1\2";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2",
            "\1\3",
            "\1\3",
            "\1\4\1\5",
            "\2\6\14\uffff\1\6\7\uffff\1\6\3\uffff\1\10\1\7",
            "\2\6\14\uffff\1\6\7\uffff\1\6\3\uffff\1\10\1\7",
            "",
            "\2\12\14\uffff\1\12\7\uffff\1\12\3\uffff\1\11",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "449:1: rule__Attribute__Alternatives : ( ( ( rule__Attribute__Group_0__0 ) ) | ( ( rule__Attribute__Group_1__0 ) ) | ( ( rule__Attribute__Group_2__0 ) ) | ( ( rule__Attribute__Group_3__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000050F800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000050F802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000030040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});

}
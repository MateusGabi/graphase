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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Int'", "'Float'", "'String'", "'Boolean'", "'ID'", "'Schema {'", "'name:'", "'}'", "':'", "'type '", "' {'", "'Enum'", "'{'", "'attribute'", "'enumvalue'", "','", "'EnumValue'", "'value'", "'number'"
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
    // InternalMyDsl.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Attribute__Group__0 )
            // InternalMyDsl.g:144:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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


    // $ANTLR start "rule__Schema__Group__0"
    // InternalMyDsl.g:449:1: rule__Schema__Group__0 : rule__Schema__Group__0__Impl rule__Schema__Group__1 ;
    public final void rule__Schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( rule__Schema__Group__0__Impl rule__Schema__Group__1 )
            // InternalMyDsl.g:454:2: rule__Schema__Group__0__Impl rule__Schema__Group__1
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
    // InternalMyDsl.g:461:1: rule__Schema__Group__0__Impl : ( 'Schema {' ) ;
    public final void rule__Schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:465:1: ( ( 'Schema {' ) )
            // InternalMyDsl.g:466:1: ( 'Schema {' )
            {
            // InternalMyDsl.g:466:1: ( 'Schema {' )
            // InternalMyDsl.g:467:2: 'Schema {'
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
    // InternalMyDsl.g:476:1: rule__Schema__Group__1 : rule__Schema__Group__1__Impl rule__Schema__Group__2 ;
    public final void rule__Schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( rule__Schema__Group__1__Impl rule__Schema__Group__2 )
            // InternalMyDsl.g:481:2: rule__Schema__Group__1__Impl rule__Schema__Group__2
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
    // InternalMyDsl.g:488:1: rule__Schema__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:492:1: ( ( 'name:' ) )
            // InternalMyDsl.g:493:1: ( 'name:' )
            {
            // InternalMyDsl.g:493:1: ( 'name:' )
            // InternalMyDsl.g:494:2: 'name:'
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
    // InternalMyDsl.g:503:1: rule__Schema__Group__2 : rule__Schema__Group__2__Impl rule__Schema__Group__3 ;
    public final void rule__Schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( rule__Schema__Group__2__Impl rule__Schema__Group__3 )
            // InternalMyDsl.g:508:2: rule__Schema__Group__2__Impl rule__Schema__Group__3
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
    // InternalMyDsl.g:515:1: rule__Schema__Group__2__Impl : ( ( rule__Schema__NameAssignment_2 ) ) ;
    public final void rule__Schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:519:1: ( ( ( rule__Schema__NameAssignment_2 ) ) )
            // InternalMyDsl.g:520:1: ( ( rule__Schema__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:520:1: ( ( rule__Schema__NameAssignment_2 ) )
            // InternalMyDsl.g:521:2: ( rule__Schema__NameAssignment_2 )
            {
             before(grammarAccess.getSchemaAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:522:2: ( rule__Schema__NameAssignment_2 )
            // InternalMyDsl.g:522:3: rule__Schema__NameAssignment_2
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
    // InternalMyDsl.g:530:1: rule__Schema__Group__3 : rule__Schema__Group__3__Impl rule__Schema__Group__4 ;
    public final void rule__Schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:534:1: ( rule__Schema__Group__3__Impl rule__Schema__Group__4 )
            // InternalMyDsl.g:535:2: rule__Schema__Group__3__Impl rule__Schema__Group__4
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
    // InternalMyDsl.g:542:1: rule__Schema__Group__3__Impl : ( '}' ) ;
    public final void rule__Schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:546:1: ( ( '}' ) )
            // InternalMyDsl.g:547:1: ( '}' )
            {
            // InternalMyDsl.g:547:1: ( '}' )
            // InternalMyDsl.g:548:2: '}'
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
    // InternalMyDsl.g:557:1: rule__Schema__Group__4 : rule__Schema__Group__4__Impl rule__Schema__Group__5 ;
    public final void rule__Schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( rule__Schema__Group__4__Impl rule__Schema__Group__5 )
            // InternalMyDsl.g:562:2: rule__Schema__Group__4__Impl rule__Schema__Group__5
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
    // InternalMyDsl.g:569:1: rule__Schema__Group__4__Impl : ( ( rule__Schema__TypeAssignment_4 ) ) ;
    public final void rule__Schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:573:1: ( ( ( rule__Schema__TypeAssignment_4 ) ) )
            // InternalMyDsl.g:574:1: ( ( rule__Schema__TypeAssignment_4 ) )
            {
            // InternalMyDsl.g:574:1: ( ( rule__Schema__TypeAssignment_4 ) )
            // InternalMyDsl.g:575:2: ( rule__Schema__TypeAssignment_4 )
            {
             before(grammarAccess.getSchemaAccess().getTypeAssignment_4()); 
            // InternalMyDsl.g:576:2: ( rule__Schema__TypeAssignment_4 )
            // InternalMyDsl.g:576:3: rule__Schema__TypeAssignment_4
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
    // InternalMyDsl.g:584:1: rule__Schema__Group__5 : rule__Schema__Group__5__Impl ;
    public final void rule__Schema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:588:1: ( rule__Schema__Group__5__Impl )
            // InternalMyDsl.g:589:2: rule__Schema__Group__5__Impl
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
    // InternalMyDsl.g:595:1: rule__Schema__Group__5__Impl : ( ( rule__Schema__TypeAssignment_5 )* ) ;
    public final void rule__Schema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:599:1: ( ( ( rule__Schema__TypeAssignment_5 )* ) )
            // InternalMyDsl.g:600:1: ( ( rule__Schema__TypeAssignment_5 )* )
            {
            // InternalMyDsl.g:600:1: ( ( rule__Schema__TypeAssignment_5 )* )
            // InternalMyDsl.g:601:2: ( rule__Schema__TypeAssignment_5 )*
            {
             before(grammarAccess.getSchemaAccess().getTypeAssignment_5()); 
            // InternalMyDsl.g:602:2: ( rule__Schema__TypeAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=15)||LA3_0==20||LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:602:3: rule__Schema__TypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Schema__TypeAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDsl.g:611:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:615:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:616:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDsl.g:623:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:627:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalMyDsl.g:628:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:628:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalMyDsl.g:629:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:630:2: ( rule__Attribute__NameAssignment_0 )
            // InternalMyDsl.g:630:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDsl.g:638:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:643:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDsl.g:650:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:654:1: ( ( ':' ) )
            // InternalMyDsl.g:655:1: ( ':' )
            {
            // InternalMyDsl.g:655:1: ( ':' )
            // InternalMyDsl.g:656:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyDsl.g:665:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:669:1: ( rule__Attribute__Group__2__Impl )
            // InternalMyDsl.g:670:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyDsl.g:676:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeNameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:680:1: ( ( ( rule__Attribute__TypeNameAssignment_2 ) ) )
            // InternalMyDsl.g:681:1: ( ( rule__Attribute__TypeNameAssignment_2 ) )
            {
            // InternalMyDsl.g:681:1: ( ( rule__Attribute__TypeNameAssignment_2 ) )
            // InternalMyDsl.g:682:2: ( rule__Attribute__TypeNameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeNameAssignment_2()); 
            // InternalMyDsl.g:683:2: ( rule__Attribute__TypeNameAssignment_2 )
            // InternalMyDsl.g:683:3: rule__Attribute__TypeNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeNameAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__SystemType__Group__0"
    // InternalMyDsl.g:692:1: rule__SystemType__Group__0 : rule__SystemType__Group__0__Impl rule__SystemType__Group__1 ;
    public final void rule__SystemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( rule__SystemType__Group__0__Impl rule__SystemType__Group__1 )
            // InternalMyDsl.g:697:2: rule__SystemType__Group__0__Impl rule__SystemType__Group__1
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
    // InternalMyDsl.g:704:1: rule__SystemType__Group__0__Impl : ( ( ( 'type ' ) ) ( ( 'type ' )* ) ) ;
    public final void rule__SystemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:708:1: ( ( ( ( 'type ' ) ) ( ( 'type ' )* ) ) )
            // InternalMyDsl.g:709:1: ( ( ( 'type ' ) ) ( ( 'type ' )* ) )
            {
            // InternalMyDsl.g:709:1: ( ( ( 'type ' ) ) ( ( 'type ' )* ) )
            // InternalMyDsl.g:710:2: ( ( 'type ' ) ) ( ( 'type ' )* )
            {
            // InternalMyDsl.g:710:2: ( ( 'type ' ) )
            // InternalMyDsl.g:711:3: ( 'type ' )
            {
             before(grammarAccess.getSystemTypeAccess().getTypeKeyword_0()); 
            // InternalMyDsl.g:712:3: ( 'type ' )
            // InternalMyDsl.g:712:4: 'type '
            {
            match(input,20,FOLLOW_9); 

            }

             after(grammarAccess.getSystemTypeAccess().getTypeKeyword_0()); 

            }

            // InternalMyDsl.g:715:2: ( ( 'type ' )* )
            // InternalMyDsl.g:716:3: ( 'type ' )*
            {
             before(grammarAccess.getSystemTypeAccess().getTypeKeyword_0()); 
            // InternalMyDsl.g:717:3: ( 'type ' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:717:4: 'type '
            	    {
            	    match(input,20,FOLLOW_9); 

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalMyDsl.g:726:1: rule__SystemType__Group__1 : rule__SystemType__Group__1__Impl rule__SystemType__Group__2 ;
    public final void rule__SystemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( rule__SystemType__Group__1__Impl rule__SystemType__Group__2 )
            // InternalMyDsl.g:731:2: rule__SystemType__Group__1__Impl rule__SystemType__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:738:1: rule__SystemType__Group__1__Impl : ( ( ( rule__SystemType__NameAssignment_1 ) ) ( ( rule__SystemType__NameAssignment_1 )* ) ) ;
    public final void rule__SystemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( ( ( ( rule__SystemType__NameAssignment_1 ) ) ( ( rule__SystemType__NameAssignment_1 )* ) ) )
            // InternalMyDsl.g:743:1: ( ( ( rule__SystemType__NameAssignment_1 ) ) ( ( rule__SystemType__NameAssignment_1 )* ) )
            {
            // InternalMyDsl.g:743:1: ( ( ( rule__SystemType__NameAssignment_1 ) ) ( ( rule__SystemType__NameAssignment_1 )* ) )
            // InternalMyDsl.g:744:2: ( ( rule__SystemType__NameAssignment_1 ) ) ( ( rule__SystemType__NameAssignment_1 )* )
            {
            // InternalMyDsl.g:744:2: ( ( rule__SystemType__NameAssignment_1 ) )
            // InternalMyDsl.g:745:3: ( rule__SystemType__NameAssignment_1 )
            {
             before(grammarAccess.getSystemTypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:746:3: ( rule__SystemType__NameAssignment_1 )
            // InternalMyDsl.g:746:4: rule__SystemType__NameAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__SystemType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemTypeAccess().getNameAssignment_1()); 

            }

            // InternalMyDsl.g:749:2: ( ( rule__SystemType__NameAssignment_1 )* )
            // InternalMyDsl.g:750:3: ( rule__SystemType__NameAssignment_1 )*
            {
             before(grammarAccess.getSystemTypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:751:3: ( rule__SystemType__NameAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:751:4: rule__SystemType__NameAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SystemType__NameAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalMyDsl.g:760:1: rule__SystemType__Group__2 : rule__SystemType__Group__2__Impl rule__SystemType__Group__3 ;
    public final void rule__SystemType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:764:1: ( rule__SystemType__Group__2__Impl rule__SystemType__Group__3 )
            // InternalMyDsl.g:765:2: rule__SystemType__Group__2__Impl rule__SystemType__Group__3
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
    // InternalMyDsl.g:772:1: rule__SystemType__Group__2__Impl : ( ' {' ) ;
    public final void rule__SystemType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:776:1: ( ( ' {' ) )
            // InternalMyDsl.g:777:1: ( ' {' )
            {
            // InternalMyDsl.g:777:1: ( ' {' )
            // InternalMyDsl.g:778:2: ' {'
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
    // InternalMyDsl.g:787:1: rule__SystemType__Group__3 : rule__SystemType__Group__3__Impl rule__SystemType__Group__4 ;
    public final void rule__SystemType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:1: ( rule__SystemType__Group__3__Impl rule__SystemType__Group__4 )
            // InternalMyDsl.g:792:2: rule__SystemType__Group__3__Impl rule__SystemType__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:799:1: rule__SystemType__Group__3__Impl : ( ( rule__SystemType__AttributeAssignment_3 ) ) ;
    public final void rule__SystemType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:803:1: ( ( ( rule__SystemType__AttributeAssignment_3 ) ) )
            // InternalMyDsl.g:804:1: ( ( rule__SystemType__AttributeAssignment_3 ) )
            {
            // InternalMyDsl.g:804:1: ( ( rule__SystemType__AttributeAssignment_3 ) )
            // InternalMyDsl.g:805:2: ( rule__SystemType__AttributeAssignment_3 )
            {
             before(grammarAccess.getSystemTypeAccess().getAttributeAssignment_3()); 
            // InternalMyDsl.g:806:2: ( rule__SystemType__AttributeAssignment_3 )
            // InternalMyDsl.g:806:3: rule__SystemType__AttributeAssignment_3
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
    // InternalMyDsl.g:814:1: rule__SystemType__Group__4 : rule__SystemType__Group__4__Impl rule__SystemType__Group__5 ;
    public final void rule__SystemType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:818:1: ( rule__SystemType__Group__4__Impl rule__SystemType__Group__5 )
            // InternalMyDsl.g:819:2: rule__SystemType__Group__4__Impl rule__SystemType__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:826:1: rule__SystemType__Group__4__Impl : ( ( rule__SystemType__AttributeAssignment_4 )* ) ;
    public final void rule__SystemType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:830:1: ( ( ( rule__SystemType__AttributeAssignment_4 )* ) )
            // InternalMyDsl.g:831:1: ( ( rule__SystemType__AttributeAssignment_4 )* )
            {
            // InternalMyDsl.g:831:1: ( ( rule__SystemType__AttributeAssignment_4 )* )
            // InternalMyDsl.g:832:2: ( rule__SystemType__AttributeAssignment_4 )*
            {
             before(grammarAccess.getSystemTypeAccess().getAttributeAssignment_4()); 
            // InternalMyDsl.g:833:2: ( rule__SystemType__AttributeAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:833:3: rule__SystemType__AttributeAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SystemType__AttributeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMyDsl.g:841:1: rule__SystemType__Group__5 : rule__SystemType__Group__5__Impl ;
    public final void rule__SystemType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:845:1: ( rule__SystemType__Group__5__Impl )
            // InternalMyDsl.g:846:2: rule__SystemType__Group__5__Impl
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
    // InternalMyDsl.g:852:1: rule__SystemType__Group__5__Impl : ( '}' ) ;
    public final void rule__SystemType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:856:1: ( ( '}' ) )
            // InternalMyDsl.g:857:1: ( '}' )
            {
            // InternalMyDsl.g:857:1: ( '}' )
            // InternalMyDsl.g:858:2: '}'
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
    // InternalMyDsl.g:868:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:872:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalMyDsl.g:873:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
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
    // InternalMyDsl.g:880:1: rule__Enum__Group__0__Impl : ( 'Enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:884:1: ( ( 'Enum' ) )
            // InternalMyDsl.g:885:1: ( 'Enum' )
            {
            // InternalMyDsl.g:885:1: ( 'Enum' )
            // InternalMyDsl.g:886:2: 'Enum'
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
    // InternalMyDsl.g:895:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:899:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalMyDsl.g:900:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:907:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:911:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // InternalMyDsl.g:912:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:912:1: ( ( rule__Enum__NameAssignment_1 ) )
            // InternalMyDsl.g:913:2: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:914:2: ( rule__Enum__NameAssignment_1 )
            // InternalMyDsl.g:914:3: rule__Enum__NameAssignment_1
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
    // InternalMyDsl.g:922:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:926:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalMyDsl.g:927:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:934:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:938:1: ( ( '{' ) )
            // InternalMyDsl.g:939:1: ( '{' )
            {
            // InternalMyDsl.g:939:1: ( '{' )
            // InternalMyDsl.g:940:2: '{'
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
    // InternalMyDsl.g:949:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // InternalMyDsl.g:954:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:961:1: rule__Enum__Group__3__Impl : ( 'attribute' ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:965:1: ( ( 'attribute' ) )
            // InternalMyDsl.g:966:1: ( 'attribute' )
            {
            // InternalMyDsl.g:966:1: ( 'attribute' )
            // InternalMyDsl.g:967:2: 'attribute'
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
    // InternalMyDsl.g:976:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:980:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // InternalMyDsl.g:981:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
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
    // InternalMyDsl.g:988:1: rule__Enum__Group__4__Impl : ( '{' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:992:1: ( ( '{' ) )
            // InternalMyDsl.g:993:1: ( '{' )
            {
            // InternalMyDsl.g:993:1: ( '{' )
            // InternalMyDsl.g:994:2: '{'
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
    // InternalMyDsl.g:1003:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl rule__Enum__Group__6 ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1007:1: ( rule__Enum__Group__5__Impl rule__Enum__Group__6 )
            // InternalMyDsl.g:1008:2: rule__Enum__Group__5__Impl rule__Enum__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1015:1: rule__Enum__Group__5__Impl : ( ( rule__Enum__AttributeAssignment_5 ) ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1019:1: ( ( ( rule__Enum__AttributeAssignment_5 ) ) )
            // InternalMyDsl.g:1020:1: ( ( rule__Enum__AttributeAssignment_5 ) )
            {
            // InternalMyDsl.g:1020:1: ( ( rule__Enum__AttributeAssignment_5 ) )
            // InternalMyDsl.g:1021:2: ( rule__Enum__AttributeAssignment_5 )
            {
             before(grammarAccess.getEnumAccess().getAttributeAssignment_5()); 
            // InternalMyDsl.g:1022:2: ( rule__Enum__AttributeAssignment_5 )
            // InternalMyDsl.g:1022:3: rule__Enum__AttributeAssignment_5
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
    // InternalMyDsl.g:1030:1: rule__Enum__Group__6 : rule__Enum__Group__6__Impl rule__Enum__Group__7 ;
    public final void rule__Enum__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1034:1: ( rule__Enum__Group__6__Impl rule__Enum__Group__7 )
            // InternalMyDsl.g:1035:2: rule__Enum__Group__6__Impl rule__Enum__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1042:1: rule__Enum__Group__6__Impl : ( ( rule__Enum__Group_6__0 )* ) ;
    public final void rule__Enum__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1046:1: ( ( ( rule__Enum__Group_6__0 )* ) )
            // InternalMyDsl.g:1047:1: ( ( rule__Enum__Group_6__0 )* )
            {
            // InternalMyDsl.g:1047:1: ( ( rule__Enum__Group_6__0 )* )
            // InternalMyDsl.g:1048:2: ( rule__Enum__Group_6__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_6()); 
            // InternalMyDsl.g:1049:2: ( rule__Enum__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1049:3: rule__Enum__Group_6__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Enum__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMyDsl.g:1057:1: rule__Enum__Group__7 : rule__Enum__Group__7__Impl rule__Enum__Group__8 ;
    public final void rule__Enum__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( rule__Enum__Group__7__Impl rule__Enum__Group__8 )
            // InternalMyDsl.g:1062:2: rule__Enum__Group__7__Impl rule__Enum__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1069:1: rule__Enum__Group__7__Impl : ( '}' ) ;
    public final void rule__Enum__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1073:1: ( ( '}' ) )
            // InternalMyDsl.g:1074:1: ( '}' )
            {
            // InternalMyDsl.g:1074:1: ( '}' )
            // InternalMyDsl.g:1075:2: '}'
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
    // InternalMyDsl.g:1084:1: rule__Enum__Group__8 : rule__Enum__Group__8__Impl rule__Enum__Group__9 ;
    public final void rule__Enum__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1088:1: ( rule__Enum__Group__8__Impl rule__Enum__Group__9 )
            // InternalMyDsl.g:1089:2: rule__Enum__Group__8__Impl rule__Enum__Group__9
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1096:1: rule__Enum__Group__8__Impl : ( 'enumvalue' ) ;
    public final void rule__Enum__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1100:1: ( ( 'enumvalue' ) )
            // InternalMyDsl.g:1101:1: ( 'enumvalue' )
            {
            // InternalMyDsl.g:1101:1: ( 'enumvalue' )
            // InternalMyDsl.g:1102:2: 'enumvalue'
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
    // InternalMyDsl.g:1111:1: rule__Enum__Group__9 : rule__Enum__Group__9__Impl rule__Enum__Group__10 ;
    public final void rule__Enum__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( rule__Enum__Group__9__Impl rule__Enum__Group__10 )
            // InternalMyDsl.g:1116:2: rule__Enum__Group__9__Impl rule__Enum__Group__10
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1123:1: rule__Enum__Group__9__Impl : ( '{' ) ;
    public final void rule__Enum__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1127:1: ( ( '{' ) )
            // InternalMyDsl.g:1128:1: ( '{' )
            {
            // InternalMyDsl.g:1128:1: ( '{' )
            // InternalMyDsl.g:1129:2: '{'
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
    // InternalMyDsl.g:1138:1: rule__Enum__Group__10 : rule__Enum__Group__10__Impl rule__Enum__Group__11 ;
    public final void rule__Enum__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1142:1: ( rule__Enum__Group__10__Impl rule__Enum__Group__11 )
            // InternalMyDsl.g:1143:2: rule__Enum__Group__10__Impl rule__Enum__Group__11
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1150:1: rule__Enum__Group__10__Impl : ( ( rule__Enum__EnumvalueAssignment_10 ) ) ;
    public final void rule__Enum__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1154:1: ( ( ( rule__Enum__EnumvalueAssignment_10 ) ) )
            // InternalMyDsl.g:1155:1: ( ( rule__Enum__EnumvalueAssignment_10 ) )
            {
            // InternalMyDsl.g:1155:1: ( ( rule__Enum__EnumvalueAssignment_10 ) )
            // InternalMyDsl.g:1156:2: ( rule__Enum__EnumvalueAssignment_10 )
            {
             before(grammarAccess.getEnumAccess().getEnumvalueAssignment_10()); 
            // InternalMyDsl.g:1157:2: ( rule__Enum__EnumvalueAssignment_10 )
            // InternalMyDsl.g:1157:3: rule__Enum__EnumvalueAssignment_10
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
    // InternalMyDsl.g:1165:1: rule__Enum__Group__11 : rule__Enum__Group__11__Impl rule__Enum__Group__12 ;
    public final void rule__Enum__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1169:1: ( rule__Enum__Group__11__Impl rule__Enum__Group__12 )
            // InternalMyDsl.g:1170:2: rule__Enum__Group__11__Impl rule__Enum__Group__12
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1177:1: rule__Enum__Group__11__Impl : ( ( rule__Enum__Group_11__0 )* ) ;
    public final void rule__Enum__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1181:1: ( ( ( rule__Enum__Group_11__0 )* ) )
            // InternalMyDsl.g:1182:1: ( ( rule__Enum__Group_11__0 )* )
            {
            // InternalMyDsl.g:1182:1: ( ( rule__Enum__Group_11__0 )* )
            // InternalMyDsl.g:1183:2: ( rule__Enum__Group_11__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_11()); 
            // InternalMyDsl.g:1184:2: ( rule__Enum__Group_11__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1184:3: rule__Enum__Group_11__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Enum__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMyDsl.g:1192:1: rule__Enum__Group__12 : rule__Enum__Group__12__Impl rule__Enum__Group__13 ;
    public final void rule__Enum__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1196:1: ( rule__Enum__Group__12__Impl rule__Enum__Group__13 )
            // InternalMyDsl.g:1197:2: rule__Enum__Group__12__Impl rule__Enum__Group__13
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
    // InternalMyDsl.g:1204:1: rule__Enum__Group__12__Impl : ( '}' ) ;
    public final void rule__Enum__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1208:1: ( ( '}' ) )
            // InternalMyDsl.g:1209:1: ( '}' )
            {
            // InternalMyDsl.g:1209:1: ( '}' )
            // InternalMyDsl.g:1210:2: '}'
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
    // InternalMyDsl.g:1219:1: rule__Enum__Group__13 : rule__Enum__Group__13__Impl ;
    public final void rule__Enum__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1223:1: ( rule__Enum__Group__13__Impl )
            // InternalMyDsl.g:1224:2: rule__Enum__Group__13__Impl
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
    // InternalMyDsl.g:1230:1: rule__Enum__Group__13__Impl : ( '}' ) ;
    public final void rule__Enum__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1234:1: ( ( '}' ) )
            // InternalMyDsl.g:1235:1: ( '}' )
            {
            // InternalMyDsl.g:1235:1: ( '}' )
            // InternalMyDsl.g:1236:2: '}'
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
    // InternalMyDsl.g:1246:1: rule__Enum__Group_6__0 : rule__Enum__Group_6__0__Impl rule__Enum__Group_6__1 ;
    public final void rule__Enum__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1250:1: ( rule__Enum__Group_6__0__Impl rule__Enum__Group_6__1 )
            // InternalMyDsl.g:1251:2: rule__Enum__Group_6__0__Impl rule__Enum__Group_6__1
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
    // InternalMyDsl.g:1258:1: rule__Enum__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1262:1: ( ( ',' ) )
            // InternalMyDsl.g:1263:1: ( ',' )
            {
            // InternalMyDsl.g:1263:1: ( ',' )
            // InternalMyDsl.g:1264:2: ','
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
    // InternalMyDsl.g:1273:1: rule__Enum__Group_6__1 : rule__Enum__Group_6__1__Impl ;
    public final void rule__Enum__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1277:1: ( rule__Enum__Group_6__1__Impl )
            // InternalMyDsl.g:1278:2: rule__Enum__Group_6__1__Impl
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
    // InternalMyDsl.g:1284:1: rule__Enum__Group_6__1__Impl : ( ( rule__Enum__AttributeAssignment_6_1 ) ) ;
    public final void rule__Enum__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( ( ( rule__Enum__AttributeAssignment_6_1 ) ) )
            // InternalMyDsl.g:1289:1: ( ( rule__Enum__AttributeAssignment_6_1 ) )
            {
            // InternalMyDsl.g:1289:1: ( ( rule__Enum__AttributeAssignment_6_1 ) )
            // InternalMyDsl.g:1290:2: ( rule__Enum__AttributeAssignment_6_1 )
            {
             before(grammarAccess.getEnumAccess().getAttributeAssignment_6_1()); 
            // InternalMyDsl.g:1291:2: ( rule__Enum__AttributeAssignment_6_1 )
            // InternalMyDsl.g:1291:3: rule__Enum__AttributeAssignment_6_1
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
    // InternalMyDsl.g:1300:1: rule__Enum__Group_11__0 : rule__Enum__Group_11__0__Impl rule__Enum__Group_11__1 ;
    public final void rule__Enum__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1304:1: ( rule__Enum__Group_11__0__Impl rule__Enum__Group_11__1 )
            // InternalMyDsl.g:1305:2: rule__Enum__Group_11__0__Impl rule__Enum__Group_11__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1312:1: rule__Enum__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1316:1: ( ( ',' ) )
            // InternalMyDsl.g:1317:1: ( ',' )
            {
            // InternalMyDsl.g:1317:1: ( ',' )
            // InternalMyDsl.g:1318:2: ','
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
    // InternalMyDsl.g:1327:1: rule__Enum__Group_11__1 : rule__Enum__Group_11__1__Impl ;
    public final void rule__Enum__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1331:1: ( rule__Enum__Group_11__1__Impl )
            // InternalMyDsl.g:1332:2: rule__Enum__Group_11__1__Impl
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
    // InternalMyDsl.g:1338:1: rule__Enum__Group_11__1__Impl : ( ( rule__Enum__EnumvalueAssignment_11_1 ) ) ;
    public final void rule__Enum__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1342:1: ( ( ( rule__Enum__EnumvalueAssignment_11_1 ) ) )
            // InternalMyDsl.g:1343:1: ( ( rule__Enum__EnumvalueAssignment_11_1 ) )
            {
            // InternalMyDsl.g:1343:1: ( ( rule__Enum__EnumvalueAssignment_11_1 ) )
            // InternalMyDsl.g:1344:2: ( rule__Enum__EnumvalueAssignment_11_1 )
            {
             before(grammarAccess.getEnumAccess().getEnumvalueAssignment_11_1()); 
            // InternalMyDsl.g:1345:2: ( rule__Enum__EnumvalueAssignment_11_1 )
            // InternalMyDsl.g:1345:3: rule__Enum__EnumvalueAssignment_11_1
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
    // InternalMyDsl.g:1354:1: rule__EnumValue__Group__0 : rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1 ;
    public final void rule__EnumValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1358:1: ( rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1 )
            // InternalMyDsl.g:1359:2: rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1366:1: rule__EnumValue__Group__0__Impl : ( () ) ;
    public final void rule__EnumValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1370:1: ( ( () ) )
            // InternalMyDsl.g:1371:1: ( () )
            {
            // InternalMyDsl.g:1371:1: ( () )
            // InternalMyDsl.g:1372:2: ()
            {
             before(grammarAccess.getEnumValueAccess().getEnumValueAction_0()); 
            // InternalMyDsl.g:1373:2: ()
            // InternalMyDsl.g:1373:3: 
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
    // InternalMyDsl.g:1381:1: rule__EnumValue__Group__1 : rule__EnumValue__Group__1__Impl rule__EnumValue__Group__2 ;
    public final void rule__EnumValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1385:1: ( rule__EnumValue__Group__1__Impl rule__EnumValue__Group__2 )
            // InternalMyDsl.g:1386:2: rule__EnumValue__Group__1__Impl rule__EnumValue__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1393:1: rule__EnumValue__Group__1__Impl : ( 'EnumValue' ) ;
    public final void rule__EnumValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1397:1: ( ( 'EnumValue' ) )
            // InternalMyDsl.g:1398:1: ( 'EnumValue' )
            {
            // InternalMyDsl.g:1398:1: ( 'EnumValue' )
            // InternalMyDsl.g:1399:2: 'EnumValue'
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
    // InternalMyDsl.g:1408:1: rule__EnumValue__Group__2 : rule__EnumValue__Group__2__Impl rule__EnumValue__Group__3 ;
    public final void rule__EnumValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1412:1: ( rule__EnumValue__Group__2__Impl rule__EnumValue__Group__3 )
            // InternalMyDsl.g:1413:2: rule__EnumValue__Group__2__Impl rule__EnumValue__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1420:1: rule__EnumValue__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1424:1: ( ( '{' ) )
            // InternalMyDsl.g:1425:1: ( '{' )
            {
            // InternalMyDsl.g:1425:1: ( '{' )
            // InternalMyDsl.g:1426:2: '{'
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
    // InternalMyDsl.g:1435:1: rule__EnumValue__Group__3 : rule__EnumValue__Group__3__Impl rule__EnumValue__Group__4 ;
    public final void rule__EnumValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1439:1: ( rule__EnumValue__Group__3__Impl rule__EnumValue__Group__4 )
            // InternalMyDsl.g:1440:2: rule__EnumValue__Group__3__Impl rule__EnumValue__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1447:1: rule__EnumValue__Group__3__Impl : ( ( rule__EnumValue__Group_3__0 )? ) ;
    public final void rule__EnumValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1451:1: ( ( ( rule__EnumValue__Group_3__0 )? ) )
            // InternalMyDsl.g:1452:1: ( ( rule__EnumValue__Group_3__0 )? )
            {
            // InternalMyDsl.g:1452:1: ( ( rule__EnumValue__Group_3__0 )? )
            // InternalMyDsl.g:1453:2: ( rule__EnumValue__Group_3__0 )?
            {
             before(grammarAccess.getEnumValueAccess().getGroup_3()); 
            // InternalMyDsl.g:1454:2: ( rule__EnumValue__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1454:3: rule__EnumValue__Group_3__0
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
    // InternalMyDsl.g:1462:1: rule__EnumValue__Group__4 : rule__EnumValue__Group__4__Impl rule__EnumValue__Group__5 ;
    public final void rule__EnumValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1466:1: ( rule__EnumValue__Group__4__Impl rule__EnumValue__Group__5 )
            // InternalMyDsl.g:1467:2: rule__EnumValue__Group__4__Impl rule__EnumValue__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1474:1: rule__EnumValue__Group__4__Impl : ( ( rule__EnumValue__Group_4__0 )? ) ;
    public final void rule__EnumValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1478:1: ( ( ( rule__EnumValue__Group_4__0 )? ) )
            // InternalMyDsl.g:1479:1: ( ( rule__EnumValue__Group_4__0 )? )
            {
            // InternalMyDsl.g:1479:1: ( ( rule__EnumValue__Group_4__0 )? )
            // InternalMyDsl.g:1480:2: ( rule__EnumValue__Group_4__0 )?
            {
             before(grammarAccess.getEnumValueAccess().getGroup_4()); 
            // InternalMyDsl.g:1481:2: ( rule__EnumValue__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1481:3: rule__EnumValue__Group_4__0
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
    // InternalMyDsl.g:1489:1: rule__EnumValue__Group__5 : rule__EnumValue__Group__5__Impl ;
    public final void rule__EnumValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1493:1: ( rule__EnumValue__Group__5__Impl )
            // InternalMyDsl.g:1494:2: rule__EnumValue__Group__5__Impl
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
    // InternalMyDsl.g:1500:1: rule__EnumValue__Group__5__Impl : ( '}' ) ;
    public final void rule__EnumValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1504:1: ( ( '}' ) )
            // InternalMyDsl.g:1505:1: ( '}' )
            {
            // InternalMyDsl.g:1505:1: ( '}' )
            // InternalMyDsl.g:1506:2: '}'
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
    // InternalMyDsl.g:1516:1: rule__EnumValue__Group_3__0 : rule__EnumValue__Group_3__0__Impl rule__EnumValue__Group_3__1 ;
    public final void rule__EnumValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1520:1: ( rule__EnumValue__Group_3__0__Impl rule__EnumValue__Group_3__1 )
            // InternalMyDsl.g:1521:2: rule__EnumValue__Group_3__0__Impl rule__EnumValue__Group_3__1
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
    // InternalMyDsl.g:1528:1: rule__EnumValue__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__EnumValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1532:1: ( ( 'value' ) )
            // InternalMyDsl.g:1533:1: ( 'value' )
            {
            // InternalMyDsl.g:1533:1: ( 'value' )
            // InternalMyDsl.g:1534:2: 'value'
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
    // InternalMyDsl.g:1543:1: rule__EnumValue__Group_3__1 : rule__EnumValue__Group_3__1__Impl ;
    public final void rule__EnumValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1547:1: ( rule__EnumValue__Group_3__1__Impl )
            // InternalMyDsl.g:1548:2: rule__EnumValue__Group_3__1__Impl
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
    // InternalMyDsl.g:1554:1: rule__EnumValue__Group_3__1__Impl : ( ( rule__EnumValue__ValueAssignment_3_1 ) ) ;
    public final void rule__EnumValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1558:1: ( ( ( rule__EnumValue__ValueAssignment_3_1 ) ) )
            // InternalMyDsl.g:1559:1: ( ( rule__EnumValue__ValueAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1559:1: ( ( rule__EnumValue__ValueAssignment_3_1 ) )
            // InternalMyDsl.g:1560:2: ( rule__EnumValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getEnumValueAccess().getValueAssignment_3_1()); 
            // InternalMyDsl.g:1561:2: ( rule__EnumValue__ValueAssignment_3_1 )
            // InternalMyDsl.g:1561:3: rule__EnumValue__ValueAssignment_3_1
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
    // InternalMyDsl.g:1570:1: rule__EnumValue__Group_4__0 : rule__EnumValue__Group_4__0__Impl rule__EnumValue__Group_4__1 ;
    public final void rule__EnumValue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1574:1: ( rule__EnumValue__Group_4__0__Impl rule__EnumValue__Group_4__1 )
            // InternalMyDsl.g:1575:2: rule__EnumValue__Group_4__0__Impl rule__EnumValue__Group_4__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1582:1: rule__EnumValue__Group_4__0__Impl : ( 'number' ) ;
    public final void rule__EnumValue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1586:1: ( ( 'number' ) )
            // InternalMyDsl.g:1587:1: ( 'number' )
            {
            // InternalMyDsl.g:1587:1: ( 'number' )
            // InternalMyDsl.g:1588:2: 'number'
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
    // InternalMyDsl.g:1597:1: rule__EnumValue__Group_4__1 : rule__EnumValue__Group_4__1__Impl ;
    public final void rule__EnumValue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1601:1: ( rule__EnumValue__Group_4__1__Impl )
            // InternalMyDsl.g:1602:2: rule__EnumValue__Group_4__1__Impl
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
    // InternalMyDsl.g:1608:1: rule__EnumValue__Group_4__1__Impl : ( ( rule__EnumValue__NumberAssignment_4_1 ) ) ;
    public final void rule__EnumValue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1612:1: ( ( ( rule__EnumValue__NumberAssignment_4_1 ) ) )
            // InternalMyDsl.g:1613:1: ( ( rule__EnumValue__NumberAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1613:1: ( ( rule__EnumValue__NumberAssignment_4_1 ) )
            // InternalMyDsl.g:1614:2: ( rule__EnumValue__NumberAssignment_4_1 )
            {
             before(grammarAccess.getEnumValueAccess().getNumberAssignment_4_1()); 
            // InternalMyDsl.g:1615:2: ( rule__EnumValue__NumberAssignment_4_1 )
            // InternalMyDsl.g:1615:3: rule__EnumValue__NumberAssignment_4_1
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
    // InternalMyDsl.g:1624:1: rule__Schema__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Schema__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1628:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1629:2: ( ruleEString )
            {
            // InternalMyDsl.g:1629:2: ( ruleEString )
            // InternalMyDsl.g:1630:3: ruleEString
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
    // InternalMyDsl.g:1639:1: rule__Schema__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__Schema__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1643:1: ( ( ruleType ) )
            // InternalMyDsl.g:1644:2: ( ruleType )
            {
            // InternalMyDsl.g:1644:2: ( ruleType )
            // InternalMyDsl.g:1645:3: ruleType
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
    // InternalMyDsl.g:1654:1: rule__Schema__TypeAssignment_5 : ( ruleType ) ;
    public final void rule__Schema__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1658:1: ( ( ruleType ) )
            // InternalMyDsl.g:1659:2: ( ruleType )
            {
            // InternalMyDsl.g:1659:2: ( ruleType )
            // InternalMyDsl.g:1660:3: ruleType
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


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalMyDsl.g:1669:1: rule__Attribute__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1673:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1674:2: ( ruleEString )
            {
            // InternalMyDsl.g:1674:2: ( ruleEString )
            // InternalMyDsl.g:1675:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeNameAssignment_2"
    // InternalMyDsl.g:1684:1: rule__Attribute__TypeNameAssignment_2 : ( ruleEString ) ;
    public final void rule__Attribute__TypeNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1688:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1689:2: ( ruleEString )
            {
            // InternalMyDsl.g:1689:2: ( ruleEString )
            // InternalMyDsl.g:1690:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getTypeNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__TypeNameAssignment_2"


    // $ANTLR start "rule__SystemType__NameAssignment_1"
    // InternalMyDsl.g:1699:1: rule__SystemType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SystemType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1703:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1704:2: ( ruleEString )
            {
            // InternalMyDsl.g:1704:2: ( ruleEString )
            // InternalMyDsl.g:1705:3: ruleEString
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
    // InternalMyDsl.g:1714:1: rule__SystemType__AttributeAssignment_3 : ( ruleAttribute ) ;
    public final void rule__SystemType__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:1719:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:1719:2: ( ruleAttribute )
            // InternalMyDsl.g:1720:3: ruleAttribute
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
    // InternalMyDsl.g:1729:1: rule__SystemType__AttributeAssignment_4 : ( ruleAttribute ) ;
    public final void rule__SystemType__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:1734:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:1734:2: ( ruleAttribute )
            // InternalMyDsl.g:1735:3: ruleAttribute
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
    // InternalMyDsl.g:1744:1: rule__Enum__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1748:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1749:2: ( ruleEString )
            {
            // InternalMyDsl.g:1749:2: ( ruleEString )
            // InternalMyDsl.g:1750:3: ruleEString
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
    // InternalMyDsl.g:1759:1: rule__Enum__AttributeAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Enum__AttributeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1763:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:1764:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:1764:2: ( ruleAttribute )
            // InternalMyDsl.g:1765:3: ruleAttribute
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
    // InternalMyDsl.g:1774:1: rule__Enum__AttributeAssignment_6_1 : ( ruleAttribute ) ;
    public final void rule__Enum__AttributeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1778:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:1779:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:1779:2: ( ruleAttribute )
            // InternalMyDsl.g:1780:3: ruleAttribute
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
    // InternalMyDsl.g:1789:1: rule__Enum__EnumvalueAssignment_10 : ( ruleEnumValue ) ;
    public final void rule__Enum__EnumvalueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1793:1: ( ( ruleEnumValue ) )
            // InternalMyDsl.g:1794:2: ( ruleEnumValue )
            {
            // InternalMyDsl.g:1794:2: ( ruleEnumValue )
            // InternalMyDsl.g:1795:3: ruleEnumValue
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
    // InternalMyDsl.g:1804:1: rule__Enum__EnumvalueAssignment_11_1 : ( ruleEnumValue ) ;
    public final void rule__Enum__EnumvalueAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1808:1: ( ( ruleEnumValue ) )
            // InternalMyDsl.g:1809:2: ( ruleEnumValue )
            {
            // InternalMyDsl.g:1809:2: ( ruleEnumValue )
            // InternalMyDsl.g:1810:3: ruleEnumValue
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
    // InternalMyDsl.g:1819:1: rule__EnumValue__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__EnumValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1823:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1824:2: ( ruleEString )
            {
            // InternalMyDsl.g:1824:2: ( ruleEString )
            // InternalMyDsl.g:1825:3: ruleEString
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
    // InternalMyDsl.g:1834:1: rule__EnumValue__NumberAssignment_4_1 : ( ruleInt1 ) ;
    public final void rule__EnumValue__NumberAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1838:1: ( ( ruleInt1 ) )
            // InternalMyDsl.g:1839:2: ( ruleInt1 )
            {
            // InternalMyDsl.g:1839:2: ( ruleInt1 )
            // InternalMyDsl.g:1840:3: ruleInt1
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000050F800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000050F802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000800L});

}
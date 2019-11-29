package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Schema {'", "'name:'", "'}'", "':'", "'type '", "' {'", "'Int'", "'Float'", "'String'", "'Boolean'", "'ID'", "'Enum'", "'{'", "'attribute'", "','", "'enumvalue'", "'EnumValue'", "'value'", "'number'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Schema";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSchema"
    // InternalMyDsl.g:64:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalMyDsl.g:64:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalMyDsl.g:65:2: iv_ruleSchema= ruleSchema EOF
            {
             newCompositeNode(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchema=ruleSchema();

            state._fsp--;

             current =iv_ruleSchema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalMyDsl.g:71:1: ruleSchema returns [EObject current=null] : (otherlv_0= 'Schema {' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' ( (lv_type_4_0= ruleType ) ) ( (lv_type_5_0= ruleType ) )* ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'Schema {' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' ( (lv_type_4_0= ruleType ) ) ( (lv_type_5_0= ruleType ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'Schema {' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' ( (lv_type_4_0= ruleType ) ) ( (lv_type_5_0= ruleType ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'Schema {' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' ( (lv_type_4_0= ruleType ) ) ( (lv_type_5_0= ruleType ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'Schema {' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' ( (lv_type_4_0= ruleType ) ) ( (lv_type_5_0= ruleType ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSchemaAccess().getSchemaKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaAccess().getNameKeyword_1());
            		
            // InternalMyDsl.g:87:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:88:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:88:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:89:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSchemaAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchemaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:110:3: ( (lv_type_4_0= ruleType ) )
            // InternalMyDsl.g:111:4: (lv_type_4_0= ruleType )
            {
            // InternalMyDsl.g:111:4: (lv_type_4_0= ruleType )
            // InternalMyDsl.g:112:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSchemaAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchemaRule());
            					}
            					add(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:129:3: ( (lv_type_5_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||(LA1_0>=17 && LA1_0<=22)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:130:4: (lv_type_5_0= ruleType )
            	    {
            	    // InternalMyDsl.g:130:4: (lv_type_5_0= ruleType )
            	    // InternalMyDsl.g:131:5: lv_type_5_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaAccess().getTypeTypeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_type_5_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"type",
            	    						lv_type_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Type");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:152:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:152:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:153:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:159:1: ruleType returns [EObject current=null] : (this_SystemType_0= ruleSystemType | this_Int0_1= ruleInt0 | this_Float_2= ruleFloat | this_String0_3= ruleString0 | this_Boolean_4= ruleBoolean | this_ID0_5= ruleID0 | this_Enum_6= ruleEnum ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SystemType_0 = null;

        EObject this_Int0_1 = null;

        EObject this_Float_2 = null;

        EObject this_String0_3 = null;

        EObject this_Boolean_4 = null;

        EObject this_ID0_5 = null;

        EObject this_Enum_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:165:2: ( (this_SystemType_0= ruleSystemType | this_Int0_1= ruleInt0 | this_Float_2= ruleFloat | this_String0_3= ruleString0 | this_Boolean_4= ruleBoolean | this_ID0_5= ruleID0 | this_Enum_6= ruleEnum ) )
            // InternalMyDsl.g:166:2: (this_SystemType_0= ruleSystemType | this_Int0_1= ruleInt0 | this_Float_2= ruleFloat | this_String0_3= ruleString0 | this_Boolean_4= ruleBoolean | this_ID0_5= ruleID0 | this_Enum_6= ruleEnum )
            {
            // InternalMyDsl.g:166:2: (this_SystemType_0= ruleSystemType | this_Int0_1= ruleInt0 | this_Float_2= ruleFloat | this_String0_3= ruleString0 | this_Boolean_4= ruleBoolean | this_ID0_5= ruleID0 | this_Enum_6= ruleEnum )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            case 22:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:167:3: this_SystemType_0= ruleSystemType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSystemTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemType_0=ruleSystemType();

                    state._fsp--;


                    			current = this_SystemType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:176:3: this_Int0_1= ruleInt0
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getInt0ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Int0_1=ruleInt0();

                    state._fsp--;


                    			current = this_Int0_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:185:3: this_Float_2= ruleFloat
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getFloatParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Float_2=ruleFloat();

                    state._fsp--;


                    			current = this_Float_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:194:3: this_String0_3= ruleString0
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getString0ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_String0_3=ruleString0();

                    state._fsp--;


                    			current = this_String0_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:203:3: this_Boolean_4= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBooleanParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_4=ruleBoolean();

                    state._fsp--;


                    			current = this_Boolean_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:212:3: this_ID0_5= ruleID0
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getID0ParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ID0_5=ruleID0();

                    state._fsp--;


                    			current = this_ID0_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:221:3: this_Enum_6= ruleEnum
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEnumParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enum_6=ruleEnum();

                    state._fsp--;


                    			current = this_Enum_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:233:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:233:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:234:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:240:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:246:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:247:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:247:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:248:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:256:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:267:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:267:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:268:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:274:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_typeName_2_0= ruleEString ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_typeName_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:280:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_typeName_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:281:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_typeName_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:281:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_typeName_2_0= ruleEString ) ) )
            // InternalMyDsl.g:282:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_typeName_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:282:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMyDsl.g:283:4: (lv_name_0_0= ruleEString )
            {
            // InternalMyDsl.g:283:4: (lv_name_0_0= ruleEString )
            // InternalMyDsl.g:284:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:305:3: ( (lv_typeName_2_0= ruleEString ) )
            // InternalMyDsl.g:306:4: (lv_typeName_2_0= ruleEString )
            {
            // InternalMyDsl.g:306:4: (lv_typeName_2_0= ruleEString )
            // InternalMyDsl.g:307:5: lv_typeName_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeName_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleSystemType"
    // InternalMyDsl.g:328:1: entryRuleSystemType returns [EObject current=null] : iv_ruleSystemType= ruleSystemType EOF ;
    public final EObject entryRuleSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemType = null;


        try {
            // InternalMyDsl.g:328:51: (iv_ruleSystemType= ruleSystemType EOF )
            // InternalMyDsl.g:329:2: iv_ruleSystemType= ruleSystemType EOF
            {
             newCompositeNode(grammarAccess.getSystemTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemType=ruleSystemType();

            state._fsp--;

             current =iv_ruleSystemType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemType"


    // $ANTLR start "ruleSystemType"
    // InternalMyDsl.g:335:1: ruleSystemType returns [EObject current=null] : ( (otherlv_0= 'type ' )+ ( (lv_name_1_0= ruleEString ) )+ otherlv_2= ' {' ( (lv_attribute_3_0= ruleAttribute ) ) ( (lv_attribute_4_0= ruleAttribute ) )* otherlv_5= '}' ) ;
    public final EObject ruleSystemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attribute_3_0 = null;

        EObject lv_attribute_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:341:2: ( ( (otherlv_0= 'type ' )+ ( (lv_name_1_0= ruleEString ) )+ otherlv_2= ' {' ( (lv_attribute_3_0= ruleAttribute ) ) ( (lv_attribute_4_0= ruleAttribute ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:342:2: ( (otherlv_0= 'type ' )+ ( (lv_name_1_0= ruleEString ) )+ otherlv_2= ' {' ( (lv_attribute_3_0= ruleAttribute ) ) ( (lv_attribute_4_0= ruleAttribute ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:342:2: ( (otherlv_0= 'type ' )+ ( (lv_name_1_0= ruleEString ) )+ otherlv_2= ' {' ( (lv_attribute_3_0= ruleAttribute ) ) ( (lv_attribute_4_0= ruleAttribute ) )* otherlv_5= '}' )
            // InternalMyDsl.g:343:3: (otherlv_0= 'type ' )+ ( (lv_name_1_0= ruleEString ) )+ otherlv_2= ' {' ( (lv_attribute_3_0= ruleAttribute ) ) ( (lv_attribute_4_0= ruleAttribute ) )* otherlv_5= '}'
            {
            // InternalMyDsl.g:343:3: (otherlv_0= 'type ' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:344:4: otherlv_0= 'type '
            	    {
            	    otherlv_0=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_0, grammarAccess.getSystemTypeAccess().getTypeKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalMyDsl.g:349:3: ( (lv_name_1_0= ruleEString ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:350:4: (lv_name_1_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:350:4: (lv_name_1_0= ruleEString )
            	    // InternalMyDsl.g:351:5: lv_name_1_0= ruleEString
            	    {

            	    					newCompositeNode(grammarAccess.getSystemTypeAccess().getNameEStringParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_name_1_0=ruleEString();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemTypeRule());
            	    					}
            	    					set(
            	    						current,
            	    						"name",
            	    						lv_name_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.EString");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemTypeAccess().getSpaceLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:372:3: ( (lv_attribute_3_0= ruleAttribute ) )
            // InternalMyDsl.g:373:4: (lv_attribute_3_0= ruleAttribute )
            {
            // InternalMyDsl.g:373:4: (lv_attribute_3_0= ruleAttribute )
            // InternalMyDsl.g:374:5: lv_attribute_3_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getSystemTypeAccess().getAttributeAttributeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_attribute_3_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemTypeRule());
            					}
            					add(
            						current,
            						"attribute",
            						lv_attribute_3_0,
            						"org.xtext.example.mydsl.MyDsl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:391:3: ( (lv_attribute_4_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:392:4: (lv_attribute_4_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:392:4: (lv_attribute_4_0= ruleAttribute )
            	    // InternalMyDsl.g:393:5: lv_attribute_4_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getSystemTypeAccess().getAttributeAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_attribute_4_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attribute",
            	    						lv_attribute_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemType"


    // $ANTLR start "entryRuleInt0"
    // InternalMyDsl.g:418:1: entryRuleInt0 returns [EObject current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final EObject entryRuleInt0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInt0 = null;


        try {
            // InternalMyDsl.g:418:45: (iv_ruleInt0= ruleInt0 EOF )
            // InternalMyDsl.g:419:2: iv_ruleInt0= ruleInt0 EOF
            {
             newCompositeNode(grammarAccess.getInt0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInt0=ruleInt0();

            state._fsp--;

             current =iv_ruleInt0; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // InternalMyDsl.g:425:1: ruleInt0 returns [EObject current=null] : otherlv_0= 'Int' ;
    public final EObject ruleInt0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:431:2: (otherlv_0= 'Int' )
            // InternalMyDsl.g:432:2: otherlv_0= 'Int'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getInt0Access().getIntKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleFloat"
    // InternalMyDsl.g:439:1: entryRuleFloat returns [EObject current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final EObject entryRuleFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat = null;


        try {
            // InternalMyDsl.g:439:46: (iv_ruleFloat= ruleFloat EOF )
            // InternalMyDsl.g:440:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalMyDsl.g:446:1: ruleFloat returns [EObject current=null] : otherlv_0= 'Float' ;
    public final EObject ruleFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:452:2: (otherlv_0= 'Float' )
            // InternalMyDsl.g:453:2: otherlv_0= 'Float'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getFloatAccess().getFloatKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleString0"
    // InternalMyDsl.g:460:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalMyDsl.g:460:48: (iv_ruleString0= ruleString0 EOF )
            // InternalMyDsl.g:461:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalMyDsl.g:467:1: ruleString0 returns [EObject current=null] : otherlv_0= 'String' ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:473:2: (otherlv_0= 'String' )
            // InternalMyDsl.g:474:2: otherlv_0= 'String'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getString0Access().getStringKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleBoolean"
    // InternalMyDsl.g:481:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalMyDsl.g:481:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalMyDsl.g:482:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalMyDsl.g:488:1: ruleBoolean returns [EObject current=null] : otherlv_0= 'Boolean' ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:494:2: (otherlv_0= 'Boolean' )
            // InternalMyDsl.g:495:2: otherlv_0= 'Boolean'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getBooleanAccess().getBooleanKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleID0"
    // InternalMyDsl.g:502:1: entryRuleID0 returns [EObject current=null] : iv_ruleID0= ruleID0 EOF ;
    public final EObject entryRuleID0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleID0 = null;


        try {
            // InternalMyDsl.g:502:44: (iv_ruleID0= ruleID0 EOF )
            // InternalMyDsl.g:503:2: iv_ruleID0= ruleID0 EOF
            {
             newCompositeNode(grammarAccess.getID0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleID0=ruleID0();

            state._fsp--;

             current =iv_ruleID0; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleID0"


    // $ANTLR start "ruleID0"
    // InternalMyDsl.g:509:1: ruleID0 returns [EObject current=null] : otherlv_0= 'ID' ;
    public final EObject ruleID0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:515:2: (otherlv_0= 'ID' )
            // InternalMyDsl.g:516:2: otherlv_0= 'ID'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getID0Access().getIDKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleID0"


    // $ANTLR start "entryRuleEnum"
    // InternalMyDsl.g:523:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalMyDsl.g:523:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalMyDsl.g:524:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalMyDsl.g:530:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'attribute' otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attribute_7_0= ruleAttribute ) ) )* otherlv_8= '}' otherlv_9= 'enumvalue' otherlv_10= '{' ( (lv_enumvalue_11_0= ruleEnumValue ) ) (otherlv_12= ',' ( (lv_enumvalue_13_0= ruleEnumValue ) ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attribute_5_0 = null;

        EObject lv_attribute_7_0 = null;

        EObject lv_enumvalue_11_0 = null;

        EObject lv_enumvalue_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:536:2: ( (otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'attribute' otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attribute_7_0= ruleAttribute ) ) )* otherlv_8= '}' otherlv_9= 'enumvalue' otherlv_10= '{' ( (lv_enumvalue_11_0= ruleEnumValue ) ) (otherlv_12= ',' ( (lv_enumvalue_13_0= ruleEnumValue ) ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // InternalMyDsl.g:537:2: (otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'attribute' otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attribute_7_0= ruleAttribute ) ) )* otherlv_8= '}' otherlv_9= 'enumvalue' otherlv_10= '{' ( (lv_enumvalue_11_0= ruleEnumValue ) ) (otherlv_12= ',' ( (lv_enumvalue_13_0= ruleEnumValue ) ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalMyDsl.g:537:2: (otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'attribute' otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attribute_7_0= ruleAttribute ) ) )* otherlv_8= '}' otherlv_9= 'enumvalue' otherlv_10= '{' ( (lv_enumvalue_11_0= ruleEnumValue ) ) (otherlv_12= ',' ( (lv_enumvalue_13_0= ruleEnumValue ) ) )* otherlv_14= '}' otherlv_15= '}' )
            // InternalMyDsl.g:538:3: otherlv_0= 'Enum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'attribute' otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attribute_7_0= ruleAttribute ) ) )* otherlv_8= '}' otherlv_9= 'enumvalue' otherlv_10= '{' ( (lv_enumvalue_11_0= ruleEnumValue ) ) (otherlv_12= ',' ( (lv_enumvalue_13_0= ruleEnumValue ) ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            // InternalMyDsl.g:542:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:543:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:543:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:544:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumAccess().getAttributeKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:573:3: ( (lv_attribute_5_0= ruleAttribute ) )
            // InternalMyDsl.g:574:4: (lv_attribute_5_0= ruleAttribute )
            {
            // InternalMyDsl.g:574:4: (lv_attribute_5_0= ruleAttribute )
            // InternalMyDsl.g:575:5: lv_attribute_5_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getEnumAccess().getAttributeAttributeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_attribute_5_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumRule());
            					}
            					add(
            						current,
            						"attribute",
            						lv_attribute_5_0,
            						"org.xtext.example.mydsl.MyDsl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:592:3: (otherlv_6= ',' ( (lv_attribute_7_0= ruleAttribute ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:593:4: otherlv_6= ',' ( (lv_attribute_7_0= ruleAttribute ) )
            	    {
            	    otherlv_6=(Token)match(input,25,FOLLOW_4); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEnumAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:597:4: ( (lv_attribute_7_0= ruleAttribute ) )
            	    // InternalMyDsl.g:598:5: (lv_attribute_7_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:598:5: (lv_attribute_7_0= ruleAttribute )
            	    // InternalMyDsl.g:599:6: lv_attribute_7_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getEnumAccess().getAttributeAttributeParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_attribute_7_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attribute",
            	    							lv_attribute_7_0,
            	    							"org.xtext.example.mydsl.MyDsl.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getEnumAccess().getEnumvalueKeyword_8());
            		
            otherlv_10=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalMyDsl.g:629:3: ( (lv_enumvalue_11_0= ruleEnumValue ) )
            // InternalMyDsl.g:630:4: (lv_enumvalue_11_0= ruleEnumValue )
            {
            // InternalMyDsl.g:630:4: (lv_enumvalue_11_0= ruleEnumValue )
            // InternalMyDsl.g:631:5: lv_enumvalue_11_0= ruleEnumValue
            {

            					newCompositeNode(grammarAccess.getEnumAccess().getEnumvalueEnumValueParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_14);
            lv_enumvalue_11_0=ruleEnumValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumRule());
            					}
            					add(
            						current,
            						"enumvalue",
            						lv_enumvalue_11_0,
            						"org.xtext.example.mydsl.MyDsl.EnumValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:648:3: (otherlv_12= ',' ( (lv_enumvalue_13_0= ruleEnumValue ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:649:4: otherlv_12= ',' ( (lv_enumvalue_13_0= ruleEnumValue ) )
            	    {
            	    otherlv_12=(Token)match(input,25,FOLLOW_16); 

            	    				newLeafNode(otherlv_12, grammarAccess.getEnumAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalMyDsl.g:653:4: ( (lv_enumvalue_13_0= ruleEnumValue ) )
            	    // InternalMyDsl.g:654:5: (lv_enumvalue_13_0= ruleEnumValue )
            	    {
            	    // InternalMyDsl.g:654:5: (lv_enumvalue_13_0= ruleEnumValue )
            	    // InternalMyDsl.g:655:6: lv_enumvalue_13_0= ruleEnumValue
            	    {

            	    						newCompositeNode(grammarAccess.getEnumAccess().getEnumvalueEnumValueParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_enumvalue_13_0=ruleEnumValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumRule());
            	    						}
            	    						add(
            	    							current,
            	    							"enumvalue",
            	    							lv_enumvalue_13_0,
            	    							"org.xtext.example.mydsl.MyDsl.EnumValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_14=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumValue"
    // InternalMyDsl.g:685:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalMyDsl.g:685:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalMyDsl.g:686:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
             newCompositeNode(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;

             current =iv_ruleEnumValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalMyDsl.g:692:1: ruleEnumValue returns [EObject current=null] : ( () otherlv_1= 'EnumValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'number' ( (lv_number_6_0= ruleInt1 ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_number_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:698:2: ( ( () otherlv_1= 'EnumValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'number' ( (lv_number_6_0= ruleInt1 ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:699:2: ( () otherlv_1= 'EnumValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'number' ( (lv_number_6_0= ruleInt1 ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:699:2: ( () otherlv_1= 'EnumValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'number' ( (lv_number_6_0= ruleInt1 ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:700:3: () otherlv_1= 'EnumValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'number' ( (lv_number_6_0= ruleInt1 ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:700:3: ()
            // InternalMyDsl.g:701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumValueAccess().getEnumValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumValueAccess().getEnumValueKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:715:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:716:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumValueAccess().getValueKeyword_3_0());
                    			
                    // InternalMyDsl.g:720:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalMyDsl.g:721:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:721:5: (lv_value_4_0= ruleEString )
                    // InternalMyDsl.g:722:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEnumValueAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:740:3: (otherlv_5= 'number' ( (lv_number_6_0= ruleInt1 ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:741:4: otherlv_5= 'number' ( (lv_number_6_0= ruleInt1 ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getEnumValueAccess().getNumberKeyword_4_0());
                    			
                    // InternalMyDsl.g:745:4: ( (lv_number_6_0= ruleInt1 ) )
                    // InternalMyDsl.g:746:5: (lv_number_6_0= ruleInt1 )
                    {
                    // InternalMyDsl.g:746:5: (lv_number_6_0= ruleInt1 )
                    // InternalMyDsl.g:747:6: lv_number_6_0= ruleInt1
                    {

                    						newCompositeNode(grammarAccess.getEnumValueAccess().getNumberInt1ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_number_6_0=ruleInt1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumValueRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Int1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumValueAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleInt1"
    // InternalMyDsl.g:773:1: entryRuleInt1 returns [String current=null] : iv_ruleInt1= ruleInt1 EOF ;
    public final String entryRuleInt1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt1 = null;


        try {
            // InternalMyDsl.g:773:44: (iv_ruleInt1= ruleInt1 EOF )
            // InternalMyDsl.g:774:2: iv_ruleInt1= ruleInt1 EOF
            {
             newCompositeNode(grammarAccess.getInt1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInt1=ruleInt1();

            state._fsp--;

             current =iv_ruleInt1.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInt1"


    // $ANTLR start "ruleInt1"
    // InternalMyDsl.g:780:1: ruleInt1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Int' ;
    public final AntlrDatatypeRuleToken ruleInt1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:786:2: (kw= 'Int' )
            // InternalMyDsl.g:787:2: kw= 'Int'
            {
            kw=(Token)match(input,17,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getInt1Access().getIntKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInt1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000007E8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000007E8002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000030002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});

}
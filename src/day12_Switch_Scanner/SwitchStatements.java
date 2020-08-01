package day12_Switch_Scanner;

//switch(expression){
//
//		caseValue1: //in the case give a datatype same as expression
//				statementA; //only get executed if the caseValue get execute
//				break; //use to break the statement
//      default://can ONLY have one default, it works like ELSE
//              statements;
//              break;
//
//        }
//
//
//        IMPORTANT:
//
//       caseValue MUST match with switch(expression) data type
//
//        Each of caseValue MUST be unique


public class SwitchStatements {
    public static void main(String[] args) {
/*in switch statement compiler first check if the caseValue match, regardless of where the
default statement is placed. If none of the caseValue are true. Default will be executed

 */

        int a = 10;

        switch(10){//10 data type is int

            case 5://5 data type is int
                //so the expression and caseValue data type matches and Also the value
                System.out.println("Five");//statement "Five" datatype can be different
                break;

            case 1:
                System.out.println("One");
                break;//end the switch

            default://if none of the caseValue is true | default will get execute
                //default can be in the beginning of the switch statement or the middle
                System.out.println("Invalid Case");
                break;
        }

    }
}

/*
4 data types that Switch Statement does not use:

        * boolean
        * double
        * float
        * long

 */
/*

IMPORTANT:

	CaseValue and expression should be in same data type.

	Each of caseValue MUST be unique

	Default is not mandatory.

	If none of the cases matches and there is no default. Nothing get executed

	Break: is use to exit the switch statement, else it will continue running switch statement; until it reaches to the end of the switch statement or "break" keyword break the statement | Break is not mandatory but necessary.

	CaseValue and expression should be in same data type. statement can be different
 */
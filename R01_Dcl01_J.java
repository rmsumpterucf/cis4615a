/******************************************************************************
 *  Compilation:  javac R01_Dcl01_J.java
 *  Execution:    java R01_Dcl01_J
 *
 *  This code is compliant
 *
 *  This code does not declare a custom class using a name already part of a java library
 *
 ******************************************************************************/

 public class R01_Dcl01_J {

       public static void main(String[] args) {
            myCustomClass.dosomething();
       }

       /*
       * Rule 1. Declarations and Initialization (DCL)
       * Corrected code per:
       * https://wiki.sei.cmu.edu/confluence/display/java/DCL01-J.+Do+not+reuse+public+identifiers+from+the+Java+Standard+Library
       * Rule 1-DCL01
       */

       public class myCustomClass {
            public static void dosomething(){
                 // execute code
            }
       }
 }

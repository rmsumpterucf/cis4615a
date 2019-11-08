/******************************************************************************
 *  Compilation:  javac R05_Obj01_J.java
 *  Execution:    java R05_Obj01_J
 *
 *  This code is compliant
 *
 *  This class uses a function to return a private variable instead of setting the internal variable to public
 *
 ******************************************************************************/

 public class R05_Obj01_J {
      private Boolean internalBool;

       public static void main(String[] args) {

       }

       public Boolean getInternalBool(){
            return internalBool;
       }

       /*
       * Rule 05. Object Orientation (OBJ)
       * Corrected code per:
       * https://wiki.sei.cmu.edu/confluence/display/java/OBJ01-J.+Limit+accessibility+of+fields
       * Rule 05-Obj01
       */
 }

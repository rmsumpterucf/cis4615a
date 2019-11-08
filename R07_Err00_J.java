/******************************************************************************
 *  Compilation:  javac R07_Err00_J.java
 *  Execution:    java R07_Err00_J
 *
 *  This code is compliant
 *
 *  This code catches expections and executes code when those exceptions are caught
 *
 ******************************************************************************/
 import java.io.IOException;

 public class R07_Err00_J {

       public static void main(String[] args) {
            Integer i = null;
            try{
                 throwSomeExceptions(i);
            } catch (NullPointerException npe){
                 // logic to handle the exception
            } catch (IOException ioe) {
                 // logic to handle the exception
            }
       }

       /*
       * Rule 07. Exceptional Behavior (ERR)
       * Corrected code per:
       * https://wiki.sei.cmu.edu/confluence/display/java/ERR00-J.+Do+not+suppress+or+ignore+checked+exceptions
       * Rule 07-Err00
       */

       public void throwSomeExceptions(int i) {
            if(i == 1){
                 throw IOException;
            }
       }
 }

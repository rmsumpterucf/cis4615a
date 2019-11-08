/******************************************************************************
 *  Compilation:  javac R04_Str03_J.java
 *  Execution:    java R04_Str03_J
 *
 *  This code is compliant
 *
 *  This code uses tostring to convert x to a string rather than a byte array
 *
 ******************************************************************************/
import java.math.BigInteger;

 public class R04_Str03_J {

     public static void main(String[] args) {
          BigInteger x = new BigInteger("530500452766");
          String s = x.toString();  // Valid character data
          byte[] byteArray = s.getBytes();
          String ns = new String(byteArray);
          x = new BigInteger(ns);
     }

     /*
     * Rule 04. Characters and Strings (STR)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string
     *
     * Rule R04_Str03
     */

 }

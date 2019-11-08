/******************************************************************************
 *  Compilation:  javac R04_Str03_J.java
 *  Execution:    java R04_Str03_J
 *
 *  This code is non-compliant
 *
 ******************************************************************************/
import java.math.BigInteger;

 public class R04_Str03_J {

     public static void main(String[] args) {
          BigInteger x = new BigInteger("530500452766");
          byte[] byteArray = x.toByteArray();
          String s = new String(byteArray);
          byteArray = s.getBytes();
          x = new BigInteger(byteArray);
     }

     /*
     * Rule 04. Characters and Strings (STR)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string
     *
     * Rule R04_Str03
     */

 }

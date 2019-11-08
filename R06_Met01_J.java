/******************************************************************************
 *  Compilation:  javac R06_Met01_J.java
 *  Execution:    java R06_Met01_J
 *
 *  This code is non-compliant
 *
 ******************************************************************************/

 public class R06_Met01_J {

     public static void main(String[] args) {
          
          getAbsAdd(Integer.MIN_VALUE, 1);
     }

     /*
     * Rule 06. Methods (MET)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/MET01-J.+Never+use+assertions+to+validate+method+arguments
     *
     * Rule R06_Met01
     */

     public static int getAbsAdd(int x, int y) {
          return Math.abs(x) + Math.abs(y);
     }

 }

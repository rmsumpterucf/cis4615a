/******************************************************************************
 *  Compilation:  javac R06_Met01_J.java
 *  Execution:    java R06_Met01_J
 *
 *  This code is compliant
 *
 *  This code validates the inputs in getAbsAdd before and after performing the abs method, throwing exceptions where appropriate
 *
 ******************************************************************************/

 public class R06_Met01_J {

     public static void main(String[] args) {

          try {
               getAbsAdd(Integer.MIN_VALUE, 1);
          } catch (IllegalArgumentException iae) {
               System.out.print("caught IllegalArgymentException");
          }

     }

     /*
     * Rule 06. Methods (MET)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/MET01-J.+Never+use+assertions+to+validate+method+arguments
     *
     * Rule R06_Met01
     */

     public static int getAbsAdd(int x, int y) {
          if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
               throw new IllegalArgumentException();
          }
          int absX = Math.abs(x);
          int absY = Math.abs(y);
          if (absX > Integer.MAX_VALUE - absY) {
               throw new IllegalArgumentException();
          }
          return absX + absY;
     }

 }

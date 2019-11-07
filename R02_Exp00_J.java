/******************************************************************************
 *  Compilation:  javac R02_Exp00_J.java
 *  Execution:    java R02_Exp00_J
 *
 *  This code is non-compliant
 *
 ******************************************************************************/
import java.io.File;

public class R02_Exp00_J {

      public static void main(String[] args) {
           File someFile = new File("filename.txt");
           someFile.delete();
      }

      /*
      * Rule 02. Expressions (EXP)
      * Corrected code per:
      * https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
      *
      * Rule R02_Exp00
      */
}

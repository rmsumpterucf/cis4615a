/******************************************************************************
 *  Compilation:  javac R02_Exp00_J.java
 *  Execution:    java R02_Exp00_J
 *
 *  This code is compliant
 *
 *  This code catches the boolean returned by someFile.delete() and executes code in the event the file deletion fails
 *
 ******************************************************************************/
import java.io.File;

public class R02_Exp00_J {

      public static void main(String[] args) {
           Boolean deleteSuccess;
           File someFile = new File("filename.txt");
           deleteSuccess = someFile.delete();
           if (!deleteSuccess){
                System.out.print("error deleting file");
                // execute code to handle failure to delete here
           }

      }

      /*
      * Rule 02. Expressions (EXP)
      * Corrected code per:
      * https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
      *
      * Rule R02_Exp00
      */
}

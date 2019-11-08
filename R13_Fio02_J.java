/******************************************************************************
 *  Compilation:  javac R13_Fio02_J.java
 *  Execution:    java R13_Fio02_J
 *
 *  This code is compliant
 *
 * This code handles the deletion boolean return and prints a statement
 *
 ******************************************************************************/
import java.io.File;

 public class R13_Fio02_J {

       public static void main(String[] args) {
            File file = new File("file");
            if (!file.delete()) {
                 System.out.println("Deletion failed");
            }
       }

       /*
       * Rule 13. Input Output (FIO)
       * Corrected code per:
       * https://wiki.sei.cmu.edu/confluence/display/java/FIO02-J.+Detect+and+handle+file-related+errors
       * Rule 13-FIO02
       */
 }

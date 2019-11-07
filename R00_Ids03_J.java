/******************************************************************************
 *  Compilation:  javac R00_Ids03_J.java
 *  Execution:    java R00_Ids03_J
 *
 *  This is code currently non-compliant
 *
 ******************************************************************************/
import java.util.logging.Logger;

public class R00_Ids03_J {

      public static void main(String[] args) {
           String username = "username";
           String password = "password";

           Logger logger = Logger.getLogger("name");

           // successful login
           Boolean loginSuccessful = true;

           if (loginSuccessful) {
                logger.severe("User login succeeded for: " + username);
           } else {
                logger.severe("User login failed for: " + username);
           }
      }

      /*
      * Rule 00. Input Validation and Data Sanitization (IDS)
      * Corrected code per:
      * https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
      *
      * Rule 00-Ids03
      */


}

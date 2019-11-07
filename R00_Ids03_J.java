/******************************************************************************
 *  Compilation:  javac R00_Ids03_J.java
 *  Execution:    java R00_Ids03_J
 *
 *  This code is compliant
 *
 *  This code uses the santitizeInput function to santitize the username before logging
 *
 ******************************************************************************/
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_Ids03_J {

      public static void main(String[] args) {
           String username = "username";
           String password = "password";

           Logger logger = Logger.getLogger("name");

           // successful login
           Boolean loginSuccessful = true;

           if (loginSuccessful) {
                logger.severe("User login succeeded for: " + sanitizeInput(username));
           } else {
                logger.severe("User login failed for: " + sanitizeInput(username));
           }
      }

      /*
      * Rule 00. Input Validation and Data Sanitization (IDS)
      * Corrected code per:
      * https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
      *
      * Rule 00-Ids03
      */

      public static String sanitizeInput(String input) {
           if (Pattern.matches("[A-Za-z0-9_]+", input)) {
                return input;
           } else {
                return "unauthorized user";
           }
      }
}

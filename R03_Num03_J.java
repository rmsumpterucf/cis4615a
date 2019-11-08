/******************************************************************************
 *  Compilation:  javac R03_Num03_J.java
 *  Execution:    java R03_Num03_J
 *
 *  This code is non-compliant
 *
 ******************************************************************************/
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class R03_Num03_J {

     public static void main(String[] args) {
          int anInt;
          InputStream is = null;
          DataInputStream dis = new DataInputStream(is);
          try {
               anInt = getInteger(dis);
          } catch(IOException e) {

          } catch(NullPointerException ne) {

          }

     }

     /*
     * Rule 03. Numeric Types and Operations (NUM)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data
     *
     * Rule R03_Num03
     */

     public static int getInteger(DataInputStream is) throws IOException {
          return is.readInt();
     }

}

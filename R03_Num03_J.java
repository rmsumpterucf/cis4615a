/******************************************************************************
 *  Compilation:  javac R03_Num03_J.java
 *  Execution:    java R03_Num03_J
 *
 *  This code is compliant
 *
 *  This code returns the read integer with a 32 bit mask, ensuring any integer is in the byte range of an unsigned int
 *
 ******************************************************************************/
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class R03_Num03_J {

     public static void main(String[] args) {
          long aLong;
          InputStream is = null;
          DataInputStream dis = new DataInputStream(is);
          try {
               aLong = getInteger(dis);
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

     public static long getInteger(DataInputStream is) throws IOException {
          return is.readInt() & 0xFFFFFFFFL;
     }

}

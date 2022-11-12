//: object/HelloDate.java
import java.util.Date;

/** The first Thinking in Java example program.
 *  Displays a string and today's date.
 * @author z0701
 * @author www.z070140.z070140
 * @version 1.0

 */
public class HelloDate {
	/** Entry point to class & application
	 *
	 * @param args array of string arguments
	 * @throws  exceptions No exceptions thrown
	 */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Hello,it's ");
	System.out.println(new Date());
	System.out.println("----------------");
	System.getProperties().list(System.out);
//	System.out.println(System.getProperty("user.name"));
	System.out.println(System.getProperty("java.library.path"));
    }
}/* Output: (55% match)
Hello, it`s:
Friday November 18:22
*///:~

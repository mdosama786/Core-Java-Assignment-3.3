
/**@Import java.util.Scanner Package*/
import java.util.Scanner;

/** @Create a class */
public class StudentResultProcessingSystem {
	private static Scanner obj;

	public static void main(String[] args) {
		/** @Declaration */
		int a;
		/** @TAKING TOP 3 RESULT OF CLASS 1 TO 10 */
		System.out.println("enter the class 1 to 10");

		/** @Create a object */
		obj = new Scanner(System.in);

		/** @Create a object */
		a = obj.nextInt();

		System.out.println("TOPPERS OF CLASS  " + a);
		/** @LAYOUT WITH NAME MARKS AND POSITION */
		System.out.println("Name   \tmarks\tposition");
		/** @TOPPER FOR CLASS 1 */

		if (a == 1) {
			System.out.println("Anmol\t79.6%\t1st ");
			System.out.println("Rajat\t78.1%\t2nd");
			System.out.println("Dhruv\t77.7%\t3rd");
		}
		/** @TOPPER OF CLASS 2 */

		if (a == 2) {
			System.out.println("Anuj\t89.6%\t1st ");
			System.out.println("Rajat\t78.1%\t2nd");
			System.out.println("Sumit\t77.7%\t3rd");
		}
		/** @TOPPER OF CLASS 3 */
		if (a == 3) {
			System.out.println("Obama\t89.6%\t1st ");
			System.out.println("Osama\t78.1%\t2nd");
			System.out.println("charlie\t77.7%\t3rd");
		}
		/** @TOPPER OF CLASS 4 */
		if (a == 4) {
			System.out.println("daljeet\t89.6%\t1st ");
			System.out.println("Faizan \t78.1%\t2nd");
			System.out.println("Ajmer  \t77.7%\t3rd");
		}
		/** @TOPPER OF CLASS 5 */
		if (a == 5) {
			System.out.println("Karan\t89.6%\t1st ");
			System.out.println("Sakshi\t78.1%\t2nd");
			System.out.println("Pavi \t77.7%\t3rd");
		}
		/** @TOPPER OF CLASS 6 */
		if (a == 6) {
			System.out.println("Anuj\t89.6%\t1st ");
			System.out.println("Rajat\t78.1%\t2nd");
			System.out.println("Sumit\t77.7%\t3rd");
		}
		/** @TOPPER OF CLASS 7 */
		if (a == 7) {
			System.out.println("Pavi\t89.6%\t1st ");
			System.out.println("Rajdeep\t78.1%\t2nd");
			System.out.println("Sakib\t77.7%\t3rd");
		}
		/** @TOPPER OF CLASS 8 */
		if (a == 8) {
			System.out.println("Shivani\t89.6%\t1st ");
			System.out.println("Harp\t78.1%\t2nd");
			System.out.println("Sidd\t77.7%\t3rd");
		}
		/** @TOPPER OF CLASS 9 */
		if (a == 9) {
			System.out.println("Param\t89.6%\t1st ");
			System.out.println("Mani\t78.1%\t2nd");
			System.out.println("Amnin\t77.7%\t3rd");
		}
		/** @TOPPER CLASS 10 */
		if (a == 10) {
			System.out.println("Anu\t89.6%\t1st ");
			System.out.println("Shahid\t78.1%\t2nd");
			System.out.println("Mushi\t77.7%\t3rd");
		}

	}
}
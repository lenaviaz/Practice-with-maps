import java.util.Scanner;

/****
 * @author Lena Viazmitinov 7/8/20
 * tester.java 
 * driver code
 */

public class tester {
	
	public static void main(String [] args) {
		
		String b; 
		String a;
		Scanner scan = new Scanner(System.in);
	
		do {
		
		System.out.print("enter your sentence: ");	
		a = scan.nextLine();

		sentences s1 = new sentences(a, a.length());
		s1.makesentenceanarray(a, a.length());
        s1.frequency(a, a.length());
			
        System.out.print("do you want to continue? type Y for yes");
         b = scan.nextLine();
        
      	}  while(b.equals("Y") || b.contentEquals("y"));
             }
	
}

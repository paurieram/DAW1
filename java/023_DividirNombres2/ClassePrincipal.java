import java.util.Scanner;

public class ClassePrincipal {

/**
 * It takes a number and divides it by the smallest possible prime number until it reaches 1
 */
	public static void main(String[] args) {
	String r = ".";
	int n = 0, d = 2,c = 0;
	Scanner t = new Scanner (System.in);
	System.out.println("introdueix nombre");
	n = t.nextInt();
	if (n <= 1) {
		//n = n * -1;
		d = -2;
		do {
			if (n%d == 0) {
				c++;
				if (c == 1) {
					r = n+" = "+d;
				} else {
					r = r + " x " + d;
				}
			n = n / d;	
			} else {
				d = d + -1;
			}	
		}while (n != 1);
	} else {
		do {
			if (n%d == 0) {
				c++;
				if (c == 1) {
					r = n+" = "+d;
				} else {
					r = r + " x " + d;
				}
			n = n / d;	
			} else {
				d++;
			}		
		}while (n != 1);

		}
	t.close();	
	System.out.println(r);
	}
}
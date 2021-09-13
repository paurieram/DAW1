import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
	String r = "gamaruç";
	int n = 0, d = 2,c = 0;
	Scanner t = new Scanner (System.in);
	System.out.println("introdueix nombre");
	n = t.nextInt();
	if (n <= 1) {
		System.out.println(r);
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
		t.close();	
		System.out.println(r);
		}
	}
}

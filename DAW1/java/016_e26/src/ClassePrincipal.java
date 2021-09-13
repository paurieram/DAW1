import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		int n = 0, d, c = 0;
		Scanner t = new Scanner (System.in);
		System.out.println("introdueix el numero");
		n = t.nextInt();
		d = n;
		do { 
			if (n%d == 0) {
				c++;
			}
			d--;
		} while (d > 0);
		System.out.println(n+"-"+d+"-"+c);
		if (c == 2) {
			System.out.println("es un nombre sencer");
		} else {
			System.out.println("no es un nombre sencer");
		}
		t.close();
	}

}

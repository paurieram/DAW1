import java.util.Scanner;

public class ClassePrincipal {
	public static void main(String[] args) {
		int n = 0, v = 0, g = 0, p = 0;
		String a = "";
		Scanner t = new Scanner (System.in);
		System.out.println("introdueix el 1r numero");
		n = t.nextInt();
		System.out.println("introdueix el 2n numero");
		v = t.nextInt();
		if (n < v) {
			p = n;
			g = v;
		}	else {
			p = v;
			g = n;
		}
		do {
			a = a+"*";
			g--;
		} while (g > 0);
		do {
			System.out.println(a);
			p--;
		} while (p > 0);
		t.close();
	}
}
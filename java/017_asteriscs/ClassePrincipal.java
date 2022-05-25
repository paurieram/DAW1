import java.util.Scanner;

public class ClassePrincipal {
	public static void main(String[] args) {
		int n = 0;
		String a = "";
		Scanner t = new Scanner (System.in);
		System.out.println("introdueix el numero");
		n = t.nextInt();
		int v = n;
		do {
			a = a+"*";
			v--;
		} while (v > 0);
		do {
			System.out.println(a);
			n--;
		} while (n > 0);
		t.close();
	}
}
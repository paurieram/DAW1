import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		int d, m, a, c = 0;
		
		Scanner t = new Scanner (System.in);
		System.out.println("introdudeix dia");
		d = t.nextInt();
		System.out.println("introdudeix mes");
		m = t.nextInt();
		System.out.println("introdudeix any");
		a = t.nextInt();
		if (d > 31 || d < 1) {
			c++;
		}
		if (m > 12 || m < 1) {
			c++;
		}
		if (a > 2020 || a < 1) {
			c++;
		}
		if (c == 0) {
			System.out.println("Correcte");
		}else {
			System.out.println("Incorrecte");
		}
	t.close();
	}
	
}

import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		int n, v;
		Scanner t = new Scanner (System.in);
		System.out.println("introdueix nombre 1");
		n = t.nextInt();
		System.out.println("introdueix nombre 2");
		v = t.nextInt();
		t.close();
		do {
			Math.pow(n,v);
			n--;
		}while (n != 0);
	}

}

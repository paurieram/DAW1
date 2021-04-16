import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		int v, v2 = 1;
		Scanner t = new Scanner (System.in);
		System.out.println("introdueix el nombre");
		v = t.nextInt();
		int n[] = new int[v];
		v--;
		do {
			n[v] = v2;
			v2++;
			v--;
		}while (v != -1);
		t.close();
		v = 0;
		do {
			System.out.println("nombre "+n[v]);
			v++;
		} while (v != n.length);
	}

}

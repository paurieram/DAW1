import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		int v;
		Scanner t = new Scanner (System.in);
		System.out.println("introdueix el nombre");
		v = t.nextInt();
		int n[] = new int[v];
		int v2 = v, p,c = 0;
		v = 0;
		do {
			System.out.println("introdueix el nombre de la posicio "+v);
			p = t.nextInt();
			if (p == v2) {
				System.out.println("Correcte");
				n[v] = v2;
				v2--;
				v++;
			}else {
				System.out.println("Error torna a introduir en nombre");
				c++;
			}
		}while (v != n.length);
		t.close();
		v = 0;
		/*do {
			System.out.println("Nombre "+n[v]);
			v++;
		} while (v != n.length);*/
		System.out.println("Errors = "+c);
	}

}
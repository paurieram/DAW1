import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
	int n[] = new int[11];
	Scanner t = new Scanner (System.in);
	n[0] = 1;
	do {
		System.out.println("introdueix nombre "+n[0]);
		n[n[0]] = t.nextInt();
		n[0]++;
	}while (n[0] != n.length);
	t.close();
	n[0] = 1;
	do {
		System.out.println("nombre "+n[n[0]]);
		n[0]++;
	}while (n[0] != n.length);		
	}
}

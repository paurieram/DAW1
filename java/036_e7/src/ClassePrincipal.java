import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int s[] = new int[5];
		for (int a=0;a<s.length;a++) {
			System.out.print("introdueix un Nombre: ");
			s[a] = t.nextInt();
		}
		System.out.print("introdueix un Nombre k: ");
		int n = t.nextInt();
		for (int a=0;a<s.length;a++) {
			if (s[a]%n == 0) {
				System.out.println("El nombre "+s[a]+" es multiple de "+n);
			}else {
				System.out.println("El nombre "+s[a]+" no es multiple de "+n);
			}
		}
	t.close();
	}
}
import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		String s[] = new String[5];
		int n[] = new int[5];
		int a = 0;
		Scanner t = new Scanner (System.in);
		do {
			System.out.println("introdueix text");
			s[a] = t.nextLine();
			n[a] = s[a].length();
			a++;
		}while(a != n.length);
		t.close();
		a = 0;
		do {
			System.out.println("nombre "+n[a]);
			a++;
		} while (a != n.length);
		a = 0;
		do {
			System.out.println("text "+s[a]);
			a++;
		} while (a != n.length);
	}

}

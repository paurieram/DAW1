import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
	int b, a;
	Scanner t = new Scanner (System.in);
	System.out.println("introdueix base");
	b = t.nextInt();
	System.out.println("introdueix alçcda");
	a = t.nextInt();
	t.close();
	System.out.println("perimetre "+(b+b+a+a));
	System.out.println("area "+b*a);
	}

}

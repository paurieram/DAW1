import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		int n;
		Scanner t = new Scanner (System.in);
		System.out.println("introdueix un numero");
		n = t.nextInt();	
		if (n < 0) {
			n = n * (-1);
		}
		System.out.println(n);
	t.close();	
	}
}
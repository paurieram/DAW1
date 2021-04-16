import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		double n1 = 1, n2 = 0, n3 = 0, ng = 0, np = 0;		
		Scanner t = new Scanner (System.in);
		while (n3 < 5) {
			System.out.println("Introdueix num1");
			n1 = t.nextInt();
			if (n3 == 0) {
				np = n3;
				ng = n3;
			}
			if (n1 > ng) {
				ng = n1;
			}else if (n1 < np) {
				np = n1;
			}
		n3 = n3 + 1;
		n2 = n2 + n1;
		}
	n2 = n2 - ng - np; 	
	t.close();
	}
	
}

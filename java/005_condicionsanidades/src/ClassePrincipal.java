import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		
	int n;
	Scanner t = new Scanner (System.in);
	System.out.println("introdueix numero de dia de la semana");
	n = t.nextInt();	
	if (n < 1 || n > 7) {
		System.out.println("Error");
	} else {
		if (n == 6 || n == 7) {
			System.out.println("Es cap de semana");
		} else if (n ==1) {
			System.out.println("Dilluns");
		} else if (n ==2) {
			System.out.println("Dimarts");
		} else if (n ==3) {
			System.out.println("Dimecres");
		} else if (n ==4) {
			System.out.println("Dijous");
		} else if (n ==5) {
			System.out.println("Divendres");
		}
	}
	t.close();
	}

}

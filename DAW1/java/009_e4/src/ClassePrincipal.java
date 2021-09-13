import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		double n1, n2;
		Scanner t = new Scanner (System.in);
		System.out.println("Introdueix num1");
		n1 = t.nextInt();
		System.out.println("INtrodueix num2");
		n2 = t.nextInt();	
		if ((n1 + n2) > 0) {
			System.out.println("La suma es positiva");
		} else if ((n1 + n2) < 0) {
			System.out.println("La suma es negativa");
		} else {
			System.out.println("La suma es zero");
		}
		if ((n1 - n2) > 0) {
			System.out.println("La resta es positiva");
		} else if ((n1 - n2) < 0) {
			System.out.println("La resta es negativa");
		} else {
			System.out.println("La resta es zero");
		}
		if ((n1 * n2) > 0) {
			System.out.println("La multiplicaccio es positiva");
		} else if ((n1 * n2) < 0) {
			System.out.println("La multiplicaccio es negativa");
		} else {
			System.out.println("La multiplicaccio es zero");
		}
		if (n2 == 0) {
			System.out.println("No es pot dividir per 0");
		} else if ((n1 / n2) > 0) {
			System.out.println("La divisio es positiva");
		} else if ((n1 / n2) < 0) {
			System.out.println("La divisio es negativa");
		} else {
			System.out.println("La divisio es zero");
		}
		t.close();
	}
}



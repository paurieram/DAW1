import java.util.Scanner;

public class RieraPau_Enunciat_001 {

	public static void main(String[] args) {
		int n, N;
		String s;
		Scanner t = new Scanner (System.in);
		Scanner te = new Scanner (System.in);
		System.out.println("introdueix 1r Nombre");
		n = t.nextInt();
		System.out.println("introdueix 2n Nombre");
		N = t.nextInt();
		System.out.println("introdueix A (Ascendent) o D (Descendent)");
		s = te.nextLine();
		t.close();
		te.close();
		if (s.equals("D")) {
			if (n < N) {
				System.out.println("El primer nombre es "+n);
				System.out.println("El segon nombre es "+N);
			}else if(n > N) {
				System.out.println("El primer nombre es "+N);
				System.out.println("El segon nombre es "+n);
			}else if(n == N) {
				System.out.println("Els nombres son inguals");
			}
		}else if (s.equals("A")) {
			if (n > N) {
				System.out.println("El primer nombre es "+n);
				System.out.println("El segon nombre es "+N);
			}else if(n < N) {
				System.out.println("El primer nombre es "+N);
				System.out.println("El segon nombre es "+n);
			}else if(n == N) {
				System.out.println("Els nombres son inguals");
			}
		}else {
			System.out.println("No has introduit la lletra correctament");
		}
	}
}

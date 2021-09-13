import java.util.Scanner;
public class ClassPrincipal {
	public static String ab(int N) {
		String r=""; 
		do {
			r=N%2+r;
			N=N/2;
		}while(N>=1);
		return r;
	}
	public static void main(String[] args) {
		Scanner t = new Scanner (System.in);
		System.out.print("Entra un nombre entre 0 i 255: ");
		int N = t.nextInt();
		do {
			if (N<=0 || N>=255) {
				System.out.print("Error! Torna a introduir-lo: ");
				N = t.nextInt();
			}
		}while (N<=0 || N>=255);
		System.out.println(ab(N));
		t.close();
	}
}
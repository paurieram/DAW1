import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int s[] = new int[5];
		for (int a=0;a<s.length;a++) {
			System.out.print("introdueix un Nombre: ");
			s[a] = t.nextInt();
		}
		System.out.print("introdueix el Nombre gran o petit: ");
		int n = t.nextInt();
		System.out.print("introdueix el Nombre gran o petit: ");
		int N = t.nextInt();
		if (n>N) {
			int a = n;
			n = N;
			N = a;
		}
		for (int a=0;a<s.length;a++) {
			if (s[a] > N) {
				s[a] = 1;
			}else if(s[a] < n){
				s[a] = 0;
			}
		}
		for (int a=0;a<s.length;a++) {
			System.out.println("Posicio "+a+" Nombre "+s[a]);
		}
	t.close();
	}
}
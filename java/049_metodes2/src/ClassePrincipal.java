import java.util.Scanner;

public class ClassePrincipal {
	public static int ll() {
		Scanner t = new Scanner (System.in);
		int a = t.nextInt();
		return a;
	}
	public static void de(int n1,int n2) {
		for(int r=n1;r>=n2;r--) {
			System.out.print(r+" ");
		}
	}
	public static void as(int n1,int n2) {
		for(int r=n1;r<=n2;r++) {
			System.out.print(r+" ");
		}
	}
	public static void main(String[] args) {
		System.out.println("1r num");
		int a = ll();
		System.out.println("2n num");
		int b = ll();
		if (a < b) {
			as(a,b);
		}else {
			de(a,b);
		}
	}
}

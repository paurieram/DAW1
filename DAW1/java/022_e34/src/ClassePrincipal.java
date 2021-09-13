import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		String r = "";
		int n = 0,de = 0,da = 0,e = 0,a = 0;
		Scanner t = new Scanner (System.in);
		System.out.println("introdueix nombre final");
		n = t.nextInt();
		de = (n/2)+1;
		e = de;
		da = 1;
		a = da;	
		if (n%2 != 0) {
			do {
				do {
					r = r+" ";
					e--;
				} while (e > 0);
				do {
					r = r+"*";
					a--;
				} while (a > 0);
				de--;
				da = da + 2;
				n = n - 2;
				e = de;
				a = da;
				System.out.println(r);
				r = "";
			} while (n != -1);
		} else {
			System.out.println("Nombre incorrecte");
		}
		t.close();
	}
}

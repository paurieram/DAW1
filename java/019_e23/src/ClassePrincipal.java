import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		int e = 0, ch = 0, cd = 0, mh = 0, md = 0, g = 0, p = 0, pt = 0;
		int s;
		Scanner t = new Scanner (System.in);
		System.out.println("introdudeix sexe(1 = H, 2 = D)");
		s = t.nextInt();
		System.out.println("introdudeix edat");
		e = t.nextInt();
		p = e;
		while (e != 0){
			pt++;
			if (s == 1 && e > 17) {
				ch++;
				mh = mh + e;
			}else if (s == 2 && e > 17){
				cd++;
				md = md + e;
			}
			if (e < p) {
				p = e;
			} 
			if (e > g) {
				g = e;
			}
			if (e < 18) {
				System.out.println("No pots entrar");
			}
			System.out.println("introdudeix sexe");
			s = t.nextInt();
			System.out.println("introdudeix edat");
			e = t.nextInt();
			if (e == 0) {
			System.out.println("Has introduit un 0");
			}
		}
	//1
	System.out.println("Nombre total de persones "+pt);	
	//2
	System.out.println("De les quals "+cd+" son dones i "+ch+" son homes");	
	//3
	if (cd == 0) {
		System.out.println("No hi han dones");
	} else {
		md = md/cd;
		System.out.println("La mitjana de edat de les dones es "+md);
	}
	if (ch == 0) {
		System.out.println("No hi han homes");
	} else {
		mh = mh/ch;
		System.out.println("La mitjana de edat de els homes es "+mh);
	}
	String s4 = "";
	//4
	if (g == 0) {
		System.out.println("No hi han edats");
	} else {
		s4 = "La edat mes gran es "+g;
	}
	if (p == 0) {
		System.out.println("No hi han edats");
	} else {
		s4 = s + " la mes petita es "+p;
	}
	System.out.println(s4);
	t.close();
	}

}


public class ClassePrincipal {
	//no rep, no retorna
	public static void nom() {
		System.out.println("L1 - nom");
	}
	//rep, no retorna
	public static void suma(int n1,int n2) {
		int r = n1 + n2;
		System.out.println("L1 - suma");
		System.out.println("L2 - suma = "+r);
	}
	//no rep, retorna
	public static int multi() {
		int r = 0;
		for(int i=1;i<=10;i++) {
			r = r + (i*10);
		}
		return r;	
	}
	//rep, retorna
	public static double dividir(int n1,int n2) {
		double r=0;
		if (n2 == 0) {
			System.out.println("Error");
		} else {
			r = n1/n2;
		}
		return r;
	}
	public static void main(String[] args) {
		System.out.println("L1 - main");
		nom();
		System.out.println("L2 - main");
		suma(2,5);
		int r = multi();
		System.out.println("L3 - main = "+r);
	}

}

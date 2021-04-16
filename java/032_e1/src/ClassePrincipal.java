public class ClassePrincipal {

	public static void main(String[] args) {
		int n[] = new int[10];
		int a = 0,v = 2;
		do {
			n[a] = v;
			a++;
			v = v * 2;
		}while(a != n.length);
		a = 0;
		do {
			System.out.println("nombre "+n[a]);
			a++;
		} while (a != n.length);
	}

}

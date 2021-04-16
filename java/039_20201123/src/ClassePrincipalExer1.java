
public class ClassePrincipalExer1 {

	public static void main(String[] args) {
	int a=2;//contador de nombres
	boolean b=false;//boolea per anar cambiant entre 2 i 3
	do {
		if (b == true) {
			System.out.println(a);
			a = a+2;
			b = false;
		}else if (b==false) {
			System.out.println(a);
			a = a+3;
			b = true;
		}
	}while (a<1801);
	}
}
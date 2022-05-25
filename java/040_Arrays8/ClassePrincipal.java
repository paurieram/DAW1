
public class ClassePrincipal {

	public static void main(String[] args) {
	boolean b=false;
	int n[] = new int[5];
	int N[] = new int[5];
	int a=0;
	do {
		if (n[a]!=N[a]) {
			b=true;	
			break;
		}
		a++;
	}while (a!=n.length);
		if (b==false) {
			System.out.println("Son iguals ");
		}else if (b==true) {
			System.out.println("No Son iguals ");
		}
	}
}
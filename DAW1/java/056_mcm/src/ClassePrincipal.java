
public class ClassePrincipal {
	
	public static int mcd() {
		int a,b,r;
		while(b!=0){
			r=a%b;
			a=b;
		}
	return a;
	}
	public static int mcm(int a,int b) {
		int r;
		r=a*b/mcd();
		return r;
	}
	
	
	
	public static void main(String[] args) {
		

	}

}

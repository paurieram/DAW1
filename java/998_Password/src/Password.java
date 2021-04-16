import java.util.Scanner;

public class Password {
	
	public static int RNG(int Petit, int Gran) {//nombre aleatori entre 2 nombres
		return (int) (Math.random() * (Gran + 1 - Petit) + Petit);
	}
	public static void main(String[] args) {
		Scanner TInt = new Scanner(System.in);
		System.out.print("Introdueix Longitud: ");
		int N = TInt.nextInt();
		String pass="";
		boolean b=false;
		do {
		for (int i=0;i!=N;i++) {
			pass = pass+Character.toString(RNG(33,125));
		}
		System.out.println(pass);
		System.out.print("0=finish:");
		int T = TInt.nextInt();
		if (T==0) {
			b=true;
		}
		pass="";
		}while(b!=true);
		
		TInt.close();
	}
}
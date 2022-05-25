import java.util.Scanner;

public class RieraPau_Enunciat_003 {

	public static void main(String[] args) {
		Scanner t = new Scanner (System.in);
		System.out.print("Introdueix un Nombre: ");
		int n = t.nextInt();
		//n.charAt(v);
		int ns=0,np=0,c=1;
		do {
			do {
				if (c%2 == 1) {
					ns = ns + n%10;
					n = n/10;
				}else {
					np = np + n%10;
					n = n/10;
				}
				c++;
			}while(n != 0);
			if (np == ns) {
				System.out.println("El nombre introduit es Balancejat");
			}else {
				System.out.println("El nombre introduit no es Balancejat");
			}
			System.out.print("Introdueix un Nombre: ");
			n = t.nextInt();
			c = 1;
			ns = 0;
			np =0;
		}while(n != 0);	
		
	t.close();
	}
}
import java.util.Scanner;

public class RieraPau_Enunciat_002 {

	public static void main(String[] args) {
	Scanner t = new Scanner (System.in);
	System.out.print("Introdueix un Nombre: ");
	int n = t.nextInt();
	t.close();
	if(n > -1 && n < 11) {
		int m = 0;
		do {
			System.out.println(n+" * "+m+" = "+(n*m));
			m++;
		}while(m != 21);
		}else {
			System.out.println("El Nombre introduit No es correcte");
		}
	}
}
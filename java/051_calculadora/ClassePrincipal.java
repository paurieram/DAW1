import java.util.Scanner;

public class ClassePrincipal {
	public static float suma(float num1, float num2) {
		float resultat;
		resultat = 0;
		resultat = num1 + num2;
		return resultat;
	}
	public static float resta(float num1, float num2) {
		float resultat;
		resultat = 0;
		resultat = num1 - num2;
		return resultat;
	}
	public static float prod(float num1, float num2) {
		float resultat;
		resultat = 0;
		resultat = num1 * num2;
		return resultat;
	}
	public static float divi(float num1, float num2) {
		float resultat;
		resultat = 0;
		resultat = num1 / num2;
		return resultat;
	}
	public static float modul(float num1, float num2) {
		float resultat;
		resultat = 0;
		resultat = num1 % num2;
		return resultat;
	}
	public static float potencia(float num1, float num2) {
		float resultat;
		resultat = 0;
		resultat = (float) Math.pow(num1, num2);
		return resultat;
	}
	public static void main(String[] args) {
			float resultat=0;
			Scanner teclat = new Scanner(System.in);
			float nombre1, nombre2;
			char operacio;
			System.out.println("Escriu el primer dels nombres: ");
			nombre1 = teclat.nextInt();
			System.out.println("Escriu el segon dels nombres: ");
			nombre2 = teclat.nextInt();
			System.out.println("Escriu la operaci� que vols fer" +
					"amb els dos nombres:\n" +
					" +  suma\n" + 
					" -  resta\n" + 
					" /  divisi� sencera\n" + 
					" %  m�dul (residu de la divisi�)\r\n" + 
					" *  multiplicaci�\r\n" + 
					" ^  elevat\n");
			operacio = teclat.next().charAt(0);
			switch (operacio) {
			case '+':
				resultat = suma(nombre1,nombre2);
				break;
			case '-':
				resultat = resta(nombre1,nombre2);
				break;
			case '*':
				resultat = prod(nombre1,nombre2);
				break;
			case '/':
				resultat = divi(nombre1,nombre2);
				break;
			case '%':
				resultat = modul(nombre1,nombre2);
				break;
			case '^':
				resultat = potencia(nombre1,nombre2);
				break;
			default:
				System.out.println("ERROR!");
				break;
			}
			System.out.println(resultat);
			teclat.close();
	}
}
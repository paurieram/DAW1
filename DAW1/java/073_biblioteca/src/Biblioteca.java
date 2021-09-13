import java.util.Scanner;

public class Biblioteca {

	public static void prestecs() {
		
	}
	public static void main(String[] args) {

		Scanner teclattext = new Scanner(System.in);
		System.out.print("Entra quants llibres vols entrar: ");
		int numLlibres = Integer.parseInt(teclattext.nextLine());

		Llibre[] objarr = new Llibre[numLlibres];
		for (int i = 0; i < objarr.length; i++) {
			System.out.println("Dades per a Objecte");
			System.out.print("Introdueix el llibre Objecte : ");
			String llibre = teclattext.nextLine();
			System.out.print("Introdueix el autor Objecte : ");
			String autor = teclattext.nextLine();
			System.out.print("Introdueix la quantitat d'exemplars Objecte : ");
			String quant = teclattext.nextLine();
			String prestec="0";
			objarr[i] = new Llibre(llibre, autor, quant,prestec);
		}
		System.out.println("Visualitar inforamació");
		for (int i = 0; i < objarr.length; i++) {
			System.out.println("Objecte " + (i + 1));
			objarr[i].view();
		}
		teclattext.close();
	}

}

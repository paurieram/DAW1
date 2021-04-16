import java.util.Scanner;

public class Enunciat_20210211 {

  public static Scanner teclat = new Scanner(System.in);
  public static Scanner teclatxt = new Scanner(System.in);
  /*
0.5 p. mostrarMissatgePerPantalla(String cadena)---
          retorna res
0.5 p. llegirEnterTeclat()---
          retorna int
0.5 p. llegirCaracterTeclat()---
          retorna char
1.0 p. llegirCadenaDeLletresTeclat()
          retorna String
          
0.5 p. comprovaEsEnter(Char valorLlegit)---
          retorna boolean
          
1.5 p. comprovaEsLletra(Char valorLlegit)---
          retorna boolean

2.0 p. mostrarMissatgePerPantallaSegonsSaltLinea(String cadena)---
          retorna res
          
6.0 p. TOTAL

(4 punts)

Dins del main, desenvolupa el codi necessari per:

Crear una matriu, les dimensions de la qual, li demanaràs a l'usuari,
També li demanaràs a l'usuari si vol omplir la matriu amb majúscules, minúscules o 
unitats (és a dir, enters d'un sol dígit, valors entre 0 i 9 ambdós inclosos).
I en funció del que escolli l'usuari, i fent servir la funció aleatoriEntreDosNombres(minim,maxim)
omple la matriu.
Recorda que pots fer servir el codi de la taula ASCII per obtenir lletres majúscules, 
lletres minúscules o nombres enters.

Al final de l'execució d'aquest codi, li demanaràs a l'usuari si vol tornar a 
començar, i si respon que si, repetiràs tot el procés, i si respon que no, faràs 
aparèixer un missatge de comiat i s'acabarà l'execució del programa.

Fes servir totes les funcions que puguis.

*/
	public static void mostrarMissatgePerPantalla(String cadena) {
		System.out.println(cadena);
	}
	
	public static int llegirEnterTeclat() {
		System.out.print("Introdueix un Enter: ");
		int enterLlegit = teclat.nextInt();
		return enterLlegit;
	}
	
	public static char llegirCaracterTeclat() {
		System.out.print("Introdueix un Caracter: ");
		String caracterLlegit2 = teclatxt.nextLine();
		char caracterLlegit = caracterLlegit2.charAt(0);
		return caracterLlegit;
	}
	
	public static String llegirCadenaDeLletresTeclat() {
		String cadenaLlegida = "";
		char caracterLlegit = ' ';
		boolean esLletra = false;
		do {
			caracterLlegit = llegirCaracterTeclat();
			esLletra = comprovaEsLletra(caracterLlegit);
			if (caracterLlegit != '#' && esLletra == true) {
				cadenaLlegida = cadenaLlegida + caracterLlegit;
			} else {
				if (caracterLlegit != '#') {
					System.out.println("No és lletra, torna-hi!");
				}
			}
		} while (caracterLlegit != '#');
		return cadenaLlegida;
	}
	
	public static boolean comprovaEsLletra(char caracterRebut) {
		boolean esLletra = false;
		int codiASCII;
		codiASCII = (int) caracterRebut;
		if ((codiASCII >= 65 && codiASCII <= 90) || (codiASCII >= 97 && codiASCII <= 122)) {
			esLletra = true;
		}
		return esLletra;
	}
	
	public static boolean comprovaEsEnter(char caracterRebut) {
		boolean esEnter = false;
		int codiASCII;
		codiASCII = (int) caracterRebut;
		if (codiASCII >= 48 && codiASCII <= 57) {
			esEnter = true;
		}
		return esEnter;
	}
	
	public static void mostrarMissatgePerPantallaSegonsSaltLinea(String cadena, boolean ambSalt) {
		if (ambSalt == true) {
			System.out.println(cadena);
		} else {
			System.out.print(cadena);
		}
	}
	
	public static int aleatoriEntreDosNombres(int nombrePetit, int nombreGran) {
		int nombreAleatori;
		nombreAleatori = (int) (Math.random() * (nombreGran + 1 - nombrePetit) + nombrePetit);
		return nombreAleatori;
	}
	
	public static void main(String[] args) {
		boolean fib = false;
		do {
			String missatgeAMostrar = "";
			String cadenaLlegida = "";
			boolean senseSaltDeLinia = false;
			missatgeAMostrar = "Entra una cadena de" + " caracters, pero entrant els" + " caracters d'un amb un,\n si"
					+ " entres dos, o més, només" + " es llegirè el primer!\n";
			mostrarMissatgePerPantalla(missatgeAMostrar);
			mostrarMissatgePerPantallaSegonsSaltLinea(missatgeAMostrar, senseSaltDeLinia);
			cadenaLlegida = llegirCadenaDeLletresTeclat();
			mostrarMissatgePerPantalla("La cadena llegida és " + cadenaLlegida);
			// segona part
			System.out.println("Introdueix les files i seguidament les columnes");
			String a[][] = new String[llegirEnterTeclat()][llegirEnterTeclat()];
			String m;
				System.out.println("Introdueix si vols omplir la matriu amb majuscules = \"M\" minuscules = \"N\" o unitats \"U\" ");
				m = teclatxt.nextLine();
				if (m.equals("M") || m.equals("m")) {
					for (int i = 0; i != a.length; i++) {
						System.out.println();
						for (int j = 0; j != a.length; j++) {
							a[i][j] = Character.toString(aleatoriEntreDosNombres(65, 90));
						}
					}
				} else if (m.equals("N") || m.equals("n")) {

					for (int i = 0; i != a.length; i++) {
						System.out.println();
						for (int j = 0; j != a.length; j++) {
							a[i][j] = Character.toString(aleatoriEntreDosNombres(97, 122));
						}
					}
				} else if (m.equals("U") || m.equals("u")) {
					for (int i = 0; i != a.length; i++) {
						System.out.println();
						for (int j = 0; j != a.length; j++) {
							a[i][j] = Character.toString(aleatoriEntreDosNombres(48, 57));
						}
					}
				} else {
					System.out.println("Error! No has introduit un tipus correcte");
				}
			for (int i = 0; i != a.length; i++) {
				System.out.println();
				for (int j = 0; j != a.length; j++) {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
			// fi
			System.out.print("vol tornar a començar?SI o NO: ");
			String fis = teclatxt.nextLine();
			if (fis.equals("SI") || fis.equals("si") || fis.equals("Si") || fis.equals("sI")) {
				fib = false;
			} else if (fis.equals("NO") || fis.equals("no") || fis.equals("No") || fis.equals("nO")) {
				fib = true;
				System.out.println("Fins Aviat");
			}
		} while (fib == false);
	}
}
import java.io.File;
import java.util.Scanner;

public class RieraPauPart01 {
	
	public static void llegirI(int[][] matriuI) {//llegir matriu int --1.1
		for(int i=0;i!=matriuI.length;i++) {
			for(int j=0;j!=matriuI.length;j++) {
				System.out.print(matriuI[i][j]+" ");
			}
		System.out.println();
		}
	}
	public static void llegirS(String[][] matriuS) {//llegir matriu string --1.2
		for(int i=0;i!=matriuS.length;i++) {
			for(int j=0;j!=matriuS.length;j++) {
				System.out.print(matriuS[i][j]+" ");
			}
		System.out.println();
		}
	}
	public static int filamax(String Nfitxer) {//fila maxima --1.3	
		Scanner t=null;
		int n=0;
		try {
			File fitxer = new File(Nfitxer);
			t = new Scanner (fitxer);
			while (t.hasNextLine()){
				String linea = t.nextLine();
				n++;
			}
		} catch (Exception E) {
			System.out.print("ERROR! "+E.getMessage());
		}
		return (n);
	}
	public static void main(String[] args) {
		System.out.println("--1.1");
		int matriuI[][] = {{1,2,3},{1,2,3},{1,2,3}};
		llegirI(matriuI);
		System.out.println("--1.2");
		String matriuS[][] = {{"abc","def","ghi"},{"abc","def","ghi"},{"abc","def","ghi"}};
		llegirS(matriuS);
		System.out.println("--1.3");
		String Nfitxer = "lib/fitxer1.3.txt";
		System.out.println(filamax(Nfitxer));
	}
}
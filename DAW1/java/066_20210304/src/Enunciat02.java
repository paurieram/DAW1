import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
public class Enunciat02 {
	public static Scanner TInt = new Scanner(System.in);
	public static int RNG() {
		int nombreAleatori;
		nombreAleatori = (int) (Math.random() * 10);
		return nombreAleatori;
	}
	public static void ATF(String[] matriu1,String[] matriu2,String[] matriu3,String NF,int N) {//arrays to fitxer
		try {
			FileWriter e=null;
			e = new FileWriter(NF);
			for(int i=0;i!=N;i++) {
				e.write(matriu1[RNG()]+" "+matriu2[RNG()]+" "+matriu3[RNG()]+"\n");
			}
			e.close();
		} catch (Exception E) {
		}
	}
	public static void FTA(String[] matriu,String NF) {//fitxer to array
		File fitxerEntrada = new File(NF);
		Scanner fileS = null;
		try {
			fileS = new Scanner (fitxerEntrada);
		} catch (FileNotFoundException e) {
		}
		for (int i = 0; i != matriu.length; i++) {
			String linea = fileS.nextLine();
				matriu[i] = linea;
		}
	}
	public static void main(String[] args) {
		System.out.print("Entra un el nombre de productes: ");
		int N = TInt.nextInt();
		String ob[] = new String[10];
		String fu[] = new String[10];
		String ad[] = new String[10];
		FTA(ob,"lib/E02/objectes.txt");
		FTA(fu,"lib/E02/funcions.txt");
		FTA(ad,"lib/E02/adjectius.txt");
		ATF(ob,fu,ad,"lib/E02/sortida.txt",N);
	}

}

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class RieraPauPart02 {

	public static boolean ContaR(String[] tmp) {//contar repetits
		boolean boolea=false;
		for(int i=0;i<=0;i++){
			for(int j=0;j<7;j++) {
				return Arrays.asList(tmp[j]).contains(tmp[j]);
			}
		}
		return boolea;
	}	
	public static void main(String[] args) {
		String Nfitxer = "lib/fitxer2.1.csv";
		int f=2,c=8;
		String matriuS[][] = new String[f][c];	
		try {
			File fitxer = new File(Nfitxer);
			Scanner t = new Scanner (fitxer);
			for (int i = 0; i != matriuS.length; i++) {
				String linea = t.nextLine();
				matriuS[i] = linea.split(",");
			}
		} catch (Exception E) {
			System.out.print("ERROR! "+E.getMessage());
		}
		String tmp[] = new String[c];
		for(int i=0;i!=2;i++) {
			for(int j=0;j!=c;j++) {
				tmp[j] = matriuS[i][j];
			}
			System.out.print(ContaR(tmp));
			
		}
		
		
		
		
	}
}
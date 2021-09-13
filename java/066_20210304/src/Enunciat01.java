import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Enunciat01 {
	public static Scanner TStr = new Scanner(System.in);
	public static Scanner TInt = new Scanner(System.in);
	public static int enters(String[] array,String tema,int F) {
		char tmp=0;
		boolean Enter = false;
		int codiASCII;
		do {
			tmp=0;
				System.out.println(tema);
				System.out.println(" Els possibles valors són:");
				for(int i=0;i!=array.length;i++){
					System.out.println("  "+(i+1)+" - "+array[i]);
				}
				if (F==49) {
					System.out.print(" Entra la teva opció (1,2)? : ");
				}else if(F==50){
					System.out.print(" Entra la teva opció (1,2,3)? : ");
				}else if(F==54){
					System.out.print(" Entra la teva opció (1,2,3,4,5,6,7)? : ");
				}
				tmp = TStr.nextLine().charAt(0);
				codiASCII = (int) tmp;
				if (codiASCII >= 48 && codiASCII <= F+1) {
					Enter = true;
				}else {
					System.out.println("ERROR! El valor entrat està fora de rang,");
				}
		}while(Enter!=true);
		return Character.getNumericValue(tmp);
	}
	public static void FTM(String[][] matriu,String NF) {//fitxer to matriu
		File fitxerEntrada = new File(NF);
		Scanner fileS = null;
		try {
			fileS = new Scanner (fitxerEntrada);
		} catch (FileNotFoundException e) {
		}
		for (int i = 0; i != 2; i++) {
			String linea = fileS.nextLine();
			for (int j = 0; j != 7; j++) {
					matriu[j] = linea.split(",");
			}
		}
	}
	public static void main(String[] args) {
		boolean b=false;
		do {
			String semana[] = {"dilluns","dimarts","dimecres","dijous","divendres","disapte","diumenge"};
			String dia[] = {"catala","castella","angles"};
			String format[] = {"llarg","curt"};
			int res[] = {enters(semana,"Entra un dia de la setmana",54),enters(dia,"Entra un idioma",50),enters(format,"Entra un format",49)};
			System.out.println(res[0]+""+res[1]+""+res[2]);
			
			String file[][] = new String[2][7];
			if (res[1]==1) {
				FTM(file, "lib/E01/catala.txt");
			}else if(res[1]==2) {
				FTM(file, "lib/E01/castella.txt");
			}else if(res[1]==3) {
				FTM(file, "lib/E01/angles.txt");
			}			
			System.out.println("El dia de la setmana ("+semana[res[0]]+") segons l'idioma escollit ("+semana[res[1]]+") i el format demanat es ("+semana[res[2]]+") és:"+file[res[2]][res[0]] );
			System.out.print("Vols continuar (1 - Si , 2 - No): ");
			int continua = TInt.nextLine().charAt(0);
			if (continua==2){
				b=true;
			}
		}while(b!=true);
	}
}
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ClassePrincipal {
	public static Scanner teclatxt = new Scanner(System.in);
	public static int FM(File fitxer) {//fila maxima	
		Scanner t=null;
		try {
			t = new Scanner (fitxer);
		} catch (Exception E) {
			System.out.print("ERROR! "+E.getMessage());
		}
		int n=0;
		while (t.hasNextLine()){
			String linea = t.nextLine();
			//System.out.println(linea);
			n++;
		}
		return (n-1);
	}
	public static void MTF(String[][] a,String NF) {//matriu to fitxer
		try {
			FileWriter e=null;
			e = new FileWriter(NF);
			for(int i=0;i!=a.length;i++) {
				if (i==0) {
					e.write("Nom;Id;Nom;Primer cognom\n");
				}
				e.write(a[i][0]+";"+a[i][1]+";"+a[i][2]+";"+a[i][3]+"\n");
			}
			e.close();
		} catch (Exception E) {
			System.out.print("ERROR! "+E.getMessage());
		}
	}
	public static void llegir(String[][] a,int L) {//llegir
		for(int i=0;i!=L;i++) {
				System.out.println(a[i][0]+";"+a[i][1]+";"+a[i][2]+";"+a[i][3]);
		}
	}
	public static void FTM(String[][] a,File fitxer,int L) {//fitxer to matriu
		Scanner t=null;
		try {
			t = new Scanner (fitxer);
		} catch (Exception E) {
			System.out.print("ERROR! "+E.getMessage());
		}
		String linea = t.nextLine();
		for (int i = 0; i != L; i++) {
			linea = t.nextLine();
			a[i] = linea.split(";");
			/*String tmp = "";
			int p=0;
			for (int j = 0; j != linea.length(); j++) {
				if (linea.charAt(j) == ';') {
					a[i][p] = tmp;
					p++;
					tmp = "";
				}else {
					tmp = tmp + linea.charAt(j);
				}
			}
			a[i][p] = tmp;*/
		}
	}
	public static int TID(String ID,String[][] a,int L) {
		int n=-1;
		for(int i=0;i!=L;i++) {
			if (a[i][1].equals(ID)) {
				n=Integer.parseInt(a[i][0]);
			}
		}
		return n;
	}
	public static void M(String[][] a, int L, String ID) {
		System.out.print("Desitges modificar el alumne (S/N)");
		String t=teclatxt.nextLine();
		if (t.equals("S")) {
		System.out.print("Introdueix nou nom del alumne: ");
		String n=teclatxt.nextLine();
		System.out.print("Introdueix nou cognom del alumne: ");
		String c=teclatxt.nextLine();
		System.out.print("Desitjes desar els canvis (S/N)");
		String r=teclatxt.nextLine();
		if (r.equals("S")) {
			a[TID(ID,a,L)-1][2]=n;
			a[TID(ID,a,L)-1][3]=c;
			System.out.print("Canvis Aplicats");
		}else {
			System.out.print("Canvis Cancelats");
		}
		}else {
			System.out.print("Canvis Cancelats");
		}
		
	}
	public static void main(String[] args) {//main
		String NF="lib/fitxertest.txt";
		File fitxer = new File(NF);
		try {
			int L=FM(fitxer);
			String a[][]=new String[L][4];		
				FTM(a,fitxer,L);
				System.out.print("Introdueix ID del alumne: ");
				String ID=teclatxt.nextLine();
				TID(ID,a,L);
				if (TID(ID,a,L)==-1) {
					System.out.println("Error! no exissteix");
				}else {
					System.out.println("El nom de l'alumne es "+a[TID(ID,a,L)-1][2]+" i cognom "+a[TID(ID,a,L)-1][3]);
				}
				M(a, L, ID);
				//llegir(a,L);
				MTF(a,NF);
		} catch (Exception E) {
			System.out.print("ERROR! "+E.getMessage());
		}
	}
}
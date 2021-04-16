import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ClassePrincipal {
	public static void llegir(char[][] matriu,int[] FC) {//llegir
		for(int i=0;i!=FC[0];i++) {
			for(int j=0;j!=FC[0];j++) {
				System.out.print(matriu[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void FiCo(int[] FC,Scanner fileS) {//filas columnas
		String linea = fileS.nextLine();
		String tmp = "";
		int i=0;
		for (i = 0; i != linea.length(); i++) {
			if (linea.charAt(i)==' ') {
				FC[1]=Integer.parseInt(tmp);
				tmp = "";
			}else {
				tmp = tmp + linea.charAt(i);
			}
		}
		FC[0]=Integer.parseInt(tmp);
	}
	public static void MTF(int result) {//int to fitxer
		try {
			FileWriter e=null;
			e = new FileWriter("lib/result.txt",true);
				e.write(result);
			e.close();
		} catch (Exception E) {
			System.out.print("ERROR! "+E.getMessage());
		}
	}
	public static boolean Nm(int fila,int columna,char[][] matriu) {//comprovar el voltant 
		boolean boolea=false;
		int b=0;
        for (int i=-1;i!=1;i++){
            if (fila+i>=0 && fila+i<=11){
                for(int j=-1;j!=1;j++){
                    if (columna+j>=0 && columna +j<=8){
                        if (matriu[fila+i][columna+j]==('*')){
                            b++;
                        }
                    }
                }
            }
        }
	    if (b>=6) {
	    	boolea=true;
	    }
    return boolea;
	}
	public static void FTM(char[][] matriu,Scanner fileS,int[] FC) {//fitxer to matriu
			for (int i = 0; i != FC[0]; i++) {
				String linea = fileS.nextLine();
				for (int j = 0; j != linea.length(); j++) {
						matriu[i][j] = linea.charAt(j);
				}
			}
	}
	public static void main(String[] args) {
		int FC[] = new int[2];
		try {
			File fitxerEntrada = new File("lib/source.txt");
			Scanner fileS = new Scanner (fitxerEntrada);
			while (fileS.hasNextLine()) {
				FiCo(FC, fileS);
				char matriu[][] = new char[FC[0]][FC[1]];
				System.out.println(FC[0]+FC[1]);
				FTM(matriu, fileS, FC);
				llegir(matriu, FC);
				int result=0;
				for(int i=0;i!=FC[0];i++) {
					for(int j=0;j!=FC[0];j++) {
						if (Nm(FC[0],FC[1],matriu)==true) {
							result++;
						}
					}
				}
				MTF(result);
			}
		} catch (Exception E) {
			System.out.print("ERROR! "+E.getMessage());
		}
	}
}
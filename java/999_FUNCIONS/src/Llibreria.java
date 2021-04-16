import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Llibreria {
	public static void main(String[] args) {
		System.out.print("");
		System.out.println("");
		Scanner TInt = new Scanner(System.in);
		Scanner TStr = new Scanner(System.in);
		int N=0;
		String S="";
		String A[]=new String[2];
		S = TStr.nextLine();
		S = TStr.next();
		N = TInt.nextInt();
		N	 = Integer.parseInt(TStr.nextLine());
		//return Arrays.asList(A).contains(S); //torna true false
		N=Integer.parseInt(S);//string to int
		S = Character.toString(N);//ascii to string
		Character.getNumericValue(N);//ascii to int
		switch(N) {
		case 1:
			break;
		case 2:
			break;
		}
		try {
			//this.S="";
		}catch(InputMismatchException e) {
   		 System.out.println("Error! ");
   	 	}catch(ArithmeticException e){
			System.out.println("ERROR! X/0");
		}catch (NumberFormatException e) {
			System.out.println("ERROR! numero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR! limits");
		}catch (Exception e){
			System.out.println("ERROR! general");
		}
	}
	public static Scanner TInt = new Scanner(System.in);
	public static Scanner TStr = new Scanner(System.in);
	public static void llegir(String[] matriu) {//llegir array
	for(int i=0;i!=matriu.length;i++) {
			System.out.print(matriu[i]+" ");
		}
	System.out.println();
	}
	public static void llegir(char[][] matriu,int[] FC) {//llegir matriu
		for(int i=0;i!=FC[0];i++) {
			for(int j=0;j!=FC[0];j++) {
				System.out.print(matriu[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int RNG(int Petit, int Gran) {//nombre aleatori entre 2 nombres
		return (int) (Math.random() * (Gran + 1 - Petit) + Petit);
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
	public static void Menu(String[] array,String misatge) {
		String mostrar=misatge+" (";
		for(int i=0;i<array.length;i++) {
			System.out.println((i+1)+". "+array[i]);
			mostrar=mostrar+(i+1);
			if(i<array.length-1) {
				mostrar=mostrar+", ";
			}
		}
		mostrar=mostrar+"): ";
		System.out.println(mostrar);
	}
	public static String[][] MatriuMes(String[][] antigaMatriu, String[] array) {//aumentar tamany de la matriu
		String novaMatriu[][] =new String [antigaMatriu.length + 1][3];
		for(int i=0;i!=novaMatriu.length - 1;i++) {
			novaMatriu[i][0]=antigaMatriu[i][0];
			novaMatriu[i][1]=antigaMatriu[i][1];
			novaMatriu[i][2]=antigaMatriu[i][2];
		}
		novaMatriu[novaMatriu.length][0]=array[0];
		novaMatriu[novaMatriu.length][1]=array[1];
		novaMatriu[novaMatriu.length][2]=array[2];
		return novaMatriu;
	}
	public static String[][] MatriuMenys(String[][] antigaMatriu,int posisio) {//Disminuir tamany de la matriu
		String novaMatriu[][] =new String [antigaMatriu.length - 1][3];
		int j=0;
		for(int i=0;i!=antigaMatriu.length;i++) {
			if (i!= posisio) {
				novaMatriu[j][0]=antigaMatriu[i][0];
				novaMatriu[j][1]=antigaMatriu[i][1];
				novaMatriu[j][2]=antigaMatriu[i][2];
				j++;
			}
		}
		return novaMatriu;
	}
	public static String mat() {//generar matricula aleatoria
		return ""+RNG(0,9)+RNG(0,9)+RNG(0,9)+RNG(0,9)+Character.toString(RNG(65,90))+Character.toString(RNG(65,90))+Character.toString(RNG(65,90));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

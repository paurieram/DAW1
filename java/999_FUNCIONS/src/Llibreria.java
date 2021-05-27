import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Llibreria {
	public static void main(String[] args) {
		//------------------------------------------- N->int S->String L->List C->char A->Array M->Matriu
		//----------mostrar
		System.out.print("");
		System.out.println("");
		//----------declaraccio
		int N=0;//int
		String S="";//string
		String A[]=new String[2];//array
		String M[][]=new String[2][2];//matriu
		Class1[] arrObj = new Class1[N];//declaracio de array d'objectes
		arrObj[N] = new Class1();//creaccio d'objecte a l'array
		Scanner TStr = new Scanner(System.in);//scanner
		ArrayList L = new ArrayList();//list
		//-----------demanar
		S = TStr.nextLine();//demanar string
		N = Integer.parseInt(TStr.nextLine());//demanar int
		char C = TStr.nextLine().charAt(0);//demanar char
		//-----------comversions
		N=Integer.parseInt(S);//string to int
		S = Character.toString(N);//ascii to string
		Character.getNumericValue(N);//ascii to int
		Math.sqrt(2);//arrel quadrada
		Math.pow(1,2);// 1 elevat a 2
		S.toLowerCase();//string a minuscules
		S.toUpperCase();//string a majuscules
		L.add("1");//contingut  | afegir
		L.get(0);//posicio | agafar
		L.add(0,2);//posicio/contingut | modificar
		L.size();//length | longitud
		L.remove(0);//posicio | treure
		//-----------switch
		switch(N) {
		case 1:
			break;
		case 2:
			break;
		}
		//-----------exepcions
		try {
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
	public static Scanner TStr = new Scanner(System.in);
	public static int O = 0;
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
	public String toString() {//mostrar objecte
		return "";
	}
	public static boolean Has(String[] A,String S) {//torna true false si conte s
		return Arrays.asList(A).contains(S); 
	}
	public static void aObj() {//omplir array de objectes
		Class1[] arrObj = new Class1[O];//declaracio de array d'objectes
		for (int i = 0; i < arrObj.length; i++) {
			System.out.println("Dades per a Objecte");
			System.out.print("Introdueix el llibre Objecte : ");
			String llibre = TStr.nextLine();
			System.out.print("Introdueix el autor Objecte : ");
			String autor = TStr.nextLine();
			System.out.print("Introdueix la quantitat d'exemplars Objecte : ");
			String quant = TStr.nextLine();
			String prestec="0";
			arrObj[i] = new Class1();//creaccio d'objecte en l'array
		}
	}
	public class class2 extends Class1{	
	}
	public static void iterator(ArrayList L) {//iterator
		Iterator i = L.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static void contarproductes(ArrayList L) {
		Iterator i = L.iterator();
		int unitats=0;
		while(i.hasNext()) {
			Object contingut = i.next();
			if(contingut instanceof Class) {
				Class tmp  = (Class)contingut;
				//unitats+=tmp.getQuantitat();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

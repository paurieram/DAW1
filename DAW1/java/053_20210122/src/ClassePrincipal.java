import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		Scanner t = new Scanner (System.in);
		System.out.print("Entra la quantitat d'alumnes: ");
		int a = t.nextInt();//a = alumnes
		System.out.println("");
		int n[] = new int[11];//n = notes
		int A=0;//A = contador alumnes
		do {
			System.out.print("Entra la nota de l'alumne "+(A+1)+" de "+a+": ");
			int N = t.nextInt();//N = nota
			if (N>=0 && N<=10) {
				n[N]++;
				A++;
			}else {
				System.out.println("ERROR! Torna a intentar-ho!");
			}
		}while (A!=a);
		System.out.println("");
		for(int i=0;i!=n.length;i++) {//mostrar resultat
			System.out.println("Hi ha "+n[i]+" alumne/s amb un "+i);
		}
		t.close();
	}

}

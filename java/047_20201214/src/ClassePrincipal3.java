import java.util.Scanner;

public class ClassePrincipal3 {

	public static void main(String[] args) {
		Scanner t = new Scanner (System.in);
		Scanner te = new Scanner (System.in);
		String o;
		boolean n=false;
		do {
			System.out.print("Introdueix \"x\" xifrar \"d\" desxifrar: ");
			o = te.nextLine();
			if (o.equals("d")||o.equals("D")||o.equals("x")||o.equals("X")) {
				n=true;
			}
		}while (n!=true);
		System.out.println("Introdueix Text");
		String T = te.nextLine();
		System.out.print("Introdueix Nombre de columnes: ");
		int c = t.nextInt();
		char r[][] = new char[3][c];
		for (int j=0;j!=c;j++){//desxifrar
			for (int i=0;i!=3;i++){
				r[i][j]=T.charAt(i);
			}
		System.out.println("");
		}
		for (int i=0;i!=3;i++){
			for (int j=0;j!=c;j++){
				System.out.print(" "+r[i][j]);
			}
		System.out.println("");
		}
		t.close();
		te.close();
	}
}
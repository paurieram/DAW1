import java.util.Scanner;

public class ClassePrincipal1 {

	public static void main(String[] args) {
		Scanner t = new Scanner (System.in);//crear matrius
		System.out.print("Introdueix les files de la matriu: ");
		int f = t.nextInt();
		System.out.print("Introdueix les columnes de la matriu: ");
		int c = t.nextInt();
		int r[][] = new int[f][3];
		int n[][] = new int[f][c];
		for (int i=0;i!=f;i++){// omplir matriu 1
			for (int j=0;j!=c;j++){
				System.out.print("Introdueix el nombre de la posicio ["+(i+1)+"]["+(j+1)+"]: ");
				n[i][j] = t.nextInt();
			}
		}	
		for (int i=0;i!=f;i++){// omplir matriu 2
			for (int j=0;j!=c;j++){
				if (n[i][j]==0) {
					r[i][2]++;
				}else if (n[i][j]<=-1) {
					r[i][0]++;
				}else if (n[i][j]>=1) {
					r[i][1]++;
				}
			}
		}
		t.close();
		for (int i=0;i!=f;i++){//n p z-- monstrar
			for (int j=0;j!=3;j++){
				System.out.print(" "+r[i][j]);
			}
		System.out.println("");
		}
	}

}

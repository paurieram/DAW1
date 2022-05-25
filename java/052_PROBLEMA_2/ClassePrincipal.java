import java.util.*;
public class ClassePrincipal {
		public static void IncicialitzarMatriu(char[][] M, char valor) {
			
		}
		public static void setInsectesMatriu(char[][] life, int K,int M) {
			Scanner t = new Scanner(System.in);
			int I=0;
			do {
			System.out.print("Introdueix La fila del insecte num "+(I+1)+": ");
			int F = t.nextInt();
				do {
					if (F<0 || F>=M) {
						System.out.print("Error; Coordenades incorrectes, torna a introduir la fila del insecte num "+(I+1)+": ");
						F = t.nextInt();	
					}else {
						break;
					}
				}while (I!=K);
				System.out.print("Introdueix La columna del insecte num "+(I+1)+": ");
				int C = t.nextInt();
				do {
					if (C<0 || C>=M) {
						System.out.print("Error; Coordenades incorrectes, torna a introduir la columna del insecte num "+(I+1)+": ");
						C = t.nextInt();	
					}else {
						break;
					}
				}while (I!=K);
				if (life[F][C] != 'X') {
					life[F][C] = 'X';
					I++;
				}else {
					System.out.println("Error; Ya existeix un insecte en aquestes coordenades, torna a introduir-les");
				}
			}while(I!=K);
		}
		public static void VisualitzarMatriu(char[][] life, String F1,int M,int Fase) {
			System.out.println("Fase = "+Fase);
			for(int i=0;i!=M;i++) {
				System.out.println("");
				System.out.print(F1);
				System.out.println("");
				System.out.print("| "); 
				for(int j=0;j!=M;j++) {
					System.out.print(life[i][j]+" | "); 
				}
			}
			System.out.println("");
			System.out.print(F1);
			
		}
		public static void Update(char[][] life, char[][] cambis,int M) {
			for(int i=0;i!=M;i++) {
				for(int j=0;j!=M;j++) {
					life[i][j] = cambis[i][j];
				}
			}
		}
		public static void Cambis(char[][] life, char[][] cambis, int M) {
			for (int c=0; c!=M; c++) {
		           for (int j=0, numeros=0, c2=0, c3=0,c4=-1,c5=-1; j!=M; j++,c2++,c3++,c4++,c5++) {
				do {
	                if (life[j-1][c+c2]=='X') {
	                    numeros++;
	                }
	            } while (c2!=1);
	           do {
	               if (life[j+c3][c+1]=='X') {
	                   numeros++;
	               }
	           } while (c3!=1);
	           do {
	               if (life[j+1][c+c4]=='X') {
	                   numeros++;
	               }
	           } while (c4!=0);
	           do {
	               if (life[j+c5][c-1]=='X') {
	                   numeros++;
	               }
	            } while (c5!=0);
	              if (numeros == 3) {
	                  cambis[j][c]='X';
	              }
	              if(numeros == 0 || numeros == 1 || numeros == 4 || numeros == 5 || numeros == 6 || numeros == 7 || numeros == 8){
	            	  cambis[j][c]=' ';
	              }
	           }
			}
		}
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("Introdueix La mida del terreny de joc: ");
		int M = t.nextInt();
		do {//demanem mida del tauler
			if (M<=0) {
				System.out.println("Error; Longitud de la matriu incorrecte, torna a introduir la mida");
				M = t.nextInt();
			}
		}while (M<=0);
		System.out.print("Introdueix La quantitat de insectes: ");
		int K = t.nextInt();
		do {//demanem nombre de insectes
			if (K<=M*M && K>5) {
				System.out.println("Error; Nombre de insectes incorrecte, torna a introduir els insectes");
				K = t.nextInt();
			}
		}while (K<=M*M && K>5);
		char life[][] = new char[M][M];//matriu principal
		char cambis[][] = new char[M][M];//matriu secundaria
		int Fase = 0; //contador fases
		String F1 = "+";//mostrar
		for(int i=0;M!=i;i++) {
			F1 = F1+"---+";
		}
		setInsectesMatriu(life, K, M);
		do {
		VisualitzarMatriu(life, F1, M, Fase);
		Cambis(life, cambis, M);
		Update(life, cambis, M);
		System.out.print("Next...");
		K = t.nextInt();
		}while(K!=0);
	t.close();
	}
}
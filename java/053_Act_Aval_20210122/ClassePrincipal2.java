
public class ClassePrincipal2 {

	public static int FP(int[][] m) {//fila n petit
		int n=m[0][0], r=1000;
		for(int i=0;i!=6;i++) {
			for(int j=0;j!=15;j++) {
				if (n>m[i][j]) {
					n=m[i][j];
					r=i+1;
				}
			}
		}
		return r;
	}
	public static int CP(int[][] m) {//columna n petit
		int n=m[0][0], r=1000;
		for(int i=0;i!=6;i++) {
			for(int j=0;j!=15;j++) {
				if (n>m[i][j]) {
					n=m[i][j];
					r=j+1;
				}
			}
		}
		return r;
	}
	public static int FG(int[][] m) {//fila n gran
		int n=m[0][0], r=1000;
		for(int i=0;i!=6;i++) {
			for(int j=0;j!=15;j++) {
				if (n<m[i][j]) {
					n=m[i][j];
					r=i+1;
				}
			}
		}
		return r;
	}
	public static int CG(int[][] m) {//columna n gran
		int n=m[0][0], r=1000;
		for(int i=0;i!=6;i++) {
			for(int j=0;j!=15;j++) {
				if (n<m[i][j]) {
					n=m[i][j];
					r=j+1;
				}
			}
		}
		return r;
	}
	public static int VP(int[][] m, int f, int c) {//Valor de la posicio
		int r =m[f-1][c-1];
		return r;
	}
	public static int cp(int[][] m) {//compta petits
		int r=0;
		for(int i=0;i!=6;i++) {
			for(int j=0;j!=15;j++) {
				if (m[i][j]<500) {
					r++;
				}
			}
		}
		return r;
	}	
	public static int cg(int[][] m) {//compta grans
		int r=0;
		for(int i=0;i!=6;i++) {
			for(int j=0;j!=15;j++) {
				if (m[i][j]>500) {
					r++;
				}
			}
		}
		return r;
	}
	public static int SP(int[][] m) {//suma petits
		int r=0;
		for(int i=0;i!=6;i++) {
			for(int j=0;j!=15;j++) {
				if (m[i][j]<500) {
					r=r+m[i][j];
				}
			}
		}
		return r;
	}	
	public static int SG(int[][] m) {//suma grans
		int r=0;
		for(int i=0;i!=6;i++) {
			for(int j=0;j!=15;j++) {
				if (m[i][j]>500) {
					r=r+m[i][j];
				}
			}
		}
		return r;
	}
	public static double CM(int t, int q) {//calcul mitjana
		int r=t/q;
		return r;
	}	
	public static void main(String[] args) {
		int m[][]=new int[6][15];
		for(int i=0;i!=6;i++) {
			for(int j=0;j!=15;j++) {
				m[i][j]= (int) (1000*Math.random());
			}
		}
		System.out.println("a) La posici� ("+FG(m)+" i "+CG(m)+") del nombre m�s gran,");
		System.out.println("b) El valor del nombre m�s gran, "+VP(m,FG(m),CG(m)));
		System.out.println("c) La posici� ("+FP(m)+" i "+CP(m)+") del nombre m�s petit,");
		System.out.println("d) El valor del nombre m�s gran, "+VP(m,FP(m),CP(m)));
		System.out.println("e) La quantitat de valors m�s grans de 500, "+cg(m));
		System.out.println("f) La quantitat de valors m�s petits de 500, "+cp(m));
		System.out.println("g) La suma dels valors m�s grans de 500, "+SG(m));
		System.out.println("h) La suma dels valors m�s petits de 500, "+SP(m));
		System.out.println("i) La mitjana dels valors m�s grans de 500, "+CM(SG(m),cg(m)));
		System.out.println("j) La mitjana dels valors m�s petits de 500, "+CM(SP(m),cp(m)));
	}	
}

public class ClassePrincipal2 {

	public static void main(String[] args) {
		int r[] = new int[3];
		int m[][] = {{14,15,11},{13,12,17},{16,18,19}};
		for (int i=0;i!=3;i++){
			for (int j=0;j!=3;j++){
				System.out.print(" "+m[i][j]);
			}
		System.out.println("");
		}
		int f=0,n=0,a=0,b=0,col=0;
		boolean res=false;
		do {
			n=m[a][b];
			if (n<m[a][b+1]) {
				if(n<m[a][b+2]) {
					f=n;
					col=1;
				}else {
					f=m[a][b+2];
					col=3;
				}
			}else if (m[a][b+1]<m[a][b+2]) {
				f=m[a][b+1];
				col=2;
			}else {
				f=m[a][b+2];
				col=3;
			}
			if (a==0) {
				if (f>m[1][col-1]) {
					if (f>m[2][col-1]){
						r[0]=col;
						res=true;
					}
				}
			}
			if (a==1) {
				if (f>m[0][col-1]) {
					if (f>m[2][col-1]){
						r[1]=col;
						res=true;
					}
				}
			}
			if (a==2) {
				if (f>m[0][col-1]) {
					if (f>m[1][col-1]){
						r[2]=col;
						res=true;
					}
				}
			}
		if (res==false) {
			a++;
		}
		}while(res!=true);	
		for (int i=0;i!=3;i++){
				System.out.print(" "+r[i]);
		}
	}
}
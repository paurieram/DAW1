import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		Scanner t = new Scanner (System.in);
		Scanner te = new Scanner (System.in);
		String m[][] = new String[2][10];
		for(int i=0;i!=2;i++) {
			for(int j=0;j!=10;j++) {
				m[i][j]=" ";
			}
		}
		System.out.print("Introdueix el  nombre de menus: ");
		int N = t.nextInt();
		do {
			if (N>25 || N<0) {
				System.out.print("ERROR! Introdueix el  nombre de menus: ");
				N = t.nextInt();
			}
		}while (N>=25 || N<0);
		String T="",tmp="";
		int n=0,k=0;
		boolean z=false;
		do {
			System.out.println("Introdueix el menu "+(n+1));
			T = te.nextLine();
			for (int i=4;i!=T.length();i++){
				if (T.charAt(i)!=' ') {
					tmp=tmp+T.charAt(i);
					if (tmp.equals("FI")) {
						tmp="";
						break;
					}
				}else if (T.charAt(i)==' ') {
					do {
						z=false;
						if (m[0][k].equals(" ")) {
							z=true;
						}else if (m[0][k].equals(tmp)) {
							z=true;
						}else if (m[0][k]!="") {
							k++;
						}
					}while(z!=true);					
					if (T.charAt(0)=='N') {
						m[0][k]=tmp;
						if (m[1][k].equals(" ")){
							m[1][k]="0";
						}
						tmp="";
						k=0;
					}else if (T.charAt(0)=='S') {
						m[0][k]=tmp;
						m[1][k]="1";
						tmp="";
						k=0;
					}	
				}	//SI: papa popo pipi FI  NO: kaka popo lala FI
			}		//SI: papa kaka sisi FI
			n++;
		
		}while(n!=N);

			for(int j=0;j!=10;j++) {
				if (m[1][j].equals("0")) {
					System.out.println(m[0][j]+" ");
				}
			}
		
		
		t.close();
		te.close();
		
	}

}

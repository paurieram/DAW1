import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		int i[] = new int[5];
		int f[] = new int[5];
		Scanner t = new Scanner (System.in);
		for(int a=0;a!=5;a++) {
			System.out.print("introdueix el nombre de la posicio "+a+": ");
			i[a] = t.nextInt();
		}
		t.close();
		for(int a=0;a!=5;a++) {
			System.out.print(i[a]+" ");
		}
		System.out.print("introdueix el nombre de les posicions que et vols desplaçar: ");
		int p = t.nextInt();
		int a=0;
		do {
			
			if(p+a > 4) {
				f[a+p-i.length] = i[a];
			}else if (p+a < 4) {
				f[a+p] = i[a];
			}
		} while(a==0);
		
	}
}
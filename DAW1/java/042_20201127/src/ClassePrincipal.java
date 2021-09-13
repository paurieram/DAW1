import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		char a[] = new char[52];
		Scanner t = new Scanner (System.in);
		Scanner te = new Scanner (System.in);
		int p=0;//contador per crear inicialitzar l'array
		String r="";//resultat
		boolean b=false;
		for(int i=65;i!=123;i++){//1A+1C
			if (i>=65 && i<=90) {
				a[p] = (char)i;
				p++;
			}else if (i>=97 && i<=122){
				a[p] = (char)i;
				p++;
			}
		}
		for(int n=0;n!=-1;){//2A+2C
			System.out.print("Entra l'índex del caràcter que vols escriure (A: 1, Z: 26, -1 per acabar): ");
			n = t.nextInt();
			if (n>=1 && n<=26) {
				do{
					System.out.print("Vols que el caràcter sigui majúscules (M) o minúscules (m): ");
					String m = te.nextLine();
					if (m.equals("m")) {//minuscula
						b=true;
						r=r+a[n+26-1];
						System.out.println("S'afegirà una \""+a[n+26-1]+"\" a la cadena.");
					}else if (m.equals("M")) {//majuscula
						b=true;
						r=r+a[n-1];
						System.out.println("S'afegirà una \""+a[n-1]+"\" a la cadena.");
					}else {//error
						System.out.println("Error! El valor ha de ser majúscules (M) o minúscules (m)");
						b=false;
					}
				}while(b!=true);
			}else if (n!=-1){
				System.out.println("Error! El valor ha d'estar entre 1 i 26 o -1 per acabar.");
			}
		}
		if (r.equals("")){//mostrar resultat
			System.out.println("No has creat cap cadena");
		}else {
			System.out.println("La cadena final és: "+r);
		}
		t.close();
		te.close();
	}
}
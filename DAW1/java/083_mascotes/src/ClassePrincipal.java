import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		Inventari I = new Inventari();
		Scanner TStr = new Scanner(System.in);
		boolean bool=false;
		do {
			System.out.println("Introdueix el que vols fer\n(1)-Llistar tots\n(2)-Llistar un\n(3)-Llistar tots detallats\n(4)-afegir\n(5)-treure un\n(6)-treure tot");
			int N = Integer.parseInt(TStr.nextLine());
			switch(N) {
			case 1:
				I.listall();
				break;
			case 2:
				System.out.println("quin vols mostrar");
				int T2 = Integer.parseInt(TStr.nextLine());
				I.listone(T2);
				break;
			case 3:
				I.listalldet();
				break;
			case 4:
				System.out.println("Introdueix el tipus de animal\n(1)-Gos\n(2)-Gat\n(3)-Lloro\n(4)-Canari");
				int N2 = Integer.parseInt(TStr.nextLine());
				switch(N2) {
				case 1:
					System.out.println("Introdueix el nom");
					String a1 = TStr.nextLine();
					System.out.println("Introdueix el edat");
					int b1 = Integer.parseInt(TStr.nextLine());
					System.out.println("Introdueix el estat");
					String c1 = TStr.nextLine();
					System.out.println("Introdueix el naixement ex: 00/00/00");
					String d1 = TStr.nextLine();
					System.out.println("Introdueix la raça");
					String e1 = TStr.nextLine();
					System.out.println("Introdueix (1)si te puçes o (0)no");
					int t1 = Integer.parseInt(TStr.nextLine());
					boolean f1=false;
					if (t1==0) {
						f1=false;
					}else if (t1==1){
						f1=true;
					}
					Gos gos = new Gos(a1,b1,c1,d1,e1,f1);
					I.add(gos);
					System.out.println("animal introduit correctament");
					break;
				case 2:
					System.out.println("Introdueix el nom");
					String a2 = TStr.nextLine();
					System.out.println("Introdueix el edat");
					int b2 = Integer.parseInt(TStr.nextLine());
					System.out.println("Introdueix el estat");
					String c2 = TStr.nextLine();
					System.out.println("Introdueix el naixement ex: 00/00/00");
					String d2 = TStr.nextLine();
					System.out.println("Introdueix el color");
					String e2 = TStr.nextLine();
					System.out.println("Introdueix (1)si te el pel llarg o (0)curt");
					int t2 = Integer.parseInt(TStr.nextLine());
					boolean f2=false;
					if (t2==0) {
						f2=false;
					}else if (t2==1){
						f2=true;
					}
					Gat gat = new Gat(a2,b2,c2,d2,e2,f2);
					I.add(gat);
					System.out.println("animal introduit correctament");
					break;
				case 3:
					System.out.println("Introdueix el nom");
					String a3 = TStr.nextLine();
					System.out.println("Introdueix el edat");
					int b3 = Integer.parseInt(TStr.nextLine());
					System.out.println("Introdueix el estat");
					String c3 = TStr.nextLine();
					System.out.println("Introdueix el naixement ex: 00/00/00");
					String d3 = TStr.nextLine();
					System.out.println("Introdueix (1)si te bec o (0)no");
					int t3 = Integer.parseInt(TStr.nextLine());
					boolean e3=false;
					if (t3==0) {
						e3=false;
					}else if (t3==1){
						e3=true;
					}
					System.out.println("Introdueix (1)si vola o (0)no");
					t3 = Integer.parseInt(TStr.nextLine());
					boolean f3=false;
					if (t3==0) {
						f3=false;
					}else if (t3==1){
						f3=true;
					}
					System.out.println("Introdueix el origen");
					String g3 = TStr.nextLine();
					System.out.println("Introdueix (1)si parla o (0)no");
					t3 = Integer.parseInt(TStr.nextLine());
					boolean h3=false;
					if (t3==0) {
						h3=false;
					}else if (t3==1){
						h3=true;
					}
					Lloro lloro = new Lloro(a3,b3,c3,d3,e3,f3,g3,h3);
					I.add(lloro);
					System.out.println("animal introduit correctament");
					break;
				case 4:
					System.out.println("Introdueix el nom");
					String a4 = TStr.nextLine();
					System.out.println("Introdueix el edat");
					int b4 = Integer.parseInt(TStr.nextLine());
					System.out.println("Introdueix el estat");
					String c4 = TStr.nextLine();
					System.out.println("Introdueix el naixement ex: 00/00/00");
					String d4 = TStr.nextLine();
					System.out.println("Introdueix (1)si te bec o (0)no");
					int t4 = Integer.parseInt(TStr.nextLine());
					boolean e4=false;
					if (t4==0) {
						e4=false;
					}else if (t4==1){
						e4=true;
					}
					System.out.println("Introdueix (1)si vola o (0)no");
					t4 = Integer.parseInt(TStr.nextLine());
					boolean f4=false;
					if (t4==0) {
						f4=false;
					}else if (t4==1){
						f4=true;
					}
					System.out.println("Introdueix el color");
					String g4 = TStr.nextLine();
					System.out.println("Introdueix (1)si canta o (0)no");
					t4 = Integer.parseInt(TStr.nextLine());
					boolean h4=false;
					if (t4==0) {
						h4=false;
					}else if (t4==1){
						h4=true;
					}
					Canari canari = new Canari(a4,b4,c4,d4,e4,f4,g4,h4);
					I.add(canari);
					System.out.println("animal introduit correctament");
					break;
				}
				break;
			case 5:
				System.out.println("quin vols borrar");
				int T3 = Integer.parseInt(TStr.nextLine());
				I.remove(T3);
				break;
			case 6:
				I.reset();
				break;
			}
		}while(bool!=true);
	}
}
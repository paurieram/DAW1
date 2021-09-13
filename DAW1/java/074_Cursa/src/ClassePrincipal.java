import java.util.Scanner;
public class ClassePrincipal {
	public static void main(String[] args) {
		Scanner TStr = new Scanner(System.in);
        boolean b=false, t=false;
        int y=0,x=0,i=0,nCurses=0;
		do {
			try {
				System.out.print("Entra quantes curses vols crear: ");
				nCurses = Integer.parseInt(TStr.nextLine());
				t=true;
			}catch(NumberFormatException E) {
       		 	System.out.println("Error! Introdueix un nombre");
			}
		}while(t!=true);
		Cursa[] aObj = new Cursa[nCurses];
		t=false;
        do {
            System.out.println("--- SELECCIO ---");
            System.out.println("1. Crear Cursa");
            System.out.println("2. Incrementar Volta");
            System.out.println("3. Decrementar Volta");
            System.out.println("4. Mostrar Informacio Cursa");
            System.out.println("5. Mostrar Tota La Informacio");
            System.out.println("6. Sortir");
            System.out.print("Introdueix la seleccio: ");
            int c = Integer.parseInt(TStr.nextLine());
	        switch(c) {
			case 1://crear cursa
				do {
					try {
		        	 System.out.print("Introdueix els metres de la Cursa: ");
		        	 y = Integer.parseInt(TStr.nextLine());
		        	 t=true;
					}catch(NumberFormatException E){
		        		 System.out.println("Error! Introdueix un nombre");
					}
				}while(t!=true);
				t=false;
				do {
		        	 try {
		        	 System.out.print("Introdueix els voltes de la Cursa: ");
		        	 x = Integer.parseInt(TStr.nextLine());
		        	 t=true;
					}catch(NumberFormatException E){
		        		 System.out.println("Error! Introdueix un nombre");
					}
				}while(t!=true);
				t=false;
				do {
		        	try {
		        		if(i<nCurses) {
		        			 if (aObj[i]==null) {
				        		aObj[i] = new Cursa(y,x);
				        		i++;
				        		t=true;
		        			 }
		        		}
		        	 }catch(ArrayIndexOutOfBoundsException E) {
		        		 System.out.println("Error! La Carrera que vols crear sobrepasa el limit introduit.");
		        	 }
				}while(t!=true);
				t=false;
		        break;
			case 2://incrementar volta
				System.out.print("Introdueix la cursa que vols incrementar: ");
				do {
		        	try {
		            y = Integer.parseInt(TStr.nextLine());
		            t=true;
		        	}catch(NumberFormatException E){
		        		 System.out.println("Error! Introdueix un nombre");
					}
				}while(t!=true);
				t=false;
				do {
		        	try {
			            if (aObj[y]!=null) {
			            	aObj[y].sumaVolta();
			            	System.out.println("carrera "+y+"+1");
			            	t=true;
			            }else {
			            	System.out.println("Error! l'objecte encara no existeix");
			            }
		        	}catch(ArrayIndexOutOfBoundsException E) {
		        		 System.out.println("Error! Carrera que vols crear no existeix.");
		        	 }
				}while(t!=true);
				t=false;
	            break;
			case 3://decrementar volta
				System.out.print("Introdueix la cursa que vols decrementar: ");
				do {
		        	try {
			            y = Integer.parseInt(TStr.nextLine());
			            t=true;
		        	}catch(NumberFormatException E){
		        		 System.out.println("Error! Introdueix un nombre");
					}
				}while(t!=true);
				t=false;
				do {
		        	try {
			            if (aObj[y]!=null) {
			            	aObj[y].restaVolta();
			            }else {
			            	System.out.println("Error! l'objecte encara no existeix");
			            }
		        	}catch(ArrayIndexOutOfBoundsException E) {
		        		 System.out.println("Error! Carrera que vols crear no existeix.");
		        	 }
				}while(t!=true);
				t=false;
	            break;
			case 4://mostrar cursa
				System.out.print("Introdueix la cursa que vols mostrar: ");
				do {
		        	try {
			            y = Integer.parseInt(TStr.nextLine());
			            t=true;
		        	}catch(NumberFormatException E){
		        		 System.out.println("Error! Introdueix un nombre");
					}
				}while(t!=true);
				t=false;
				do {
		        	try {
			            if (aObj[y-1]!=null) {
			            	System.out.print(aObj[y-1].toString());
			            }else {
			            	System.out.println("Error! l'objecte encara no existeix");
			            }
		        	}catch(ArrayIndexOutOfBoundsException E) {
		        		 System.out.println("Error! Carrera que vols crear no existeix.");
		        	 }
				}while(t!=true);
				t=false;
	            break;
			case 5://mostrar totes
				for(int j=0;j!=nCurses;j++){
					if (aObj[j]!=null) {
						System.out.print(aObj[j].toString());
					}else {
		            	System.out.println("Error! l'objecte encara no existeix");
		            }
				}
				break;
			case 6://sortir
				 System.out.print("Fins Aviat");
				 b=true;
				 break;
			}
	        t=false;
	        c=0;
	        y=0;
	        x=0;
        }while(b!=true);
        TStr.close();
	}
}
import java.util.Scanner;

public class ClassePrincipalExer2 {

	public static void main(String[] args) {
	System.out.println("Benvingut a la empresa PagaPocTardiMalamen");
	Scanner t = new Scanner (System.in);
	int n =1,A=0,B=0,C=0,D=0;//inicialitzem les variables dels treballadors per cada tram i el contador de treballadors
	do {
		double s=0;	
		System.out.print("Introdueixi el Sou del treballador "+n+": ");	
		s = t.nextInt();
		if (s >= 100 && s <= 300) {//tram a
			s = s+((s/100)*7);
			if (s > 300) {
				System.out.println("El treballador "+n+" cobra "+s+" i per tant forma part del grup B (301-600)");
				B++;
				n++;
			}else {
				System.out.println("El treballador "+n+" cobra "+s+" i per tant forma part del grup A (100-300)");
				A++;
				n++;
			}
		}else if(s >= 301 && s <= 600){//tram b
			s = s+((s/100)*5);
			if (s > 600) {
				System.out.println("El treballador "+n+" cobra "+s+" i per tant forma part del grup C (601-1000)");
				C++;
				n++;
			}else {
				System.out.println("El treballador "+n+" cobra "+s+" i per tant forma part del grup B (301-600)");
				B++;
				n++;
			}
		}else if(s >= 601 && s <= 1000){//tram c
			s = s+((s/100)*3);
			if (s > 1000) {
				System.out.println("El treballador "+n+" cobra "+s+" i per tant forma part del grup D (>1000)");
				D++;
				n++;
			}else {
				System.out.println("El treballador "+n+" cobra "+s+" i per tant forma part del grup C (601-1000)");
				C++;
				n++;
			}
		}else if(s > 1000){//tram d
			s = s+((s/100)*1);
			System.out.println("El treballador "+n+" cobra "+s+" i per tant forma part del grup D (>1000)");
			D++;
			n++;
		}else {
			System.out.print("El Sou introduit es menor de 100, torna a introduir el sou del treballador "+n+": ");
			s = t.nextInt();
	}	
	}while(n!=101);
	t.close();
	System.out.println("En el tram A (100-300) hi ha "+A+" Treballadors");
	System.out.println("En el tram B (301-600) hi ha "+B+" Treballadors");
	System.out.println("En el tram C (601-1000) hi ha "+C+" Treballadors");
	System.out.println("En el tram D (>1000) hi ha "+D+" Treballadors");
	}
}
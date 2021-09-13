import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
	int v1;
	String v2;
	Scanner v3, v4;//variable 
	v3 = new Scanner (System.in);//crear variable teclat
	v4 = new Scanner (System.in);
	System.out.println("introdueix un numero del 1 al 15");
	v1 = v3.nextInt();
	System.out.println("introdueix el teu nom");
	v2 = v4.nextLine();
	System.out.println("nom "+v2+" numero "+v1);
	v3.close();
	v4.close();
	}
	
}

import java.util.Scanner;

public class RieraPau_Enunciat_004 {

	public static void main(String[] args) {
		int mb=0, mp=0, vm=0, vp=0;//vp=velocitat permesa vm = velocitat mesurada mp = multes paris mb = multes barcelona c= ciutat
		Scanner t = new Scanner (System.in);
		Scanner te = new Scanner (System.in);
		String c="";
		do {
			c = "";
			System.out.print("B (Barcelona) P (Paris) # (parar programa): ");
			c = te.nextLine();
			if (c.equals("B") || c.equals("P")) {
				System.out.print("Velocitat del veicle: ");
				vm = t.nextInt();
				System.out.print("Velocitat maxima permitida: ");
				vp = t.nextInt();
			}else if (!c.equals("#")){
				System.out.println("No has introduit la lletra correctament");
				c = "";
			}
			if (c.equals("B")) {
				if (vp < vm) {
					mb++;
				}
			}else if (c.equals("P")) {
				if (vp < vm) {
					mp++;
				}
			}
		}while (!c.equals("#"));
		t.close();
		te.close();
		System.out.println(mb+" multes per Barcelona");
		System.out.println(mp+" multes per París");
		if (mp < mb) {
			System.out.println("Conduir per les carreteres de París");
			System.out.println("és més segur que per les de Barcelona");
		}else if(mp > mb) {
			System.out.println("Conduir per les carreteres de Barcelona");
			System.out.println("és més segur que per les de París");
		}else if(mp == mb) {
			System.out.println("Tant Barcelona com Paris, són igual de segures!");
		}
		
	}
}
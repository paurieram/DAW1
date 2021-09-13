import java.io.FileWriter;
import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		FileWriter VFitxer;
		Scanner t = new Scanner (System.in);
		String txt="";
		try {
			VFitxer = new FileWriter("lib/fitxer.txt",true);
			while (!txt.equals("FI")){
				System.out.print("Introdueix: ");
				txt = t.nextLine();
				VFitxer.write(txt+"\n");
			}
			VFitxer.close();
		} catch (Exception e) {
			System.out.print("ERROR! "+e.getMessage());
		}
		t.close();
	}

}

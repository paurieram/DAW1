import java.io.File;
import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		File fitxer = new File("lib/fitxer.txt");
		try {
			Scanner t = new Scanner (fitxer);
			while (t.hasNextLine()){
				String linea = t.nextLine();
				System.out.println(linea);
			}
			t.close();
		} catch (Exception e) {
			System.out.print("ERROR! "+e.getMessage());
		}
	}
}
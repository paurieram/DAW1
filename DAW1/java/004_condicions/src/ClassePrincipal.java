import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		
		int n;
		Scanner t = new Scanner (System.in);
		System.out.println("introdueix un numero");
		n = t.nextInt();
		if (n >= 25 && n <= 50) {
			System.out.println("oK");
		
		} else {
			System.out.println("Error");
		}
	t.close();
	}

}

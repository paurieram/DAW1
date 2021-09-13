import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		int n = 0;
		Scanner t = new Scanner (System.in);
		n = t.nextInt();
		if (n%2 == 0) {
            System.out.println("El numero "+n+" es parell");
        } else {
            System.out.println("El numero "+n+" es imparell");
        }
	t.close();
	}
}
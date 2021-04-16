import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {
        int n;
        Scanner t = new Scanner (System.in);
        System.out.println("Introdueix un numero");

        n = t.nextInt();

        if (n > 0) {
            System.out.println("El numero es positiu");
        } else if (n == 0) { 
            System.out.println("El numero es 0");
        } else {
            System.out.println("El numero es negatiu");
        }

        t.close();
    }

}
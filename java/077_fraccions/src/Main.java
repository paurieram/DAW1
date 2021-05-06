import java.io.*;

public class Main{

static BufferedReader	reader	= new BufferedReader(new InputStreamReader(System.in));

static long readLong() throws IOException{
	return Integer.valueOf(readln()).longValue();
}

static String readln() throws IOException{
	return reader.readLine();
}

/**
 * main method
 */
public static void main(String[] args){
	try{
		System.out.println("Programa classe Fraction.");
		System.out.println("Creant fracció amb numerador 0 & denominador 1");
		Fraction f0= new Fraction(0, 1);
		System.out.println("Fraction " + f0);
		System.out.println();
		int option= 1;
		while(option != 5){
			System.out.println("Enter opció");
			System.out.println(" 1. Afegir fracccions");
			System.out.println(" 2. Restar fracccions");
			System.out.println(" 3. Multiplicar fracccions");
			System.out.println(" 4. Dividir fracccions");
			System.out.println(" 5. Exit");
			System.out.print("Enter option: ");
			option= (int)readLong();
			if(option != 5){
				if(option >= 1 && option <= 4){
					System.out.print("Entra primer numerador: ");
					String num= readln();
					System.out.print("Enter primer denominador: ");
					String den= readln();
					System.out.print("Entra segon numerador: ");
					String num2= readln();
					System.out.print("Enter segon denominador: ");
					String den2= readln();

					Fraction f1= new Fraction(Integer.parseInt(num, 10), Integer.parseInt(den, 10));
					Fraction f2= new Fraction(Integer.parseInt(num2, 10), Integer.parseInt(den2, 10));

					if(option == 1){
						f0= f1.add(f2);
						System.out.println(f1 + " + " + f2 + " = " + f0);
					}else if(option == 2){
						f0= f1.substract(f2);
						System.out.println(f1 + " - " + f2 + " = " + f0);
					}else if(option == 3){
						f0= f1.multiply(f2);
						System.out.println(f1+ " * " + f2 + " = " + f0);
					}else if(option == 4){
						f0= f1.divide(f2);
						System.out.println(f1 + " / " + f2 + " = " + f0);
					}
				}else{
					System.out.println("Opció Invalida option");
				}
				System.out.println();
			}

		}
	}catch(Exception ioe){
		System.err.println(ioe.getMessage());
		System.exit(-1);
	}
}

}

//Enunciat -> https://docs.google.com/document/d/1s99a-7VWAlRCYUUBIazVnJk0t9M_hs21mdClljZXooQ/edit?usp=sharing

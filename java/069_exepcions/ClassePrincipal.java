import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		Scanner TStr = new Scanner(System.in);
		int n=0, i=0,p=0;
		int num[]=new int[10];
		do {
			try {
				System.out.print("Num: ");
				i++;
				n = Integer.parseInt(TStr.nextLine());
				System.out.print("Pos: ");
				p = Integer.parseInt(TStr.nextLine());
				num[p]=n;
			}catch (NumberFormatException e) {
				System.out.println("ERROR! numero");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ERROR! limits");
				n=0;
			}catch (Exception e){
				System.out.println("ERROR! general");
			}
		}while(n<=0 || n>=100);
	}

}

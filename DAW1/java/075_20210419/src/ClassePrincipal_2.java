
public class ClassePrincipal_2 {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(0,0,5,5);
		Rectangle R2 = new Rectangle(7,9,2,3);
		System.out.println(R1);
		System.out.println(R2);
		System.out.println(R1.Perim());
		System.out.println(R1.Area());
		System.out.println(R2.Perim());
		System.out.println(R2.Area());
		R1.setall(5, 4, 9, 10);
		R2.setall(6, -8, 5, 2);
		System.out.println(R1);
		System.out.println(R2);
		System.out.println(R1.Perim());
		System.out.println(R1.Area());
		System.out.println(R2.Perim());
		System.out.println(R2.Area());
	}

}

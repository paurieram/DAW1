
public class ClassePrincipal_1 {

	public static void main(String[] args) {
		Punt P1 = new Punt(5,0);
		Punt P2 = new Punt(10,10);
		Punt P3 = new Punt(-3,7);
		System.out.println(P1+" "+P2+" "+P3);
		P1.setxy(10,-3);
		P2.setxy(91,23);
		P3.setxy(1,12);
		System.out.println(P1+" "+P2+" "+P3);
		int x=0,y=0;
		Punt P4 = new Punt(x,y);
		System.out.println(P4);
		P4.setxy(1,12);
		P4.move(50, 60);
		System.out.println(P4);
		System.out.println(P1.dist(P2.getx(),P2.gety()));
	}

}


public class ClassePrincipal {
	public static int RNG(int Petit, int Gran) {
		return (int) (Math.random() * (Gran + 1 - Petit) + Petit);
	}
	public static String mat() {
		return ""+RNG(0,9)+RNG(0,9)+RNG(0,9)+RNG(0,9)+Character.toString(RNG(65,90))+Character.toString(RNG(65,90))+Character.toString(RNG(65,90));
	}
	public static void main(String[] args) {
		Cotxe cotxe1 = new Cotxe();
		cotxe1.setmar("marca");
		cotxe1.setmod("model");
		cotxe1.setcol("coolor");
		cotxe1.setmat(mat());
		cotxe1.view();

	}
}

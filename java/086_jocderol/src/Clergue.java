
public class Clergue extends PersonatgeIntel_ligencia {
	private String deu;

	public String toString() {
		return super.toString()+"Clergue deu=" + deu + "\n";
	}

	public Clergue(String n,String d) {
		super(n, 1, 15);
		deu=d;
	}
	public void cura(Object o) {
		((Mag) o).setVida(((Mag) o).getVida()+10);
		System.out.println("Has curat +10 de vida");
	}
}

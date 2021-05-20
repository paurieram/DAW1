import java.util.Arrays;

public class Mag extends PersonatgeIntel_ligencia{
	private String Conjures[]=new String[4];
	public Mag(String n) {
		super(n, 10, 18);
	}
	public void aprendreConjura(String c) {
		for(int i=0;i!=Conjures.length;i++) {
			if(Conjures[i]==null) {
				Conjures[i]=c;
				System.out.println("Conjura apresa");
				c=null;
				break;
			}
		}
		if (c!=null) {
			System.out.println("No queden espais per apendre");
		}
	}
	public void llencaConjura(Object o) {
		for(int i=0;i!=Conjures.length;i++) {
			if(Conjures[i]!=null) {
				Conjures[i]=null;
				System.out.println("Conjura llençada");
				break;
			}
		}
		if (o instanceof Poble) {
			System.out.println("No Ha tingut efecte perque era Poble");
		}else if(o instanceof Mag){
			((Mag) o).setVida(((Mag) o).getVida()-10);
			((Mag) o).setIntel(((Mag) o).getIntel()-5);
			System.out.println("-10 de vida i -5 de inteligencia al Mag");
		}else if (o instanceof Clergue) {
			((Clergue) o).setVida(((Clergue) o).getVida()-10);
			System.out.println("-10 de vida al Clergue");
		}
	}
	public String toString() {
		return super.toString()+"Mag Conjures=" + Arrays.toString(Conjures) + "\n";
	}
}

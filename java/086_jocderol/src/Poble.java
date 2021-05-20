
public class Poble extends PersonatgeIntel_ligencia{
	private int ovelles;

	public Poble(String n, int f, int i, int o) {
		super(n, f, i);
		ovelles = o;
	}

	public String toString() {
		return super.toString()+"Poble ovelles=" + ovelles + "\n";
	}
}


public class PersonatgeIntel_ligencia extends Personatge{
	private int intel;
	public PersonatgeIntel_ligencia(String n, int f,int i) {
		super(n, f);
		intel=i;
	}
	public int getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}
	public String toString() {
		return super.toString()+"PersonatgeIntel_ligencia inteligencia= " + intel + "\n";
	}
}

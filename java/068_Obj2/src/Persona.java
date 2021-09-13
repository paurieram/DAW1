
public class Persona {
	//atributs
	private String dni,nom;
	private int edat;
	//set
	public void setDni(String d) {
		dni=d;
	}
	public void setNom(String n) {
		nom=n;
	}
	public void setEdat(int e) {
		edat=e;
	}
	//get
	public String getDni() {
		return dni;
	}
	public String getNom() {
		return nom;
	}
	public int getEdat() {
		return edat;
	}
	public void view() {
		System.out.println(dni+" "+nom+" "+edat);
	}
}

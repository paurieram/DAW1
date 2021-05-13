
public class Persona {
	private String nom;
	private int edat;
	Persona(){
		
	}
	Persona(String n,int e){
		nom=n;
		edat=e;
	}
	public void setedat(int e) {
		edat=e;
	}
	public void setnom(String n) {
		nom=n;
	}
	public int getedat() {
		return edat;
	}
	public String getnom() {
		return nom;
	}
	private void birthday() {
		edat++;
	}
	private boolean major() {
		if(edat>=18) {
			return true;
		}
		return false;
	}
}

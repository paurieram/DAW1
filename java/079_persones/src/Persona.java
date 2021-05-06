
public class Persona {
	private String nom;
	private String domicili;
	private String horari;

	public Persona(){
		nom = "no nom";
		domicili = "no domicili";
		horari = "no horari";
	}
	public Persona(String n,String d,String h){
		nom = n;
		domicili = d;
		horari = h;
	}
	public void metode(String a) {
		System.out.println(a);
	}
	public void setnom(String n) {
		nom=n;
	}
	public void setdomicili(String d) {
		domicili=d;
	}
	public void sethorari(String h) {
		horari=h;
	}
	public String getnom() {
		return nom;
	}
	public String getdomicili() {
		return domicili;
	}
	public String gethorari() {
		return horari;
	}
	public String toString() {
		return "-Persona-\n"+"nom = "+nom+"\n"+"domicili = "+domicili+"\n"+"horari = "+horari+"\n----";
	}
}
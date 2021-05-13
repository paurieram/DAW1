
public class Mascotes{
	private String nom;
	private int edat;
	private String estat;
	private String naixement;
	Mascotes(String no,int ed,String es,String na){
		nom=no;
		edat=ed;
		estat=es;
		naixement=na;
	}
	public String toString() {//mostrar objecte
		return "---Mascota---\nnom: "+nom+"\nedat: "+edat+"\nestat: "+estat+"\nnaixement: "+naixement+"\n";
	}
	public String getnom() {
		return nom;
	}
	public void birthday() {
		edat++;
	}
	public void morir() {
		System.out.println("ha mort");
	}
	public void parla() {
		System.out.println(" hola ");
	}
}

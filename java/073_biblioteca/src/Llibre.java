public class Llibre {
	private String titol,autor,exemplars,prestec;
	Llibre(){
		System.out.println("Objecte Creat Correctament");
	}
	Llibre(String ti,String au,String ex,String pr){
		System.out.println("Objecte Creat Correctament");
		titol=ti;
		autor=au;
		exemplars=ex;
		prestec=pr;
	}
	public void setmar(String e) {
		titol=e;
	}
	public void setmod(String e) {
		autor=e;
	}
	public void setcol(String e) {
		exemplars=e;
	}
	public void setmat(String e) {
		prestec=e;
	}
	public String getmar() {
		return titol;
	}
	public String getmod() {
		return autor;
	}
	public String getcol() {
		return exemplars;
	}
	public String getmat() {
		return prestec;
	}
	public void view() {
		System.out.println(titol);
		System.out.println(autor);
		System.out.println(exemplars);
		System.out.println(prestec);
	}
}
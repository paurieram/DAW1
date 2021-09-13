
public class Article {
	private String nom;
	private double preu;//sense iva
	private int iva;
	private int unit;
	Article(String n,int p,int i,int u){//constructor 
		nom=n;
		preu=p;
		iva=i;
		unit=u;
	}
	public String getnom() {// GETTERS
		return nom;
	}
	public double getpreu() {
		return preu;
	}
	public int getiva() {
		return iva;
	}
	public int getunit() {
		return unit;
	}
	public void setnom(String n) {// SETTERS
		nom=n;
	}
	public void setpreu(int p) {
		preu=p;
	}
	public void setiva(int i) {
		iva=i;
	}
	public void setunit(int u) {
		unit=u;
	}
	public double getpvp() {//getpvp
		return (((preu/100)*iva)+preu);
	}
//	public double getpvpdescuento() {
//		
//	}
//	public boolean vendre(int x){
//		
//	}
//	public boolean emagatzemar(int x){
//		
//	}
}

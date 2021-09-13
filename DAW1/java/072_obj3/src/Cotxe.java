
public class Cotxe {
	//atributs
	private String mar,mod,col,mat;
	Cotxe(){
		System.out.println("Objecte Creat Correctament");
	}
	//set
	public void setmar(String e) {
		mar=e;
	}
	public void setmod(String e) {
		mod=e;
	}
	public void setcol(String e) {
		col=e;
	}
	public void setmat(String e) {
		mat=e;
	}
	//get
	public String getmar() {
		return mar;
	}
	public String getmod() {
		return mod;
	}
	public String getcol() {
		return col;
	}
	public String getmat() {
		return mat;
	}
	public void view() {
		System.out.println(mar);
		System.out.println(mod);
		System.out.println(col);
		System.out.println(mat);
	}
}

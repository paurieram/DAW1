
public class Empleat extends Persona{
	private String nomcap;
	
	public Empleat(){
		nomcap = "no nomcap";
	}
	public Empleat(String n,String d,String h,String nc){
		super(n,d,h);
		nomcap = nc;
	}
	public void setnomcap(String nc) {
		nomcap=nc;
	}
	public String getnomcap() {
		return nomcap;
	}

	public String toString() {
		return super.toString()+"\n-Empleat-\n"+"nomcap = "+nomcap+"\n-----";
	}
	public void cobrar(String n) {
		System.out.println(n);
	}
}

public class Administrador extends Empleat{
	private String puesto;
	
	public Administrador(){
		puesto = "no nomcap";
	}
	public Administrador(String n,String d,String h,String nc,String p){
		super(n,d,h,nc);
		puesto = p;
	}
	public void administrar(String n){
			System.out.println(n);
	}
	public String toString() {
		return super.toString()+"\n-Administrador-\n"+"puesto = "+puesto+"\n-----";
	}
}

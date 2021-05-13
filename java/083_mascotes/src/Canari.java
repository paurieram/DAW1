
public class Canari extends Aus{
	private String color;
	private boolean canta;
	Canari(String no,int ed,String es,String na, boolean b,boolean v,String co,boolean ca){
		super(no,ed,es,na,b,v);
		color=co;
		canta=ca;
	}
	public void parla() {
		System.out.println(" hola ");
	}
	public void volar() {
		System.out.println(" fiu ");
	}
	public String toString() {//mostrar objecte
		return super.toString()+"-Canari-\ncolor: "+color+"\ncanta: "+canta;
	}
}

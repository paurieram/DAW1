
public class Gat extends Mascotes{
	private String color;
	private boolean pelllarg;
	Gat(String no,int ed,String es,String na, String co,boolean p){
		super(no,ed,es,na);
		color=co;
		pelllarg=p;
	}
	public String toString() {//mostrar objecte
		return super.toString()+"--Gat--\ncolor: "+color+"\npelllarg: "+pelllarg;
	}
	public void parla() {
		System.out.println(" Miau ");
	}
}

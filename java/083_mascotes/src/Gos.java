
public class Gos extends Mascotes{
	private String raca;
	private boolean puces;
	Gos(String no,int ed,String es,String na, String r,boolean p){
		super(no,ed,es,na);
		raca=r;
		puces=p;
	}
	public String toString() {//mostrar objecte
		return super.toString()+"--Gos--\nraça: "+raca+"\npuçes: "+puces;
	}
	public void parla() {
		System.out.println(" Guau ");
	}
}

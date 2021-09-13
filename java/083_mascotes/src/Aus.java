
public class Aus extends Mascotes{
	private boolean bec;
	private boolean vola;
	Aus(String no,int ed,String es,String na, boolean b,boolean v){
		super(no,ed,es,na);
		bec=b;
		vola=v;
	}
	public void volar() {
		System.out.println(" fiu ");
	}
	public String toString() {//mostrar objecte
		return super.toString()+"--Aus--\nbec: "+bec+"\nvola: "+vola;
	}
}

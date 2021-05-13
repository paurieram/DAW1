
public class Cotxe extends Terrestre{
	private boolean aire;
	
	Cotxe(boolean a,int r,String ma, String mo){
		super(ma,mo,r);
		aire=a;
	}
	public boolean getAire() {
		return aire;
	}

	public void setAire(boolean aire) {
		this.aire = aire;
	}

	public String toString() {
		return "-Cotxe \naire=" + aire + "";
	}
}

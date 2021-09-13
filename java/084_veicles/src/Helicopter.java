
public class Helicopter extends Aeris{
	private int helices;
	
	Helicopter(String ma,String mo,int s,int h){
		super(ma,mo,s);
		helices=h;
	}
	public String toString() {
		return "-Helicopter \nhelices=" + helices + "";
	}

	public int getHelices() {
		return helices;
	}

	public void setHelices(int helices) {
		this.helices = helices;
	}
}

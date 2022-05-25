
public class Aeris extends Vehicle {
	private int seients;
	
	Aeris(String ma,String mo,int s){
		super(ma,mo);
		seients=s;
	}
	public int getSeients() {
		return seients;
	}

	public void setSeients(int seients) {
		this.seients = seients;
	}

	public String toString() {
		return "--Aeris \nseients=" + seients + "";
	}
}


public class Aquatics extends Vehicle {
	private double eslora;
	
	Aquatics(String ma,String mo,double e){
		super(ma,mo);
		eslora=e;
	}
	public double getEslora() {
		return eslora;
	}

	public void setEslora(double eslora) {
		this.eslora = eslora;
	}

	public String toString() {
		return "--Aquatics \neslora=" + eslora + "";
	}
}

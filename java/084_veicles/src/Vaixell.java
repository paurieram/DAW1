
public class Vaixell extends Aquatics{
	public boolean motor;

	Vaixell(String ma,String mo,double e,boolean m){
		super(ma,mo,e);
		motor=m;
	}
	public String toString() {
		return "-Vaixell \nmotor=" + motor + "";
	}

	public boolean getMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}
}

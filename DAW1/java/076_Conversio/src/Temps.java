
public class Temps {
	private double s;

	public Temps() {
		this.s = 0;
	}
	// Setters i Getters
	public void setH(double horesRebudes) {
		this.s = horesRebudes * 3600;
	}
	public double getH() {
		return this.s / 3600;
	}
	
	public void setM(double minutsRebuts) {
		this.s = minutsRebuts * 60;
	}
	
	public double getM() {
		return this.s / 60;
	}

	public void setS(double segonsRebuts) {
		this.s = segonsRebuts;
	}
	public double getS() {
		return this.s;
	}

	public void setMS(double milliSegonsRebuts) {
		this.s = milliSegonsRebuts / 1000;
	}
	public double getMS() {
		return this.s * 1000;
	}	
	public void setHMSM(double hora, double min, double seg, double miliSeg) {
		this.s = hora * 3600 + min * 60 + seg + miliSeg/1000; 
	}
}

public class Massa {
	private double kg;
	
	public Massa() {
		this.kg = 0;
	}
	
	// Setters i Getters
	public void setTones(double tonesRebudes) {
		this.kg = tonesRebudes * 1000;
	}
	
	public double getTones() {
		return this.kg / 1000;
	}
	
	public void setKG(double kgRebuts) {
		this.kg = kgRebuts;
	}
	
	public double getKG() {
		return this.kg;
	}
	
	public void setGR(double gramsRebuts) {
		this.kg = gramsRebuts / 1000;
	}
	
	public double getGR() {
		return this.kg * 1000;
	}
	
	public void setMG(double gramsRebuts) {
		this.kg = gramsRebuts / 1000000;
	}
	
	public double getMG() {
		return this.kg * 1000000;
	}
	
	public void setTON(double tonesRebudes) {
		this.kg = tonesRebudes * 907.18474899;
	}
	
	public double getTON() {
		return this.kg / 907.18474899;
	}
	
	public void setLB(double lliuresRebudes) {
		this.kg = lliuresRebudes * 0.4535237;
	}
	
	public double getLB() {
		return this.kg / 0.4535237;
	}
	
	public void setOZ(double uncesRebudes) {
		this.kg = uncesRebudes * 0.0283495;
	}
	
	public double getOZ() {
		return this.kg / 0.0283495;
	}
}
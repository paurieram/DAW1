
public class Temperatura {
	private double k;
	
	public Temperatura() {
		this.k = 0;
	}
	// Setters i Getters
	public void setK (double grausKRebuts) {
		this.k = grausKRebuts;
	}
	public double getK() {
		return this.k;
	}
	public void setC (double grausCentigratsRebuts) {
		this.k = grausCentigratsRebuts + 273.15;
	}
	public double getC() {
		return this.k - 273.15;
	}
	public void setF (double grausFahrenheitRebuts) {
		this.k = 5 * (grausFahrenheitRebuts - 32) / 9 + 273.15;
	}
	public double getF() {
		return 9 * (this.k - 273.15) / 5 + 32;
	}
}
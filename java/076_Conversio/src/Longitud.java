
public class Longitud {
	private double metres;

	public Longitud() {
		this.metres = 0;
	}
	
	public Longitud(double metresRebuts) {
		this.metres = metresRebuts;
	}

	// Setters i Getters
	public void setKM (double kiloMetresRebuts) {
		this.metres = kiloMetresRebuts * 1000;
	}
	
	public double getKM() {
		return this.metres / 1000;
	}
	
	public void setM (double metresRebuts) {
		this.metres = metresRebuts;
	}
	
	public double getM() {
		return this.metres;
	}
	
	public void setCM(double centiMetresRebuts) {
		this.metres = centiMetresRebuts / 100;
	}
	
	public double getCM() {
		return this.metres * 100;
	}
	
	public void setMM(double centiMetresRebuts) {
		this.metres = centiMetresRebuts / 1000;
	}
	
	public double getMM() {
		return this.metres * 1000;
	}
	
	// Conversions
	
	public void setLlegues(double lleguesRebudes) {
		this.metres = lleguesRebudes * 4828.032;
	}
	
	public double getLlegues() {
		return this.metres / 4828.032;
	}
	
	public void setMilles(double millesRebudes) {
		this.metres = 1609.344 * millesRebudes;
	}
	
	public double getMilles() {
		return this.metres / 1609.344;
	}
	
	public void setIardes(double iardesRebudes) {
		this.metres = iardesRebudes * 0.9144;
	}
	
	public double getIardes() {
		return this.metres / 0.9144;
	}

	public void setPeus(double peusRebuts) {
		this.metres = peusRebuts * 0.3048;
	}
	
	public double getPeus() {
		return this.metres / 0.3048;
	}
	
	public void setPolsades(double polsadesRebudes) {
		this.metres = polsadesRebudes * 0.0254;
	}
	
	public double getPolsades() {
		return this.metres / 0.0254;
	}
}

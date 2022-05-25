package RieraPau;

public class Fitxa {
	private String referencia;
	private String titol;
	public Fitxa(String referencia, String titol) {
		this.referencia = referencia;
		this.titol = titol;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getTitol() {
		return titol;
	}
	public void setTitol(String titol) {
		this.titol = titol;
	}
	public String toString() {
		return referencia + " - " + titol + "\n";
	}
	public String visualitzar() {
		return "\nReferencia.....: " + referencia + "\nTitol.........: " + titol + "\n";
	}
	public boolean equals(Fitxa f) {
		if (f.getReferencia().equals(referencia)) {
			return true;
		}
	return false;
	}
}


public class Cursa {
	private int metres, voltes;
	public Cursa() {
		metres = 0;
		voltes = 0;
	}
	public Cursa(int m,int n) {
		metres = m;
		voltes = n;
	}
	// SETTERS
	public void setMetres(int m) {
		metres = m;
	}
	public void setVoltes(int v) {
		voltes = v;
	}
	// GETTERS
	public int getMetres() {
		return metres;
	}
	public int getVoltes() {
		return voltes;
	}
	// METODES
	public void sumaVolta() {
		voltes++;
	}
	public void sumaVolta(int v) {
		voltes = voltes + v;
	}
	private void controlVoltaNeg() {
		if (voltes < 0) {
			voltes = 0;
		}
	}
	public void restaVolta() {
		voltes--;
		controlVoltaNeg();
	}
	public void restaVolta(int v) {
		voltes = voltes - v;
		controlVoltaNeg();
	}
	public int disRecorreguda() {
		return voltes*metres;
	}
	public String toString() {
		String valor;
		valor ="--- INFORMACIO OBJECTE ---";
		valor+="Voltes = "+voltes+"\n";
		valor+="Metres = "+metres+"\n";
		valor+="Distancia recorreguda = "+disRecorreguda()+"\n";
		return valor;
	}
}
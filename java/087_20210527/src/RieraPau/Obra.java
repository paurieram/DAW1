package RieraPau;

public class Obra extends Fitxa{
	private String autor; 
	private short nrePags;
	public Obra(String referencia, String titol, String autor, short nrePags) {
		super(referencia, titol);
		this.autor = autor;
		this.nrePags = nrePags;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public short getNrePags() {
		return nrePags;
	}
	public void setNrePags(short nrePags) {
		this.nrePags = nrePags;
	}
	public String visualitzar() {
		return "\nAutor.....: " + autor + "\nPagines.........: " + nrePags + "\n";
	}

}

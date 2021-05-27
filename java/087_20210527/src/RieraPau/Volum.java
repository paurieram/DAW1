package RieraPau;

public class Volum extends Obra{
	private short nro;
	public Volum(String referencia, String titol, String autor, short nrePags, short nro) {
		super(referencia, titol, autor, nrePags);
		this.nro = nro;
	}

	public short getNro() {
		return nro;
	}

	public void setNro(short nro) {
		this.nro = nro;
	}
	public String visualitzar() {
		return "\nNumero.....: " + nro + "\n";
	}

}

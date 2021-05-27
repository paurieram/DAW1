package RieraPau;

public class Revista extends Fitxa{
	private short any;
	private short nro;
	public Revista(String referencia, String titol, short any, short nro) {
		super(referencia, titol);
		this.any = any;
		this.nro = nro;
	}
	public short getAny() {
		return any;
	}
	public void setAny(short any) {
		this.any = any;
	}
	public short getNro() {
		return nro;
	}
	public void setNro(short nro) {
		this.nro = nro;
	}
	public String visualitzar() {
		return "\nAny.....: " + any + "\nNumero.........: " + nro + "\n";
	}
}

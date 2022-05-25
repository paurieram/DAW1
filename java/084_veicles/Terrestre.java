
public class Terrestre extends Vehicle {
	private int nrodes;

	Terrestre(String ma, String mo ,int r){
		super(ma,mo);
		nrodes=r;
	}
	public int getNrodes() {
		return nrodes;
	}

	public void setNrodes(int nrodes) {
		this.nrodes = nrodes;
	}

	public String toString() {
		return "--Terrestre \nnrodes=" + nrodes + "";
	}
}

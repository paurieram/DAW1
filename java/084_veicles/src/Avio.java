
public class Avio extends Aeris{
	private String tmaxim;

	Avio(String ma,String mo,int s,String t){
		super(ma,mo,s);
		tmaxim=t;
	}
	public String toString() {
		return "-Avio \ntmaxim=" + tmaxim + "";
	}

	public String getTmaxim() {
		return tmaxim;
	}

	public void setTmaxim(String tmaxim) {
		this.tmaxim = tmaxim;
	}
}

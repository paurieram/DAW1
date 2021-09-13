
public class Submari extends Aquatics{
	private double profiuditat;
	
	Submari(String ma,String mo,double e,double p){
		super(ma,mo,e);
		profiuditat=p;
	}
	public double getProfiuditat() {
		return profiuditat;
	}

	public void setProfiuditat(double profiuditat) {
		this.profiuditat = profiuditat;
	}

	public String toString() {
		return "-Submari \nprofiuditat=" + profiuditat + "";
	}
}

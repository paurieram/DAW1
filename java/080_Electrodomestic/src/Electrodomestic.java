
public class Electrodomestic {
	private static final String C[]={"blanc","negre","vermell","blau","gris"};
	private double preu;
	private String color;
	private char consum;
	private double pes;
	
	Electrodomestic(){
		preu=100.00;
		color="blanc";
		consum='F';
		pes=5;
	}
	Electrodomestic(double pu,double ps){
		preu=pu;
		color="blanc";
		consum='F';
		pes=ps;
	}
	Electrodomestic(double pu,String cr,char cm,double ps){
		preu=pu;
		checkcolor(cr);
		checkconsum(cm);
		pes=ps;
	}
	//get
	public double getpreu() {
		return preu;
	}
	public String getcolor() {
		return color;
	}
	public char getconsum() {
		return consum;
	}
	public double getpes() {
		return pes;
	}
	private void checkconsum(char c) {
		if (c=='A' || c=='B' || c=='C' || c=='D' || c=='E' || c=='F') {
			consum = c;
			System.out.println("Lletra correcte");
		}else {
			consum = 'F';
			System.out.println("Lletra incorrecte");
		}
	}
	private void checkcolor(String c) {
		if(c.equals("blanc") || c.equals("negre") || c.equals("vermell") || c.equals("blau") || c.equals("gris") || c.equals("BLANC") || c.equals("NEGRE") || c.equals("VERMELL") || c.equals("BLAU") || c.equals("GRIS")) {
			color = c;
			System.out.println("Color correcte");
		}else {
			color = "blanc";
			System.out.println("Color incorrecte");
		}
	}
}
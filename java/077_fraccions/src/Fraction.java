
public class Fraction {
	private int denominator, numerator;//denominator - numerator


public Fraction(){
	
}
public Fraction(int n,int d){
	denominator=d;
	numerator=n;
	
}
public Fraction add(Fraction f){
	int d = mcm(denominator,f.getd());
	int n = mcd(denominator,d)*numerator+mcd(f.getd(),d)*f.getn();
	return new Fraction(n,d);
}
public Fraction substract(Fraction f){
	int d = mcm(denominator,f.getd());
	int n = (mcd(denominator,d)*numerator)+mcd(f.getd(),d)*f.getn();
	return new Fraction(n,d);
}
public Fraction multiply(Fraction f){
	return new Fraction(f.getn()*numerator, f.getd()*denominator);
}
public Fraction  divide(Fraction f){
	return new Fraction(f.getd()*numerator, f.getn()*denominator);
}
public int getd(){
	return denominator;
}
public int getn(){
	return numerator;
}
public String toString() {
	return numerator+"/"+denominator;
}
private int mcm(int a,int b) {
	return (a*b/mcd(a,b));
}
private int mcd(int a, int b) {
	int t;
	while(b!=0) {
		t=b;
		b=a%b;
		a=t;
	}
	return a;
}



}
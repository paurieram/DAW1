
public class Estudiant extends Persona{
	private int grau;
	private char grup;
	
	public Estudiant(){
		grau = 0;
		grup = '0';
	}
	public Estudiant(String n,String d,String h,int gu,char gp){
		super(n,d,h);
		grau = gu;
		grup = gp;
	}
	public String toString() {
		return super.toString()+"\n-Estudiant-\n"+"grau = "+grau+"\n"+"grup = "+grup+"\n-----";
	}
	public void estudiar(String n) {
		System.out.println(n);
	}
	public void setgrau(int g) {
		grau=g;
	}
	public void setgrup(char g) {
		grup=g;
	}
	public int getgrau() {
		return grau;
	}
	public char getgrup() {
		return grup;
	}
}
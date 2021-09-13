
public class Moto extends Terrestre{
	private String color;
	Moto(int r,String ma, String mo,String co){
		super(ma,mo,r);
		color=co;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "-Moto \ncolor=" + color + "";
	}
}

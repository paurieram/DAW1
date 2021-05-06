
public class Punt {
	private int x;
	private int y;
	Punt(){//constructor 1
		
	}
	Punt(int X,int  Y){//constructor 2
		x=X;
		y=Y;
	}
	public void setx(int X) {// SETTERS
		x=X;
	}
	public void sety(int Y) {
		y=Y;
	}
	public void setxy(int X,int Y) {//setter doble
		x=X;
		y=Y;
	}
	public int getx() {// GETTERS
		return x;
	}
	public int gety() {
		return y;
	}
	public void move(int X,int Y) {//move
		x=x+X;
		y=x+Y;
	}
	public int dist(int X,int Y) {
		return (int) Math.sqrt(Math.pow((x-X),2)+Math.pow((y-Y),2));
	}
}

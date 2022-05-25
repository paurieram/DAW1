
public class Rectangle {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	Rectangle(){//constructor 1
		
	}
	Rectangle(int X1,int  Y1,int X2,int Y2){//constructor 2
		if ((X1<X2)&&(Y1<Y2)) {
			x1=X1;
			y1=Y1;
			x2=X2;
			y2=Y2;
			System.out.println("Objecte creat correctament");
		}else {
			System.out.println("Error! El objecte no ha sigut creat correctament");
		}
	}
	public void setx1(int X1) {// SETTERS
		if ((X1<x2)&&(y1<y2)) {
			x1=X1;
			System.out.println("Parametre cambiat correctament");
		}else {
			System.out.println("Error! no s'ha cambiat correctament");
		}
	}
	public void setx2(int X2) {
		if ((x1<X2)&&(y1<y2)) {
			x2=X2;
			System.out.println("Parametre cambiat correctament");
		}else {
			System.out.println("Error! no s'ha cambiat correctament");
		}
	}
	public void sety1(int Y1) {
		if ((x1<x2)&&(Y1<y2)) {
			y1=Y1;
			System.out.println("Parametre cambiat correctament");
		}else {
			System.out.println("Error! no s'ha cambiat correctament");
		}
	}
	public void sety2(int Y2) {
		if ((x1<x2)&&(y1<Y2)) {
			y2=Y2;
			System.out.println("Parametre cambiat correctament");
		}else {
			System.out.println("Error! no s'ha cambiat correctament");
		}
	}
	public void setx1y1(int X1,int Y1) {
		if ((X1<x2)&&(Y1<y2)) {
			x1=X1;
			y1=Y1;
			System.out.println("Parametre cambiat correctament");
		}else {
			System.out.println("Error! no s'ha cambiat correctament");
		}
	}
	public void setx2y2(int X2,int Y2) {
		if ((x1<X2)&&(y1<Y2)) {
			x1=X2;
			y1=Y2;
			System.out.println("Parametre cambiat correctament");
		}else {
			System.out.println("Error! no s'ha cambiat correctament");
		}
	}
	public void setall(int X1,int Y1,int X2,int Y2) {
		if ((X1<X2)&&(Y1<Y2)) {
			x1=X1;
			y1=Y1;
			x2=X2;
			y2=Y2;
			System.out.println("Parametre cambiat correctament");
		}else {
			System.out.println("Error! no s'ha cambiat correctament");
		}
	}
	public int getx1() {// GETTERS
		return x1;
	}
	public int getx2() {
		return x2;
	}
	public int gety1() {
		return y1;
	}
	public int gety2() {
		return y2;
	}
	public int Perim() {
		return ((x2-x1)+(y2-y1))*2;
	}
	public int Area() {
		return (x2-x1)*(y2-y1);
	}
}

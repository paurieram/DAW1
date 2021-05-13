
public class Lloro extends Aus{
	private String origen;
	private boolean parla;
	Lloro(String no,int ed,String es,String na, boolean b,boolean v,String o,boolean p){
		super(no,ed,es,na,b,v);
		origen=o;
		parla=p;
	}
	public void saluda() {
		System.out.println(" hola ");
	}
	public void volar() {
		System.out.println(" fiu ");
	}
	public String toString() {//mostrar objecte
		return super.toString()+"-Lloro-\norigen: "+origen+"\nparla: "+parla;
	}
}

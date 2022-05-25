import java.util.ArrayList;

public class Inventari {
	private ArrayList L = new ArrayList();//list
	public void listall() {//1
		for(int i=0;i!=L.size();i++) {
			Object o =L.get(i);
			if (o instanceof Gos) {
				Gos t = (Gos) o;
				System.out.println(i+" - tipus: Gos, nom: "+t.getnom());
			}else if (o instanceof Gat){
				Gat t = (Gat) o;
				System.out.println(i+" - tipus: Gat, nom: "+t.getnom());
			}else if (o instanceof Lloro){
				Lloro t = (Lloro) o;
				System.out.println(i+" - tipus: Lloro, nom: "+t.getnom());
			}else if (o instanceof Canari){
				Canari t = (Canari) o;
				System.out.println(i+" - tipus: Canari, nom: "+t.getnom());
			}
		}
	}
	public void listone(int i) {//2
		System.out.println(L.get(i));
	}
	public void listalldet() {//3
		for(int i=0;i!=L.size();i++) {
			System.out.println(L.get(i));
		}
	}
	public void add(Object o) {//4
		L.add(o);
		
	}
	public void remove(int i) {//5
		L.remove(i);
	}
	public void reset() {//6
		L.clear();
	}
}
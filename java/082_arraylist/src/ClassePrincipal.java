import java.util.ArrayList;
import java.util.Iterator;

public class ClassePrincipal {

	public static void main(String[] args) {
		ArrayList llista = new ArrayList();//declaracio
		llista.add("1");//contingut
		llista.get(0);//posicio
		llista.add(0,2);//posicio/contingut
		llista.size();//length
		llista.remove(0);//posicio
		llista.add(new Producte("Producte1",10));//objecte en llista
		Iterator i = llista.iterator();
		int unitats=0;
		while(i.hasNext()) {
			Object contingut = i.next();
			if(contingut instanceof Producte) {
				Producte tmp  = (Producte)contingut;
				unitats+=tmp.getQuantitat();
			}
		}
	}

}

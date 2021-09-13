import java.util.ArrayList;

public class ClassePrincipal {

	public static void main(String[] args) {
		ArrayList L = new ArrayList();
		Pelicula P1=new Pelicula("jungla","mp4","pep","2h","Joan","Marc");
		Pelicula P2=new Pelicula("planta","wav","planta","2h","Joan","Ivan");
		Pelicula P3=new Pelicula("planta","mov","planta","1:30h","Joan","Marc");
		L.add(P1);
		L.add(P2);
		L.add(P3);
//		System.out.println(L.get(0));
//		System.out.println(L.get(1));
//		System.out.println(L.get(2));
		int k=0;
		for (int i=0;i!=L.size();i++) {
			for (int j=0;j!=L.size();j++) {
				Pelicula PT1 = (Pelicula) L.get(i);
				Pelicula PT2 = (Pelicula) L.get(j);
					if (PT1.equals(PT2) && i!=j) {
					k++;
				}
			}
		}
		if (k>=2) {
			System.out.println("Hi ha "+(k)+" Objectes iguals");
		}else {
			System.out.println("Hi ha 0 Objectes iguals");
		}
	}
}
import java.util.ArrayList;

public class ClassePrincipal {
	public static void main(String[] args) {
		ArrayList A = new ArrayList();
		Mag M1 = new Mag("mag1");
		Clergue C1 = new Clergue("Clergue1","deu");
		Poble P1 = new Poble("Poble1",1,5,10);
		A.add(M1);
		A.add(C1);
		A.add(P1);
		Mag B = new Mag("magb");
		System.out.println(A.get(0));
		System.out.println(A.get(1));
		System.out.println(A.get(2));
		System.out.println(B);
		((Mag) A.get(0)).aprendreConjura("conjura1");
		((Mag) A.get(0)).aprendreConjura("conjura2");
		B.aprendreConjura("conjura3");
		System.out.println(A.get(0));
		System.out.println(B);
		((Mag) A.get(0)).llencaConjura(B);
		B.llencaConjura(A.get(0));
		((Clergue) A.get(1)).cura(B);
		((Mag) A.get(0)).llencaConjura(B);
		B.llencaConjura(A.get(2));
		System.out.println(A.get(0));
		System.out.println(A.get(1));
		System.out.println(A.get(2));
		System.out.println(B);
	}
}

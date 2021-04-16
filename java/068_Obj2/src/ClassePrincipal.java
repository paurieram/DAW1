public class ClassePrincipal {
	public static void DadesObj(Persona Obj) {
		String dni = "123456789G";
		String nom = "Pep";
		int edat = 37;
		Obj.setDni(dni);
		Obj.setNom(nom);
		Obj.setEdat(edat);
	}
	public static void main(String[] args) {
		int N = 10;
		Persona ArrPers[] = new Persona[N];
		for(int i=0;i!=ArrPers.length;i++) {
			ArrPers[i]= new Persona();
			DadesObj(ArrPers[i]);
		}
		for(int i=0;i!=ArrPers.length;i++) {
			ArrPers[i].view();
		}	
	}
}
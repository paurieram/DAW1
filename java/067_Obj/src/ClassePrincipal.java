public class ClassePrincipal {
	public static void main(String[] args) {
		Persona Persona1 = new Persona();
		String dni = "123456789G";
		Persona1.setDni(dni);
		String nom = "Pep";
		Persona1.setNom(nom);
		int edat = 37;
		Persona1.setEdat(edat);
		Persona1.view();
	}
}
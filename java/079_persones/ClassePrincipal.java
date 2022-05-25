
public class ClassePrincipal {

	public static void main(String[] args) {
		
		Empleat Empleat1=new Empleat("nom1","domicili","horari","cap");
		System.out.println(Empleat1);
		Estudiant Estudiant1=new Estudiant("nom2","domicili","horari",90,'C');
		System.out.println(Estudiant1);
		Administrador Administrador1=new Administrador("nom3","domicili","horari","cap","post");
		System.out.println(Administrador1);
	}

}

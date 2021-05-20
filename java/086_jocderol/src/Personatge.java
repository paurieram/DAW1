
public class Personatge {
	private static final int D_VIDA=100;
	private String nom;
	private int forca;
	private int vida;

public Personatge(String n,int f){
	nom=n;
	forca=f;
	vida=D_VIDA;
}
public String toString() {
	return "Personatge nom=" + nom + ", forca=" + forca + ", vida=" + vida+"\n";
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getForca() {
	return forca;
}

public void setForca(int forca) {
	this.forca = forca;
}

public int getVida() {
	return vida;
}

public void setVida(int vida) {
	this.vida = vida;
}
}
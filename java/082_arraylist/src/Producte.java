public class Producte {
    private String nom;
    private int quantitat;

    public Producte(String n, int q) {
        this.nom = n;
        this.quantitat = q;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom (String n) {
        this.nom = n;
    }

    public int getQuantitat () {
        return this.quantitat;
    }

    public void setQuantitat (int q) {
        this.quantitat = q;
    }
	public String toString() {
		return "nom "+ nom + "\n quantitat "+ quantitat;
	}
}
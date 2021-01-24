
public class Produit5 implements Interface {

	private String libelle;
	private double prix;
	private int qnt;
	
	
	// GET - SET
	
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	
	
	//constricteur
	
	public Produit5(String libelle, double prix, int qnt) {
		super();
		this.libelle = libelle;
		this.prix = prix;
		this.qnt = qnt;
	}
	
	
	public Produit5() {
		// TODO Auto-generated constructor stub
	}

	
	
	// ToString
	
	@Override
	public String toString() {
		return "Produit5 [libelle=" + libelle + ", prix=" + prix + ", qnt=" + qnt + "]";
	}

	// afficher
	
	@Override
	public void afficher() {
		System.out.println(this);
		
	}
	
	
	
}

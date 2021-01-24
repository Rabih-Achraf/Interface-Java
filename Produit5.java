
public class Produit5 implements Interface {

	private String libelle;
	private double prix;
	private int qnt;
	@Override
	public String getLibelle() {
		return libelle;
	}
	
	// GET - SET
	
	@Override
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public double getPrix() {
		return prix;
	}
	@Override
	public void setPrix(double prix) {
		this.prix = prix;
	}
	@Override
	public int getQnt() {
		return qnt;
	}
	@Override
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

	// interface afficher
	
	@Override
	public void afficher() {
		System.out.println(this);
		
	}
	
	
	
}

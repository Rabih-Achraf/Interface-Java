
public class Employer implements Interface {

	private String nom;
	private String prenom;
	private double salaire;
	
	// GET - SET
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
	// constricteeure
	
	public Employer(String nom, String prenom, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	
	public Employer() {
		// TODO Auto-generated constructor stub
	}
	
	
	// ToString
	
	@Override
	public String toString() {
		return "Employer [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}
	
	// interface afficher
	
	@Override
	public void afficher() {
		System.out.println(this);
		
	}
	

	
	
	
}

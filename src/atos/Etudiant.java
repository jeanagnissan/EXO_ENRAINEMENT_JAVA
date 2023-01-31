package atos;

public class Etudiant {
	private int id;
	private String nom;
	private String prenom;
	private String matricule;
	private int age;
	private Ville villeEtudiant = new Ville();

	// constructeur avec parametres
	public Etudiant(int id, String nom, String prenom, String matricule, int age) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.age = age;
	}

	// constructeur sans parametres
	public Etudiant() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Ville getVille() {
		return villeEtudiant;
	}

	public void setVille(Ville villeEtudiant) {
		this.villeEtudiant = villeEtudiant;
	}
	
	

}

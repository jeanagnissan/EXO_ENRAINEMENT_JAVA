package atos;

public class Ville {
	
	private int id;
	private String libelle = "Abidjan";
	
	public Ville(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	public Ville() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}

package atos;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) throws Exception {
		Ville ville = new Ville();
		System.out.println("ville === " + ville.getLibelle());
		
		Etudiant etudiant = new Etudiant();
		System.out.println("etudiant_ville ===" + etudiant.getVille().getLibelle());

		String poids = "";
		String taille = "";
		Integer imc = 0;
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("Veuillez entrer votre poids en Kg");
			poids = scanner.nextLine();
			if (!(Integer.valueOf(poids) instanceof Integer)) {
				throw new Exception("Veuillez saisir un nombre svp");
			}
			System.out.println("Votre poids est " + poids + " Kg");

			
			System.out.println("Veuillez entrer votre taille en metre");
			taille = scanner.nextLine();
			if (!(Integer.valueOf(taille) instanceof Integer)) {
				throw new Exception("Veuillez saisir un nombre svp");
			}
			System.out.println("Votre taille est " + taille + " metre");

			
			int imc2 = (int) (Integer.valueOf(poids) / Math.pow(Integer.valueOf(taille), 2));
			System.out.println("Votre imc est  de " + imc2);

		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("Veuillez saisir un nombre svp");
			throw new Exception("Veuillez saisir un nombre svp");
		}

	}

}

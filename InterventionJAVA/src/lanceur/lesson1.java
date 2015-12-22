package lanceur;

import java.util.ArrayList;
import java.util.List;

public class lesson1 {

	public static void main(String[] args) {
// -------------------------------------------------------------------------------------------------------------------------------
		// premier programme
		// System.out.println() permet d'écrire dans la console
	System.out.println("Helo World!");// il faut utiliser des " et non des '
											// pour une chaine de carractères
		char car = 'a'; // ici pn utilise les ' et non les " comme c'est un
						// carractère

// ------------------------------------------------------------------------------------------------------------------------------
		// Déclaration de variable
		/*
		 * Calculer 5*9*45 1*2*3*4*5*6 a= 42 b=49 a*a+b*a-b*b
		 */
		int var2 = 1 * 2 * 3 * 4 * 5 * 6, a = 42, b = 49, c = (a * a) + (b * a) - (b * b), var1 = 5 * 9 * 45;
		System.out.println("var1 =" + var1 + " var2 =" + var2 + " a=" + a + " b=" + b + " c=" + c);
		// on peut également les afficher dirèctement sans passer par des
		// variables:
		System.out.println(5 * 9 * 45);

// --------------------------------------------------------------------------------------------------------------------------------
		// On va afficher une suite de chiffre de 0à9 de differentes manieres

		// boucle for
		System.out.println("Boucle for");
		for (int i = 0; i < 10; i++) {

			System.out.print(i);
		}
		System.out.println("");

		int i = 0;
		System.out.println("Boucle while");
		while (i < 10) {

			System.out.print(i);
			i++;
		}

		// les listes
		List<Integer> l = new ArrayList<Integer>();
		for (int j = 0; j < 10; j++) {
			l.add(j);
		}
		System.out.println();
		System.out.println("Seconde boucle for");
		for (int k : l) {
			System.out.print(k);
		}
		System.out.println();

// ----------------------------------------------------------------------------------------------------------------------------------
		// Calculer la somme des nombres de 1 à 1000
		int somme = 0;
		for (int j = 1; j < 1001; j++) {
			somme += j;// somme+=j c'est comme écrire somme= somme+j
		}
		System.out.println("somme =" + somme);
		// Calcler factoriel(100) c'est à dire le produit des nombres de 1 à 100
		double produit = 1;
		for (int j = 1; j < 20; j++) {
			produit *= j;
		}
		System.out.println("produit =" + produit);
		// produit ne peut être ni int ni long car la taille de ces variables
		// n'est pas assez grande
		// exemple:
		int trop_grand = 3000 * 1000000;
		System.out.println("trop grand = "+trop_grand);
		System.out.println();


		
	}
	


}

package lanceur;

public class lesson2 {
	public static void main(String[] args) {

		int sommeSauf3 = calcule_somme_sauf_multiple_de_3(5);
		System.out.println("resultat = " + sommeSauf3);
		
		sommeSauf3 = calcule_somme_sauf_multiple_de_3(6);
		System.out.println("resultat = " + sommeSauf3);
		
		sommeSauf3 = calcule_somme_sauf_multiple_de_3(10);
		System.out.println("resultat = " + sommeSauf3);
		
		boolean premier=est_premier(8);
		System.out.println(premier);
		
		premier=est_premier(1);
		System.out.println(premier);
	}

	// -----------------------------------------------------------------------------------------------------------------------------------
	// fonctions
	/*
	 * a déclarer en static pour ne pas avoir besoin d'un objet pour l'appeler
	 * ex: si une classe n'est pas statique on l'appele objet.class(); sinon on
	 * l'appelle comme ça : class(); (je crois)
	 */
	/*
	 * Calculer la somme des nombres de 1 à n sauf les multiples de 3
	 * calcule_somme_sauf_multiple_de_3(5)=5+4+2+1=12
	 * calcule_somme_sauf_multiple_de_3(6)=12
	 * calcule_somme_sauf_multiple_de_3(10)37
	 */
	public static int calcule_somme_sauf_multiple_de_3(int n) {
		int somme = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0) {
				somme += 0;

			} else {
				somme += i;
			}

		}
		return somme;
	}
	/*
	 * Creer une fonciton est_premier qui renvoie un boolean si le nombre donné est premier ou non
	 */
	public static boolean est_premier(int n) {
		
		for (int i = 1; i < n; i++) {
			if ((n%i==0)){
				return false;
			}else{
				return true;
			}
		}
		return true;
		
	}
}

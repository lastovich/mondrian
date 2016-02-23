
public class LaunchMe {
	
	private static void mondrian(Element[] nuplets, int k) {
		// instanciation de la classe util Mondrian
		Mondrian mondrian = new Mondrian(nuplets, k);
		
		if (mondrian.cutable()) {
			mondrian.chooseDimension();
		}
	}
	
	public static void main(String[] args) {
		// définition des bornes pour QID1 et QID2
		int[] borneMin = {2, 25};
		int[] borneMax = {5, 26};
		int k = 2;
		
		// création du jeu de donnees
		JeuDeDonnees jeu = new JeuDeDonnees(50, borneMin, borneMax, 4, k);
		
		// affichage du jeu de donnees
		System.out.println(jeu.toString());
		
		// on applique mondrian sur les nuplets
		Element[] nuplets = jeu.getElements();
		mondrian(nuplets, k);
		
	}

}

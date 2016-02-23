import java.util.Random;

public class JeuDeDonnees {

	private int cardinalite;
	private int[] borneMin;
	private int[] borneMax;
	private int distinct;
	private int k;

	Element[] nuplets;

	public static String[] pays = { "France", "Allemagne", "Espagne", "Chine",
			"USA", "Finlande" };

	public JeuDeDonnees(int cardinalite, int[] borneMin, int[] borneMax, int distinct, int k) {
		this.cardinalite = cardinalite;
		this.borneMin = borneMin;
		this.borneMax = borneMax;
		this.distinct = distinct;
		this.k = k;

		this.populate();
	}
	
	public Element[] getElements() {
		return nuplets;
	}

	private void populate() {
		// création du jeu de données vide
		nuplets = new Element[cardinalite];

		// définition des range
		int range1 = (borneMax[0] - borneMin[0]) + 1;
		int range2 = (borneMax[1] - borneMin[1]) + 1;

		for (int i = 0; i < cardinalite; ++i) {
			// création du premier QID
			int qid1 = (int) (Math.random() * range1) + borneMin[0];

			// création du second QId
			int qid2 = (int) (Math.random() * range2) + borneMin[1];

			// récupération de la SD
			int index = new Random().nextInt(pays.length);
			String sensible = (pays[index]);

			// création de l'élément
			Element element = new Element(qid1, qid2, sensible);
			// affectation de l'élément au jeu de données
			nuplets[i] = element;
		}
	}

	public String toString() {
		String res = "Jeu[\n";

		for (Element e : nuplets) {
			res += "\t" + e.toString() + "\n";
		}

		res += "]";
		return res;
	}

}

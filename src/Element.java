
public class Element {

	private int qid1;
	private int qid2;
	private String sensible;
	
	public Element(int qid1, int qid2, String sensible) {
		this.qid1 = qid1;
		this.qid2 = qid2;
		this.sensible = sensible;
	}
	
	public String toString() {
		return "[" + qid1 +", " + qid2 + ", " + sensible + "]";
	}
}

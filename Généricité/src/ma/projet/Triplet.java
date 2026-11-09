package ma.projet;

public class Triplet<T> {
	 private final T premier;
	 private final T second;
	 private final T troisieme;
	 public T getPremier() {
		return premier;
	}
	 public T getSecond() {
		 return second;
	 }
	 public T getTroisieme() {
		 return troisieme;
	 }
	 public Triplet(T premier, T second, T troisieme) {
		super();
		this.premier = premier;
		this.second = second;
		this.troisieme = troisieme;
	 }

	    public void affiche() {
	        System.out.println("Triplet : ["
	            + premier + ", "
	            + second + ", "
	            + troisieme + "]");
	    }

}

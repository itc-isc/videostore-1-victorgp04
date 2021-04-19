package wsVideoStore;

public abstract class Movie
{
	private String title;
	private int priceCode;
	public static final int REGULAR = 1;
	public static final int NEW_RELEASE = 2;
	public static final int CHILDRENS = 3;
	
	public Movie(String title) {
		this.title 		= title;
	}
		
	public String getTitle () {
		return title;
	}

	public int getPriceCode () {
		return priceCode;
	}

  public abstract double determineAmount(int daysRented);

  public abstract int determineFrequentRenterPoints(int daysRented);
}
/**
 * Movie
 */
package W3.DesignStartup.src;

public class Movie {
	public static final int CHILDREN =2;
	public static final int REGULAR =0;
	public static final int NEW_RELEASE =1;

	private String _title;
	private int _priceCode;

	public Movie(String title, int priceCode) {
		super();
		this._title = title;
		this._priceCode = priceCode;

	}

	public int getPriceCode() {
		return this._priceCode;
	}
	public String getTitle() {
		return this._title;
	}

	public void setTitle(String title) {
		this._title = title;
	}	

	public void setPriceCode(int priceCode) {
		this._priceCode = priceCode;
	}
	
}
package java8.lambda.example3;

public class City {
	
	private int cityId;
	private String cityName;
	private int rating;
	private String countryName;
	
	/**
	 * @param cityId
	 * @param cityName
	 * @param rating
	 * @param countryName
	 */
	public City(int cityId, String cityName, int rating, String countryName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.rating = rating;
		this.countryName = countryName;
	}
	
	/**
	 * @return the cityId
	 */
	public int getCityId() {
		return cityId;
	}
	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}
	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", rating=" + rating + ", countryName="
				+ countryName + "]";
	}
	

}


public class Film implements Game
{

	@Override
	public String getName() 
	{
		return filmName;
	}

	@Override
	public int getYear() 
	{
		return consYear;
	}

	@Override
	public String getExtraInfo() 
	{
		return "(imdb "+ getImdbPoint()+" )";
	}
	private String filmName;
	private int consYear;
	private double imdbPuan;
	
	public Film(String filmName, int consYear)
	{
		this.filmName = filmName;
		this.consYear = consYear;
	}
	
	
	public double getImdbPoint() {
		return imdbPuan;
	}

	public void setImdbPoint(double imdbPuan) {
		this.imdbPuan = imdbPuan;
	}


	

}

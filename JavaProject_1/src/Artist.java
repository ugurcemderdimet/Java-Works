
public class Artist extends Person implements Game 
{
	private String stageName;
	
	private Game games[] = new Game[5];
	
	public Artist(String name, String stageName)
	
	{
		super(name);
		this.stageName = stageName;
	}
	
	public String getstageName() {
		return stageName;
	}

	public void setstageName(String stageName) {
		this.stageName = stageName;
	}
	public void addGame(Game game)
	{
		if(games[0]==null)
		{
			games[0] = game;
		}
		else if(games[1]==null)
		{
			if(!game.equals(games[0].getName()))
			games[1]=game;
		}
			
		
	}
	public String toString()
	{
		
		String gameName1 = games[0].getName() + "( "+ games[0].getYear()+ " )"+ games[0].getExtraInfo() ;
		String gameName2 = games[1].getName() + "( "+ games[1].getYear()+ " )"+ games[1].getExtraInfo() ;
		return "Adým: "+super.getName() + " sahne adým " + stageName+ " gamesým: "+ gameName1 + gameName2;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getYear() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getExtraInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}

import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		Scanner enter =new Scanner(System.in);
		
		System.out.println("Enter artist name and surname: ");
		String name = enter.nextLine();
		System.out.println("Enter artist's stage name: ");
		String stageName = enter.nextLine();
		
		System.out.println("Enter first game name: ");
		String filmName1 = enter.nextLine();
		System.out.println("Enter first game's year of construction: ");
		int consYear1 = enter.nextInt();
		System.out.println("IMDB point (with comma): ");
		double imdb1 = enter.nextDouble();
		enter.nextLine();

		
		
		System.out.println("Enter second game name: ");
		String filmName2 = enter.nextLine();
		System.out.println("Enter second game's year of construction: ");
		int consYear2 = enter.nextInt();
		System.out.println("IMDB point (with comma): ");
		double imdb2 = enter.nextDouble();
		
		enter.close();
		
		
		Artist artist = new Artist(name, stageName);
		Film film1 = new Film(filmName1, consYear1);
		film1.setImdbPoint(imdb1);
		
		Film film2 = new Film(filmName2, consYear2);
		film2.setImdbPoint(imdb2);
		
		artist.addGame(film1);
		artist.addGame(film2);
		
		System.out.println(artist.toString());
		
		

	}

}

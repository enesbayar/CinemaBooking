package Model;
import java.util.ArrayList;


public class Movie {

	private String movieName;
	private String movieUrl;
	private String description;
	private String sessions;
	private double movieRate;
	private double price;
	private String seats;
	
	public Movie() {
		super();
	}

	public Movie(String movieName, String movieUrl, String description,
			String sessions, double movieRate, double price, String seats) {
		super();
		this.movieName = movieName;
		this.movieUrl = movieUrl;
		this.description = description;
		this.sessions = sessions;
		this.movieRate = movieRate;
		this.price = price;
		this.seats = seats;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieUrl() {
		return movieUrl;
	}

	public void setMovieUrl(String movieUrl) {
		this.movieUrl = movieUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSessions() {
		return sessions;
	}

	public void setSessions(String sessions) {
		this.sessions = sessions;
	}

	public double getMovieRate() {
		return movieRate;
	}

	public void setMovieRate(double movieRate) {
		this.movieRate = movieRate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}
	
	
	
}

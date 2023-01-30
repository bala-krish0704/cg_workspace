package com.cg.moviemanagementsystem;

public class Movie {
	private String movieId;
	private String movieName;
	private String movieLanguage;
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String movieId, String movieName, String movieLanguage) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieLanguage = movieLanguage;
	}
	

}

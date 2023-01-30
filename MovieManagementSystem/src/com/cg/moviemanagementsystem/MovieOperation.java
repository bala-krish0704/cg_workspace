package com.cg.moviemanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieOperation {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Movie> movie = new ArrayList<>();
		Movie mv = null;
		

		char ch = 'y';
		while(ch == 'y') {
			System.out.println("Enter the operation to perfom");
			System.out.println("1.Creation ");
			System.out.println("2.Read");
			System.out.println("3.update");
			System.out.println("4.Delete");
			int choice = in.nextInt();
			switch(choice) {
			case 1:
					
					System.out.println("Enter the number of movie to be added");
					int n = in.nextInt();
					for(int i = 0 ; i < n ; i ++) {
					mv = new Movie();
					System.out.println("Enter the movieId");
					mv.setMovieId(in.nextLine());
					System.out.println("Enter the movie Name");
					mv.setMovieName(in.nextLine());
					System.out.println("Enter movie language");
					mv.setMovieLanguage(in.nextLine());
					movie.add(mv);
					}
					break;
					
			case 2 :
					for(Movie mv1 : movie) {
						System.out.println("Movie Id : "+ mv1.getMovieId());
						System.out.println("Movie name : " + mv1.getMovieName());
						System.out.println("Movie Language : "+ mv1.getMovieLanguage());
					}
					break;
			case 3:
				if(movie.isEmpty()) {
					System.out.println("No data found");
				}
				else {
					
				}	
				break;
			case 4:
				if(movie.isEmpty()) {
					System.out.println("No data found");
				}
				else {

				}
				break;
				default:
					System.out.println("Enter the right option");
					break;	
			}
			System.out.println("Do you want to continuen press y or else press n");
			ch = in.next().charAt(0);
		}
	}
}

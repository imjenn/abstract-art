package com.abstractart;
import java.util.ArrayList;
import java.util.Random;

public class Museum {

	public static void main(String[] args) {
		
		ArrayList<Art> museum = new ArrayList<Art>();
		
		Painting painting1 = new Painting("The Old Guitarist", "Picasso", "Man playing guitar", "Oil");
		museum.add(painting1);
		System.out.println("\n====== PAINTING 1 ======\n");
		painting1.viewArt();
		
		Painting painting2 = new Painting("Self Portrait", "Picasso", "A self portrait", "Oil");
		museum.add(painting2);
		System.out.println("\n====== PAINTING 2 ======\n");
		painting2.viewArt();
		
		Painting painting3 = new Painting("La Reve", "Picasso", "Painting of woman", "Oil");
		museum.add(painting3);
		System.out.println("\n====== PAINTING 3 ======\n");
		painting3.viewArt();

		Sculpture sculpture1 = new Sculpture("Bull's Head", "Picasso", "Created from the seat and handlebars of a bike", "Metal");
		museum.add(sculpture1);
		System.out.println("\n====== SCULPTURE 1 ======\n");
		sculpture1.viewArt();

		Sculpture sculpture2 = new Sculpture("Fernande", "Picasso", "Projected planes suggestive of different points of view", "Bronze");
		museum.add(sculpture2);
		System.out.println("\n====== SCULPTURE 2 ======\n");
		sculpture2.viewArt();
		
//		Random rand = new Random();
		System.out.println("\n====== RANDOM ======\n");
		museum.get(new Random().nextInt(museum.size())).viewArt();
		
		

	}

}

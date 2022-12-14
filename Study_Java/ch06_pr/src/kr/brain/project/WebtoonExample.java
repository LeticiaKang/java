package kr.brain.project;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class WebtoonExample {
	
	public static ArrayList<Book> ab = new ArrayList<>();
	
	public static void main(String[] args) {
		
		// Webtoon(String isbn, String title, String genre, String author, LocalDateTime date)
		
		Webtoon w1 = new Webtoon("i-12345", "????1", "?ڹ?", "????1");
		Webtoon w2 = new Webtoon("i-12346", "????2", "??????", "????2");
		Webtoon w3 = new Webtoon("i-12347", "????3", "??????", "????3");
		
		ab.add(w1);
		ab.add(w2);
		ab.add(w3);
		ab.add(new Webtoon("i-123499", "????4", "??????", "????4"));
		
		for(Book a : ab)
			System.out.println(a.toString());
		
	}
}

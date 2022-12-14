package kr.brain.project;

import java.time.LocalDateTime;
import java.util.Objects;

// 웹툰을 등록하고 조회하는 걸 해볼거야
// 웬툰의 주요 필드는 뭐야? (저자, 제목, 장르, 판매부스)

// 웹툰 Book종류
// 인터페이스로 BOOk을 만들어야해
public class Webtoon implements Book {

	private String isbn;
	private String genre;
	private String author;
	private String title;
	private LocalDateTime date;
	private int count;
	
	public Webtoon() {
	}
	
	public Webtoon(String isbn, String title, String genre, String author) {
		this.isbn = isbn;
		this.title = title;
		this.genre = genre;
		this.author = author;
		date = LocalDateTime.now(); 
	}
	
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	// 재정의
	public String toString() {
		return "Webtoon [title = " + title + ", genre = " + genre +  ", author = " + author + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 참조하는 객체가 같으면 true
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Webtoon other = (Webtoon) obj;
		return Objects.equals(author, other.author) 
				&& Objects.equals(date, other.date)
				&& Objects.equals(genre, other.genre) 
				&& Objects.equals(title, other.title);
	}

	
	@Override
	public void setGerne(String genre) {
	}

	
	
	
	
}

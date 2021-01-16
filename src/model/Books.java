package model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Books")
public class Books {

	@Id
	private int id;
//	@Column(name = "Book Title")
	private String name;
//	@Column(name = "Language")
	private String language;
//	@Column(name = "Author")
	private String author;
//	@Column(name = "Genre")
	private String genre;
	//@Column(name = "Book Added On")
	private String added_date;
//	@Column(name = "Issue Status")
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAdded_date() {
		return added_date;
	}
	public void setAdded_date(String added_date) {
		this.added_date = added_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Books(int id, String name, String author, String genre, String added_date, String status, String language) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.added_date = added_date;
		this.status = status;
		this.language = language;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}

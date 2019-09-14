package lab2.cap;

abstract class Item
{
	private int idno,copiesno;
	private String title;
	
	
	public Item(int idno, int copiesno, String title) {
		super();
		this.idno = idno;
		this.copiesno = copiesno;
		this.title = title;
	}
	public int getIdno() {
		return idno;
	}
	public void setIdno(int idno) {
		this.idno = idno;
	}
	public int getCopiesno() {
		return copiesno;
	}
	public void setCopiesno(int copiesno) {
		this.copiesno = copiesno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Item [idno=" + idno + ", copiesno=" + copiesno + ", title=" + title + "]";
	}
	
	
	
}


abstract class WrittenItem extends Item
{
	private String author;

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + "]";
	}

	public WrittenItem(int idno, int copiesno, String title, String author) {
		super(idno, copiesno, title);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}

class Book extends WrittenItem
{

	public Book(int idno, int copiesno, String title, String author) {
		super(idno, copiesno, title, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return super.getAuthor();
	}

	@Override
	public void setAuthor(String author) {
		// TODO Auto-generated method stub
		super.setAuthor(author);
	}
	
}


class JournalPaper extends WrittenItem
{
	public JournalPaper(int idno, int copiesno, String title, String author) {
		super(idno, copiesno, title, author);
		System.out.println("\n book idno="+idno+"\n number of copies : "+copiesno+"\ntitle of book : "+title+"\n Author name : "+author);
		// TODO Auto-generated constructor stub
	}

	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}


abstract class Mediaitem extends Item
{
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public Mediaitem(int idno, int copiesno, String title, int n) {
		super(idno, copiesno, title);
		this.n = n;
	}

	@Override
	public String toString() {
		return "Mediaitem [n=" + n + "]";
	}
	
}

class Video extends Mediaitem
{
	public Video(int idno, int copiesno, String title, int n) {
		super(idno, copiesno, title, n);
		// TODO Auto-generated constructor stub
	}
	private String director;
	private String genre;
	private int yearreleased;
	
}


class CD extends Mediaitem
{
	public CD(int idno, int copiesno, String title, int n) {
		super(idno, copiesno, title, n);
		System.out.println("\n book idno="+idno+"\n number of copies : "+copiesno+"\ntitle of book : "+title+"\n Runtime integer : "+n);
		// TODO Auto-generated constructor stub
	}
	private String artist;
	private String genre;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}


public class InheritanceLab {
	public static void main(String[] args) {
		JournalPaper obj1=new JournalPaper(123, 50, "Horror Stories", "Durjoy Dutta");
		CD obj2=new CD(154, 25, "Funny", 5);
		obj2.setGenre("Funny");
		obj2.setArtist("Chetan Bhagat");
		System.out.println("Genre: "+ obj2.getGenre());
		System.out.println("Artist: "+ obj2.getArtist());
	}

}

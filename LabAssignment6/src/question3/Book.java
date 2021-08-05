package question3;

public class Book implements Comparable<Book>{

	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title =title;
		this.author = author;			
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	//hashCode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	//equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	//toString method
	@Override
	public String toString() {                              
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	//compareT      o method
	@Override
	public int compareTo(Book b) {
	       return this.getTitle().compareTo(b.getTitle());
	}
       
}
           

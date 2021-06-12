package sample007;

import java.util.Date;

public class Book implements Comparable<Book>, Cloneable {
	private String title;
	private Date publishDate;
	private String comment;

	public boolean equls(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Book))
			return false;
		Book b = (Book) o;
		if (!this.title.equals(b.title)) {
			return false;
		}
		if (!this.publishDate.equals(b.publishDate)) {
			return false;
		}

		return true;
	}

	public int hashCode() {
		int result = 37;
		result = result * 31 + this.title.hashCode();
		result = result * 31 + this.publishDate.hashCode();
		return result;
	}

	public int compareTo(Book o) {
		return this.publishDate.compareTo(o.publishDate);
	}

	public Book clone() {
		Book re = new Book();
		re.title = this.title;
		re.publishDate = (Date) this.publishDate.clone();
		re.comment = this.comment;
		return re;
	}
}

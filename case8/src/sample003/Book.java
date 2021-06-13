package sample003;

import java.util.Date;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Book implements Comparable<Book>, Cloneable {
	private String title;
	private Date publishDate;
	private String comment;

	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}

	public int hastCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	public int compareTo(Book o) {
		return CompareToBuilder.reflectionCompare(this, o);
	}

	public Book clone() {
		Book re = new Book();
		re.comment = this.comment;
		re.publishDate = this.publishDate;
		re.title = this.title;
		return re;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

//commons-loggingを使用したパターン

public class Book extends Item{
	private String author;
	private int pages;
	private String publisher;
	private int MAX_BORROW_DAY = 14;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getMAX_BORROW_DAY() {
		return MAX_BORROW_DAY;
	}

	public void setMAX_BORROW_DAY(int mAX_BORROW_DAY) {
		MAX_BORROW_DAY = mAX_BORROW_DAY;
	}
}

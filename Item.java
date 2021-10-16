
public class Item {

	private String title1;
	private boolean borrowed;

	public int year;
	public int month;
	public int dayOfMonth;

	public String gettitle1() {
		return title1;
	}

	public void settitle1(String title1) {
		this.title1 = title1;
	}

	public boolean isBorrowed() {
		return borrowed;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	void print() {
		System.out.println(title1 + " " + borrowed + " " + year + " " + month + " " + dayOfMonth);
	}

}

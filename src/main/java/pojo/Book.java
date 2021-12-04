package pojo;

public class Book {
	String bookID;
	String name;
	String author;
	String category;
	String description;
	int NoOFUnits;
	int sellingPrice;
	int costPrice;
	String Status;
	String userName;
	public Book(String bookID, String name, String author, String category, String description, int noOFUnits,
			int sellingPrice, int costPrice, String status, String userName) {
		super();
		this.bookID = bookID;
		this.name = name;
		this.author = author;
		this.category = category;
		this.description = description;
		NoOFUnits = noOFUnits;
		this.sellingPrice = sellingPrice;
		this.costPrice = costPrice;
		Status = status;
		this.userName = userName;
	}
	
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNoOFUnits() {
		return NoOFUnits;
	}
	public void setNoOFUnits(int noOFUnits) {
		NoOFUnits = noOFUnits;
	}
	public int getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public int getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(int costPrice) {
		this.costPrice = costPrice;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", name=" + name + ", author=" + author + ", category=" + category
				+ ", description=" + description + ", NoOFUnits=" + NoOFUnits + ", sellingPrice=" + sellingPrice
				+ ", costPrice=" + costPrice + ", Status=" + Status + ", userName=" + userName + "]";
	}
	
	
}

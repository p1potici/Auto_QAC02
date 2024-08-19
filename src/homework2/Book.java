public class Book {
    private String title;
    private double price;
    private Author author;
    private int year;

    public Book(String title, double price, Author author, int year) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getDetails() {
        return String.format("%s (published in %d), by %s > %.2f RON", getTitle(), getYear(), getAuthor().getName(), getPrice());
    }
}

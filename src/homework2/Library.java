public class Library {
    public static void main(String[] args) {

        Author author = new Author("Robert Greene");
        Author author2 = new Author("Daniel Kahneman");
        Author author3 = new Author("Carol S. Dweck");

        Book book = new Book("The 48 Laws of Power", 69.99, author, 1998);
        Book book2 = new Book("Thinking, Fast and Slow", 79.99, author2, 2011);
        Book book3 = new Book("Mindset: The New Psychology of Success", 59.99, author3, 2006);

        System.out.println(book.getDetails());
        System.out.println(book2.getDetails());
        System.out.println(book3.getDetails());
    }
}


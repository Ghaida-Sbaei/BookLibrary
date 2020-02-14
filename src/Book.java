public class Book {
    private String name;
    private double price;
    private int quantity;
    private Author author;
    private int year;

    public Book(String name,double price,int quantity,Author author,int year){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.author=author;
        this.year=year;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", author=" + author.getName()+
                ", year=" + year +
                '}';
    }
}

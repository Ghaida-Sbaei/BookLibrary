public class Book {
    private String name;
    private double price;
    private int quantity;
    private Author author;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

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

public class Application {
    public static void main(String[] args) {

        Author author1 = new Author("Koen", "koen.griffioen@capgemini.com", 26, "m");
        Author author2 = new Author("Alice Munro", 88, "f");
        Book book1 = new Book("Selected stories", 16.99, 15000000, author2, 1996);
        Book book2 = new Book("The moons of jupiter", 14.99, 1000000, author2, 1988);
        Book book3 = new Book("Thoughts of Java", 1.99, 1, author1, 2020);
        Book book4 = new Book("Thoughts of Dotnet", 4.99, 2, author1, 2020);
        System.out.println("The Aouthers are : ");
        author1.show();
        author2.show();
        System.out.println("************************************************************************");
        System.out.println("The Books are : ");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());








    }





}

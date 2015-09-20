package bookauthor;

/**
 * Created by user on 20-Sep-15.
 */
public class book {
    private String name;
    private author author;
    private double price;
    private int stock;
    public book(String name, author author, double price, int stock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.stock = stock;

    }
    public book(String name, author author) {
        this.name = name;
        this.author = author;
    }
    public String getName()  {
        return name;
    }
    public author getAuthor()  {
        return author;
    }
    public double getPrice()  {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStock()  {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void returnBook(int amount) {
        stock += amount;
    }
   public void borrowBook(int amount) {
       if (stock >= amount) {
           stock -= amount;
       } else {
           System.out.println("Borrowing amount exceeds the current stock!");
       }
   }
    public void print()  {
        System.out.println("author"+getAuthorName()+"name:"+name+"price"+price+"stock"+stock);;
    }
    public String getAuthorName()  {
        return author.getName();
    }
}

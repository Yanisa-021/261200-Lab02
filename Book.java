public class Book {

    private String title;
    private String author;
    private double price;


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Show book information
    public void displayDetails() {

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Apply a discount to the price
    public void applyDiscount(double discountPercent) {

        // Check if discount is valid
        if (discountPercent > 0.0 && discountPercent < 100.0) {
            double discountAmount = price * (discountPercent / 100.0); // Calculate discount
            price = price - discountAmount; // Update price
            System.out.println("Discount applied: " + discountPercent + "%");
            System.out.println("Updated price: " + price);
        } else {

            // Discount is invalid
            System.out.println("Error:Discount must be more than 0 and less than 100.");
        }
    }
}

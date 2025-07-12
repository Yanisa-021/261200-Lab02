public class Main {

    public static void main(String[] args) {

        // Create a book for testing
        Book book = new Book("Sleep Deprived but Still Coding eiei", "gipsee", 1000.00);


        // Try giving wrong discount
        book.applyDiscount(-20);  // Should show error message

        // Try a good discount
        book.applyDiscount(25);   // Should reduce price to 750

        // Show book info after discount
        book.displayDetails();    // Price should be updated
    }
}

package bookjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create an instance of Book class
        Scanner input = new Scanner(System.in);
        Book myBook = new Book();

        // Prompt user for book details
        System.out.print("Enter the book title: ");
        String title = input.nextLine();
        myBook.setTitle(title);

        System.out.print("Enter the book author: ");
        String author = input.nextLine();
        myBook.setAuthor(author);

        System.out.print("Enter the book price: ");
        double price = input.nextDouble();
        myBook.setPrice(price);

        // Display book information
        System.out.println("\nBook Details:");
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Price: $" + myBook.getPrice());
    }
}

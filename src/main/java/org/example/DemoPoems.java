package org.example;
import java.util.Scanner;

public class DemoPoems {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int choice;
            String title;

            // Prompt user for poem type
            do {
                System.out.println("Select the type of Poem to create:");
                System.out.println("1. Couplet");
                System.out.println("2. Limerick");
                System.out.println("3. Haiku");
                System.out.println("4. Plain Poem");
                System.out.print("Enter your choice (1-4): ");
                choice = input.nextInt();
                input.nextLine(); // Consume the newline
            } while (choice < 1 || choice > 4);

            // Prompt user for the title
            System.out.print("Enter the title of the poem: ");
            title = input.nextLine();

            // Instantiate the correct poem object based on user choice
            Poem poem;
            switch (choice) {
                case 1:
                    poem = new Couplet(title);
                    break;
                case 2:
                    poem = new Limerick(title);
                    break;
                case 3:
                    poem = new Haiku(title);
                    break;
                case 4:
                    System.out.print("Enter the number of lines: ");
                    int numberOfLines = input.nextInt();
                    input.nextLine(); // Consume the newline
                    poem = new Poem(title, numberOfLines);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

            // Display the poem details
            System.out.println("\nPoem Details:");
            System.out.println("Title: " + poem.getName());
            System.out.println("Number of Lines: " + poem.getNumberOfLines());

            input.close();
        }
    }



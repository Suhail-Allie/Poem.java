package org.example;

public class Poem {

        private String name;
        private int numberOfLines;

        // Constructor that requires values for both fields
        public Poem(String name, int numberOfLines) {
            this.name = name;
            this.numberOfLines = numberOfLines;
        }

        public String getName() {
            return name;
        }

        // Getter method for numberOfLines
        public int getNumberOfLines() {
            return numberOfLines;
        }

        // Main method to test the Poem class
        public static void main(String[] args) {
            // Create a Poem object
            Poem myPoem = new Poem("The Road Not Taken", 20);

            // Display the poem's details
            System.out.println("Poem Name: " + myPoem.getName());
            System.out.println("Number of Lines: " + myPoem.getNumberOfLines());
        }
    }



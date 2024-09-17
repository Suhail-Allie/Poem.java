package org.example;

    public class Haiku extends Poem {
        private static final int NUMBER_OF_LINES = 3;

        // Constructor that requires only a title
        public Haiku(String title) {
            super(title, NUMBER_OF_LINES);
        }
    }



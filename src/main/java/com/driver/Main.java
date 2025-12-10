package com.driver;

public class Main {

    // Task 1: Product class inside Main class
    static class Product {

        // Task 3
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4 (Overloaded)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5 (Overloaded)
        public double product(double x, double y) {
            return x * y;
        }
    }

    // Task 2: main function (NO OUTPUT)
    public static void main(String[] args) {
        Product p = new Product();
        // No printing here
    }
}

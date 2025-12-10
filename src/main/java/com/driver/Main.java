package com.driver;

public class Main {
   static class Product {
     // Task 3: Method with two int parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with three int parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    // Main function
    public static void main(String[] args) {

        // Task 2: Create object of Product
        Product p = new Product();

        // Calling product(int, int)
        int result1 = p.product(2, 3);
        System.out.println("Product of 2 and 3 = " + result1);

        // Calling product(int, int, int)
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of 2, 3 and 4 = " + result2);

        // Calling product(double, double)
        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of 2.5 and 3.5 = " + result3);
    }
}


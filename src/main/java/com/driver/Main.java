public class Main {

    public static void main(String[] args) {

        // Task 2: Create object of Product
        Product p = new Product();

        // Task 3
        System.out.println(p.product(2, 3));

        // Task 4
        System.out.println(p.product(2, 3, 4));

        // Task 5
        System.out.println(p.product(2.5, 3.5));
    }
}

// Task 1: Product class
class Product {

    // Task 3
    public int product(int x, int y) {
        return x * y;
    }

    // Task 4
    public int product(int x, int y, int z) {
        return x * y * z;
    }

    // Task 5
    public double product(double x, double y) {
        return x * y;
    }
}

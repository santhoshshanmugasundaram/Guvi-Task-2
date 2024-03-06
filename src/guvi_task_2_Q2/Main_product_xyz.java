package guvi_task_2_Q2;

import java.util.*;

public class Main_product_xyz {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product ID:");
            int pid = scanner.nextInt();
            System.out.println("Enter price:");
            double price = scanner.nextDouble();
            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();

            Product product = new Product(pid, price, quantity);
            products[i] = product;
        }

        // Find PID of the product with the highest price
        int highestPricePid = findHighestPricePid(products);
        System.out.println("Product ID with the highest price: " + highestPricePid);

        // Calculate and return total amount spent on all products
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);
    }

	private static int findHighestPricePid(Product[] products) {
	    double maxPrice = products[0].getPrice(); // Initialize with the price of the first product
	    int highestPricePid = products[0].getPid(); // Initialize with the PID of the first product

	    for (Product product : products) {
	        if (product.getPrice() > maxPrice) {
	            maxPrice = product.getPrice();
	            highestPricePid = product.getPid();
	        }
	    }

	    return highestPricePid;
	}

    private static double calculateTotalAmountSpent(Product[] products) {
        double totalAmountSpent = 0;

        for (Product product : products) {
            totalAmountSpent += product.getPrice() * product.getQuantity();
        }

        return totalAmountSpent;
    }
}



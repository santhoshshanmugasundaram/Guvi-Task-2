package guvi_tasks_1;

	import java.util.Scanner;

	public class Question5 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the purchase amount: ");
	        double purchaseAmount = sc.nextDouble();

	        double discount = 0.0;
	        if (purchaseAmount < 500) {
	            discount = 0; // no discount
	        } else if (purchaseAmount > 500 && purchaseAmount < 1000) {
	            discount = 10; // 10% discount for purchases between 500 and 1000
	        } else if (purchaseAmount > 1000) {
	            discount = 20; // 20% discount for purchases over 1000
	        }

	        double discountAmount = (purchaseAmount * discount) / 100;
	        double payableAmount = purchaseAmount - discountAmount;

	        System.out.println("Discount: $" + discountAmount);
	        System.out.println("Payable amount: $" + payableAmount);

	        sc.close();
	    }

}

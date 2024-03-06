package guvi_tasks_1;

	import java.util.Scanner;
	  public class Question2 {
	    //write a  program that find a given number is negative or positive
	        public static void main(String[] args) {
	            // Create Scanner object to read input
	            Scanner sc = new Scanner(System.in);

	            System.out.println("Enter a number: ");
	            // Read the number provided by the user
	            double number = sc.nextDouble();

	            // Check if the number is positive, negative, or zero
	            if (number < 0) {
	                System.out.println(number + " is a negative number.");
	            } else if (number > 0) {
	                System.out.println(number + " is a positive number.");
	            } else {
	                System.out.println("The number is zero.");
	            }
	        }
	    
	  }


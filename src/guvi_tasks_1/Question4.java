package guvi_tasks_1;

public class Question4 {
	//write a java program to find the smallest number in among three numbers
	  public static void main(String[] args) {
	        int num1 = 9, num2 = 6, num3 = 3;

	            if (num1 <= num2 && num1 <= num3)
	                System.out.println("Smallest number is: " + num1);
	            else if (num2 <= num1 && num2 <= num3)
	                System.out.println("Smallest number is: " + num2);
	            else
	                System.out.println("Smallest number is: " + num3);
	        }
	    

}

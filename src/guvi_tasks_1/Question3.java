package guvi_tasks_1;

public class Question3 {
	  public static void main(String[] args) {
		    //write down the program to reverse the given number using loops ,input =876 output =678
		       
		       int number = 876, reverse = 0;  
		       while(number != 0)   
		       {  
		       int remainder = number % 10;  
		       reverse = reverse * 10 + remainder;  
		       number = number/10;  
		       }  
		       System.out.println(reverse);  
		       }  
		       }


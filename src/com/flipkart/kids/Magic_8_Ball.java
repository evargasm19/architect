package com.flipkart.kids;
import java.util.Random;
import java.util.Scanner;

class Magic_8_Ball {
	
	static String usersQuestion = "a";
	static Scanner input = new Scanner(System.in);
	
	static String dormir() {
		
		while(usersQuestion != null) {
			
			
			
			  System.out.println("Ask the Magic 8-Ball a question (press enter to quit)");
			  usersQuestion = input.nextLine();
			  
			  Random random = new Random(); 
			 int randomInt = 1 + random.nextInt(2); 
			  
			  if(randomInt == 1) {
				  usersQuestion = "It is certain."; 
				 System.out.println(""+usersQuestion);
			  }
			  else 
				  if(randomInt == 2) {
					  usersQuestion ="Absolutely!";
					 System.out.println(""+usersQuestion);
				  }
			 
			  
		}
		return usersQuestion;
		 
	 }
	 public static void main(String args[])
	 {
		 System.out.println(""+ dormir() ); 
	 }
	 
}

	
	
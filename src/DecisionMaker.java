
import java.util.Scanner;

public class DecisionMaker {
		
			public static void main(String[] args) {
				/*Have the user enter an integer between 1 and 100
				/Then display a specific result based upon the range entered. 
				Step 1 we will use if/else statements
				 Condition 1- If the number is odd print the number entered and the "odd."
				 2 If integer is even and between range 2 to 25, Print "Even and less than 25."
				 3 If int is even between 26 and 60 print "Even".
				 4 If int is even and greater than 60 print number and "Even."
				 5 If int is odd and greater than 60 print number and "Odd and over 60." 
				 */
				Scanner scnr= new Scanner(System.in);


				String getUserChoice;
				do {

					System.out.print("Hello, what is your name?");

					String userName = scnr.nextLine();//next line allows you to add a complete name with the token for a space

					System.out.print("Hi " + userName + ", go ahead and enter an integer between 1 and 100: ");

					int integer = scnr.nextInt();
			
				System.out.println("You entered the integer: " + integer);

				if((integer % 2 == 1) && (integer < 60))
					System.out.println(integer + " is Odd.");
				else if ((integer % 2 == 0) && ((integer >= 2) && (integer <= 25)))
					System.out.println("is Even and less than 25.");
				else if((integer % 2 == 0) && ((integer > 25) && (integer < 61)))
					System.out.println("Even.");
				else if ((integer % 2 == 0) && (integer > 60) && (integer <= 100))
					System.out.println(integer + " is Even.");
				else if ((integer % 2 == 1) && (integer > 60) && (integer <= 100))
					System.out.println(integer + " is Odd and Over 60.");
				if(( integer <= 0) || (integer >= 101 ))
					System.out.println("Sorry, " + integer + " is not between 1 and 100.");
				
				System.out.print("Continue?(y/n):");

				getUserChoice = scnr.next(); }

			while (getUserChoice.equals("y"));
				
			}
		
		
		
		
	}

}

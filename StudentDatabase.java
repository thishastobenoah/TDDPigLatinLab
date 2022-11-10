import java.util.Scanner;
import java.util.Arrays;
public class StudentDatabase {
	public static void main (String[]args) {
		int selection = 0;
		Scanner userInput = new Scanner(System.in);
		String [] students ={"studentA","studentB","studentC","studentD","studentE","studentF","studentG","studentH","studentI","studentJ"};
		String [] hometown ={"hometownA","hometownB","hometownC","hometownD","hometownE","hometownF","hometownG","hometown","hometownI","hometownJ"};
		String [] favfood ={"favfoodA","favfoodB","favfoodC","favfoodD","favfoodE","favfoodF","favfoodG","favfoodH","favfoodI","favfoodJ"};
		try {
			System.out.print("Choose a student(1-10):");
			selection = userInput.nextInt();
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}
		
		
		
	}
}




//
//
//What will the application do?
//Provide information about students in a class of at least 10 people
//Prompt the user to ask about a particular student 
//Give proper responses according to user-submitted information 
//Ask if the user would like to learn about another student
//Validate user choices and ask again if they provide an invalid number or information type.
//
//Build Specifications
//Store the information about students in three "parallel" arrays: one for name, one for hometown, and one for favorite food
//Account for invalid user input with exceptions 
//Try to incorporate IndexOutOfBoundsException
//
//Grading Criteria:
//There are ten possible points:
//Three "parallel" arrays containing information about students: one for name, one for hometown, and one for favorite food
//Prompt to select a specific student and returns the specified student
//Prompt includes validation of input for a valid student upon selection
//Prompt will continue to ask for valid student selection in a loop until valid input is provided
//Prompt that will select specified hometown or favorite food for specified student
//Prompt includes validation of input for hometown or favorite food prompt
//Prompt will continue to ask for valid hometown or favorite food in a loop until valid input is provided
//Incorporates IndexoutOfBoundsException in an appropriate way
//Asks if user would like to know more, and behaves appropriately upon input
//Prompt includes validation of input for prompt to know more information

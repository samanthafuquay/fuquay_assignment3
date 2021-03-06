package fuquay_problem1;
import java.security.SecureRandom;
import java.util.Scanner; 
//used geeksforgeeks.com to learn to use the random number generator 
public class CAI1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		quiz();
		scan.close();
	}

	
	public static void quiz() {
		int helper =0;
		SecureRandom rand = new SecureRandom(); 
		int num_one = rand.nextInt(10); 
        int num_two = rand.nextInt(10);
        int correctAnswer = num_one * num_two; 
        while(helper ==0) {
        askQuestion(num_one, num_two);
        int studentAnswer= readResponse();
        helper =isAnswerCorrect(studentAnswer, correctAnswer, helper);
        }
        System.exit(0);
	}
	
	public static void askQuestion(int num_one, int num_two) {
		System.out.printf("What is %d times %d?\n", num_one, num_two);
		
	}
	
	public static int readResponse() {
		int studentAnswer = scan.nextInt();
		return studentAnswer;
	}
	
	public static int isAnswerCorrect(int studentAnswer, int correctAnswer, int helper) {
		if(studentAnswer == correctAnswer) {
			displayCorrectResponse();
			helper =1;
			return helper;	
		}
		else {
			displayIncorrectResponse();
			return helper;
		}
	}
	
	public static void displayCorrectResponse(){
		System.out.println("Very good!");
	}
	
	public static void displayIncorrectResponse(){
		System.out.println("No. please try again!");
	}
}
	/*
	-quiz method:
	Create 2 random numbers with the SecureRandom object between 0-9
	contains program logic
	
	-askQuestion method:
	prints the problem to the screen "How much is _ times _?"
	
	-readResponse method:
	that reads the answer from the user
	
	- isAnswerCorrect method:
	that checks to see if students answer is correct
	program terminates if correct.
	The program shall continue to ask the student to solve the original multiplication 
	problem until the student provides the correct answer
	
	- method displayCorrectResponse
	 display the message "Very good!" 
	 
	- method displayIncorrectResponse
	 display the message "No. Please try again." 
	 
	 -main method:
	 runs your program by calling the quiz method.

	*/


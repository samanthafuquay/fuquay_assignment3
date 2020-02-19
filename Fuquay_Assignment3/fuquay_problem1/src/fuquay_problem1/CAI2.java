package fuquay_problem1;

	import java.security.SecureRandom;
	import java.util.Scanner; 
	//used geeksforgeeks.com to learn to use the random number generator 
	public class CAI2 {
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
			SecureRandom rand = new SecureRandom(); 
			int snum = rand.nextInt(4)+1; 
			switch(snum) {
			case 1:
				System.out.println("Very good!");
				break;
			case 2:
				System.out.println("Excellent!");
				break;
			case 3:
				System.out.println("Nice work!");
				break;
			case 4:
				System.out.println("Keep up the good work!");
				break;
			default:
				System.out.println("System malfunction please try again");
				break;
			
			}
		}
		
		public static void displayIncorrectResponse(){
			SecureRandom rand = new SecureRandom(); 
			int snum = rand.nextInt(4)+1; 
			switch(snum) {
			case 1:
				System.out.println("No. please try agian!");
				break;
			case 2:
				System.out.println("Wrong. Try once more.");
				break;
			case 3:
				System.out.println("Don't give up!");
				break;
			case 4:
				System.out.println("No. Keep trying.");
				break;
			default:
				System.out.println("System malfunction please try again");
				break;
			
			}
		}
	
}
/*

Use random-number generation to choose a number from 1 to 4 that will be used to
 select one of the four appropriate responses to each correct or incorrect answer.
  Use a switch statement to issue the responses.
*/
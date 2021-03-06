package fuquay_problem1;

	import java.security.SecureRandom;
	import java.util.Scanner; 
	//used geeksforgeeks.com to learn to use the random number generator 
	public class CAI4 {
		static Scanner scan = new Scanner(System.in);
		public static void main(String[] args) {
			quiz();
			scan.close();
		}

		
		public static void quiz() {
			int numcorrectans =0;
			int studentlevel = readDifficulty();
	        for(int i =0; i<10; i++) {
				int num_one = generateQuestionArguemnt(studentlevel);
		        int num_two = generateQuestionArguemnt(studentlevel);
		        float correctAnswer = num_one * num_two;
	        	askQuestion(num_one, num_two);
	        	float studentAnswer= readResponse();
	        	numcorrectans =isAnswerCorrect(studentAnswer, correctAnswer, numcorrectans);
	        	
	        }
	        displayCompletionMethod(numcorrectans);
	        
	        System.out.println("Please press one if you would like a new problem set or press 0 to exit");
	        int help = scan.nextInt();
	        if(help == 1) {
	        	restartprogram();
	        }
	        else {
	        System.exit(0);
	        }
		}
		public static int generateQuestionArguemnt(int difficultLevel) {
			SecureRandom rand = new SecureRandom(); 
			switch(difficultLevel) {
			case 1:
				int rannumone = rand.nextInt(10);
				return rannumone;
			case 2:
				int rannumtwo = rand.nextInt(100);
				return rannumtwo;
			case 3:
				int rannumthree = rand.nextInt(1000);
				return rannumthree;
			case 4:
				int rannumfour = rand.nextInt(10000);
				return rannumfour;
			default:
				System.out.println("Sorry that is not a valid choice level 1 will be assigned");
				int rannumfive = rand.nextInt(10);
				return rannumfive;
			}
		}
		
		public static void askQuestion(int num_one, int num_two) {
			System.out.printf("What is %d times %d?\n", num_one, num_two);
			
		}
		
		public static float readResponse() {
			float studentAnswer = scan.nextFloat();
			return studentAnswer;
		}
		public static int readDifficulty() {
			System.out.println("Please enter a difficultly level of 1,2,3 or 4");
			int difficultyLevel = scan.nextInt();
			return difficultyLevel;
		}
		
		public static int isAnswerCorrect(float studentAnswer, float correctAnswer, int numcorrectans) {
			if(studentAnswer == correctAnswer) {
				displayCorrectResponse();
				numcorrectans ++;
				return numcorrectans;	
			}
			else {
				displayIncorrectResponse();
				return numcorrectans;
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
		public static void displayCompletionMethod(int numcorrectans){
			float percentcorrect = (numcorrectans *100 )/ 10;
			if(percentcorrect < 75) {
				System.out.println("Your score is  " +percentcorrect+"%");
				System.out.println("Please ask your teacher for extra help.");
			}
			else {
				System.out.println("Your score is  " +percentcorrect+"%");
				System.out.println("Congratulations, you are ready to go to the next level!");
			}
		}
		public static void restartprogram() {
			quiz();
		}

}
/*
Modify the program from Part 3 to allow the user to enter a difficulty level.
At a difficulty level of 1, the program should use only single-digit numbers in the problems; 
at a difficulty level of 2, numbers as large as two digits, and so on. Allow for four levels of 
difficulty.
create a function called "readDifficulty" that reads the difficulty levelfrom the student
create a function called "generateQuestionArgument" that uses the difficulty level to generate
 a random number
 

*/
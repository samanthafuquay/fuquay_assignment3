package fuquay_problem1;

	import java.security.SecureRandom;
	import java.util.Scanner; 
	//used geeksforgeeks.com to learn to use the random number generator 
	public class CAI5 {
		static Scanner scan = new Scanner(System.in);
		public static void main(String[] args) {
			quiz();
			scan.close();
		}

		
		public static void quiz() {
			int numcorrectans =0;
			int studentlevel = readDifficulty();
			int problemType = readProblemType();
			if(problemType == 5) {
				for(int i=0; i<10; i++) {
					SecureRandom rand = new SecureRandom(); 
					problemType = rand.nextInt(4)+1; 
					int num_one = generateQuestionArguemnt(studentlevel);
			        int num_two = generateQuestionArguemnt(studentlevel);
			        float correctAnswer = correctAnswer(num_one, num_two, problemType);
		        	askQuestion(num_one, num_two, problemType);
		        	float studentAnswer= readResponse();
		        	numcorrectans =isAnswerCorrect(studentAnswer, correctAnswer, numcorrectans);
				}
				
			}
			else {
	        for(int i =0; i<10; i++) {
				int num_one = generateQuestionArguemnt(studentlevel);
		        int num_two = generateQuestionArguemnt(studentlevel);
		        float correctAnswer = correctAnswer(num_one, num_two, problemType);
	        	askQuestion(num_one, num_two, problemType);
	        	float studentAnswer= readResponse();
	        	numcorrectans =isAnswerCorrect(studentAnswer, correctAnswer, numcorrectans);
	        	
	        }
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
		
		public static void askQuestion(int num_one, int num_two, int problemType) {
			switch (problemType){
			case 1:
				System.out.printf("What is %d plus %d?\n", num_one, num_two);
				break;
			case 2:
				System.out.printf("What is %d times %d?\n", num_one, num_two);
				break;
			case 3:
				System.out.printf("What is %d minus %d?\n", num_one, num_two);
				break;
			case 4:
				System.out.printf("What is %d divided by %d?\n", num_one, num_two);
				break;
			default:
				break;	
			}
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
		public static int readProblemType() {
			System.out.println("Please pick a type of arithmetic problem to study\n"
					+ "Press 1 for addition\n"
					+ "press 2 for multiplication\n"
					+ "Press 3 for subtraction\n"
					+ "Press 4 for divison\n"
					+ "Press 5 for a random mixture of problems");
			int problemType = scan.nextInt();
			return problemType;
		}
		public static float correctAnswer(int num_one, int num_two, int problemType) {
			float correctAnswer =0;
			switch (problemType) {
			case 1:
				correctAnswer = num_one + num_two;
				return correctAnswer;
			case 2:
				correctAnswer = num_one * num_two;
				return correctAnswer;
			case 3: 
				correctAnswer = num_one - num_two;
				return correctAnswer;
			case 4:
				correctAnswer = num_one / num_two;
				return correctAnswer;
			default:
				return correctAnswer;	
			}
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
allow the user to pick a type of arithmetic problem to study. An option 1 means additon problems only,
2 means multiplication problems only, 3 means subtraction problems only, 4 means division problems only
and 5 means a random mixture of all these types
the program shall ask the student to enter a problem type of 1,2,3,4 or 5 with appropriate human-readable
label
the program shall ask the student to solve 10 different problems, as determined by the problem type
create a method called "readProblemType" that reads the diffiuclty level from the student

*/
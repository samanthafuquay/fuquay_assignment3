package fuquay_problem1;

public class Application {
	public static void main(String[] args) {
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		String dataFile = "problem1.txt";
		String outputfile = "unique_words.txt";
		duplicateRemover.remove(dataFile);
		duplicateRemover.write(outputfile);
	}
}

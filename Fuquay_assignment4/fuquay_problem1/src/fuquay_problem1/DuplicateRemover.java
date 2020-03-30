package fuquay_problem1;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemover {
public static Set<String> uniqueWords;
public static List<String> input = new ArrayList<String>();

	public  void remove(String dataFile) {
		//reading in the file
		Scanner sc = null;
		try {
		sc = new Scanner(new File(dataFile));
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("The file is not found");
			System.exit(0);
		}
		while(sc.hasNext()){
			input.add(sc.next());
		}
		uniqueWords = new HashSet<String>(input);
		sc.close();
	}
	public void write(String outputfile) {
		try {
		File f = new File(outputfile);
		if(!f.exists()) {
				f.createNewFile();
		}
		PrintWriter pw = new PrintWriter(new FileOutputStream(outputfile,false));
		System.out.println("Are we getting here ?");
		pw.println("did it overwrite?");
		pw.print(uniqueWords);
		pw.close();
		
		} 
		catch (IOException e) {
			System.out.println("An IOException has occured");
				e.printStackTrace();
				System.exit(0);
			}	
			
			
		}
		
	}




//you can consider a words to be any sequence of characters separated by whitespace
//you must handle any exceptions that will be thrown within the method that throws them
//you are not aloud to put throws exceptions to your method signatures

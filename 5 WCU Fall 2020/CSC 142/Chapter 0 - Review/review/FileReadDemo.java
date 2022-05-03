import java.util.Scanner;
import java.io.*;
public class FileReadDemo{
public static void main(String [] args) throws IOException
{
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter the name of a file:  ");
	String filename = keyboard.nextLine();
	File inputFile = new File (filename);
	if(!inputFile.exists()){
		System.out.println("The file is not found.");
		System.exit(0);
	}
	Scanner input = new Scanner(inputFile);
	while(input.hasNext()){
	String content = input.nextLine();
	System.out.println(content);
	}
	input.close();
}
}



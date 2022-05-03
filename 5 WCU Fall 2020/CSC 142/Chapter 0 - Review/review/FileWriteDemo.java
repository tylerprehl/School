import java.util.Scanner;
import java.io.*;
public class FileWriteDemo{
public static void main(String [] args) throws IOException
{
	String filename, friendName;
	int numFriends;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("How many friends do you have? ");
	numFriends = keyboard.nextInt();
	keyboard.nextLine();
	System.out.print("Enter the filename: ");

	filename = keyboard.nextLine();
	System.out.println("Data Written to the file. ");

	PrintWriter outputFile = new PrintWriter(filename); 
//	 replace line 17 by the following two lines:
//   FileWriter fwriter = new FileWriter (filename, true); 
//	PrintWriter outputFile = new PrintWriter(fwriter);
   
	for (int i = 0; i<numFriends; i++)
	{		
		System.out.print("Enter the name of friend " + "number " + (i+1) + ":"); 
		friendName = keyboard.nextLine();
		outputFile.println(friendName);
	}
	outputFile.close();
}
}
//	PrintWriter outputFile = new PrintWriter(filename); writing by overwriting


//	FileWriter fwriter = new FileWriter (filename, true); writing by appending
//	PrintWriter outputFile = new PrintWriter(fwriter);




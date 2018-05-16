 /*
 * Sarah Hall
 * CSCI 232
 * Homework 1 assignment
 */

package homework1;
import java.util.Scanner;
import java.io.*;

public class homework1 {
	
	public static void main(String[] args) { 
		
		try { //the try and catch thing to tell if the fiel is actually there
		@SuppressWarnings("resource")
			Scanner file = new Scanner(new File("input.txt")); //making a new file blah bal whatever
			while(file.hasNextLine()) { //while there's actually something IN the file we can do this shit
				String line = file.nextLine(); //I converted the file into a string because that makes it super easy to chop up all nice
				String words[] = line.split(" ");//made an array for our strings hmhmhmhm
				for(int i = 0; i < words.length; i++) {//runnin through the array
					System.out.println(words[i]); //printing everything nice
				}
			}
		}
		catch (FileNotFoundException e) { //boring shit
            System.out.println("File not found");
	
		}
	}
}
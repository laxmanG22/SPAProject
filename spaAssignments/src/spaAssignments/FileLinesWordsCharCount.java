package spaAssignments;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLinesWordsCharCount {
	private static String path="/Users/saiku/OneDrive/Desktop/Laxman/Files/NationalAnthem.txt";
	public static void main(String[] args) {
		int charCount=0;
		int wordCount=0;
		int lineCount=0;
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(path));
			String currLine=reader.readLine().trim();
			
			while(currLine!=null) {
				
				lineCount++;
				
				String words[]=currLine.split(" ");
				wordCount = wordCount + words.length;
				
				for(String word:words) {
					charCount=charCount+ word.length();
				}
				currLine=reader.readLine();
			}
			
			System.out.println("Total Lines     :"+lineCount);
			System.out.println("Total Words     :"+wordCount);
			System.out.println("Total Characters:"+charCount);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

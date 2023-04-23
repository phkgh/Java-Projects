package HK_Assg5_java;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;


public class Analysis {
	
	
	int Stringlength;
	ArrayList<String> s = new ArrayList<>();
	ArrayList<String> result;
	ArrayList<String> newWord = new ArrayList<>();
	ArrayList<Integer> value = new ArrayList<>();
	int count;
	String element;
	String hem;
	int o;
	int r;
	
	
	InputFile classObject2 = new InputFile();	
																			//for sorting the array list
	private ArrayList<String> sortArraylist() {
		
		Collections.sort(result);											
		
		return result;
	}
	
																	        //for calculating the word frequency 
	private void frequency() {
		int k = result.size();
		int j;
		for (int i=0; i<k; i ++) {
			element = result.get(i);
			
			if (!newWord.contains(element)) {
				newWord.add(element);
			}
		}
		
		int m = newWord.size();
																			//calculating the no. of times each word is repeated
		for (j =0;j<m; j++) {
			hem = newWord.get(j);
			
			int freq = Collections.frequency(result,hem);
			
			value.add(freq);
		}
		
		
	}
	
																		    //for checking if the given word is a Palindrome
	private boolean palindrome_Of_String(String w) {			
		
		Stringlength = w.length();
		o = Stringlength -1;
		r = Stringlength;
		String rev = "";
		int p;
		
		for(p = o ; p >=0; p--)
		{
			rev = rev + w.charAt(p);										//input strings are reversed and compared
			
			while(w.equals(rev)){
				
				return true;
			}	
		}	
				
	return false;
	}
	
																			//for displaying the word, it's frequency, and if it is a Palindrome
	private void display() {
		int i;
		
		System.out.println("Word		Frequency		Palindrome");
		System.out.println("---------------------------------------");
		for (i = 0; i<newWord.size(); i++)
			System.out.println(newWord.get(i)+"		"+ value.get(i)+"		"+palindrome_Of_String(newWord.get(i)));	
				
	}
	

	
	public void driverFunction() throws FileNotFoundException
	{
		result = classObject2.buildList();
		sortArraylist();
		frequency();
		display();
	}
	
	
}



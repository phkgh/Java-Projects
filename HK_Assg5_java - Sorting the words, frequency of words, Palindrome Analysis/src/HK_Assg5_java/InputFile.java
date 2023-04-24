package HK_Assg5_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputFile {
	
	ArrayList<String> responses;
	
	ArrayList<String> list = new ArrayList<>();
	
	public ArrayList<String> buildList() throws FileNotFoundException
	{
		
		ArrayList<String> list = new ArrayList<>();						//opening the input file
		Scanner inFile = new Scanner(new File("inPoem.txt"));			//reading the input file
		
		while (inFile.hasNext())										//reading until the end of the file
			
			list.add(inFile.next());
		
		/*for (String num : list)
			System.out.println("replace done");
			num = num.replace(","," ");
			num = num.replace("."," ");*/
		
		inFile.close();													//closing the input file
		return list;
		
	}

}

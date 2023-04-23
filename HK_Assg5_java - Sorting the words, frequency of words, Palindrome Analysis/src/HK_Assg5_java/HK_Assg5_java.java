


package HK_Assg5_java;


import java.io.FileNotFoundException;

public class HK_Assg5_java {

	public static void main(String[] args)throws FileNotFoundException {
		Analysis classObject1 = new Analysis();								//creating object for Analysis class
		
		System.out.println("Poem Word Analysis");
		
		System.out.println("Opening the File");
		
		classObject1.driverFunction();										//driver method of Analysis class called
		
		System.out.println("End of results.");

	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class proj3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Encryption Level 1");
                 String temp1 = "";         // empty string invoked
         
         try
         {
        	 System.out.println("Opening input file..."); //displaying the user that the given file is being opened
        	 
        	 BufferedReader temp2 = new BufferedReader(new FileReader("Oct1.txt")); //creating a new object 'temp2' of type BufferedReader
        	 String temp3;                       //creating string variable 'temp3'
        	 System.out.println("Encrypting..."); //printing a message so that the user knows when the encryption has started
        	 
        	 if((temp3 = temp2.readLine())!=null)  //if conditions that traverses through the length of the line in the given input file
        	 {
        		 temp1 = temp1 + temp3;            //temp1 holds the file contents by the end of all iterations
        	 }
        	 temp2.close();                        //BufferedReader object 'temp2' is closed
       
         }catch(IOException e)         //the IOException has been handled
         
             {
        	    e.printStackTrace();
             }
         int t1 = temp1.length();     //the length of temp1 is stored into an integer variable t1
              String giventext = "";  //an empty string called 'giventext' has been declared to hold the incremented(by 3) and case changed string literals
         char letter;                 //declaring a character variable 'letter'
         String temp4 = "";           //declaring an empty string 'temp4'
              for(int i = 0; i < t1; i++)     //running a 'for' loop for the values from zero to (t1-1) 
              {
            	  letter = temp1.charAt(i);   //reading every character from the i'th position to 'letter'
            	  if(letter >= 'a' && letter <= 'z') //checking to find if the character read falls into the bounds of lower case english alphabet or not
            	  {
            		  letter = (char)(letter+3);     //incrementing the character by 3 letters
            		  
            		  giventext = giventext + letter;  //the incremented string literals are successively read into the string variable 'giventext'
            	  }
            	  else if(letter >= 'A' && letter <= 'Z') //checking to find if the character read falls into the bounds of upper case english alphabet or not
            	  {
            		  letter = (char)(letter + 3);   //incrementing the character by 3 letters
            		  
            		 
            		  giventext = giventext +letter;  //the incremented string literals are successively read into the string variable 'giventext'
            		  }
            	  else {
            		  giventext = giventext + letter;
            	  }
              }
              for(int i=0; i<t1; i++)
              {
            	  if(Character.isLowerCase(giventext.charAt(i)))  //if the character is lower case, we are changing it to upper case
            	  {
            		 temp4 = (String)(temp4+Character.toUpperCase(giventext.charAt(i)));
            	  }
            	  else                                            //if the character is upper case, we are changing it to lower case
            	  {
            		  temp4 = (String)(temp4 + Character.toLowerCase(giventext.charAt(i)));
            		  
            	  }
              }
          try {
        	  BufferedWriter Pen = new BufferedWriter(new FileWriter("EncryptOct1.txt")); //creating a new object 'Pen' of type BufferedReader
        	  Pen.write(temp4);                                                           //writing to temp4
        	  Pen.close();                                                                //closing 'Pen'
        	  
	  System.out.println("Encryption complete"); //prompting the user that the encryption has been completed
	  
	  
          }catch(IOException e) {
        	  e.printStackTrace();
          }
	}

}


//PROJECT 7: MOVIE SORT BY GENRE AND YEAR USING ARRAYLISTS, INHERITANCE AND FILES

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Proj7{

    public static ArrayList<ArrayList<String>> check(ArrayList<ArrayList<String>>  p){   //sorting arraylist by genres
        Collections.sort(p, new Comparator<ArrayList<String>>() {    
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {			//comparing arraylists
                if(o1.get(1).equals(o2.get(1))){
                    return o1.get(0).compareTo(o2.get(0));
    
                }
                return o1.get(1).compareTo(o2.get(1));
            }         
        });

        return p;

    }
	public static void main(String[] args) throws FileNotFoundException					
    {																			//creating arraylist variables
	ArrayList<String> list = new ArrayList<String>();
    ArrayList<ArrayList<String>>  list1 = new ArrayList<ArrayList<String>> ();
    ArrayList<ArrayList<String>>  list2 = new ArrayList<ArrayList<String>> ();
    ArrayList<ArrayList<String>>  list3 = new ArrayList<ArrayList<String>> ();
    ArrayList<ArrayList<String>>  list4 = new ArrayList<ArrayList<String>> ();
    ArrayList<ArrayList<String>>  list5 = new ArrayList<ArrayList<String>> ();
    ArrayList<ArrayList<String>>  list6 = new ArrayList<ArrayList<String>> ();
    ArrayList<ArrayList<String>>  list7 = new ArrayList<ArrayList<String>> ();


    String[] Genre = new String[]{"Adventure","Drama","Fantasy","Romance","Sci Fi","Thriller","War"};  //String Genre is created
    

	Scanner inFile = new Scanner(new File("MovieListing.txt"));										//reading inFile

	String name;
	String year,genre,rating;						//string variables created
	

    int count = 0;
	
	while (inFile.hasNext())								//read till the end of file
	{
        if (count>1){

            ArrayList<String> l = new ArrayList<String>();
		
            String data[] = inFile.nextLine().split(",");			//splitting by commas
        
            name=data[0].strip();									//stroring the data as name, year, genre, and rating
            year = data[1].strip();
            genre = data[2].strip();
            rating = data[3].strip();

            														//appending the read values to an arraylist
            l.add(name);
            l.add(year);
            l.add(genre);
            l.add(rating);
            														//comparing the genres and appending the values to their corresponding arraylists
            if (genre.equals(Genre[0])){
                list1.add(l);
            }

            else if (genre.equals(Genre[1])){
                list2.add(l);
            }

            else if (genre.equals(Genre[2])){
                list3.add(l);
            }

            else if (genre.equals(Genre[3])){
                list4.add(l);
            }

            else if (genre.equals(Genre[4])){
                list5.add(l);
            }

            else if (genre.equals(Genre[5])){
                list6.add(l);
            }

            else if (genre.equals(Genre[6])){
                list7.add(l);
            }
            else{
                System.out.println("Incorrect Genre");
            }  

        }

        else{


            list.add(inFile.nextLine().strip());

        }

        count++;												//count variable is incremented
	

	
	}
	inFile.close();												//input file closed

																//every list is fed into the 'check' method written above, to sort the arraylist

    list1 = check(list1);
    list2 = check(list2);
    list3 = check(list3);
    list4 = check(list4);
    list5 = check(list5);
    list6 = check(list6);
    list7 = check(list7);
    
    
    
    movie class3 = new movie(list,list1,list2,list3,list4,list5,list6,list7);   //calling a constructor from the 'movie' class
    class3.driver();															//calling a driver from the movie class
   
    /*System.out.println(list);
    System.out.println(list.get(0));
    System.out.println(list1);
    System.out.println(list2);
    System.out.println(list3);
    System.out.println(list4);
    System.out.println(list5);
    System.out.println(list6);
    System.out.println(list7);*/

    


    
}}
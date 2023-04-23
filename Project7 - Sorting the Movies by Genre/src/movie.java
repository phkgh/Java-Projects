
//PROJECT 7: MOVIE SORT BY GENRE AND YEAR USING ARRAYLISTS, INHERITANCE AND FILES


import java.util.ArrayList;


import javax.swing.JOptionPane;

public class movie extends super_class {
	
																							//creating array lists for each type by populating them, for further manipulation on them
	private ArrayList<ArrayList<String>>  list11 = new ArrayList<ArrayList<String>> ();
	private ArrayList<ArrayList<String>>  list22 = new ArrayList<ArrayList<String>> ();
	private ArrayList<ArrayList<String>>  list33 = new ArrayList<ArrayList<String>> ();
	private ArrayList<ArrayList<String>>  list44 = new ArrayList<ArrayList<String>> ();
	private ArrayList<ArrayList<String>>  list55 = new ArrayList<ArrayList<String>> ();
	private ArrayList<ArrayList<String>>  list66 = new ArrayList<ArrayList<String>> ();
	private ArrayList<ArrayList<String>>  list77 = new ArrayList<ArrayList<String>> ();
	String[] Genre = new String[]{"Adventure","Drama","Fantasy","Romance","Sci Fi","Thriller","War"};  //creating string array for holding the Genres
	
	public void driver() {
		
		movie_call();														//driver class for; movie method is called
		
	}
	
	public movie(ArrayList<String> a0,ArrayList<ArrayList<String>> a1,ArrayList<ArrayList<String>> a2,ArrayList<ArrayList<String>> a3,ArrayList<ArrayList<String>> a4,ArrayList<ArrayList<String>> a5,ArrayList<ArrayList<String>> a6,ArrayList<ArrayList<String>> a7 ){
				//populating the private variables by parameters passed when the constructor was called
		super(a0.get(0),a0.get(1));				//super class is called - director and composer values are populated
		list11 = a1;
		list22 = a2;
		list33 = a3;
		list44 = a4;
		list55 = a5;
		list66 = a6;
		list77 = a7;
		
	}
	

	private void movie_call() {
		
		String option = JOptionPane.showInputDialog("Director/Composer Movies"+"\n\nDirector:     "+getdirector()+"\nComposer:  "+getcomposer()
						    +"\n\nWhich genre would you like:"
						    
						    +"\n\n1. Adventure " + 
							"\n2. Drama" + 
							"\n3. Fantasy" +
							"\n4. Romance" +
							"\n5. Sci Fi" +
							"\n6. Thriller" +
							"\n7. War"+
						    "\n\nYour choice:");  //display to user, the options to choose
		
		int selectedOption = Integer.parseInt(option); //selected option of the user is stored in a variable

	    if (selectedOption == 2){						// Drama genre movies are displayed
	        String output = "";

	        for (int i=0;i<list22.size();i++){
	            String message = "";
	            for (int j=0;j<list22.get(i).size();j++){
	                if (j!=2){
	                    message = message +"  " + list22.get(i).get(j);
	                }
	            }
	            output = output + message.strip() + "\n";
	        }



	        JOptionPane.showMessageDialog(null,"Director:  "+ getdirector()+"\nComposer:  "+getcomposer()+"\n\nGenre : "+Genre[selectedOption-1]+"\n\nMovie Title                          Year Released            Rating"+"\n"+output);
	    }
	    
	    else if (selectedOption == 1){					// Adventure genre movies are displayed
	        String output = "";

	        for (int i=0;i<list11.size();i++){
	            String message = "";
	            for (int j=0;j<list11.get(i).size();j++){
	                if (j!=2){
	                    message = message +"  " + list11.get(i).get(j);
	                }
	            }
	            output = output + message.strip() + "\n";
	        }



	        JOptionPane.showMessageDialog(null,"Director:  "+ getdirector()+"\nComposer:  "+getcomposer()+"\n\nGenre : "+Genre[selectedOption-1]+"\n\nMovie Title                          Year Released            Rating"+"\n"+output);
	    }
	    
	    else if (selectedOption == 3){						// Fantasy genre movies are displayed
	        String output = "";

	        for (int i=0;i<list33.size();i++){
	            String message = "";
	            for (int j=0;j<list33.get(i).size();j++){
	                if (j!=2){
	                    message = message +"  " + list33.get(i).get(j);
	                }
	            }
	            output = output + message.strip() + "\n";
	        }



	        JOptionPane.showMessageDialog(null,"Director:  "+ getdirector()+"\nComposer:  "+getcomposer()+"\n\nGenre : "+Genre[selectedOption-1]+"\n\nMovie Title                          Year Released            Rating"+"\n"+output);
	    }
	    
	    else if (selectedOption == 4){						// Romance genre movies are displayed
	        String output = "";

	        for (int i=0;i<list44.size();i++){
	            String message = "";
	            for (int j=0;j<list44.get(i).size();j++){
	                if (j!=2){
	                    message = message +"  " + list44.get(i).get(j);
	                }
	            }
	            output = output + message.strip() + "\n";
	        }



	        JOptionPane.showMessageDialog(null,"Director:  "+ getdirector()+"\nComposer:  "+getcomposer()+"\n\nGenre : "+Genre[selectedOption-1]+"\n\nMovie Title                          Year Released            Rating"+"\n"+output);
	    }
	    
	    else if (selectedOption == 5){						// Sci Fi genre movies are displayed
	        String output = "";

	        for (int i=0;i<list55.size();i++){
	            String message = "";
	            for (int j=0;j<list55.get(i).size();j++){
	                if (j!=2){
	                    message = message +"  " + list55.get(i).get(j);
	                }
	            }
	            output = output + message.strip() + "\n";
	        }



	        JOptionPane.showMessageDialog(null,"Director:  "+ getdirector()+"\nComposer:  "+getcomposer()+"\n\nGenre : "+Genre[selectedOption-1]+"\n\nMovie Title                          Year Released            Rating"+"\n"+output);
	    }
	    
	    else if (selectedOption == 6){									// Thriller genre movies are displayed
	        String output = "";

	        for (int i=0;i<list66.size();i++){
	            String message = "";
	            for (int j=0;j<list66.get(i).size();j++){
	                if (j!=2){
	                    message = message +"  " + list66.get(i).get(j);
	                }
	            }
	            output = output + message.strip() + "\n";
	        }



	        JOptionPane.showMessageDialog(null,"Director:  "+ getdirector()+"\nComposer:  "+getcomposer()+"\n\nGenre : "+Genre[selectedOption-1]+"\n\nMovie Title                          Year Released            Rating"+"\n"+output);
	    }
	    
	    else{																	// War genre movies are displayed
	        String output = "";

	        for (int i=0;i<list77.size();i++){
	            String message = "";
	            for (int j=0;j<list77.get(i).size();j++){
	                if (j!=2){
	                    message = message +"  " + list77.get(i).get(j);
	                }
	            }
	            output = output + message.strip() + "\n";
	        }



	        JOptionPane.showMessageDialog(null,"Director:  "+ getdirector()+"\nComposer:  "+getcomposer()+"\n\nGenre : "+Genre[selectedOption-1]+"\n\nMovie Title                          Year Released            Rating"+"\n"+output);
	    }
	    





	}
	
	
	

}

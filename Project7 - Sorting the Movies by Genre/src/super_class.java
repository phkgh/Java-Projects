
//PROJECT 7: MOVIE SORT BY GENRE AND YEAR USING ARRAYLISTS, INHERITANCE AND FILES

public class super_class {
	
	protected String director1,composer1;						
	
	public super_class(String director,String composer) {				//constructor for the super class is created, and the values for director and composer are populated
		
		director1 = director;
		composer1 = composer;
		
	}
	
	public void setdirector(String director) {							//set director value
		
		director1= director;
		
	}
	
	public String getdirector() {										//director value is returned when this method is called
		return director1;
	}
	
	public void setcomposer(String composer) {							//set composer value
		composer1=composer;
		
	}
	
	public String getcomposer() {										//composer value is returned when this method is called
		return composer1;
	}
	
	

}

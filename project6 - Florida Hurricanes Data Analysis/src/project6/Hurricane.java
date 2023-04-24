

package project6;

public class Hurricane {												//class hurricane created

	private String name;
	private int category;
	private String  date;
	


																//name, date and categories are individually returned
	public String getName() {

		return name;

	}

	public String getDate() {

		return date;

	}

	public int getCategory() {

		return category;

	}

	public int getMonth() {										//splitting the data by month

		String[] month = getDate().split("[/]");

		return Integer.parseInt(month[0]);

	}

	public int getYear() {										//splitting the data by year

		String[] year = getDate().split("[/]");

		return Integer.parseInt(year[2]);

	}

	
	Hurricane(String name, int category, String date) {			//creating hurricane objects, and using this instances

		this.name = name;
		this.category = category;
		this.date = date;
		

	}
}
	
	
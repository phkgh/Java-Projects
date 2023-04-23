
package project6;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class project6 {

	public static void main(String[] args) throws FileNotFoundException {
		
		String username;
		int selection;
		CreateHurricaneObjects class1 = new CreateHurricaneObjects();					//creating objects for the classes									
		NameSort nameclass = new NameSort();
		CategorySort categoryclass = new CategorySort();
		YearSort yearclass = new YearSort();
		MonthSort monthclass = new MonthSort();
		AverageCategory average = new AverageCategory();
		ActiveYear active = new ActiveYear();
		TotalCategory totalCat = new TotalCategory();
		TotalYear totalYear = new TotalYear();
		
		class1.driver();
		
		
		username= JOptionPane.showInputDialog(" Press 1 to sort by storm name order" + 	//displaying options for user selection
				"\n Press 2 to sort by storm category" + 
				"\n Press 3 to sort by storm year " +
				"\n Press 4 to sort by storm month" +
				"\n Press 5 to sort by average storm category" +
				"\n Press 6 to sort by the most active year" +
				"\n Press 7 to sort by the aggregate total by category" + 
				"\n Press 8 to sort by the aggregate total by year" +
				"\n Press 9 exit ");
		
		selection = Integer.parseInt(username);												
		
		switch (selection) {															//selected classes will be invoked

		case 1:nameclass.driver();
			break;

		case 2:categoryclass.driver();
			break;

		case 3:yearclass.driver();
			break;

		case 4:monthclass.driver();
			break;

		case 5:average.driver();
			break;

		case 6: active.driver();
			break;

		case 7: totalCat.driver();
			break;

		case 8: totalYear.driver();
			break;
			
		case 9: System.exit(1);	
			break;

	}

	}
}


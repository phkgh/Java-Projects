
package project6;

import java.util.Arrays;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class TotalCategory {																	//for counting the number of hurricanes by their category					
	
	CreateHurricaneObjects classb = new CreateHurricaneObjects();
	Hurricane[] hurricanes = classb.getHurricanesArray();
    String[] str = new String[6];
    

    private void getCategoryCount() {
    	
        Arrays.stream(hurricanes).collect(Collectors.groupingBy(hurricaneObj -> hurricaneObj.getCategory()))
                .forEach((occurrence,
                        count) -> str[occurrence] = "Total category " + occurrence + " hurricanes: " + count.size());
        
        int Hurricane_length= hurricanes.length;
        StringBuilder builder = new StringBuilder(str.length);
        for (int i = 1; i < str.length; builder.append(str[i++]))
            builder.append("\n");
        
        
        JOptionPane.showMessageDialog(															//displaying the aggregate totals by category, for the user
                null, "Florida Named Hurricanes 1950 - 2020\n\n" +"\n"+"Aggregate Totals by Category(Saffir-Simpson scale)"+ "\n\n"+"Total Number of Named Hurricanes = "
                        + Hurricane_length + "\n" + builder.toString());
    }


    public void driver() {																		//driver function
        getCategoryCount();																		//calling the getCategoryCount method
        
    }

}
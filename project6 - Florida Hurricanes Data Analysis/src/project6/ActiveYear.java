
package project6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class ActiveYear {																		//finding the active years
	
	CreateHurricaneObjects classb = new CreateHurricaneObjects();								//creating object for the class CreateHurricaneObjects
	Hurricane[] hurricanes = classb.getHurricanesArray();	
    
    Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

    private void getYearCount() {																//calculating the no. of storms appeared in a year

        
        Arrays.stream(hurricanes).collect(Collectors.groupingBy(hurricaneObj -> hurricaneObj.getYear()))
                .forEach((occurrence, count) -> hashMap.put(occurrence, count.size()));
        
        
        String[] tempStr = new String[hashMap.size()];
        int maxVal = Collections.max((hashMap.values()));
        int i = 0;
        for (java.util.Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == maxVal) {
                tempStr[i] = entry.getKey().toString();
                i++;
            }
        }
        displayOutput(tempStr);
    }


    private void displayOutput(String[] str) {														//displaying the output for the user

        StringBuilder builder = new StringBuilder(str.length);
        for (int i = 0; i < str.length && str[i] != null; builder.append(str[i++]))
            if (i > 0) {
                builder.append(" and ");
            } else if (i > 1) {
                builder.append(", ");
            }
               JOptionPane.showMessageDialog(null,
                "Major Florida Hurricanes 1950 - 2020\n\n" + "Most active storm year\n\n" +"Most active storm year is tied with "+ builder.toString() +" each having"
                        + Collections.max((hashMap.values())) + " named Storms.");
    }

    public void driver() {																			//driver function
        getYearCount();
       
    }

}
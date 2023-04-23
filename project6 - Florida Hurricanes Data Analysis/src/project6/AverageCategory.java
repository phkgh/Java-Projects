

package project6;

import javax.swing.JOptionPane;

public class AverageCategory {															//for calculating the average category

    
	CreateHurricaneObjects classb = new CreateHurricaneObjects();
	Hurricane[] hurricanes = classb.getHurricanesArray();
	
	public void driver() {																//driver function to call the calculateAverage

    	calculateAverage();

    }
	
    private float getTotal() {															//calculating the total of the storm categories
        int total = 0;
        for (int i = 0; i < hurricanes.length; i++) {
            total = total + hurricanes[i].getCategory();
        }

        return total;

    }

    private void calculateAverage() {													//average calculated
        double d = getTotal() / hurricanes.length;
        String e = String.format("%.1f",d);
        
        JOptionPane.showMessageDialog(null, "Florida Named Hurricanes 1950 - 2020\n\n" + "Average Storm Category by Saffir-Simpson scale\n\n"+"Average Storm Category is :"+e);
        

    }

    
}
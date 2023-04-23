

package project6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class TotalYear {																		//class total year
	
	
	CreateHurricaneObjects classb = new CreateHurricaneObjects();
	Hurricane[] hurricanes = classb.getHurricanesArray();
	Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
   
    
    private void getYearCount() {																//counting the number of storms in a given year	
        
    	Arrays.stream(hurricanes).collect(Collectors.groupingBy(hurricaneObj -> hurricaneObj.getYear()))
                .forEach((occurrence, count) -> hashMap.put(occurrence, count.size()));
        
    	displayOutput();
    	
    }

    
    private void displayOutput() {																//displaying the output for the user

        JFrame frame = new JFrame("Aggregate totals by Year");
        JTable table = new JTable();
        DefaultTableModel tableModel = new DefaultTableModel(0, 0);
        String[] header = { "Year", "Number of Storms" };

        frame.add(new JScrollPane(table));
        tableModel.setColumnIdentifiers(header);

        table.setModel(tableModel);
        for (java.util.Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int occurrence = entry.getKey();
            int count = entry.getValue();

            tableModel.addRow(new Object[] { occurrence, count });

        }

        setProperties(frame);

    }

    private void setProperties(JFrame frame) {													//for printing as a table

        frame.setSize(300, 300);
        frame.pack();
        frame.setVisible(true);
        frame.setFocusable(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    public void driver() {																		//driver function
        getYearCount();

    }
}
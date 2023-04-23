
package project6;

import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class YearSort {																						//sorting the data by years
	
	
	CreateHurricaneObjects classb = new CreateHurricaneObjects();											//creating object for the class CreateHurricaneObjects
	Hurricane[] hurricanes = classb.getHurricanesArray();								
  
  File path;
  String name;
	int selectionp;

  
  private void getSortOrder() {														
  																										//asking user to select an option

  	name= JOptionPane.showInputDialog("Press 1 for Ascending order" + "\n" + "\n" +
				"Press 2 for descending order");
	
	selectionp = Integer.parseInt(name);
	
	if (selectionp == 1) {																					//ascending order
		sortAscending();
	}
	else {
		sortDescending();																					//descending order
	}
      

  }

 
  private void sortAscending() {																			//sorting in the ascending order

      Arrays.sort(hurricanes, (first, second) ->

      Integer.compare(first.getYear(), (second.getYear()))

      );

      displayOutput("Hurricane Years in Ascending Order");

  }

  
  private void sortDescending() {																			//sorting in the descending order

      Arrays.sort(hurricanes, (first, second) ->

      Integer.compare(second.getYear(), (first.getYear()))

      );

      displayOutput("Hurricane Year in Descending Order");
  }

  
  private void displayOutput(String sortType) {															//displaying the output

      JFrame frame = new JFrame(sortType);
      JTable table = new JTable();
      DefaultTableModel tableModel = new DefaultTableModel(0, 0);
      String[] header = { "Name", "Category", "Date" };

      frame.add(new JScrollPane(table));
      tableModel.setColumnIdentifiers(header);

      table.setModel(tableModel);

      for (int i = 0; i < hurricanes.length; i++) {

          String name = hurricanes[i].getName();
          int category = hurricanes[i].getCategory();
          String date = hurricanes[i].getDate();

          tableModel.addRow(new Object[] { name, category, date });
      }

      setProperties(frame);
      writeOutput(table);
    

  }

  private void setProperties(JFrame frame) {

      
      frame.setSize(300, 300);
      frame.pack();
      frame.setVisible(true);
      frame.setFocusable(true);
      frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

  }


  private void writeOutput(JTable table) {																//output file is created and the results are printed to it
      try {
          PrintWriter p = new PrintWriter(new File("SortByYearPappu.txt"));

          for (int j = 0; j < 3; j++) {
              p.print(table.getModel().getColumnName(j) + "\t\s\s");
          }

          p.print("\n\n\n\n");
          for (int i = 0; i < table.getRowCount(); i++) {
              for (int j = 0; j < table.getColumnCount(); j++) {

                  Object str = table.getModel().getValueAt(i, j);
                  p.print(str.toString().replaceAll("\s", "") + "\t\t");

              }
              
              p.print("\n________________\n");
          }
          p.close();

      } catch (IOException e) {

          JOptionPane.showMessageDialog(null, "An error has occurred!", "Error!", JOptionPane.INFORMATION_MESSAGE);
      }

  }

  

  public void driver() {																					//driver function

      getSortOrder();

  }
}
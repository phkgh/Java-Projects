

import javax.swing.JOptionPane;


public class assignment2_Dialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		double num1, num2;
		String user_input;
		
		
		//prompt the user for entering the inputs
		
		user_input = JOptionPane.showInputDialog("\nPlease enter for num1: " );
		num1 = Double.parseDouble(user_input);
	
		user_input = JOptionPane.showInputDialog("\nPlease enter for num2: " );
		num2 = Double.parseDouble(user_input);
		
		
		
		//create object
		//create an operation with a default constructor
		Calculator calculator1 = new Calculator();
		
		
		//display
		//call methods to perform operations
		
		JOptionPane.showMessageDialog(null, "\nThe Calculator Program");
		
		double a = (double) calculator1.getValue();
		
		JOptionPane.showMessageDialog(null,"\nInitial Value is:" + a);
														
		calculator1.add(num1);
		
		double b = (double) calculator1.getValue();
		
		JOptionPane.showMessageDialog(null,"\naddition is:" + b);
		
		calculator1.multiply(3.0);
		
		double c = (double) calculator1.getValue();
		
		JOptionPane.showMessageDialog(null,"\nAfter multiplying:" + c);
		
		calculator1.subtract(num2);
		
		double d = (double) calculator1.getValue();
		
		JOptionPane.showMessageDialog(null,"\nAfter subtracting with num2 is:" + d);
		
		calculator1.divide(2.0);
		
		double e = (double) calculator1.getValue();
			
		JOptionPane.showMessageDialog(null,"\nAfter dividing by 2.0 is:" + e);	
				
		calculator1.clear();
		
		double f = (double) calculator1.getValue();
		
		JOptionPane.showMessageDialog(null,"\nFinal Value is:" + f);
		
		JOptionPane.showMessageDialog(null, "\nEnd of results");						
		
	}

}

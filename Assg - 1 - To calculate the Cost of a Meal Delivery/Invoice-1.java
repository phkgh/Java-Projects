


import javax.swing.JOptionPane;
public class Invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//variables
		String username; //read input from JOptionPane
		float subtotal;  //user given
		String str;      //declaration to work with JOptionPane
		float n;         //variable to catch a value for the 'tip percentage'
		float tip;       //declaration of variable for tip
		float grand_total; //declaration of variable for grand total calculation
		
		
		//prompt the user for input
		
		username = JOptionPane.showInputDialog("Enter the username please: ");
		
		//prompt the user for subtotal amount
		
		str = JOptionPane.showInputDialog("Hello " + username + 
			   "\nPlease enter your subtotal amount: $");
		subtotal = Integer.parseInt(str); //parsing the user given string to subtotal of type int
		
		float a = (float)(subtotal*0.15); //variable declaration to help with the calculations
		float b = (float)(subtotal*0.20); //variable declaration to help with the calculations 
		float c = (float)(subtotal*0.25); //variable declaration to help with the calculations	
		float tax = (float)(subtotal*0.065); //declaring and calculating tax
		float delivery_fee = (float)(subtotal*0.10); //delivery fee calculation

		//prompt the user to enter a tip amount
		str = JOptionPane.showInputDialog("Suggested Tip Amounts:" +
		       "\n15% = $" + a +
		       "\n20% = $" + b +
		       "\n25% = $" + c +
		       "\n\nEnter the Tip%:");
		n = Integer.parseInt(str); //parsing the user given string to variable 'n' of type int
		tip = (float)(subtotal*(n/100)); //user specific tip calculation
		grand_total = subtotal+tax+delivery_fee+tip;	//grand total calculation	
				                       
		//displaying the total delivery cost to the user, as a message dialog box		
		JOptionPane.showMessageDialog(null, "\nYour Delivery Cost:" +
                "\n\nSubtotal = $" + subtotal +
                "\nTax = " + tax +
                "\nDelivery Fee = " + delivery_fee +
                "\nTip Amount = " + tip +
                "\n-------------------" +
                "\nTotal Due = $" + grand_total);
                		      			
		
		
		
	}

}

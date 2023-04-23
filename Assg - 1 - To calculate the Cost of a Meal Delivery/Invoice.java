

import javax.swing.JOptionPane;
public class Invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//variables
		String username; //read input from JOptionPane
		float subtotal;  //user given
		String str;
		float n;
		float tip;
		float grand_total; 
		
		
		//prompt the user for input
		
		username = JOptionPane.showInputDialog("Enter the username please: ");
		str = JOptionPane.showInputDialog("Hello " + username + 
			   "\nPlease enter your subtotal amount: $");
		subtotal = Integer.parseInt(str);
		
		float a = (float)(subtotal*0.15);
		float b = (float)(subtotal*0.20);
		float c = (float)(subtotal*0.25);	
		float tax = (float)(subtotal*0.065);
		float delivery_fee = (float)(subtotal*0.10);

		
		str = JOptionPane.showInputDialog("Suggested Tip Amounts:" +
		       "\n15% = $" + a +
		       "\n20% = $" + b +
		       "\n25% = $" + c +
		       "\n\nEnter the Tip%:");
		n = Integer.parseInt(str);
		tip = (float)(subtotal*(n/100));
		grand_total = subtotal+tax+delivery_fee+tip;		
				                       
				
		JOptionPane.showMessageDialog(null, "\nYour Delivery Cost:" +
                "\n\nSubtotal = $" + subtotal +
                "\nTax = " + tax +
                "\nDelivery Fee = " + delivery_fee +
                "\nTip Amount = " + tip +
                "\n-------------------" +
                "\nTotal Due = $" + grand_total);
                		      			
		
		
		
	}

}

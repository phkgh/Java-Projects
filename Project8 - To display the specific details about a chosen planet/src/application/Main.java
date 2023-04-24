

package application;
	
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup; 
import java.util.InputMismatchException; 

public class Main extends Application {
	private int out;

	@Override
	public void start(Stage primaryStage)   {
		
		String name, radius, weight, distance;																		//strings to hold the planet characteristics
		
		String[] Genre_list = new String[]{"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"}; //string array created to hold the planet names
		
		
	    ArrayList<String> l1 = new ArrayList<String>();																//array lists to store each planets data 
		ArrayList<String> l2 = new ArrayList<String>();
		ArrayList<String> l3 = new ArrayList<String>();
		ArrayList<String> l4 = new ArrayList<String>();
		ArrayList<String> l5 = new ArrayList<String>();
		ArrayList<String> l6 = new ArrayList<String>();
		ArrayList<String> l7 = new ArrayList<String>();
		ArrayList<String> l8 = new ArrayList<String>();
		

	    try {
	    
		Scanner inFile = new Scanner(new File("PlanetInfo.txt"));	//input file is read
		
	    
		while (inFile.hasNext()) 		//file is read until the last line
	    {
			ArrayList<String> l = new ArrayList<String>();  //array list created to store lines during the iterations
			
			
			
    		String data[] = inFile.nextLine().split(",");   //comma separated values are split
    		
    		name = data[0].strip();		//here data stored in the variable
            radius = data[1].strip();
            weight = data[2].strip();
            distance = data[3].strip();
            l.add(name);			
            
            l.add(radius);
            l.add(weight);
            l.add(distance);
			
            
            if (name.equals(Genre_list[0])){   				//extracting data by the planet names
            	
            	System.out.println("yes");
            	l1.addAll(l);
            	System.out.println(l1);
            }

            else if (name.equals(Genre_list[1])){
            	System.out.println("yes11");
            	l2.addAll(l);
            	System.out.println(l2);
            }

            else if (name.equals(Genre_list[2])){
            	l3.addAll(l);
            }

            else if (name.equals(Genre_list[3])){
            	l4.addAll(l);
            }

            else if (name.equals(Genre_list[4])){
            	l5.addAll(l);
            }

            else if (name.equals(Genre_list[5])){
            	l6.addAll(l);
            }

            else if (name.equals(Genre_list[6])){	            	
            	l7.addAll(l);
            }
            
            else if (name.equals(Genre_list[7])){	            	
            	l8.addAll(l);
            }
            
            else{
                System.out.println("Incorrect name");   //incorrect name message
            }

            
	    	
	    }
		} catch (FileNotFoundException e) {					//file not found exception
			    	
			    	JOptionPane.showMessageDialog(null, "File not found:"+"\n\nPlanetInfo.txt file not found","Error_Message",JOptionPane.ERROR_MESSAGE);
			    	System.exit(0);							//program terminates when the input file is not found
			    }
		
         
		RadioButton c0 = new RadioButton("Mercury");		//radio buttons are created for the planet selection
		RadioButton c1 = new RadioButton("Venus");
		RadioButton c2 = new RadioButton("Earth");
		RadioButton c3 = new RadioButton("Mars");
		
		RadioButton c4 = new RadioButton("Jupiter");
		RadioButton c5 = new RadioButton("Saturn");
		RadioButton c6 = new RadioButton("Uranus");
		RadioButton c7 = new RadioButton("Neptune");
		
		CheckBox k1 = new CheckBox("Circumference");					//check boxes are created to let the user choose planet characteristics
		CheckBox k2 = new CheckBox("Surface Area");
		CheckBox k3 = new CheckBox("Distance from the Sun");
		CheckBox k4 = new CheckBox("Corresponding weight on the planet chosen      ");
		Button submit = new Button("Submit");							//submit button created
		 
		
		VBox planets = new VBox(8,c0,c1,c2,c3,c4,c5,c6,c7);				//to ensure planets are displayed in a vertical stage
		ToggleGroup gpplanets = new ToggleGroup();						//toggle group gpplanets is created
		c0.setToggleGroup(gpplanets);									//radio buttons are added as children to the toggle group
		c1.setToggleGroup(gpplanets);
		c2.setToggleGroup(gpplanets);
		c3.setToggleGroup(gpplanets);
		c4.setToggleGroup(gpplanets);
		c5.setToggleGroup(gpplanets);
		c6.setToggleGroup(gpplanets);
		c7.setToggleGroup(gpplanets);
		c0.isSelected();
		
		c1.isSelected();												//isSelected function is being called, to perform actions
		c2.isSelected();
		c3.isSelected();
		c4.isSelected();
		c5.isSelected();
		c6.isSelected();
		c7.isSelected();
		
		
		
		
		VBox details = new VBox(5,k1,k2,k3,k4);							//details object is created for a vertical stage
		
													
		k1.isSelected();												//isSelected method is called to check the user selection
		k2.isSelected();
		k3.isSelected();
		k4.isSelected();
		
		VBox root = new VBox (13,planets,details,submit);				//all the objects are displayed in a dialog box 
		
		submit.setOnAction(e->{											//actions are performed based the user selection
			String msg = "";
			if (c0.isSelected()) {
				msg += "\nMercury:- ";
				if (k1.isSelected()) {													//circumference is calculated and displayed
					msg += "\nCircumference  :  "+ circumference(l1.get(1))+"  km";
				}
				if (k2.isSelected()) {													//surface area is calculated and displayed
					msg += "\nSurface Area  :  "+ getsurfacearea(l1.get(1))+"  km";
				}
				
				if(k3.isSelected()) {													//distance from the sun is displayed
					msg += "\nDistance from the Sun  :  "+ l1.get(3)+"  AU";
				}
				if (k4.isSelected()) {													//corresponding weight is calculated and displayed
					
					int w = inputcheck();
					System.out.println(w+1);

					msg += "\nCorrespnding Weight on the planet  :  "+ getconvweight(l1.get(2),Integer.toString(w))+"  kg";
				}
				
				
			}
			if (c1.isSelected()) {
				msg += "\nVenus : ";
				if (k1.isSelected()) {													//circumference is calculated and displayed
					msg += "\nCircumference  :  "+circumference(l2.get(1))+"  km";
					
				}
				if(k2.isSelected()) {													//surface area is calculated and displayed
					msg += "\nSurface Area  :  "+ getsurfacearea(l2.get(1))+"  km";
					
				}
				if(k3.isSelected()) {													//distance from the sun is displayed
					msg += "\nDistance from the Sun  :  "+ l2.get(3)+"  AU";
				}
				if (k4.isSelected()) {													//corresponding weight is calculated and displayed
					
					
					int w = inputcheck();
								
					
					msg += "\nconv weight  :  "+ getconvweight(l2.get(2),Integer.toString(w))+"  kg";
					
					
					
				}
			}
			if(c2.isSelected()) {															
				msg += "\nEarth :- ";
				if (k1.isSelected()) {																//circumference is calculated and displayed
					msg += "\nCircumference  :  "+ circumference(l3.get(1))+"  km";
				}
				if (k2.isSelected()) {																//surface area is calculated and displayed
					msg += "\nSurface Area  :  "+ getsurfacearea(l3.get(1))+"  km";
				}
				
				if(k3.isSelected()) {																//distance from the sun is displayed
					msg += "\nDistance from the Sun  :  "+ l3.get(3)+"  AU";
				}
				if (k4.isSelected()) {																//corresponding weight is calculated and displayed
					
					
					int w = inputcheck();
							
					msg += "\nCorresponding Weight on Planet chosen  :  "+ getconvweight(l3.get(2),Integer.toString(w))+"  kg";
					
					
					
				}
				
				
			}
			if (c3.isSelected()) {
				msg += "\nMars:- ";
				if (k1.isSelected()) {																//circumference is calculated and displayed
					msg += "\nCircumference  :  "+ circumference(l4.get(1))+"  km";
				}
				if (k2.isSelected()) {																//surface area is calculated and displayed
					msg += "\nSurface Area  :  "+ getsurfacearea(l4.get(1))+"  km";
				}
				
				if(k3.isSelected()) {																//distance from the sun is displayed
					msg += "\nDistance from the Sun  :  "+ l4.get(3)+"  AU";
				}
				if (k4.isSelected()) {																//corresponding weight is calculated and displayed
					
					
					int w = inputcheck();
							
					msg += "\nCorresponding Weight on the planet  :  "+ getconvweight(l4.get(2),Integer.toString(w))+"  kg";
					
					
					
				}
			}
			if (c4.isSelected()) {
				msg += "\nJupiter:- ";
				if (k1.isSelected()) {																//circumference is calculated and displayed
					msg += "\nCircumference  :  "+ circumference(l5.get(1))+"  km";
				}
				if (k2.isSelected()) {																//surface area is calculated and displayed
					msg += "\nSurface Area  :  "+ getsurfacearea(l5.get(1))+"  km";
				}
				
				if(k3.isSelected()) {																//distance from the sun is displayed
					msg += "\nDistance from the Sun  :  "+ l5.get(3)+"  AU";
				}
				if (k4.isSelected()) {																//corresponding weight is calculated and displayed
					
					
					int w = inputcheck();
							
					
					msg += "\nCorresponding Weight on the PLanet  :  "+ getconvweight(l5.get(2),Integer.toString(w))+"  kg";
					
					
					
				}		
			}
			if (c5.isSelected()) {
				msg += "\nSaturn:- ";
				if (k1.isSelected()) {																//circumference is calculated and displayed
					msg += "\nCircumference  :  "+ circumference(l6.get(1))+"  km";
				}
				if (k2.isSelected()) {																//surface area is calculated and displayed
					msg += "\nSurface Area  :  "+ getsurfacearea(l6.get(1))+"  km";
				}
				
				if(k3.isSelected()) {																//distance from the sun is displayed
					msg += "\nDistance from the Sun  :  "+ l6.get(3)+"  AU";
				}
				if (k4.isSelected()) {																//corresponding weight is calculated and displayed
					
					
					int w = inputcheck();
								
					
					msg += "\nCorresponding Weight on the Planet chosen  :  "+ getconvweight(l6.get(2),Integer.toString(w))+"  kg";
					
					
					
				}		
			}
			if (c6.isSelected()) {
				msg += "\nUranus:- ";
				if (k1.isSelected()) {																//circumference is calculated and displayed		
					msg += "\nCircumference  :  "+ circumference(l7.get(1))+"  km";
				}
				if (k2.isSelected()) {																//surface area is calculated and displayed
					msg += "\nSurface Area  :  "+ getsurfacearea(l7.get(1))+"  km";
				}
				
				if(k3.isSelected()) {																//distance from the sun is displayed
					msg += "\nDistance from the Sun  :  "+ l7.get(3)+"  AU";
				}
				if (k4.isSelected()) {																//corresponding weight is calculated and displayed
					
					
					int w = inputcheck();
							
					msg += "\nCorresponding Weight on the Planet chosen  :  "+ getconvweight(l7.get(2),Integer.toString(w))+"  kg";
					
					
					
				}		
			}
			if (c7.isSelected()) {
				msg += "\nNeptune:- ";
				if (k1.isSelected()) {																//circumference is calculated and displayed
					msg += "\nCircumference  :  "+ circumference(l8.get(1))+"  km";
				}
				if (k2.isSelected()) {																//surface area is calculated and displayed
					msg += "\nSurface Area  :  "+ getsurfacearea(l8.get(1))+"  km";
				}
				
				if(k3.isSelected()) {																//distance from the sun is displayed
					msg += "\nDistance from the Sun  :  "+ l8.get(3)+"  AU";
				}
				if (k4.isSelected()) {																//corresponding weight is calculated and displayed
					
					int w = inputcheck();
					
					
					msg += "\nCorresponding Weight on the Planet chosen  :  "+ getconvweight(l8.get(2),Integer.toString(w))+"  kg";
					
					
					
				}	
			}

			
			new Alert(AlertType.INFORMATION,msg,ButtonType.OK).showAndWait();			//displays the output based on the user select options
		});
		
		Scene sc = new Scene(root);														//scene object is created
		primaryStage.setScene(sc);														//scene is set
		primaryStage.setTitle("Planets list: ");										//title set
		primaryStage.show();															//for displaying the planets list
	}
	
	public int negativeinput(int r) throws NegativeInputValueException{					//negative input value exception method is created
		if (r<0) {																		//if the input is less than zero, throw the exception
			throw new NegativeInputValueException();
			
		}
		
		else {
			return r;																	//otherwise return the value
		}
		
	}
	
	public int inputcheck() {															//method to check input validity, and to throw corresponding exceptions									
		TextInputDialog textArea = new TextInputDialog();								//text input dialog object is created
		textArea.setHeaderText("Enter your Weight of Choice in numbers: ");
		textArea.showAndWait();															//user text input box is displayed
		
		
		String v = textArea.getEditor().getText();
		boolean key = false;
		try {
		int data = Integer.parseInt(textArea.getEditor().getText());					//user input value is stored in data
		out = negativeinput(data);
		key = true;																		//flag
		}
		
		catch(NumberFormatException r) {												//throws an exception for number format
			try {
				if (v == ""){															//if the user input is empty or left blank, this exception is thrown
					throw new EmptyStringException();	
						
				}
				else {
					throw new InputMismatchException();									
				}
				
			}
			
			catch (InputMismatchException t) {											//if the supposed integer input is given in word format, this exception is thrown
				
				JOptionPane.showMessageDialog(null,"Input Mismatch Error "+v,"Error!", JOptionPane.ERROR_MESSAGE);
				
				t.printStackTrace();
		
				}
			catch (EmptyStringException g) {											//empty string catch statement
				JOptionPane.showMessageDialog(null,"String is empty"+v,"Error!", JOptionPane.ERROR_MESSAGE);
				
				g.printStackTrace();
			}
			
		
		}
		
		catch (NegativeInputValueException e1) {										//when the user input is a negative value
			JOptionPane.showMessageDialog(null,"Error_Message: value is neagtive"+v,"Error!", JOptionPane.ERROR_MESSAGE);

			e1.printStackTrace();

		}
		
		if(key==false) {																//flag
			inputcheck();																//when the flag has remained false, the user input is fed back for further calculations/processes'
		}
		
		return out;																		//returns the input value, when no exceptions are caught
		
	}
	

	
	public double circumference(String l) {															
		
		final double PI = 3.14159;																	//constant variable Pi is created
		double radius = Integer.parseInt(l);														//radius values are parsed over to here
		double circum = 2*PI*radius;																//circumference is calculated	
		return circum;																				//circumference is created
	}
	
	public double getsurfacearea(String l) {														//surface area is calculated and returned here
		
			final double PI = 3.14159;
			double radius = Integer.parseInt(l);
			double surfacearea = 4*PI*(radius*radius);
			return surfacearea;
		}
	public double getconvweight(String l,String weight) {											//weight is converted to that of on earth
			
			
			double k = Double.parseDouble(l);
			double w = Double.parseDouble(weight);
			
			double conv=w*k;
			return conv;
		}
		

	
	public static void main(String[] args) {
		launch(args);
	}
}

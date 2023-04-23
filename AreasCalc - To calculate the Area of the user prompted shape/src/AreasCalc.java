import java.util.Scanner;

public class AreasCalc {

	public static void circleArea() { 
        Scanner scanner = new Scanner(System.in);                                           //a new scanner object is created
        double radius_circle;                                                                      //'radius' of type double is created
        System.out.println("");
        System.out.print("Please enter a value for the radius of the circle : ");           //prompting the user for input
        radius_circle = scanner.nextDouble();  
        while (radius_circle < 0) {                                                                //for checking the input validity, and if needed, prompt the user to re-enter a valid input
            System.out.println("The radius of a circle cannot be a negative number! Please enter a positive value.");
            System.out.print("Please enter a positive circle radius : ");
            radius_circle = scanner.nextDouble();                                                  //user entered value is scanned to the object radius
        }
     
        CircleArea circle = new CircleArea(radius_circle);                                         //an object for the class Circle is created
        double area = circle.Calculated_Area_Circle();                                                     //variable 'area' of type double is created
        area = ((double) ((int) (area * 100))) / 100;                                       //for returning a value, accurate upto 2 decimal places
        System.out.print("The area of the circle is " + area + " Square units" );                             //printing the calculated area of the circle
        scanner.close();
    }

    public static void rectangleArea() { 
        Scanner scanner = new Scanner(System.in);
        double rectangle_length, rectangle_width;                                                               //length and width of type double is created
        
        System.out.print("Please enter a value for the length of the rectangle : ");        //prompting the user for the length value
        rectangle_length = scanner.nextDouble();                                                      //'length' will hold the user given input
        while (rectangle_length < 0) {                                                                //for checking the input validity, and if needed, prompt the user to re-enter a valid input
            System.out.println("The length of a rectangle cannot be a negative number! Please enter a positive value.");
            System.out.print("Please enter a valid input for the length of the rectangle : ");
            rectangle_length = scanner.nextDouble();                                                  //user input is scanned to the variable length
        }
        System.out.print("Please enter a value for the width of the rectangle : ");			//prompting the user for the width value
        rectangle_width = scanner.nextDouble();  														//user input value is scanned to the 'width'

        while (rectangle_width < 0) { 
            System.out.println("The width of a rectangle cannot be a negative number! Please enter a positive value.");
            System.out.print("Please enter a valid input for the width of the rectangle : ");
            rectangle_width = scanner.nextDouble();
        }
        RectangleArea rectangleArCalc = new RectangleArea(rectangle_length, rectangle_width);  					//an object for the class 'Rectangle' is created
        double area = rectangleArCalc.getArea();  											//variable 'area' of type double is created
        area = ((double) ((int) (area * 100))) / 100;  										//for returning a value, accurate upto 2 decimal places
        System.out.print("The area of the rectangle is " + area +" Square units");  							//printing the calculated area of the rectangle	
        scanner.close();
    }

    public static void triangleArea() {
        Scanner scanner = new Scanner(System.in);
        double triangle_base, triangle_height; 																//variable base and height of type double is created
        System.out.println("");
        System.out.print("Please enter a value for the base of the triangle : ");			//prompting the user for the triangle's 'base' value
        triangle_base = scanner.nextDouble();  														//'base' holds the user given input
        while (triangle_base < 0) { 																	//for checking the input validity, and if needed, prompt the user to re-enter a valid input
            System.out.println("The base of a triangle cannot be a negative number! Please enter a positive value.");
            System.out.print("Please enter the correct value for the 'base' : ");
            triangle_base = scanner.nextDouble();													//user input is scanned to the 'base'
        }
        System.out.print("Enter height of triangle : ");									//prompting the user for the triangle's 'height' value
        triangle_height = scanner.nextDouble();  													//'height' holds the user given input
        while (triangle_height < 0) { 																//for checking the input validity, and if needed, prompt the user to re-enter a valid input
            System.out.println("Invalid value.Please enter the value again.");
            System.out.print("Enter height of triangle : ");
            triangle_height = scanner.nextDouble();													//user input is scanned to the 'height'
        }
        TriangleArea triangle = new TriangleArea(triangle_base, triangle_height);   							//an object for the class 'Triangle' is created
        double area = triangle.Calculated_Area_Triangle();  
        area = ((double) ((int) (area * 100))) / 100;  
        System.out.print("The area of the triangle is " + area + " Square units");  
        scanner.close();
    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Area of Circle\n2. Area of Rectangle\n3. Area of Triangle\nEnter your chosen object shape: "); //prompting the user for the desired object geometry
        int userInput = scanner.nextInt();   
        while (userInput < 1 || userInput > 3) { 
            System.out.println("Please a value in the given range:");
            System.out.print("Please enter your shape of choice: ");
            userInput = scanner.nextInt();
}     																						//user input is scanned and matched with available options
        if (userInput == 1) { 
            circleArea();
        }
        if (userInput == 2) { 
            rectangleArea();
        }
        if (userInput == 3) { 
            triangleArea();
        }
        scanner.close();
    }
}

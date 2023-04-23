public class CircleArea 					//a class for calculating the area of a circle is being created
{
    private double PI = 3.14159; 			//a private member 'pi' is created with its default value assigned
    private double radius_circle;       			//a private member 'radius' is created

    public CircleArea() { 
        this.radius_circle = 0.0;       			//setting the radius= 0.0, for this instance
    }

    public CircleArea(double radius_circle) { 
        this.radius_circle = radius_circle;      			//for accessing the user given value of the radius, for the current instance
    }

    public double getRadius() { 
        return radius_circle;             			//for returning the value of the variable named 'radius'
    }

    public void setRadius(double radius_circle) { 
        this.radius_circle = radius_circle;      			//for assigning a value to the variable 'radius'
    }
    public double Calculated_Area_Circle() { 
        return PI * radius_circle * radius_circle; 		//returns the calculated value of the circle's area
    }
}

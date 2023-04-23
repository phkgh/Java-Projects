
public class RectangleArea
{  
    private double rectangle_length, rectangle_width;  					//the 'length' and 'breadth' are created as private variables

    public RectangleArea() { 
        this.rectangle_length = 0;    						//setting the initial values of length and breadth for the current instance
        this.rectangle_width = 0;
    }

    public RectangleArea(double rectangle_length, double rectangle_width) { 
        this.rectangle_length = rectangle_length;       				//reading the user given values of length and width for the current instance
        this.rectangle_width = rectangle_width;
    }

    public double getLength() {      				//for returning the value of the variable named 'length'
        return rectangle_length;           
    }

    public void setLength(double rectangle_length) {    		//for assigning a value to the variable 'length'
        this.rectangle_length = rectangle_length;
    }

    public double getWidth() {        				//for returning the value of the variable named 'width'
        return rectangle_width;
    }

    public void setWidth(double rectangle_width) {  			//for assigning a value to the variable 'width'
        this.rectangle_width = rectangle_width;
    }

    public double getArea() {     					//calculating the area of the rectangle
        return rectangle_length * rectangle_width;
    }
}


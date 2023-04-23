
public class TriangleArea  						// a class for calculating the area of a triangle is being created
{
    private double triangle_base,triangle_height;   				// declaring the base and height to be worked with, as private variables
    TriangleArea()  							// default constructor sets the value to 0 
    {
        this.triangle_base=0;
        this.triangle_height=0;
    }
    TriangleArea(double triangle_base,double triangle_height)  	// parameterizing the constructor, so that it sets the value by the user inputs 
    {
        this.triangle_base=triangle_base;
        this.triangle_height=triangle_height;
    }
    public void setBase(double triangle_base)  			// for reading and working with the value of the base, as given by the user
    {
        this.triangle_base=triangle_base;
    }
    public void setHeight(double triangle_height)  		// for reading and working with the value of the height, as given by the user
    {
        this.triangle_height=triangle_height;
    }
    public double getBase()  					// returns the base of the triangle, in double
    {	
        return triangle_base;
    }
    public double getHeight()  					// returns the height of the triangle, in double
    {
        return triangle_height;
    }
    public double Calculated_Area_Triangle()  			 		// reutrns the area of the triangle, by the general formula --> ((1/2)*base*height)
    {
        return 0.5*triangle_base*triangle_height;
    }
}


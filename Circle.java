
/**
 * Represents a circle. Every circle created using this class has a positive radius.  Adapted from class provided by ProjectSTEM.
 *
 * https://coderunner.projectstem.org/docs/shapes/index.html
 * 
 * @author Kyle Vu
 * @version 1
 */
public class Circle
{
    private double rad;

    /**
     * Creates a circle with radius 1.0.
     */
    public Circle()
    {
        rad = 1.0;
    }
    
    /**
     * Creates a circle with specified radius.
     */
    public Circle(final double rad)
    {
        setRadius(rad);
    }

    /**
     * Sets the radius of the circle to the specified radius.
     *
     * @param  rad  the proposed new radius. This should be a positive number.
     */
    public void setRadius(final double rad)
    {
        if (rad <= 0)
        {
            this.rad = 1.0;
        }
        else
        {
            this.rad = rad;
        }
    }
    
    /**
     * Used to get the radius of the circle, which will be a positive number.
     * 
     * @return  the radius of the circle.
     */
    public double getRadius()
    {
        return rad;
    }
    
    /**
     * Calculates the area of this circle as a double.
     * 
     * @return  the area of the circle.
     */
    public double getArea()
    {
        return Math.PI * rad * rad;
    }
    
    /**
     * Calculates the circumference of this circle as a double.
     * 
     * @return  the circumference of the circle.
     */
    public double getCircumference()
    {
        return Math.PI * rad * 2;
    }
    
    /**
     * Compares this circle to the specified object. The result is true if and only if the argument is not null and is a Circle object with the same radius as this object.
     * 
     * @override    equals in java.lang.Object
     * @return      true if the given object represents a Circle with the same radius as this one, false otherwise.
     */
    @Override
    public boolean equals(Object other)
    {
        if (other == null)
        {
            return false;
        }
        
        if (! (other instanceof Circle) )
        {
            return false;
        }
        
        return this.rad == ((Circle) other).rad;
    }
    
    /**
     * A String representation of this circle. This is in the form "circle with radius r", where r is the double representing the radius of the circle to the nearest hundredth.
     * 
     * @override    toString in class java.lang.Object
     * @return      a String representation of this circle
     */
    @Override
    public String toString()
    {
        return "A circle of radius " + rad;
    }
}

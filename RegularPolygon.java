
/**
 * Represents a Regular Polygon. Every shape created using this class has an integer number of sides greater than 3 all with the same length.
 *
 * @author Kyle Vu
 * @version 1
 */
public class RegularPolygon
{
    private int num;        // The number of sides of the RegularPolygon
    private double len;     // The side length of the RegularPolygon

    /**
     * Creates an equilateral triangle with side length 1.0.
     */
    public RegularPolygon()
    {
        this(1.0);
    }
    
    /**
     * Creates a regular polygon with the given number of sides. Side lengths default to 1.0.
     * 
     * @param   num     the number of sides in the polygon.  This should be 3 or greater.
     */
    public RegularPolygon(final int num)
    {
        this(num, 1.0);
    }
    
    /**
     * Creates an equilateral triangle with the given side length.
     * 
     * @param   len     the length of each side in the polygon.  This should be positive.
     */
    public RegularPolygon(final double len)
    {
        this(3, len);
    }
    
    /**
     * Creates a regular polygon with the given number of sides and side length.
     * 
     * @param   num     the number of sides in the polygon.  This should be 3 or greater.
     * @param   len     the length of each side in the polygon.  This should be positive.
     */
    public RegularPolygon(final int num, final double len)
    {
        setSideLength(len);
        setNumSides(num);
    }

    /**
     * Sets the side length of the regular polygon to the specified length.
     * 
     * @param   len     the proposed new side length. This should be a positive number.
     */
    public void setSideLength(final double len)
    {
        this.len = 1.0;
        
        if (len > 0)
        {
            this.len = len;
        }
    }
    
    /**
     * Sets the number of sides of the regular polygon to the specified number.
     * 
     * @param   num     the proposed new number of sides. This should be 3 or greater.
     */
    public void setNumSides(final int num)
    {
        this.num = 3;
        
        if (num > 3)
        {
            this.num = num;
        }
    }
    
    /**
     * Used to get the number of sides in the polygon.
     * 
     * @return  the number of sides in the regular polygon.
     */
    public int getNumSides()
    {
        return num;
    }
    
    /**
     * Used to get the length of each side in the regular polygon.
     * 
     * @return  the side length of the regular polygon
     */
    public double getSideLength()
    {
        return len;
    }
    
    
    /**
     * Calculates the area of this regular polygon as a double.
     * 
     * @return  the area of the regular polygon.
     */
    public double getArea()
    {
        return num * len * len / 4 / Math.tan(Math.PI / num);
    }
    
    /**
     * Calculates the perimeter of this regular polygon as a double.
     * 
     * @return  the perimeter of the regular polygon
     */
    public double getPerimeter()
    {
        return num * len;
    }
    
    /**
     * Compares this regular polygon to the specified object. The result is true if and only if the argument is not null and represents a polygon with the same number of sides and side lengths as this one.
     * 
     * @override    equals in class java.lang.Object
     * @return      true if the given object represents a Rectangle with the same length and width as this one, false otherwise.
     */
    @Override
    public boolean equals(Object other)
    {
        if (other == null)
        {
            return false;
        }
        
        if (!(other instanceof RegularPolygon))
        {
            return false;
        }
        
        return num == ((RegularPolygon) other).num && len == ((RegularPolygon) other).len;
    }
    
    /**
     * Increases the number of sides in the polygon by 1. The lengths of the sides in the polygon are unaffected, with the additional side having the same length as the others so the shape remains a regular polygon.
     */
    public void addSides()
    {
        addSides(1);
    }
    
    /**
     * Increases the number of sides in the polygon by the given number. The lengths of the sides in the polygon are unaffected, with the additional side having the same length as the others so the shape remains a regular polygon.
     * 
     * @param   numExtra    the number of sides to add to the polygon.
     */
    public void addSides(final int numExtra)
    {
        num += numExtra;
    }
    
    /**
     * A String representation of this regular polygon. The string returned is in the form "regular shape_name with side length l", where l is the length of each side, and shape_name is the correct polygon name for shapes between 5 and 20 sides inclusive. For shapes with more sides the phrase "polygon of n sides", where n is the number of sides, is used. For shapes of side 3 the string returned is "equilateral triangle with side length l", and for shapes of side 4 the string returned is "square with side length l".
     * 
     * @override    toString in class java.lang.Object
     * @return      a String representation of this polygon.
     */
    public String toString()
    {
        final String[] names = {"pentagon", "hexagon", "heptagon", "octagon", "enneagon", "decagon", "hendecagon", "dodecagon", "tridecagon", "tetradecagon", "pentadegacon", "hexadecagon", "heptadecagon", "octadecagon", "enneadecagon", "icosagon"};
        if (num == 3)
        {
            return "equilateral triangle with side length " + len;
        }
        else if (num == 4)
        {
            return "square with side length " + len;
        }
        else if (num <= 20)
        {
            return "regular " + names[num-5] + " with side length " + len;
        }
        else
        {
            return "polygon of " + num + " sides with side length " + len;
        }
    }
}

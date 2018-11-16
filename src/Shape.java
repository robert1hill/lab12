import java.awt.Color;
import java.awt.Point;


/**
 *  This is the base code for all shapes. Pretty sick
 * @author Robert
 *
 */
public abstract class Shape implements Drawable
{
    
    /**
     * generic instance variables. will be helpful later.
     */
    protected Point[] location;
    private Color color;
    private boolean filled;
    
    /**
     * Constructor for a shape
     * @param color specifies the color
     * @param filled specifies whether the shape is filled
     */
    public Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    
    /**
     * general getter
     * @return the color of the shape
     */
    public Color getColor()
    {
        return color;
    }
    
    /**
     * general getter
     * @return boolean of the filled
     */
    public boolean isFilled()
    {
        return filled;
    }
    
    /**
     * general getter
     * @return array of points used in the object
     */
    public Point[] getLocation()
    {
        return location;
    }
    
    
}

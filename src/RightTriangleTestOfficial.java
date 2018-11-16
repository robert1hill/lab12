
import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Triangle
 * 
 * @author Robert
 * @version 2018-04-02
 * Lab 11
 */
public class RightTriangleTestOfficial
{
    private RightTriangle r1 = new RightTriangle(new Point(100, 100), 50, 100, Color.BLACK, true);
    private RightTriangle r2 = new RightTriangle(new Point(100, 100), 75, 50, Color.CYAN, false);
    
    

    /**
     * Verify the affects of the constructor for the Rectangle
     * The location, the diameter(s), the color, and the filled flag
     */
    @Test
    public void testTriConstructorPoint()
    {
        // Verify the quantity of points for each shape
        Assert.assertEquals("Quantity of points defining the Oval is more than 3", 3, r1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Oval is more than 3", 3, r2.getLocation().length);

        // Verify the location for each shape
        Point[] p = r1.getLocation();
        Assert.assertEquals("Location center wrong", new Point(100, 100), p[0]);
        Assert.assertEquals("Location base wrong", new Point(150, 100), p[1]);
        Assert.assertEquals("Location height wrong", new Point(100, 200), p[2]);
        //Assert.assertEquals("Location LL wrong", new Point(75, 50), p[3]);

        // Verify the colors for each shape
        Assert.assertEquals("Incorrect color for the Oval", Color.BLACK, r1.getColor());
        Assert.assertEquals("Incorrect color for the Oval", Color.CYAN, r2.getColor());
        //Assert.assertEquals("Incorrect color for the Circle", Color.BLUE, c1.getColor());
        //Assert.assertEquals("Incorrect color for the Circle", Color.RED, c2.getColor());
        
        // Verify the appropriate filled flag for each shape
        Assert.assertTrue("Incorrect flag for filled for the Oval", r1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Oval", r2.isFilled());
        
        
    }
}

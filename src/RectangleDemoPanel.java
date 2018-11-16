import java.awt.Graphics;
import java.awt.Color;

public class RectangleDemoPanel extends MyPanel
{
    public RectangleDemoPanel()
    {
        super();
    }
    
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.BLACK);
        
        int startX = 10;
        int startY = 10;
        
        int endX = 280;
        int endY = 280;
        
        g.drawRect(startX, startY, endX, endY);
        
        
        
    }
    
}
 


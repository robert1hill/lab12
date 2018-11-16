import java.awt.Graphics;
    import java.awt.Color;

public class OvalDemoPanel extends MyPanel
{
    

    
        public OvalDemoPanel()
        {
            super();
        }
        
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            
            g.setColor(Color.BLACK);
            
            int CenterX = 40;
            int CenterY = 50;
            
            int width = 400;
            int height = 300;
            
            g.drawOval(CenterX, CenterY, width, height);
            
            
            
        }
        
    }
     




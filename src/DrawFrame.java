
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(200, 100), 400, Color.DARK_GRAY, true);
        
        
        // Ears:
        RightTriangle lEar = new RightTriangle(new Point(250, 210), 25, -130, Color.DARK_GRAY, true);
        RightTriangle rEar = new RightTriangle(new Point(550, 210), -25, -130, Color.DARK_GRAY, true);
        RightTriangle inLEar = new RightTriangle(new Point(255, 188), 12, -100, Color.PINK, true);
        RightTriangle inREar = new RightTriangle(new Point(545, 188), -12, -100, Color.PINK, true);
        // Eyes:
        Oval eye1 = new Oval(new Point(280, 180), 60, 80, Color.WHITE, true);
        Oval eye2 = new Oval(new Point(465, 180), 60, 80, Color.WHITE, true);
        Oval pup1 = new Oval(new Point(283, 187), 35, 60, Color.BLACK, true);
        Oval pup2 = new Oval(new Point(483, 187), 35, 60, Color.BLACK, true);
        // Nose and Mouth:
        Circle nose = new Circle(new Point(375, 280), 50, Color.BLACK, true);
        PolyLine m1 = new PolyLine(new Point(310, 350), new Point(400, 370), 50, Color.BLACK, true);
        PolyLine m2 = new PolyLine(new Point(490, 350), new Point(400, 370), 50, Color.BLACK, true);
        
        // Collar:
        
        Oval collarBase = new Oval(new Point(200, 450), 400, 50, Color.BLUE, true);
        Oval tongue = new Oval(new Point(420, 380), 40, 60, Color.RED, true);
        Circle buttonHigh = new Circle(new Point(370, 440), 60, Color.GREEN, false);
        Circle buttonBase = new Circle(new Point(360, 430), 80, Color.RED, true);
        
        // Square around the dog:
        Square outlineS = new Square(new Point(400, 300), 480, Color.BLUE, false);
        Circle outlineC = new Circle(new Point(50, 0), 700, Color.BLACK, false);
        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(lEar);
        drawPanel.addShape(rEar);
        drawPanel.addShape(inLEar);
        drawPanel.addShape(inREar);
        drawPanel.addShape(eye1);
        drawPanel.addShape(eye2);
        drawPanel.addShape(pup1);
        drawPanel.addShape(pup2);
        drawPanel.addShape(nose);
        drawPanel.addShape(m1);
        drawPanel.addShape(m2);
        
       drawPanel.addShape(collarBase);
       drawPanel.addShape(tongue); 
       
        drawPanel.addShape(buttonBase);
        drawPanel.addShape(buttonHigh);
        drawPanel.addShape(outlineS);
        drawPanel.addShape(outlineC);
        
        
        // set background color
        drawPanel.setBackground(Color.CYAN);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

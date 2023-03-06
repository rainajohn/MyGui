import ecs100.*;
import java.awt.Color;
/**
 * Making some sliders and responding to mouse events
 *
 * @Raina
 * @7/3/23
 */
public class MyGui
{
    // instance variables - replace the example below with your own
    private double speed;
    
    // fields to remember the "pressed" position
    private double startX, startY; 


    /**
     * Constructor for objects of class MyGui
     */
    public MyGui()
    {
        // initialise instance variables
        speed = 0;
        
        // setup buttons
        UI.addButton("Quit", UI::quit);
        
        // setup slider
        UI.addSlider("Speed", 0, 100, 20, this::setSpeed);
        
        // setup mouse listener
        UI.setLineWidth(10);
        UI.setMouseListener(this::doMouse);
    }
    
    /**
     * Callback method for speed slider
     */
    public void setSpeed(double km){
        // check if it is greater or less than last speed
        if (speed < km) {
            UI.println("Accelerating"); }
        else if (speed > km) {
            UI.println("Decelerating"); }
        else {
            UI.println("Stationary");}
            
        // set the speed to the new speed
        this.speed = km;
    }
    
    /**
     * Callback method to mouse listener
     * Only make one callback method to the mouse listener
     */
    public void doMouse(String action, double x, double y) {
        if (action.equals("pressed")) {
            this.startX = x;
            this.startY = y; }
        else if (action.equals("released")){
            UI.drawLine(this.startX, this.startY, x, y);}
    }
}

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
       
}

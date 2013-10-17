/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.plasmarobotics.jim;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;

/**
 *This class handles all climbing operations of the robot
 * @author Jim
 */

public class FroboClimb {
    /*
     * cRIO ports
     */
    //Solenoids...
    public static final int LEFT_SOLENOID_FORWARD_PORT = 10;
    public static final int LEFT_SOLENOID_REVERSE_PORT = 11;
    
    public static final int RIGHT_SOLENOID_FORWARD_PORT = 12;
    public static final int RIGHT_SOLENOID_REVERSE_PORT = 13;
    
    //Victors...
    public static final int LEFT_VICTOR_PORT = 14;
    public static final int RIGHT_VICTOR_PORT = 15;
    
    DoubleSolenoid leftSolenoid,
            rightSolenoid;
    
    Victor leftVictor,
            rightVictor;
    
    
    public FroboClimb(){
        
        leftSolenoid = new DoubleSolenoid(LEFT_SOLENOID_FORWARD_PORT, LEFT_SOLENOID_REVERSE_PORT);
        rightSolenoid = new DoubleSolenoid(RIGHT_SOLENOID_FORWARD_PORT, RIGHT_SOLENOID_REVERSE_PORT);
        
        leftVictor = new Victor(LEFT_VICTOR_PORT);
        rightVictor = new Victor(RIGHT_VICTOR_PORT);
    }
    
    
}

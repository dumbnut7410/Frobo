/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.plasmarobotics.jim;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Command;

/**
 *This class handles all climbing operations of the robot
 * @author Jim
 */

public class FroboClimb {
    /*
     * cRIO ports
     */
    
    
    DoubleSolenoid leftSolenoid,
            rightSolenoid;
    
    Victor leftVictor,
            rightVictor;
    
    
    public FroboClimb(){
        
        leftSolenoid = new DoubleSolenoid(Constants.LEFT_SOLENOID_FORWARD_PORT, Constants.LEFT_SOLENOID_REVERSE_PORT);
        rightSolenoid = new DoubleSolenoid(Constants.RIGHT_SOLENOID_FORWARD_PORT, Constants.RIGHT_SOLENOID_REVERSE_PORT);
        
        leftVictor = new Victor(Constants.LEFT_CLIMB_VICTOR_PORT);
        rightVictor = new Victor(Constants.RIGHT_CLIMB_VICTOR_PORT);
    }
           
    
}

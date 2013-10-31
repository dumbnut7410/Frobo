/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.plasmarobotics.jim;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;

/**
 *This class controls the drive system of Frobo
 * @author Jim
 */

public class FroboDrive {
    
    Joystick leftJoystick,
            rightJoystick;
   
    RobotDrive chassis;
     
    /**
     * Used to create a FroboDrive object to control all driving controls
     * 
     * @param leftJoystick Left joystick for tank drive
     * @param rightJoystick Right joystick for tank drive
     */
    public FroboDrive(Joystick leftJoystick, Joystick rightJoystick){
        //Binds the joysticks...
        this.leftJoystick = leftJoystick;
        this.rightJoystick = rightJoystick;
        
        //Creates a RobotDrive...
        chassis = new RobotDrive(Constants.FRONT_LEFT_DRIVE_PORT, Constants.BACK_LEFT_DRIVE_PORT, Constants.FRONT_RIGHT_DRIVE_PORT, Constants.BACK_RIGHT_DRIVE_PORT);
        
    }
    
    /*
     * called periodically during teleop to control the robot
     */
    public void update(){
        chassis.tankDrive(leftJoystick, rightJoystick);
        
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.plasmarobotics.jim;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;


/**
 *This class controls the drive system 
 * @author Jim
 */

public class FroboDrive {
    
    Joystick leftJoystick,
            rightJoystick;
   
    RobotDrive chassis;
    Encoder encoder;
     
    /**
     * Used to create a FroboDrive object to control all driving controls
     * 
     * @param leftJoystick Left joystick for tank drive
     * @param rightJoystick Right joystick for tank drive
     * @param frobo Instance of the main class
     */
    public FroboDrive(Joystick leftJoystick, Joystick rightJoystick, Frobo frobo){
        //Binds the joysticks...
        this.leftJoystick = frobo.getLeftJoystick();
        this.rightJoystick = frobo.getRightJoystick();
        
        //Creates a RobotDrive...
        chassis = new RobotDrive(Constants.FRONT_LEFT_DRIVE_CHANNEL, 
                Constants.BACK_LEFT_DRIVE_CHANNEL, 
                Constants.FRONT_RIGHT_DRIVE_CHANNEL, 
                Constants.BACK_RIGHT_DRIVE_CHANNEL);
        
         encoder = new Encoder(Constants.ENCODER_A_CHANNEL, Constants.ENCODER_B_CHANNEL);
         encoder.setDistancePerPulse(Constants.ENCODER_DISTANCE_PER_PULSE);
        
    }
    
    /*
     * called periodically during teleop to control the robot
     */
    public void update(){
        chassis.tankDrive(leftJoystick, rightJoystick);
        
    }
    
    /**
     * The robot will drive in a straight line for a given distance
     * @param distance Distance (in inches) to drive
     */
    public void drive(float distance){
        encoder.start();
        if(encoder.get() < distance)
            chassis.drive(.5, .5);
    }
}

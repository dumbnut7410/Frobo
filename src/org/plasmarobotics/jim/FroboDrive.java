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
    
    /*
     * Constants
     */
    
    //drive motors
    public static final int FRONT_LEFT_CONTROLLER_PORT = 1;
    public static final int BACK_LEFT_CONTROLLER_PORT = 2;
    public static final int FRONT_RIGHT_CONTROLLER_PORT = 3;
    public static final int BACK_RIGHT_CONTROLLER_PORT = 4;
    
    /*
     * Controls
     */
    Joystick leftJoystick,
            righJoystick;
    /*
     * Components to manipulate
     */
    private Talon frontLeftTalon, 
                frontRightTalon,
                backLeftTalon,
                backRightTalon;
    
    RobotDrive chassis;
     
    /**
     * Used to create a FroboShoot object to control all driving controls
     * 
     * @param leftJoystick Left joystick for tank drive
     * @param rightJoystick Right joystick for tank drive
     * @param chassis Object representing the collection of motor controllers
     */
    public FroboDrive(Joystick leftJoystick, Joystick rightJoystick, RobotDrive chassis){
        //Binds the joysticks...
        this.leftJoystick = leftJoystick;
        this.righJoystick = rightJoystick;
        
        //Binds the Talons...
        frontLeftTalon = new Talon(FRONT_LEFT_CONTROLLER_PORT);
        frontRightTalon = new Talon(FRONT_RIGHT_CONTROLLER_PORT);
        backLeftTalon = new Talon(BACK_LEFT_CONTROLLER_PORT);
        backRightTalon = new Talon(BACK_RIGHT_CONTROLLER_PORT);
        
        //Creates a RobotDrive...
        chassis = new RobotDrive(frontLeftTalon, backRightTalon, frontRightTalon, backRightTalon);
        
    }
    
    /*
     * called periodically during teleop to control the robot
     */
    public void update(){
        chassis.tankDrive(leftJoystick, righJoystick);
    }
    
}

/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/



package org.plasmarobotics.jim;


import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import java.util.Vector;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Frobo extends IterativeRobot {
    int monstersConsumed = 2;
    
    
    Joystick rightJoystick,
            leftJoystick;
  
    private FroboDrive drive;
    private FroboShoot shoot;
    private FroboClimb climb;
    private Compressor compress;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
      
    public void robotInit() {
    
        leftJoystick = new Joystick(Constants.LEFT_STICK_PORT);
        rightJoystick = new Joystick(Constants.RIGHT_STICK_PORT);

        drive = new FroboDrive(leftJoystick, rightJoystick);
        shoot = new FroboShoot(rightJoystick);
        climb = new FroboClimb();
        
        compress = new Compressor(Constants.PRESSURE_SWITCH_PORT, Constants.COMPRESSOR_RELAY_CHANNEL);
        compress.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
       
        drive.update();
         
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
    public Joystick getRightJoystick() {
        return rightJoystick;
    }

    public Joystick getLeftJoystick() {
        return leftJoystick;
    }
}

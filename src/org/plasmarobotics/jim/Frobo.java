/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/


//monsters consumed: 1

//laptop edition


package org.plasmarobotics.jim;


import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import org.plasmarobotics.jim.sensors.Vision;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Frobo extends IterativeRobot {
    
    Joystick rightJoystick,
            leftJoystick;
  
    private FroboDrive drive;
    private FroboShoot shoot;
    private FroboClimb climb;
    private Compressor compress;
    private Vision vision;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
      
    public void robotInit() {
    
        leftJoystick = new Joystick(Constants.LEFT_STICK_PORT);
        rightJoystick = new Joystick(Constants.RIGHT_STICK_PORT);

        drive = new FroboDrive(leftJoystick, rightJoystick, this);
        shoot = new FroboShoot(rightJoystick, this);
        vision = new Vision();
        
      //  climb = new FroboClimb(); pneumatics are broken
        
        compress = new Compressor(Constants.PRESSURE_SWITCH_CHANNEL, Constants.COMPRESSOR_RELAY_CHANNEL);
        compress.start();
    }

    public void autonomousInit() {
        
        drive.setupAutonomous();
    }

    
    /**
     * This function is called periodically during autonomous
     */
    int step = 0; //used to iterate through commands
    public void autonomousPeriodic() {
       switch(step){
           case 0: 
               if(drive.drive(.5, 48))
                    step++;
               break;
               
           case 1:
               if(drive.turn(90))
                    step++;
               break;
               
           case 2:
               if(drive.drive(.5, 48))
                    step++;
               break;
               
           case 3:
               if(drive.turn(90))
                   step++;
               break;
               
           case 4:
               if(drive.drive(.5,48))
                   step++;
               break;
                     
           case 5:
               if(drive.turn(90))
                   step++;
               break;
               
           case 6:
               if(drive.drive(.5, 48))
                   step++;
               break;
               
           case 7:
               if(drive.turn(90))
                   step++;
               break;
               
           default:
               System.out.println("no commands sent");
               drive.drive(0, 0);
               break;
       }
        
    }
        
    

    public void teleopInit() {
        drive.setupTeleop();
    }

    
    
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
       
        drive.updateTeleop();
        shoot.update();
        vision.update();
        
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
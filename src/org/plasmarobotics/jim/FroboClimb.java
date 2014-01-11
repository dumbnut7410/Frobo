/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.plasmarobotics.jim;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Victor;
import org.plasmarobotics.jim.utils.ToggleableButton;

/**
 *This class handles all climbing operations of the robot
 * @author Jim
 */

public class FroboClimb {
       
    DoubleSolenoid climbSolenoid;
    
    Victor leftVictor,
            rightVictor;
    
    Joystick gamePad;        
 
    ToggleableButton solenoidButton,
            lockButton;
    
    Servo lock;
    
    boolean isUp = false,
            isLocked = false;
    
    public FroboClimb(){
        
        gamePad = new Joystick(Constants.GAMEPAD_PORT);
        
        climbSolenoid = new DoubleSolenoid(Constants.LEFT_SOLENOID_FORWARD_CHANNEL, Constants.LEFT_SOLENOID_REVERSE_CHANNEL);
             
        lock = new Servo(Constants.CLIMB_SERVO_CHANNEL);
        
        leftVictor = new Victor(Constants.LEFT_CLIMB_VICTOR_CHANNEL);
        rightVictor = new Victor(Constants.RIGHT_CLIMB_VICTOR_CHANNEL);
    }
           
    public void update(){
        //Setting The climbing motors
        leftVictor.set(gamePad.getY());
        rightVictor.set(gamePad.getY());
        
        if(solenoidButton.isPressed()){
            isUp = !isUp;
        }
        if(lockButton.isPressed()){
            isLocked = !isLocked;
        }
        
        //actually moves the solenoid
        if(isUp){
            climbSolenoid.set(DoubleSolenoid.Value.kForward);
        }else{
            climbSolenoid.set(DoubleSolenoid.Value.kReverse);
        }
        
        if(isLocked){
            lock.set(Constants.CLIMB_SERVO_OPEN);
        } else{
            lock.set(Constants.CLIMB_SERVO_CLOSE);
        }
        
    }
}

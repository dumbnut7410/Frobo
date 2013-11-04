/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.plasmarobotics.jim;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 *This class handles all climbing operations of the robot
 * @author Jim
 */

public class FroboClimb {
  
    DoubleSolenoid climbSolenoid;
    
    Victor leftVictor,
            rightVictor;
  
    Joystick gamePad;
    
    JoystickButton lockButton,
            solenoidButton;
            
    Servo lockServo;
    
    //used to determine if the user is climbing
    boolean climbing = false,
            isSolenoidRaised = false,
            isLocked = false;
    
    

    public FroboClimb(){
        
        this.climbSolenoid = new DoubleSolenoid(Constants.CLIMB_SOLENOID_FORWARD_PORT, Constants.CLIMB_SOLENOID_REVERSE_PORT);
        
        
        this.leftVictor = new Victor(Constants.LEFT_CLIMB_VICTOR_PORT);
        this.rightVictor = new Victor(Constants.RIGHT_CLIMB_VICTOR_PORT);
        
        this.gamePad = new Joystick(Constants.GAMEPAD_PORT);
        
        this.lockButton = new JoystickButton(gamePad, Constants.GAMEPAD_LEFT_TRIGGER);
        this.solenoidButton = new JoystickButton(gamePad, Constants.GAMEPAD_RIGHT_TRIGGER);
        
        
    }
        
    /**
     * This method is called in the teleop loop. It performs all actions used by the shooter.
     */
    public void update(){
            //possibly toggles solenoids/lock       
            isSolenoidRaised = toggleButton(solenoidButton, isSolenoidRaised);
            isLocked = toggleButton(lockButton, isLocked);
            
            //sets the state of the solenoids
            if(isSolenoidRaised){
                climbSolenoid.set(DoubleSolenoid.Value.kForward);
            } else {
                climbSolenoid.set(DoubleSolenoid.Value.kReverse);
            }
            
            //Sets the lock on the arms
            if(isLocked){
                lockServo.set(.25);
            } else{
                lockServo.set(0);
            }
            
            leftVictor.set(gamePad.getRawAxis(Constants.GAMEPAD_LEFT_Y_AXIS));
            leftVictor.set(gamePad.getRawAxis(Constants.GAMEPAD_RIGHT_Y_AXIS));
        
    }
    
    /**
     * Enable/disable the climbing mech
     * @param isClimbing 
     */
    public void setClimbing(boolean isClimbing) {
        this.climbing = climbing;
    }
    
    /**
     * This code allows for toggling of a boolean with a button
     * @param pressedButton
     * @param lastState 
     */
    public boolean toggleButton(JoystickButton pressedButton, boolean lastState){
        
        if(pressedButton.get()){
            if(pressedButton.get() == lastState){
                return lastState;
            } else {
                return !lastState;
            }
        } else {
            return lastState;
        }
        
        
              
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.plasmarobotics.jim;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import java.util.*;
/**
 *Class to handle user input of the robot
 * @author Jim
 */
public class Controls {
    
    /*
     * Controllers
     */
    
    Joystick rightStick, 
            leftStick;
    
    JoystickButton shootButton;
    
    //joystick ports
    public static final int LEFT_STICK_PORT = 1;
    public static final int RIGHT_STICK_PORT = 2;
    
    public static final int SHOOT_TRIGGER_BUTTON = 1;
    
    
    Vector buttons,//ArrayList for all buttons
            pressedButtons; //ArrayList for all buttons pressed
    
    public Controls(){
        rightStick = new Joystick(RIGHT_STICK_PORT);
        leftStick = new Joystick(RIGHT_STICK_PORT);
        
        shootButton = new JoystickButton(rightStick, SHOOT_TRIGGER_BUTTON);
        
        buttons.addElement(shootButton);
    }

    public Joystick getRightStick() {
        return rightStick;
    }

    public Joystick getLeftStick() {
        return leftStick;
    }

    /**
     * This refreshes the controls for the robot
     *  
     */
   public void getControls(Command shoot){
       shootButton.whenPressed(shoot);
   }
   
}

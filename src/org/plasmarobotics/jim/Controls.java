/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.plasmarobotics.jim;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

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
    
    public Controls(){
        rightStick = new Joystick(RIGHT_STICK_PORT);
        leftStick = new Joystick(RIGHT_STICK_PORT);
        
        shootButton = new JoystickButton(rightStick, SHOOT_TRIGGER_BUTTON);
        
    }

    public Joystick getRightStick() {
        return rightStick;
    }

    public Joystick getLeftStick() {
        return leftStick;
    }

    /**
     * Primary method of this class.
     * 0 = shoot
     * @return an int to represent which controls are pressed
     */
    public JoystickButton getControl(){
        
        return shootButton;
    }
    
    
}

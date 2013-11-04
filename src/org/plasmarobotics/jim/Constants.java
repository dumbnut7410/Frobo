/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.plasmarobotics.jim;

/**
 *This class holds all constant values within Frobo
 * @author Jim
 */
public final class Constants {
     
    //joystick ports
    public static final int LEFT_STICK_PORT = 1,
                        RIGHT_STICK_PORT = 2,
                        GAMEPAD_PORT = 3;
    
    //Drive motors
    public static final int FRONT_LEFT_DRIVE_PORT = 1,
                        BACK_LEFT_DRIVE_PORT = 2,
                        FRONT_RIGHT_DRIVE_PORT = 3,
                        BACK_RIGHT_DRIVE_PORT = 4;
    
    //Shooting ports
    public static final int FRONT_SHOOT_PORT = 6,
                        BACK_SHOOT_PORT = 7;
    
    //Shoot kicker
    public static final int SHOOT_KICKER_FORWARD_PORT = 8,
                        SHOOT_KICKER_REVERSE_PORT = 9;
    
    //left climb arm
    public static final int CLIMB_SOLENOID_FORWARD_PORT = 10,
                        CLIMB_SOLENOID_REVERSE_PORT = 11;
    
    //right climb arm
    public static final int RIGHT_SOLENOID_FORWARD_PORT = 12,
                        RIGHT_SOLENOID_REVERSE_PORT = 13;
    
    //Climb Victors
    public static final int LEFT_CLIMB_VICTOR_PORT = 14,
                        RIGHT_CLIMB_VICTOR_PORT = 15;
    
    //motor speeds
    public static final double FRONT_SHOOT_MOTOR_SPEED = .5,
                        BACK_SHOOT_MOTOR_SPEED = .5;
    
    //Joystick buttons
    public static final int JOYSTICK_TRIGGER_BUTTON = 1;
    
    //Gamepad buttons
    public static final int GAMEPAD_RIGHT_TRIGGER = 1,
                        GAMEPAD_LEFT_TRIGGER = 2,
                        GAMEPAD_TRIANGLE = 3,
                        GAMEPAD_CIRCLE = 4,
                        GAMEPAD_SQUARE = 5,
                        GAMEPAD_CROSS = 6,
                        GAMEPAD_START = 7;
    
    //Gamepad thumbsticks
    public static final int GAMEPAD_LEFT_X_AXIS = 1,
                        GAMEPAD_LEFT_Y_AXIS = 2,
                        GAMEPAD_RIGHT_X_AXIS = 3,
                        GAMEPAD_RIGHT_Y_AXIS = 4;
    
    
    //Compressor
    public static final int PRESSURE_SWITCH_PORT = 14,
                        COMPRESSOR_RELAY_CHANNEL = 1;
}

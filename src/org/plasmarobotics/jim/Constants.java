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
    public static final int LEFT_STICK_PORT = 1;
    public static final int RIGHT_STICK_PORT = 2;
    
    //Drive motors
    public static final int FRONT_LEFT_DRIVE_PORT = 1;
    public static final int BACK_LEFT_DRIVE_PORT = 2;
    public static final int FRONT_RIGHT_DRIVE_PORT = 3;
    public static final int BACK_RIGHT_DRIVE_PORT = 4;
    
    //Shooting ports
    public static final int FRONT_SHOOT_PORT = 6;
    public static final int BACK_SHOOT_PORT = 7;
    
    //Shoot kicker
    public static final int SHOOT_KICKER_FORWARD_PORT = 8;
    public static final int SHOOT_KICKER_REVERSE_PORT = 9;
    
    //left climb arm
    public static final int LEFT_SOLENOID_FORWARD_PORT = 10;
    public static final int LEFT_SOLENOID_REVERSE_PORT = 11;
    
    //right climb arm
    public static final int RIGHT_SOLENOID_FORWARD_PORT = 12;
    public static final int RIGHT_SOLENOID_REVERSE_PORT = 13;
    
    //Climb Victors
    public static final int LEFT_CLIMB_VICTOR_PORT = 14;
    public static final int RIGHT_CLIMB_VICTOR_PORT = 15;
    
    //motor speeds
    public static final double FRONT_SHOOT_MOTOR_SPEED = .5;
    public static final double BACK_SHOOT_MOTOR_SPEED = .5;
    
    //Buttons
    public static final int SHOOT_TRIGGER_BUTTON = 1;
    
    //Compressor
    public static final int PRESSURE_SWITCH_PORT = 14;
    public static final int COMPRESSOR_RELAY_CHANNEL = 1;
}

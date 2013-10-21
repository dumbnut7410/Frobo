/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.plasmarobotics.jim;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
/**
 *
 * @author Jim
 */
public class FroboShoot {
    
    //cRIO ports
    public static final int FRONT_SHOOT_CRIO_PORT = 6;
    public static final int BACK_SHOOT_CRIO_PORT = 7;
    
    public static final int SOLENOID_FORWARD_PORT = 8;
    public static final int SOLENOID_REVERSE_PORT = 9;
    
    //motor speeds
    public static final double FRONT_SHOOT_MOTOR_SPEED = .5;
    public static final double BACK_SHOOT_MOTOR_SPEED = .5;
    
    
    
    private static Victor frontShootVictor = new Victor(FRONT_SHOOT_CRIO_PORT);
    private static Victor backShootVictor = new Victor(BACK_SHOOT_CRIO_PORT);
    
    private static DoubleSolenoid shootSolenoid;
    
    
    //used to pass the shootCommand to the model class
    public static Command getShootCommand(){
        return new shootFrisbee();
    }
    
    
    public FroboShoot(){
        
        shootSolenoid = new DoubleSolenoid(SOLENOID_FORWARD_PORT, SOLENOID_REVERSE_PORT);
        
    }
    
     
    /*
     * Command used for shooting
     */
    public static class shootFrisbee extends Command{
        boolean finished = false;
        
        protected void initialize() {
            
        }
        
        protected void execute() {
            frontShootVictor.set(FRONT_SHOOT_MOTOR_SPEED);
            backShootVictor.set(BACK_SHOOT_MOTOR_SPEED);
        
            shootSolenoid.set(DoubleSolenoid.Value.kForward);
            finished = true;
        }
        
        protected void interrupted() {
            
        }
        
        protected boolean isFinished() {
            return finished;
        }
        
        protected void end() {
            shootSolenoid.set(DoubleSolenoid.Value.kReverse);
        }
       
    }
    
        
}


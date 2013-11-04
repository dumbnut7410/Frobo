/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.plasmarobotics.jim;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
/**
 *Class to manage shooting functionality of the robot
 * @author Jim
 */
public class FroboShoot {
    
    private static Victor frontShootVictor,
            backShootVictor;
    
    private static DoubleSolenoid shootSolenoid;
    
    Joystick rightJoystick;
    JoystickButton shootBtn;
    
    /**
     * Sets up a froboShoot object
     * @param rightStick Needed to bind the JoystickButton to shoot
     */
    public FroboShoot(Joystick rightStick){
        
        this.rightJoystick = rightStick;
        this.shootBtn = new JoystickButton(rightStick, Constants.JOYSTICK_TRIGGER_BUTTON);
        
        this.shootSolenoid = new DoubleSolenoid(Constants.SHOOT_KICKER_FORWARD_PORT, Constants.SHOOT_KICKER_REVERSE_PORT);
        
        this.frontShootVictor = new Victor(Constants.FRONT_SHOOT_PORT);
        this.backShootVictor = new Victor(Constants.BACK_SHOOT_PORT);
        
        
    }
    
    /**
     * Called by teleopPeriodic() in main class
     */
    public void update(){
        if(shootBtn.get()){
            
        }
    }
    /*
     * Command used for shooting
     */
    public static class shootFrisbee extends Command{
        boolean finished = false;
        
        protected void initialize() {
            
        }
        
        protected void execute() {
            frontShootVictor.set(Constants.FRONT_SHOOT_MOTOR_SPEED);
            backShootVictor.set(Constants.BACK_SHOOT_MOTOR_SPEED);
        
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


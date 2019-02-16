/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.DriveWithJoysticks;
import frc.robot.commands.ExtendIntake;
import frc.robot.commands.HatchIntakeDown;
import frc.robot.commands.HatchIntakeUp;
import frc.robot.commands.RetractIntake;
import frc.robot.commands.SwapDriveDirection;


/**
 * Add your docs here.
 */
public class OI {

    private Joystick pilotController;
    private Joystick coPilotController;

    public OI() {
        pilotController = new Joystick(0);
        coPilotController = new Joystick(1);
    
        //  8==========D

        Button copilotButtonA = new JoystickButton(coPilotController, RobotMap.joystickButtonA);
        copilotButtonA.whenPressed(new HatchIntakeDown());
        
        Button copilotButtonY = new JoystickButton(coPilotController, RobotMap.joystickButtonY);
        copilotButtonY.whenPressed(new HatchIntakeUp());

        Button pilotButtonX = new JoystickButton(pilotController, RobotMap.joystickButtonX);
        pilotButtonX.whenPressed(new ExtendIntake(3));
        
        Button pilotButtonB = new JoystickButton(pilotController, RobotMap.joystickButtonB);
        pilotButtonB.whenPressed(new RetractIntake(1.5));

        Button pilotButtonY = new JoystickButton(pilotController, RobotMap.joystickButtonY);
        pilotButtonY.whenPressed(new SwapDriveDirection());
        
        
        copilotButtonA.close();
        copilotButtonY.close();
        pilotButtonX.close();
        pilotButtonB.close();
        pilotButtonY.close();
    }

    public Joystick getPilotController() {
        return pilotController;
    }
    public Joystick getcoPilotController() {
        return coPilotController;
    }
}

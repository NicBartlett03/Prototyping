/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class MoveCargo extends Command {
  private double yAxis = 0.0;
  
  public MoveCargo() {
    requires(Robot.cargoIntake);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.cargoIntake.cargoIntakeMotor.set(Robot.oi.getcoPilotController().getRawAxis(RobotMap.rightJoystickYAxis));
    yAxis = Robot.oi.getcoPilotController().getRawAxis(RobotMap.leftJoystickYAxis);
  if(yAxis < 0){
    Robot.cargoIntake.cargoExtensionMotor.set(Robot.oi.getcoPilotController().getRawAxis(RobotMap.leftJoystickYAxis) * -.4);
  }else{
    Robot.cargoIntake.cargoExtensionMotor.set(Robot.oi.getcoPilotController().getRawAxis(RobotMap.leftJoystickYAxis) * -.1);
  }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.cargoIntake.cargoIntakeStop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}

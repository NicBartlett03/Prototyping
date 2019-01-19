/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import frc.robot.RobotMap;
import frc.robot.commands.DriveWithJoysticks;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public WPI_TalonSRX leftFrontMotor = new WPI_TalonSRX(RobotMap.leftFrontMotor);
  public WPI_TalonSRX leftBackMotor = new WPI_TalonSRX(RobotMap.leftBackMotor);
  public WPI_TalonSRX rightFrontMotor = new WPI_TalonSRX(RobotMap.rightFrontMotor);
  public WPI_TalonSRX rightBackMotor = new WPI_TalonSRX(RobotMap.rightBackMotor);

  public SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightFrontMotor, rightBackMotor);
  public SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftFrontMotor, leftBackMotor);

  private DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DriveWithJoysticks());
  }

  public DriveTrain(){
    drive = new DifferentialDrive(leftMotors, rightMotors);
  }

  public void arcadeDrive(double speed, double rotation){
    drive.arcadeDrive(speed, rotation);
  }

  public void stopDrive(){
    drive.arcadeDrive(0, 0);
  }

  public void resetEncoders() {
		leftFrontMotor.setSelectedSensorPosition(0, 0, 0);
		rightFrontMotor.setSelectedSensorPosition(0, 0, 0);
	}
  
  public double getLeftEncoderPosition() {
		return leftFrontMotor.getSelectedSensorPosition(0);
		
	}

	public double getRightEncoderPosition() {
		return rightFrontMotor.getSelectedSensorPosition(0);
  }
  
  public void tankDrive(double leftSpeed, double rightSpeed){
    drive.tankDrive(leftSpeed, rightSpeed, true);
  }


}

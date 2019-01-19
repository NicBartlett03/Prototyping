/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
  	public static final int intakeMotor = 17;

	public static final int leftBackMotor 	= 10;
	public static final int leftFrontMotor 	= 11;
	public static final int rightBackMotor 	= 12;
	public static final int rightFrontMotor = 13;

  	public static final int pilotController = 0;

  	public static final int leftJoystickYAxis 	= 1;
	public static final int rightJoystickYAxis 	= 5;
	public static final int leftJoystickXAxis 	= 0;
	public static final int rightJoystickXAxis 	= 4;

	public static final int joystickButtonA 			= 1;
	public static final int joystickButtonB 			= 2;
	public static final int joystickButtonX				= 3;
	public static final int joystickButtonY 			= 4;
	public static final int joystickLeftBumper 			= 5;
	public static final int joystickRightBumper 		= 6;
	public static final int joystickButtonBack 			= 7;
	public static final int joystickButtonsStart 		= 8;
	public static final int joystickButtonLeftStick 	= 9;
	public static final int joystickButtonRightStick 	= 10;
	
}

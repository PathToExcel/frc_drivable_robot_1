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
  // Joystick configuration for driving, claw movement
  public static int joystickForDriving = 0;

  // Motor Controller port configuration for the 4 motors
  public static int leftFrontMotorControllerPort = 1;
  public static int leftBackMotorControllerPort = 2;
  public static int rightBackMotorControllerPort = 3;
  public static int rightFrontMotorControllerPort = 4;

}

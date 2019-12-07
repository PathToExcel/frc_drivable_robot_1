/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveManuallyCommand;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  //Instantiate the motor controller objects
  public WPI_TalonSRX leftFrontMotorController = new WPI_TalonSRX(RobotMap.leftFrontMotorControllerPort);
  public WPI_TalonSRX leftBackMotorController = new WPI_TalonSRX(RobotMap.leftBackMotorControllerPort);
  public WPI_TalonSRX rightBackMotorController = new WPI_TalonSRX(RobotMap.rightBackMotorControllerPort);
  public WPI_TalonSRX rightFrontMotorController = new WPI_TalonSRX(RobotMap.rightFrontMotorControllerPort);
  
  //Instantiate a new DifferentialDrive object
  public DifferentialDrive myRobotDrive = new DifferentialDrive(leftBackMotorController, rightBackMotorController);

  //Constructor function for DriveSubsystem
  public DriveSubsystem() {
    leftFrontMotorController.follow(leftBackMotorController);
    rightFrontMotorController.follow(rightBackMotorController);
  }

  //manualDrive() method
  public void manualDrive(double move, double turn){
    if (Math.abs(move) < 0.10) {
      move = 0;
    }
    if (Math.abs(turn) < 0.10) {
      move = 0;
    }
    
    myRobotDrive.arcadeDrive(move, turn);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveManuallyCommand());
  }
}

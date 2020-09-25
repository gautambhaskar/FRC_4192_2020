/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.RobotMap;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */
  private final XboxController m_driverController = new XboxController(0);
  private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);

  public DriveTrain() {
    CANSparkMax leftLeader = new CANSparkMax(RobotMap.leftLeader, MotorType.kBrushless);
    CANSparkMax leftFollower1 = new CANSparkMax(RobotMap.leftFollower1, MotorType.kBrushless);
    CANSparkMax leftFollower2 = new CANSparkMax(RobotMap.leftFollower2, MotorType.kBrushless);
    CANSparkMax rightLeader = new CANSparkMax(RobotMap.rightLeader, MotorType.kBrushless);
    CANSparkMax rightFollower1 = new CANSparkMax(RobotMap.rightFollower1, MotorType.kBrushless);
    CANSparkMax rightFollower2 = new CANSparkMax(RobotMap.rightFollower2, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    m_robotDrive.tankDrive(m_driverController.getY(Hand.kLeft), m_driverController.getY(Hand.kRight));
    if(m_driverController.getTriggerAxis(Hand.kLeft)){
      
    }
  }
}

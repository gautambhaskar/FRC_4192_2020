/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
    public final class RobotMap {
        public static final int leftLeader = 1;
        public static final int leftFollower1 = 2;
        public static final int leftFollower2 = 3;
        public static final int spool = 4;
        public static final int rightLeader = 5;
        public static final int rightFollower1 = 6;
        public static final int rightFollower2 = 7;
        public static final int intake = 8;
        public static final int index = 9;
        public static final int turret = 10;
        public static final int feeder = 11;
        public static final int shooterLeft = 12;
        public static final int shooterRight = 13;
        public static final int hood = 14;
        public static final int lift = 15;
    }
    public final class Controllers {
        XboxController controller0 = new XboxController(0);
    }
}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

/**
 * Add your docs here.
 */
public class VisionListener {
    NetworkTableInstance NTI;
    public void VisionListener(){
        new VisionListener().run();
    }
    public void run(){
        NTI = NetworkTableInstance.getDefault();
        NetworkTable table = NTI.getTable("X");
        NetworkTableEntry xEntry = table.getEntry("X");
        

    }
}

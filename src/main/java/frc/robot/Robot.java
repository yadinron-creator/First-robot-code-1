// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.spikes2212.util.smartmotorcontrollers.TalonFXWrapper;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.commands.Transport;
import frc.robot.subsystems.MoveTransport;

public class Robot extends TimedRobot {

    MoveTransport moveTransport;

    @Override
    public void robotInit() {
        MotorController motorController = new TalonFXWrapper(20);
        Transport transport = new Transport(motorController);

        moveTransport = new MoveTransport(transport, 0.5);
    }

    @Override
    public void robotPeriodic() {
        CommandScheduler.getInstance().run();
    }

    @Override
    public void disabledInit() {
        CommandScheduler.getInstance().cancelAll();
    }

    @Override
    public void disabledPeriodic() {

    }

    @Override
    public void autonomousInit() {
        CommandScheduler.getInstance().schedule(moveTransport);
    }

    @Override
    public void autonomousExit() {
        CommandScheduler.getInstance().cancel(moveTransport);
    }

    @Override
    public void autonomousPeriodic() {

    }

    @Override
    public void teleopInit() {

    }

    @Override
    public void teleopPeriodic() {

    }

    @Override
    public void testInit() {
        CommandScheduler.getInstance().cancelAll();
    }

    @Override
    public void testPeriodic() {

    }

    @Override
    public void simulationInit() {

    }

    @Override
    public void simulationPeriodic() {

    }
}

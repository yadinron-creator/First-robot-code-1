package com.spikes2212.command;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystem.Shooter;

public class Shoot extends Command {
    Shooter shooter;
    double speed;

    public Shoot (Shooter shooter, double speed){
        this.shooter = shooter;
        this.speed = speed;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        super.execute();
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
        shooter.stop();
    }

}

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class Shoot extends Command {

    private final Shooter shooter;
    private final double speed;

    public Shoot(Shooter shooter, double speed) {
        addRequirements(shooter);
        this.shooter = shooter;
        this.speed = speed;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        shooter.setSpeed(speed);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        shooter.stop();
    }

}

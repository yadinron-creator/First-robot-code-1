package frc.robot.Subsystem;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private final MotorController motorController;

    public Shooter(MotorController motorController) {
        this.motorController = motorController;
    }

    public void setSpeed(Double speed) {
        motorController.set(0.5);
    }

    public double getSpeed() {
        return motorController.get();
    }

    public void stop() {
        motorController.stopMotor();
    }
}

package org.firstinspires.ftc.teamcode.Test;


import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.SetUp.functions;

@TeleOp(name= "Intake_test")
public class Intake extends functions { // you need to extend the functions class

    @Override
    public void runOpMode() {
        setup(); // All the set up in one line of code

        waitForStart(); // wait for the start

        while (opModeIsActive()){
            if (gamepad1.a){ // press the A button to make the intake move
                Intake(1, 500);
            }

        }

    }
}


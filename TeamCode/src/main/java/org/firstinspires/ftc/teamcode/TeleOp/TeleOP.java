package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.SetUp.functions;

@TeleOp(name = "TeleOp")
public class TeleOP extends functions {


    @Override
    public void runOpMode(){
    setup();
    waitForStart();
    while(opModeIsActive()){
        Driving();
        Intake();
        if (gamepad1.x){
            WobbleGoal(0);
        } else if (gamepad1.y){
            WobbleGoal(0.5);
        }

    }
    }



}
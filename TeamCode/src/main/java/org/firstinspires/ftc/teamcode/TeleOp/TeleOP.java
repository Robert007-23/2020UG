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
        WG();
        AM();

    }
    }


    public void WG(){
        if (gamepad1.x){
            WobbleGoal(0);
        } else if (gamepad1.y){
            WobbleGoal(0.5);
        }
    }

    public void AM(){
        if (gamepad1.left_bumper) {
            Actuator(-0.99);
        } else if (gamepad1.right_bumper){
            Actuator(0.40);
        Actuator(-0.99);
        } else {
            Actuator(0.40);
        }
    }


}

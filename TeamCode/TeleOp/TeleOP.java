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
        ST();
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
            Actuator(1);
        } else if (gamepad1.right_bumper){
            Actuator(-1);
        } else {
            Actuator(0);
        }
    }

    public void ST(){
     if (gamepad1.dpad_left){
         Strafing(1,1);
     }  else if(gamepad1.dpad_right){
         Strafing(-1,1);
     }


    }

}

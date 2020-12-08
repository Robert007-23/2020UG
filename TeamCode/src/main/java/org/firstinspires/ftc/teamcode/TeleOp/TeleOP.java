package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.SetUp.functions;

@TeleOp(name = "TeleOP")
public class TeleOP extends functions {
// Bools
    boolean shoot = true;

    @Override
    public void runOpMode(){
        setup();
        waitForStart();
        while(opModeIsActive()){
            Driving();
            Intake();
            WG();
            AM();
            RL();
            MotorTest();
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
            Strafing(1,250);
        } else if (gamepad1.dpad_right){
            Strafing(-1,250);
        }

    }

    public void RL(){
     if (gamepad1.start && shoot){
         RingLauncher(0.7);
         sleep(1000);
         shoot = false;
     } else if(gamepad1.start && !shoot){
         RingLauncher(0.5);
         sleep(1000);
         shoot = true;
     }



    }

}
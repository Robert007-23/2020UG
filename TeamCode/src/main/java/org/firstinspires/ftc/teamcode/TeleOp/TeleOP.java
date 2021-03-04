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
        AS(); // Experimental, activated by pressing A once, will now be automated to shoow 3 ring
        STRA();
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
        } else if (gamepad1.right_bumper) {
            Actuator(0.40);
            Actuator(-0.99);
            Actuator(0.40);
            Actuator(-0.99);
            Actuator(0.40);
            Actuator(-0.99);
            sleep(1700);
        } else {
            Actuator(0.40);
        }
    }
    public void AS(){
        if (gamepad1.dpad_up) {
            Actuator(-0.99);
            sleep(1000);
            Actuator (0.40);
        } else if (gamepad1.b){
            Intake();
            AM();
        }
    }
    public void STRA(){
        if (gamepad1.dpad_right) {
            Strafing(1, 4);
        } else if (gamepad1.dpad_left) {
            Strafing(-1,4);
        }
    }


}

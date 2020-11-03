package org.firstinspires.ftc.teamcode.Auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous (name = "MyFirstAuto")
public class MyFirstAuto extends LinearOpMode{

    DcMotor leftbackDrive;
    DcMotor leftfrontDrive;
    DcMotor rightbackDrive;
    DcMotor rightfrontDrive;


    public void runOpMode() {

        /*********DEFINING HARDWARE***************************************/

        //Motors
        leftbackDrive = hardwareMap.get(DcMotor.class, "BLM");
        leftfrontDrive = hardwareMap.get(DcMotor.class, "FLM");
        rightbackDrive = hardwareMap.get(DcMotor.class, "BRM");
        rightfrontDrive = hardwareMap.get(DcMotor.class, "FRM");

        //Reversing some of the motor directions to make driving easier
        leftfrontDrive.setDirection(DcMotor.Direction.REVERSE);
        leftbackDrive.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();// this ask the phone for when you press the start button.

    }
    // this makes a functions so that you can use it over and over
    public void movement(int left, int right,int time ){
        leftbackDrive.setPower(left);
        leftfrontDrive.setPower(left);
        rightbackDrive.setPower(right);
        rightfrontDrive.setPower(right);
        sleep(time);
    }

}
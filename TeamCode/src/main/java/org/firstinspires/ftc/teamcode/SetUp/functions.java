package org.firstinspires.ftc.teamcode.SetUp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
/*this is the Class used for setup*/
public class functions extends LinearOpMode {

    //this this where name will be stated
    public DcMotor leftbackDrive;
    public DcMotor leftfrontDrive;
    public DcMotor rightbackDrive;
    public DcMotor rightfrontDrive;


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


    }
    /**this is were all functions will go to be used later**/
    // this makes a functions so that you can use it over and over
    public void setup(){
        //Motors
        leftbackDrive = hardwareMap.get(DcMotor.class, "BLM");
        leftfrontDrive = hardwareMap.get(DcMotor.class, "FLM");
        rightbackDrive = hardwareMap.get(DcMotor.class, "BRM");
        rightfrontDrive = hardwareMap.get(DcMotor.class, "FRM");

        //Reversing some of the motor directions to make driving easier
        leftfrontDrive.setDirection(DcMotor.Direction.REVERSE);
        leftbackDrive.setDirection(DcMotor.Direction.REVERSE);

    }

    public void movement(double left, double right, int time ){
        leftbackDrive.setPower(left);
        leftfrontDrive.setPower(left);
        rightbackDrive.setPower(right);
        rightfrontDrive.setPower(right);
        sleep(time);
        leftbackDrive.setPower(0);
        leftfrontDrive.setPower(0);
        rightbackDrive.setPower(0);
        rightfrontDrive.setPower(0);
    }
    public void strafe(){
        double r = Math.hypot(gamepad1.left_stick_x, gamepad1.left_stick_y);
        double robotAngle = Math.atan2(gamepad1.left_stick_y, gamepad1.left_stick_x) - Math.PI / 4;
        double rightX = gamepad1.right_stick_x;
        final double v1 = r * Math.cos(robotAngle) + rightX;
        final double v2 = r * Math.sin(robotAngle) - rightX;
        final double v3 = r * Math.sin(robotAngle) + rightX;
        final double v4 = r * Math.cos(robotAngle) - rightX;

        leftfrontDrive.setPower(v1);
        rightfrontDrive.setPower(v2);
        leftbackDrive.setPower(v3);
        rightbackDrive.setPower(v4);
    }
}

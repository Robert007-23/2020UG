package org.firstinspires.ftc.teamcode.SetUp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/*this is the Class used for setup*/
public class functions extends LinearOpMode {

    //this this where name will be stated
    public DcMotor leftbackDrive;
    public DcMotor leftfrontDrive;
    public DcMotor rightbackDrive;
    public DcMotor rightfrontDrive;

    public void runOpMode() {
            setup();
    }
    /**this is were all functions will go to be used later**/
    // this makes a functions so that you can use it over and over

    public void setup(){

        /*********DEFINING HARDWARE***************************************/

        //Motors
        leftbackDrive = hardwareMap.get(DcMotor.class, "BLM");
        leftfrontDrive = hardwareMap.get(DcMotor.class, "FLM");
        rightbackDrive = hardwareMap.get(DcMotor.class, "BRM");
        rightfrontDrive = hardwareMap.get(DcMotor.class, "FRM");

        //Reversing some of the motor directions to make driving easier
        m_leftFront.setDirection(DcMotor.Direction.REVERSE);
        m_leftBack.setDirection(DcMotor.Direction.REVERSE);
        m_rightBack.setDirection(DcMotor.Direction.FORWARD);
        m_rightFront.setDirection(DcMotor.Direction.FORWARD);

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

      public void Strafing(double power, int time){
        m_leftBack.setPower(power);
        m_leftFront.setPower(-power);
        m_rightBack.setPower(-power);
        m_rightFront.setPower(power);
        sleep(time);
        m_leftBack.setPower(0);
        m_leftFront.setPower(0);
        m_rightBack.setPower(0);
        m_rightFront.setPower(0);
    }

}

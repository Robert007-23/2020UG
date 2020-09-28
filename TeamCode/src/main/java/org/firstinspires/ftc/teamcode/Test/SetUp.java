package org.firstinspires.ftc.teamcode.Test;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class SetUp extends LinearOpMode {

    DcMotor m_leftBack;
    DcMotor m_leftFront;
    DcMotor m_rightBack;
    DcMotor m_rightFront;

    public void runOpMode() {

        /*********DEFINING HARDWARE***************************************/

        //Motors
        m_leftBack = hardwareMap.get(DcMotor.class, "BLM");
        m_leftFront = hardwareMap.get(DcMotor.class, "FLM");
        m_rightBack = hardwareMap.get(DcMotor.class, "BRM");
        m_rightFront = hardwareMap.get(DcMotor.class, "FRM");

        //Reversing some of the motor directions to make driving easier
        m_leftFront.setDirection(DcMotor.Direction.REVERSE);
        m_leftBack.setDirection(DcMotor.Direction.REVERSE);


    }
    // this makes a functions so that you can use it over and over
    public void movement(int left, int right,int time ){
        m_leftBack.setPower(left);
        m_leftFront.setPower(left);
        m_rightBack.setPower(right);
        m_rightFront.setPower(right);
        sleep(time);
    }
}

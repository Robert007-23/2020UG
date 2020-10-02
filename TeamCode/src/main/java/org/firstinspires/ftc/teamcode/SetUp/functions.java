package org.firstinspires.ftc.teamcode.SetUp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/*this is the Class used for setup*/
public class functions extends LinearOpMode {
    //this this where name will be stated
    DcMotor m_leftBack;
    DcMotor m_leftFront;
    DcMotor m_rightBack;
    DcMotor m_rightFront;

    public void runOpMode() {
            setup();
    }
    /**this is were all functions will go to be used later**/
    // this makes a functions so that you can use it over and over
    public void movement(double left, double right,int time ){
        m_leftBack.setPower(left);
        m_leftFront.setPower(left);
        m_rightBack.setPower(right);
        m_rightFront.setPower(right);
        sleep(time);
        m_leftBack.setPower(0);
        m_leftFront.setPower(0);
        m_rightBack.setPower(0);
        m_rightFront.setPower(0);
    }

    public void setup(){
        DcMotor m_leftBack;
        DcMotor m_leftFront;
        DcMotor m_rightBack;
        DcMotor m_rightFront;

        /*********DEFINING HARDWARE***************************************/

        //Motors
        m_leftBack = hardwareMap.get(DcMotor.class, "BLM");
        m_leftFront = hardwareMap.get(DcMotor.class, "FLM");
        m_rightBack = hardwareMap.get(DcMotor.class, "BRM");
        m_rightFront = hardwareMap.get(DcMotor.class, "FRM");

        //Reversing some of the motor directions to make driving easier
        m_leftFront.setDirection(DcMotor.Direction.REVERSE);
        m_leftBack.setDirection(DcMotor.Direction.REVERSE);
        m_rightBack.setDirection(DcMotor.Direction.FORWARD);
        m_rightFront.setDirection(DcMotor.Direction.FORWARD);


    }

}

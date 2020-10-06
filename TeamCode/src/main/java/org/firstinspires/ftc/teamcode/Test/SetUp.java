package org.firstinspires.ftc.teamcode.Test;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
/*this is the Class used for setup*/
public class SetUp extends LinearOpMode {
//this this where name will be stated
   public DcMotor m_leftBack;
   public DcMotor m_leftFront;
   public DcMotor m_rightBack;
   public DcMotor m_rightFront;

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
    /**this is were all functions will go to be used later**/
    // this makes a functions so that you can use it over and over
    public void setup(){
        m_leftBack = hardwareMap.get(DcMotor.class, "BLM");
        m_leftFront = hardwareMap.get(DcMotor.class, "FLM");
        m_rightBack = hardwareMap.get(DcMotor.class, "BRM");
        m_rightFront = hardwareMap.get(DcMotor.class, "FRM");

    }

    public void movement(double left, double right, int time ){
        m_leftBack.setPower(left);
        m_leftFront.setPower(left);
        m_rightBack.setPower(right);
        m_rightFront.setPower(right);
        sleep(time);
    }
}

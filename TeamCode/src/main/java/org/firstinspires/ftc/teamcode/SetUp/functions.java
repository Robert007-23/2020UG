package org.firstinspires.ftc.teamcode.SetUp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

/*this is the Class used for setup*/
public class functions extends LinearOpMode {
    //this this where name will be stated
    //motors
    public DcMotor m_leftBack;
    public DcMotor m_leftFront;
    public DcMotor m_rightBack;
    public DcMotor m_rightFront;
    public DcMotor m_intake;

    public DcMotor m_test1;
    public DcMotor m_test2;
    //Servos
    public Servo s_wobblegoal;
    public CRServo s_actuator;
    public Servo s_launcher;

    public void runOpMode() {
            setup();
    }
    /**this is were all functions will go to be used later**/
    // this makes a functions so that you can use it over and over

    public void setup(){

        /*********DEFINING HARDWARE***************************************/

        //Motors
        m_leftBack = hardwareMap.get(DcMotor.class, "BLM");
        m_leftFront = hardwareMap.get(DcMotor.class, "FLM");
        m_rightBack = hardwareMap.get(DcMotor.class, "BRM");
        m_rightFront = hardwareMap.get(DcMotor.class, "FRM");
        m_test1 = hardwareMap.get(DcMotor.class, "test1");
        m_test2 = hardwareMap.get(DcMotor.class, "test2");
        m_intake = hardwareMap.get(DcMotor.class, "INTAKE");

        //Reversing some of the motor directions to make driving easier
        m_leftFront.setDirection(DcMotor.Direction.REVERSE);
        m_leftBack.setDirection(DcMotor.Direction.REVERSE);
        m_rightBack.setDirection(DcMotor.Direction.FORWARD);
        m_rightFront.setDirection(DcMotor.Direction.FORWARD);
        m_test1.setDirection(DcMotorSimple.Direction.REVERSE);

        //Servos
        s_wobblegoal = hardwareMap.get(Servo.class, "WGS");
        s_launcher   = hardwareMap.get(Servo.class, "RL");

        //CRServo
        s_actuator = hardwareMap.get(CRServo.class, "AS");


    }

//  movement method (used to move the robot) @Auto
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

    //  driving method (used to move the robot) @Tele
    public void Driving(){
        double leftPower = Range.clip(gamepad1.left_stick_y - gamepad1.left_stick_x, -1, 1);
        double rightPower = Range.clip(gamepad1.right_stick_y + gamepad1.right_stick_x,-1 ,1);

        m_leftBack.setPower(-leftPower);
        m_leftFront.setPower(-leftPower);
        m_rightBack.setPower(-rightPower);
        m_rightFront.setPower(-rightPower);
    }

//  Intake method (Used for turning on the intake)
    public void Intake() {
        if (gamepad1.a) {
            m_intake.setPower(0.8);
        }else {
            m_intake.setPower(0);
        }
    }

//    Strafing method (used for  strafing)
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

//

//    wobble goal servo method (Used to move the wobble goal servo)
    public void WobbleGoal(double pos){
        s_wobblegoal.setPosition(pos);
    }

//    wobble goal Actuator method (Used to move the Actuator)
    public void Actuator (double speed){ s_actuator.setPower(speed);}

    public void RingLauncher (double pos){ s_launcher.setPosition(pos);}

//    MOTOR Test method(used to test motors)
    public void MotorTest(){
                if (gamepad2.a) {
                    m_test1.setPower(-0.25);
                    m_test2.setPower(-0.25);
                }
                if (gamepad2.b) {
                    m_test1.setPower(-0.50);
                    m_test2.setPower(-0.50);
                }
                 if (gamepad2.x){
                  m_test1.setPower(-0.75);
                  m_test2.setPower(-0.75);
                 }
                if (gamepad2.y){
                 m_test1.setPower(-1);
                 m_test2.setPower(-1);
                } else {
                 m_test1.setPower(0);
                 m_test2.setPower(0);
                }
    }


}

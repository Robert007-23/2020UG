package org.firstinspires.ftc.teamcode.TeleOp;

//this are the classes you need to import for this file to work
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp (name = "MyFirstTeleOP")//the @ Put the file in TeleOp mode and the "name = " tells the phone what name to belong to this file
public class MyFirstTeleOP extends LinearOpMode {
    //speed
    int rawSpeedMultiplier = 1;
    //the motors that have been defined in your code will be stated here
    private DcMotor m_leftBack;
    private DcMotor m_rightBack;
    private DcMotor m_leftFront;
    private DcMotor m_rightFront;




    @Override   // This is where you map the the defined motors with a new name that you can remember.
    public void runOpMode(){
        m_leftBack = hardwareMap.get(DcMotor.class, "BLM");
        m_rightBack = hardwareMap.get(DcMotor.class, "BRM");
        m_leftFront = hardwareMap.get(DcMotor.class, "FLM");
        m_rightFront = hardwareMap.get(DcMotor.class, "FRM");

        // Reverse the motor that runs backwards when connected directly to the REV hub
        m_leftBack.setDirection(DcMotor.Direction.FORWARD);
        m_rightBack.setDirection(DcMotor.Direction.REVERSE);
        m_leftFront.setDirection(DcMotor.Direction.FORWARD);
        m_rightFront.setDirection(DcMotor.Direction.REVERSE);


        waitForStart();// this ask the phone for when you press the start button.

        while (opModeIsActive()) {

            // Ignore this code
            //double multiplier = Range.clip(rawSpeedMultiplier - gamepad1.right_trigger, 2, 1);
            // leftbackDrive.setPower(leftPower * multiplier);
            //leftfrontDrive.setPower(leftPower * multiplier);
            //rightbackDrive.setPower(rightPower * multiplier);
            //rightfrontDrive.setPower(rightPower * multiplier);
            // Ignore this code

            //tank drive: The left stick controls the left wheels while the right stick controls the right wheels
            double leftPower = Range.clip(gamepad1.left_stick_y - gamepad1.left_stick_x, -1, 1);
            double rightPower = Range.clip(gamepad1.right_stick_y + gamepad1.right_stick_x, -1, 1);
            double v4;
            double v3;
            double v2;
            double v1;
            {
                double r = Math.hypot(gamepad1.left_stick_x, gamepad1.left_stick_y);
                double robotAngle = Math.atan2(gamepad1.left_stick_y, gamepad1.left_stick_x) - Math.PI / 4;
                double rightX = gamepad1.right_stick_x;
                v1 = r * Math.cos(robotAngle) + rightX;
                v2 = r * Math.sin(robotAngle) - rightX;
                v3 = r * Math.sin(robotAngle) + rightX;
                v4 = r * Math.cos(robotAngle) - rightX;

            }

            m_leftBack.setPower(v4);
            m_leftFront.setPower(v2);
            m_rightBack.setPower(v3);
            m_rightFront.setPower(v1);


            if (gamepad1.a) { // this looks for if you press the "A" button

                m_leftBack.setPower(1);
                m_leftFront.setPower(1);
                m_rightBack.setPower(1);
                m_rightFront.setPower(1);


            }
        }
    }
}
package org.firstinspires.ftc.teamcode.TeleOp;

//this are the classes you need to import for this file to work
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp (name = "MyFirstTeleOp")//the @ Put the file in TeleOp mode and the "name = " tells the phone what name to belong to this file
public class MyFirstTeleOp extends LinearOpMode {
    //speed
    int rawSpeedMultiplier = 1;
    //the motors that have been defined in your code will be stated here
    private DcMotor leftbackDrive;
    private DcMotor rightbackDrive;
    private DcMotor leftfrontDrive;
    private DcMotor rightfrontDrive;




    @Override   // This is where you map the the defined motors with a new name that you can remember.
    public void runOpMode(){
        leftbackDrive = hardwareMap.get(DcMotor.class, "BLM");
        rightbackDrive = hardwareMap.get(DcMotor.class, "BRM");
        leftfrontDrive = hardwareMap.get(DcMotor.class, "FLM");
        rightfrontDrive = hardwareMap.get(DcMotor.class, "FRM");

        // Reverse the motor that runs backwards when connected directly to the REV hub
        leftbackDrive.setDirection(DcMotor.Direction.FORWARD);
        rightbackDrive.setDirection(DcMotor.Direction.REVERSE);
        leftfrontDrive.setDirection(DcMotor.Direction.FORWARD);
        rightfrontDrive.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();// this ask the phone for when you press the start button.

        while (opModeIsActive()){

            // Ignore this code
            //double multiplier = Range.clip(rawSpeedMultiplier - gamepad1.right_trigger, 2, 1);
            // leftbackDrive.setPower(leftPower * multiplier);
            //leftfrontDrive.setPower(leftPower * multiplier);
            //rightbackDrive.setPower(rightPower * multiplier);
            //rightfrontDrive.setPower(rightPower * multiplier);
            // Ignore this code

            //tank drive: The left stick controls the left wheels while the right stick controls the right wheels
            double leftPower = Range.clip(gamepad1.left_stick_y - gamepad1.left_stick_x, -1, 1);
            double rightPower = Range.clip(gamepad1.right_stick_y + gamepad1.right_stick_x,-1 ,1);

            leftbackDrive.setPower(leftPower);
            leftfrontDrive.setPower(leftPower);
            rightbackDrive.setPower(rightPower);
            rightfrontDrive.setPower(rightPower);

            if(gamepad1.a){ // this looks for if you press the "A" button

                leftbackDrive.setPower(1);
                leftfrontDrive.setPower(1);
                rightbackDrive.setPower(1);
                rightfrontDrive.setPower(1);
            } 
        }
    }
}
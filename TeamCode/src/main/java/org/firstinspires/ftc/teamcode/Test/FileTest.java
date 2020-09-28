package org.firstinspires.ftc.teamcode.Test;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

@Disabled
@TeleOp(name = "FileTest")
public class FileTest extends LinearOpMode {

        SetUp functions=new SetUp();


        public void runOpMode() {

            functions.movement(1,1,1);



    }

}
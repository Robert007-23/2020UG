package org.firstinspires.ftc.teamcode.Test;

import android.os.Bundle;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "FileTest")
public class FileTest extends LinearOpMode {


        SetUp b=new SetUp();



    public void runOpMode() {
        b.movement(1,1,1);



    }

}
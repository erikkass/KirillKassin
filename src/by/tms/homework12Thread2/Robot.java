package by.tms.homework12Thread2;

import by.tms.homework12Thread.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Robot {

    public Robot() {
    }

    Head head = new Head();
    Body body = new Body();
    RightHand rightHand = new RightHand();
    LeftHand leftHand = new LeftHand();
    RightLeg rightLeg = new RightLeg();
    LeftLeg leftLeg = new LeftLeg();
    CPU cpu = new CPU();
    RAM ram = new RAM();
    HDD hdd = new HDD();

    ArrayList<Object> robotPart = new ArrayList<>(Arrays.asList(head, body, rightHand, leftHand, rightLeg, leftLeg, cpu, ram, hdd));
}

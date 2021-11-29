package by.tms.homework12Thread;

import java.util.ArrayList;
import java.util.Arrays;

public class FactoryRobots extends Thread {

    private Dump dump;

    public FactoryRobots(Dump dump) {
        this.dump = dump;
    }

    @Override
    public void run() {
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
        for (int i = 0; i < 100; i++) {
            for (int j = 0; i < 4; i++) {
                int random = (int) (Math.random() * 9);
                dump.addRobotPart(robotPart.get(random));
            }
        }
    }
}

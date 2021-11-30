package by.tms.homework12Thread2;

import java.util.ArrayList;

public class FactoryRobots extends Thread {

    private Dump dump;

    public FactoryRobots(Dump dump) {
        this.dump = dump;
    }

    @Override
    public void run() {
        Robot robot = new Robot();
        ArrayList<Object> robotPart = robot.robotPart;
        for (int i = 0; i < 100; i++) {
            int random1 = (int) (Math.random() * 4) + 1;
            for (int j = 0; i < random1; i++) {
                int random = (int) (Math.random() * 9);
                dump.addRobotPart(robotPart.get(random));
            }
        }
    }
}

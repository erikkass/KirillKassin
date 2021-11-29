package by.tms.homework12Thread;

import java.util.*;
import java.util.stream.Collectors;

public class Scientist extends Thread {

    private Dump dump;

    public Scientist(String name, Dump dump) {
        super(name);
        this.dump = dump;
    }

    @Override
    public void run() {
        List<Object> warehouse = new ArrayList<>();
        Queue<Object> robotPart;
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            robotPart = dump.getRobotPart();
            warehouse.addAll(robotPart);
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

        ArrayList<Object> robotPart2 = new ArrayList<>(Arrays.asList(head, body, rightHand, leftHand, rightLeg, leftLeg, cpu, ram, hdd));
        int count = 0;
        int robots = 400;
        for (int i = 0; i < robotPart2.size(); i++) {
            for (int j = 0; j < warehouse.size(); j++) {
                if (robotPart2.get(i).getClass() == warehouse.get(j).getClass()) {
                    count++;
                }
            }
            if (count < robots) {
                robots = count;
            }
            count = 0;
        }
        System.out.println("Собраных роботов: " + Thread.currentThread().getName() + " - " + robots);

    }
}

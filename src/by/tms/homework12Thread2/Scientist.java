package by.tms.homework12Thread2;

import java.util.*;

public class Scientist extends Thread {

    private Dump dump;
    int robots;

    public Scientist(String name, Dump dump) {
        super(name);
        this.dump = dump;
    }

    @Override
    public void run() {
        List<Object> warehouse = new ArrayList<>();
        Queue<Object> assistant;
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            assistant = dump.getRobotPart();
            warehouse.addAll(assistant);
        }
        Robot robot = new Robot();
        ArrayList<Object> robotPart2 = robot.robotPart;
        int count = 0;
        robots = 400;
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


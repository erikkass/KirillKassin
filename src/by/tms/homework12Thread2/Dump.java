package by.tms.homework12Thread2;

import by.tms.homework12Thread.Robot;

import java.util.*;

public class Dump {

    private static final int MAX_CAPACITY = 4;
    public List<Object> junk;

    public Dump() {
        by.tms.homework12Thread.Robot robot = new Robot();
        ArrayList<Object> robotPart = robot.robotPart;
        junk = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 9);
            junk.add(robotPart.get(random));
        }
    }

    public Queue getRobotPart() {
        Queue<Object> assistant = new ArrayDeque<>(MAX_CAPACITY);
        synchronized (junk) {
            if (junk.size() == 0) {
                try {
                    junk.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int random1 = (int) (Math.random() * 4) + 1;
            for (int i = 0; i < random1; i++) {
                int random2 = (int) (Math.random() * junk.size());
                assistant.add(junk.get(random2));
            }
            junk.notify();
            return assistant;
        }
    }

    public void addRobotPart(Object o) {
        synchronized (junk) {
            if (o != null) {
                junk.add(o);
            }
            junk.notify();
        }
    }

}

package by.tms.homework12Thread;

import java.util.*;

public class Dump {

    private static final int MAX_CAPACITY = 4;
    public List<Object> junk;
    private final Object LOCK = new Object();

    public Dump() {
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
        junk = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 9);
            junk.add(robotPart.get(random));
        }
    }

    public Queue getRobotPart() {
        Queue<Object> assistant = new ArrayDeque<>(MAX_CAPACITY);
        synchronized (LOCK) {
            if (junk.size() == 0) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 4; i++) {
                int random = (int) (Math.random() * junk.size());
                assistant.add(junk.get(random));
            }
            LOCK.notify();
            return assistant;
        }
    }

    public void addRobotPart(Object o) {
        synchronized (LOCK) {
            if (o != null) {
                junk.add(o);
            }
            LOCK.notify();
        }
    }

}

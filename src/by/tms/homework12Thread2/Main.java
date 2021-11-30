package by.tms.homework12Thread2;


public class Main {
    public static void main(String[] args) {
        Dump dump = new Dump();
        FactoryRobots factoryRobots = new FactoryRobots(dump);
        Scientist albertEinstein = new Scientist("Albert Einstein", dump);
        Scientist stephenHawking = new Scientist("Stephen Hawking", dump);

        albertEinstein.start();
        stephenHawking.start();
        factoryRobots.start();

        try {
            albertEinstein.join();
            stephenHawking.join();
            factoryRobots.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (albertEinstein.robots > stephenHawking.robots) {
            System.out.println("В соревновании победил: " + albertEinstein.getName());

        } else {
            System.out.println("В соревновании победил: " + stephenHawking.getName());
        }

    }
}

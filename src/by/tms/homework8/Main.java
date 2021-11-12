package by.tms.homework8;

import by.tms.homework8.task2.*;
import by.tms.homework8.task3.Mark;
import by.tms.homework8.task4.Student;
import by.tms.homework8.task4.StudentStat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        SportCar porsche = new SportCar("Porsche", "911 Turbo", "green", 10, 1990, 300);
        Truck volvo = new Truck("Volvo", "FMX", "blue", 100, 2000, 2000);
        Jeep nissan = new Jeep("Nissan", "Terrano", "black", 1500, 2005, 1.4);
        Van chevrolet = new Van("Chevrolet", "Express", "yellow", 2233, 2010, 45.2);
        SportCar audi = new SportCar("Audi", "R8", "red", 1234, 2020, 350);
        SportCar ferrari = new SportCar("Ferrari", "488", "red", 1000, 2009, 400);
        garage.parkingCar(porsche);
        garage.parkingCar(volvo);
        garage.parkingCar(nissan);
        garage.parkingCar(chevrolet);
        garage.parkingCar(audi);
        garage.parkingCar(ferrari);
        garage.departureCar(audi);
        System.out.println(garage.getCarGarage());

        List<String> list = new ArrayList<>();
        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");
        System.out.println(Mark.markLength4(list));

        StudentStat stat = new StudentStat();
        List<Student> statList = new ArrayList<>();
        statList.add(new Student("Alex", "Rogers", 20, 3.3));
        statList.add(new Student("Bob", "Wick", 19, 3.9));
        statList.add(new Student("Michael", "Jackson", 22, 5.0));
        statList.add(new Student("Anna", "Doe", 18, 4.1));
        statList.add(new Student("John", "Nash", 21, 4.9));
        System.out.print("Студент с лучшим средним баллом: ");
        stat.getBestStudentAvg(statList);
        System.out.println("\n");
        System.out.println("Сортировка по имени:");
        stat.sortStudentByName(statList);

        for (Student student : statList) {
            System.out.println("\n" + "Имя: " + student.getFirstName() + " " + student.getLastName() +
                    "\n" + "Возраст: " + student.getAge() + "\n" + "Средний балл: " + student.getPointAvg());
        }

        System.out.println();
        System.out.println("Сортировка по возрасту:");
        stat.sortStudentByAge(statList);
        for (Student student : statList) {
            System.out.println("\n" + "Имя: " + student.getFirstName() + " " + student.getLastName() +
                    "\n" + "Возраст: " + student.getAge() + "\n" + "Средний балл: " + student.getPointAvg());
        }

        System.out.println();
        System.out.println("Сортировка по среднему баллу:");
        stat.sortStudentByAvgPoint(statList);
        for (Student student : statList) {
            System.out.println("\n" + "Имя: " + student.getFirstName() + " " + student.getLastName() +
                    "\n" + "Возраст: " + student.getAge() + "\n" + "Средний балл: " + student.getPointAvg());

        }
    }
}
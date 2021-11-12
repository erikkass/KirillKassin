package by.tms.homework8.task4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentStat {

    public void getBestStudentAvg(List statList) {
        Iterator<Student> studentIterator = statList.iterator();
        while (studentIterator.hasNext()) {
            Student element2 = studentIterator.next();
            if (element2.getPointAvg() == getBestAvgPoint(statList)) {
                System.out.print(element2);
            }
        }
    }

    public double getBestAvgPoint(List list) {
        Iterator<Student> studentIterator = list.iterator();
        double bestPointAvg = 0.0;
        while (studentIterator.hasNext()) {
            Student element = studentIterator.next();
            if (element.getPointAvg() > bestPointAvg) {
                bestPointAvg = element.getPointAvg();
            }
        }
        return bestPointAvg;
    }

    public void sortStudentByName(List list) {
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student student, Student student2) {
                int result = student.getFirstName().compareTo(student2.getFirstName());
                return result == 0 ? student.getLastName().compareTo(student2.getLastName()) : result;
            }
        });
    }

    public void sortStudentByAge(List list) {
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student student, Student student2) {
                return student.getAge().compareTo(student2.getAge());
            }
        });
    }

    public void sortStudentByAvgPoint(List list) {
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student student, Student student2) {
                return student.getPointAvg().compareTo(student2.getPointAvg());
            }
        });
    }
}



package Lesson10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Student implements Comparable{
    private String name;
    private int course;
    public static void main(String[] args) {
        List<Student> listOfStudents = new LinkedList<>();
        listOfStudents.add(new Student("Ivan", 4));
        listOfStudents.add(new Student("Bogdan", 5));
        listOfStudents.add(new Student("Andriy", 2));
        listOfStudents.add(new Student("Viktor", 1));
        listOfStudents.add(new Student("Sergiy", 3));



        for (Student student: listOfStudents) {
            System.out.println(student);
        }
        System.out.println();
        printStudents(listOfStudents, 4);

        System.out.println();

        Collections.sort(listOfStudents);
        listOfStudents.forEach(System.out::println);
        System.out.println();
        Collections.sort(listOfStudents,new StudenCourseComparator());
        listOfStudents.forEach(System.out::println);

    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    public static void printStudents (List<Student> students, Integer course){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.name);
            }

        }

    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student listOfSudent = (Student)o;
        this.name.equals(listOfSudent.name);

        Integer course1 = this.course;
        Integer course2 = listOfSudent.course;
        int difference = this.name.compareTo(listOfSudent.name);
        if (difference == 0){
            return course1.compareTo(course2);
        }
        return difference;
    }
}


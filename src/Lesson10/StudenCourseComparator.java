package Lesson10;

import java.util.Comparator;

public class StudenCourseComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        int difference = (new Integer(s1.getCourse()).compareTo(new Integer(s2.getCourse())));
        if (difference ==0){
            return (s1.getName().compareTo(s2.getName()));
        }
        return difference;
    }
}
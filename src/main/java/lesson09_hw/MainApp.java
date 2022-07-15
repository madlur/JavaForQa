package lesson09_hw;

import java.util.*;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {

        List<Course> courses = prepareCourse();
        List<Student> students = prepareStudent(courses);

        List<String> uniqueCourses = getUniqueCourseNames(students);
        System.out.println("Список уникальных курсов: " + uniqueCourses.toString());
        System.out.println("Список студентов: " );
        students.stream().map(Student::getName).forEach(System.out::println);

        List<Student> top3Students = getTop3Inquisitive(students);
        System.out.println("\nТОП-3 любознательных студентов:");
        top3Students.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        List<Student> studentsOnCourse = getStudentsOnCourse(students, courses.get(2));
        System.out.println("\nСписок студентов на целевом курсе:");
        studentsOnCourse.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }

    static List<Course> prepareCourse() {
        List<Course> courses = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            courses.add(new Course("Курс " + i));
        }

        return courses;
    }

    static List<Student> prepareStudent(List<Course> courses) {
        List<Student> students = new ArrayList<>();

        Student _student = new Student("Student 1");
        _student.setCourse(courses.get(0));
        _student.setCourse(courses.get(1));
        _student.setCourse(courses.get(2));
        _student.setCourse(courses.get(3));
        _student.setCourse(courses.get(4));

        students.add(_student);

        _student = new Student("Student 2");
        _student.setCourse(courses.get(0));
        _student.setCourse(courses.get(1));
        _student.setCourse(courses.get(2));
        _student.setCourse(courses.get(3));

        students.add(_student);

        _student = new Student("Student 3");
        _student.setCourse(courses.get(0));
        _student.setCourse(courses.get(1));
        _student.setCourse(courses.get(2));

        students.add(_student);

        _student = new Student("Student 4");
        _student.setCourse(courses.get(0));
        _student.setCourse(courses.get(1));

        students.add(_student);

        return students;
    }

    static List<String> getUniqueCourseNames(List<Student> students) {
        return students.stream()
                .map(Student::getAllCourses)
                .flatMap(Collection::stream)
                .map(Course::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    static List<Student> getTop3Inquisitive(List<Student> students) {
        return students.stream()
                .sorted((stud1, stud2) -> stud2.getAllCourses().size() - stud1.getAllCourses().size())
                .limit(3)
                .collect(Collectors.toList());
    }

    static List<Student> getStudentsOnCourse(List<Student> students, Course course) {
        String courseName = course.getName();
        return students.stream()
                .filter(stud -> stud.getAllCourses().stream().anyMatch(c -> c.getName().equals(courseName)))
                .collect(Collectors.toList());
    }
}

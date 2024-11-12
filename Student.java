package week4;

import java.util.ArrayList;

public class Student {

    private ArrayList<String> students;

    public Student(){
        students = new ArrayList<>();
    }

    public void addStudent(String student) {
        students.add(student);
        System.out.println("Student added: " + student);
    }

    public void removeStudent(String student) {
        if (students.remove(student)) {
            System.out.println("Student removed: " + student);
        } else {
            System.out.println("Student not found: " + student);
        }
    }

    public void displayStudents() {
        System.out.println("Student List:");
        for (String student : students) {
            System.out.println(student);
        }
    }

    // Main method
    public static void main(String[] args) {
        Student std= new Student();
        std.addStudent("Irfan");
        std.addStudent("Mustafa");
        std.displayStudents();
        std.removeStudent("Mustafa");
        std.displayStudents();
    }
}

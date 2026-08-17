package ClassList;

import java.util.ArrayList;

public class ClassList {

    private String sectionName;
    private ArrayList<Student> students;

    public ClassList(String sectionName) {
        this.sectionName = sectionName;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayClassList() {

        System.out.println("\nClass: " + sectionName);

        for (Student student : students) {
            System.out.println(
                    student.getStudentNumber() + " - " +
                            student.getName()
            );
        }
    }
}
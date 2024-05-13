package facade;

import controller.StudentManager;
import controller.TeacherManager;

public class FacadeInfo {
    public void showStudentTeacher() {
        System.out.println("Student List");
        StudentManager.showStudentList();
        System.out.println("Teacher List");
        TeacherManager.showTeacherList();
    }
}

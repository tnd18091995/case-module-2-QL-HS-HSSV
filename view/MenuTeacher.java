package view;
import controller.TeacherManager;
import java.util.Scanner;
public class MenuTeacher {
    public static void showMenuTeacher() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----TeacherManager-----");
            System.out.println("1. Add Teacher");
            System.out.println("2. Show ListTeachers");
            System.out.println("3. Find Teacher");
            System.out.println("4. Edit Teacher");
            System.out.println("5. Remove Teacher");
            System.out.println("6. Sort Teacher By WorkDay");
            System.out.println("0. Exit ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    TeacherManager.addNewTeacher(scanner);

                    break;
                case 2:
                    TeacherManager.showTeacherList();
                    break;
                case 3:
                    System.out.println("Enter ID Teacher");
                    int id = scanner.nextInt();
                    TeacherManager.findTeacher(id);
                    break;
                case 4:
                    System.out.println("Enter ID Teacher");
                    int idEdit = scanner.nextInt();
                    TeacherManager.editTeacher(idEdit, scanner);
                    break;
                case 5:
                    System.out.println("Enter ID Teacher");
                    int idRemove = scanner.nextInt();
                    TeacherManager.removeTeachers(idRemove);
                    break;
                case 6:
                    MenuSortTeacher.sortTeacher();
                case 0:
                    System.out.println("Exit Program");
                    break;
                default:
                    System.out.println("Enter Again");
                    break;
            }
        } while (choice != 0);
    }
}
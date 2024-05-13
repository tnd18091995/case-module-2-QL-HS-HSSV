package view;
import facade.FacadeInfo;
import java.util.Scanner;

import static view.MenuStudent.showMenuStudent;
import static view.MenuTeacher.showMenuTeacher;

public class Main {

    public static void main(String[] args) {
        FacadeInfo facadeInfo = new FacadeInfo();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1. ManagerStudent");
            System.out.println("2. ManagerTeacher");
            System.out.println("3. ShowTeacher&Student");
            System.out.println("0. Exit ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    showMenuStudent();
                case 2:
                    showMenuTeacher();
                case 3:
                    facadeInfo.showStudentTeacher();
                case 0:
                    System.out.println("Exit Program");
                    break;
            }
        } while (choice != 0) ;
    }
}

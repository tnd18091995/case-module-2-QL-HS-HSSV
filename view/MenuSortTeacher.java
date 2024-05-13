package view;

import controller.TeacherManager;

import java.util.Scanner;

public class MenuSortTeacher {
    public static void sortTeacher() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----Sort Teacher-----");
            System.out.println("1. Ascending");
            System.out.println("2. Descending");
            System.out.println("0. Exit ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    TeacherManager.sortWorkDayAscending();
                    break;
                case 2:
                    TeacherManager.sortWorkDayDescending();
                    break;
                case 0:
                    System.out.println("Exit Program");
                    break;
                default:
                    System.out.println("Try Enter Again!");
                    break;
            }
        } while (choice != 0);
    }
}

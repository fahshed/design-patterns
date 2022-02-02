package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ExamController examController = new ExamController();

        Examiner examiner = new Examiner(examController);

        Student student1 = new Student(examController);
        Student student2 = new Student(examController);
        Student student3 = new Student(examController);
        Student student4 = new Student(examController);
        Student student5 = new Student(examController);

        examiner.checkScripts();
        examiner.sendScripts();

        System.out.println("\nResult:");
        student1.showMarks();
        student2.showMarks();
        student3.showMarks();
        student4.showMarks();
        student5.showMarks();

        int choice;
        while(true) {
            System.out.println("\nAny re-examine request?\n1.Yes\n2.No");
            choice = input.nextInt();
            if(choice == 1) {
                System.out.println("Student ID?");
                choice = input.nextInt();
                if(choice == 1) student1.applyReExamine();
                else if(choice == 2) student2.applyReExamine();
                else if(choice == 3) student3.applyReExamine();
                else if(choice == 4) student4.applyReExamine();
                else if(choice == 5) student5.applyReExamine();
            }
            else {
                System.out.println("Thank you.");
                break;
            }
        }
    }
}

package com.company;

public class Student extends Person {
    private int id;
    private int marks;

    private static int studentCount = 0;

    public Student(ExamController examController) {
        this.id = 1 + studentCount++;
        this.examController = examController;
        this.examController.addStudent(this);
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getId() {
        return this.id;
    }

    public int getMarks() {
        return this.marks;
    }

    public void applyReExamine() {
        System.out.println("Re-examine request sent from Student ID: " + this.id);
        this.examController.getReExamineRequest(this.id, this.marks);
    }

    public void showMarks() {
        System.out.println("Student ID: " + this.id + " Marks: "  + this.marks);
    }
}
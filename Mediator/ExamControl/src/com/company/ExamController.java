package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExamController {
    private List<Script> scripts;
    private List<Student> students;
    private Examiner examiner;

    public ExamController() {
        this.students = new ArrayList<>();
        this.scripts = new ArrayList<>();
        this.examiner = new Examiner(this);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addExaminer(Examiner examiner) {
        this.examiner = examiner;
    }

    public void receiveScripts(List<Script> scripts) {
        this.scripts = scripts;
        System.out.println("Scripts received in Exam controller office");
        this.showMarks();
        this.recheckScripts();
        this.publishResult();
    }

    private void showMarks() {
        System.out.println("Unchecked scripts:");
        for(Script script : scripts) {
            System.out.println("Student ID: " + script.id + " Marks: "  + script.marks);
        }
    }

    private void recheckScripts() {
        System.out.println("Scripts rechecked");

        boolean mistake = false;
        int change;
        Random rand = new Random();

        System.out.println("Mistakes:");
        for(Script script : scripts) {
            if(rand.nextInt(2) == 1) {
                if(rand.nextInt(2) == 1) {
                    change = 1 + rand.nextInt(100-script.marks);
                }
                else {
                    change = -1*(1+rand.nextInt(10));
                }

                System.out.println("Student ID: " + script.id + " Previous marks: "  + script.marks + " Corrected marks: "+ (script.marks+change));
                script.marks += change;
                mistake = true;
            }
        }

        if(!mistake) {
            Script script = scripts.get(rand.nextInt(5));

            if(rand.nextInt(2) == 1) {
                change = 1 + rand.nextInt(100-script.marks);
            }
            else {
                change = -1*(1+ rand.nextInt(10));
            }

            System.out.println("Student ID: " + script.id + " Previous marks: "  + script.marks + " Corrected marks: "+ (script.marks+change));
            script.marks += change;
            mistake = true;
        }
    }

    private void publishResult() {
        for(Script script : scripts) {
            students.get(script.id-1).setMarks(script.marks);
        }

        System.out.println("Result published");
    }

    public void getReExamineRequest(int id, int marks) {
        System.out.println("Re-examine request got from Student ID: " + id);
        System.out.println("Script sent to examiner for re-examine");
        this.examiner.reExamine(new Script(id, marks));
    }

    public void publishReExamineResult(Script script) {
        System.out.println("Re-examine result:");
        if(this.students.get(script.id-1).getMarks() == script.marks) {
            System.out.println("Student ID: " + script.id + " Marks: " + script.marks);
            System.out.println("No change in marks");
        }
        else {
            this.students.get(script.id-1).setMarks(script.marks);
            System.out.println("Student ID: " + script.id + " Marks: " + script.marks);
            System.out.println("Marks updated");
        }
    }
}

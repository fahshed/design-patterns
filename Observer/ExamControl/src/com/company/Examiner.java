package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Examiner extends Person {

    private List<Script> scripts;

    public Examiner(ExamController examController) {
        this.scripts = new ArrayList<>();
        this.examController = examController;
        this.examController.addExaminer(this);
    }

    public void checkScripts() {
        Random rand = new Random();
        for(int i=0; i<5; i++) {
            scripts.add(new Script(i+1, 50 + rand.nextInt(50)));
        }

        System.out.println("Scripts checked by examiner");
    }

    public void sendScripts() {
        System.out.println("Scripts and marks sent to exam controller office");
        this.examController.receiveScripts(scripts);
    }

    public void reExamine(Script script) {
        System.out.println("Script re-examined and sent to controller office");

        Random rand = new Random();
        int chance = rand.nextInt(3);
        if(chance == 1) {
            script.marks += rand.nextInt(100-script.marks+1);
            this.examController.publishReExamineResult(script);
        }
        else if(chance == 2) {
            script.marks -= rand.nextInt(10);
            this.examController.publishReExamineResult(script);
        }
        else {
            this.examController.publishReExamineResult(script);
        }
    }
}

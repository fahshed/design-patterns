package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class DriveComponent {

    protected String name;
    protected String type;
    protected List<DriveComponent> directory;


    public DriveComponent(String name, String type, List<DriveComponent> directory) {
        this.name = name;
        this.type = type;
        this.directory = new ArrayList<>();
        this.directory.addAll(directory);
    }

    public void incrementComponent() {

    }

    public int getComponentCount() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void addComponent(DriveComponent component) {

    }

    public DriveComponent getComponent(int index) {
        return null;
    }

    public void removeComponent(DriveComponent component) {

    }

    public int getComponentListSize() {
        return 0;
    }

    public void clearComponents() {

    }

    public void list() {
        for(int i=0; i<(this.directory.size()-2); i++) {
            System.out.print("\t");
        }
        System.out.println("----"+this.name);
    }

    public void getDirectory() {
        for(int i=0; i<this.directory.size(); i++) {
            System.out.print(this.directory.get(i).getName());
            if(i==0) {
                System.out.print(":\\");
            }
            else if(i<(this.directory.size()-1)) {
                System.out.print("\\");
            }
        }
        System.out.println();
    }

    public void details() {
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.print("Directory: ");
        this.getDirectory();
    }
}

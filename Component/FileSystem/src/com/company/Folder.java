package com.company;

import java.util.ArrayList;
import java.util.List;

public class Folder extends DriveComponent {

    private List<DriveComponent> componentList;
    private int componentCount;

    public Folder(String name, String type, List<DriveComponent> directory) {
        super(name, type, directory);
        this.directory.get(this.directory.size()-1).addComponent(this);
        this.directory.add(this);
        this.componentList = new ArrayList<>();
        this.componentCount = 0;
    }

    @Override
    public void getDirectory() {
        super.getDirectory();
    }

    public void incrementComponent() {
        this.componentCount++;
    }

    @Override
    public int getComponentCount() {
        return this.componentCount;
    }

    @Override
    public void addComponent(DriveComponent component) {
        this.componentList.add(component);
    }

    @Override
    public DriveComponent getComponent(int index) {
        return this.componentList.get(index);
    }

    @Override
    public void removeComponent(DriveComponent component) {
        int index = this.componentList.indexOf(component);
        DriveComponent toRemove = this.componentList.get(index);
        toRemove.clearComponents();
        this.componentList.remove(index);
    }

    @Override
    public int getComponentListSize() {
        return this.componentList.size();
    }

    @Override
    public void clearComponents() {
        for(DriveComponent component: componentList) {
            component.clearComponents();
        }
        this.componentList.clear();
    }

    @Override
    public void list() {
        super.list();
        for(DriveComponent component: componentList) {
            component.list();
        }
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Component Count: " + this.componentCount);
    }
}

package com.company;

import java.util.List;

public class File extends DriveComponent {

    public File(String name, String type, List<DriveComponent> directory) {
        super(name, type, directory);
        this.directory.get(this.directory.size()-1).addComponent(this);
        this.directory.add(this);
        for(DriveComponent component: this.directory) {
            component.incrementComponent();
        }
    }

    @Override
    public void getDirectory() {
        super.getDirectory();
    }

    @Override
    public void list() {
        super.list();
    }

    @Override
    public void details() {
        super.details();
    }
}


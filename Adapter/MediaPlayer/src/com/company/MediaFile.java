package com.company;

public class MediaFile {
    protected String name;
    protected  String type;
    protected  float size;
    protected  float duration;

    public MediaFile(String fileName, float size, float duration) {
        this.name = fileName.split("\\.")[0];
        this.type = fileName.split("\\.")[1];
        this.size = size;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public float getSize() {
        return size;
    }

    public float getDuration() {
        return duration;
    }
}

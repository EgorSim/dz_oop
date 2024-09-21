package com.company;

abstract class MusicalObject {
    private String title;

    public MusicalObject(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Название: " + title;
    }
}

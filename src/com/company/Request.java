package com.company;

public class Request {
    private Person person;
    private Song song;

    public Request(Person person, Song song) {
        this.person = person;
        this.song = song;
    }

    public Person getPerson() {
        return person;
    }

    public Song getSong() {
        return song;
    }

    @Override
    public String toString() {
        return "Заявка:\n" +
                person + "\n" +
                song;
    }
}

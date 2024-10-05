package ru.vsu.cs.simonov;

class Request {
    private Person person;
    private Playable playable;


    public Request(Person person, Playable playable) {
        this.person = person;
        this.playable = playable;
    }

    public Person getPerson() {
        return person;
    }

    public Playable getPlayable() {
        return playable;
    }

    @Override
    public String toString() {
        return "Заявка:\n" +
                person + "\n" +
                playable;
    }
}



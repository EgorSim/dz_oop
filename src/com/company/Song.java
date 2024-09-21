package com.company;

class Song extends MusicalObject {
    private String genre;
    private String artist;

    public Song(String title, String genre, String artist) {
        super(title);
        this.genre = genre;
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Жанр: " + genre + "\n" +
                "Исполнитель: " + artist;
    }
}

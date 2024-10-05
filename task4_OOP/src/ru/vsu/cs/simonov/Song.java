package ru.vsu.cs.simonov;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class Song extends MusicalObject implements Playable {
    private String genre;
    private String artist;
    private String filePath;

    public Song(String title, String genre, String artist, String filePath) {
        super(title);
        this.genre = genre;
        this.artist = artist;
        this.filePath = filePath;
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

    @Override
    public void play() throws IOException, JavaLayerException {
        File soundFile = new File(filePath);

        // Проверяем, является ли файл MP3
        if (filePath.toLowerCase().endsWith(".mp3")) {
            // Используем JLayer для воспроизведения MP3
            FileInputStream fis = new FileInputStream(soundFile);
            Player player = new Player(fis);
            System.out.println("Играет песня: " + getTitle() + " - " + getArtist());
            player.play();
        }
    }
}
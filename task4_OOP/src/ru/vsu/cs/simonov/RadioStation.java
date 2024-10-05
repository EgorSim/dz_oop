package ru.vsu.cs.simonov;

import javazoom.jl.decoder.JavaLayerException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class RadioStation {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, JavaLayerException {
        Person person = new Person("Егор", "Симонов");
        Song song = new Song("МАЙ МАЙ", "Рэп", "LOVV66", "C:\\Users\\Егор\\Desktop\\LOVV66.mp3");
        Request request = new Request(person, song);

        List<Request> requests = new ArrayList<>();
        requests.add(request);

        for (Request r : requests) {
            System.out.println(r);
            r.getPlayable().play();
        }
    }
}
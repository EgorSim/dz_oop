package ru.vsu.cs.simonov;

import javazoom.jl.decoder.JavaLayerException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

interface Playable {
    void play() throws UnsupportedAudioFileException, IOException, LineUnavailableException, JavaLayerException;
}


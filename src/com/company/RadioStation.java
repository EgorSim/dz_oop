package com.company;

public class RadioStation {

    public static void main(String[] args) {
        Person person = new Person("Егор", "Симонов");
        Song song = new Song("МАЙ МАЙ", "Рэп", "LOVV66");
        Request request = new Request(person, song);

        System.out.println(request);
    }
}

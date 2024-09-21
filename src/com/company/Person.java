package com.company;

class Person {
    private String Name;
    private String Surname;

    public Person(String Name, String Surname) {
        this.Name = Name;
        this.Surname = Surname;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    @Override
    public String toString() {
        return "Человек: " + Name + " " + Surname;
    }
}

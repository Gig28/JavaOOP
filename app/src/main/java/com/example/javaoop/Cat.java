package com.example.javaoop;
import android.util.Log;


public class Cat extends Animal{
    int age;
    String name;
    private String breed;
    private String color;


    public Cat(){

    }
    public Cat(int age, String name, String breed,String color){
        this.age = age;
        this.name = name;
        this.color = color;
        this.breed = breed;


    }

    public String talk() {
        Log.i("talk()",  "Meow! My name is " + name + ", and I'm " + age + " years old " + breed + "  " + color + ".");
        return("Meow! My name is " + name + ", and I'm " + age + " years old " + breed + "  " + color + ".");
    }

    public String talk(int age) {
        Log.i("talk()",  "Meow! My name is " + name + ", and I'm " + age + " years old " + breed + "  " + color + ".");
        return("Meow! My name is " + name + ", and I'm " + age + " years old " + breed + "  " + color + ".");
    }
    public String talk(String hello) {
        Log.i("talk()",  "Meow! My name is " + name + ", and I'm " + age + " " + hello);
        return("Meow! My name is " + name + ", and I'm " + age + " " + hello);
    }
}
package com.example.javaoop;
import android.util.Log;


public class Cat extends Animal{
    int age;
    String name;

    final static int numberOfLegs = 4;
//    private String breed;
//    private String color;
//

    public Cat(){
        this.name = "John Doe";
        this.age = -1;
    }
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }
//    public Cat(int age, String name, String breed,String color){
//        this.age = age;
//        this.name = name;
//        this.color = color;
//        this.breed = breed;
//
//
//    }

//    public String talk() {
//        Log.i("talk()",  "Meow! My name is " + name + ", and I'm " + age + " years old " + breed + "  " + color + ".");
//        return("Meow! My name is " + name + ", and I'm " + age + " years old " + breed + "  " + color + ".");
//    }
    public String talk() {
        Log.i("talk()",  "Meow! I'm cat My name is " + name + ", and I'm " + age + " years old ");
        return("Meow! My name is " + name + ", and I'm " + age + " years old ");
    }
    public String talk(int age) {
        Log.i("talk()",  "Meow! I'm cat My name is " + name + ", and I'm " + age + " years old ");
        return("Meow! My name is " + name + ", and I'm " + age + " years old ");
    }
    public String talk(String hello) {
        Log.i("talk()",  "Meow! I'm cat My name is " + name + ", and I'm " + age + " " + hello);
        return("Meow! My name is " + name + ", and I'm " + age + " " + hello);
    }

    public static final String whatCatsLike() {
        return " I like playing, jumping and sometimes scratching";}
}
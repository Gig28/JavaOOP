package com.example.javaoop;

import android.util.Log;

public class Puma extends Cat{
    public String talk() {
        Log.i("talk()",  "RRRR! I'm puma My name is " + name + ", and I'm " + age + " years old ");
        return("R-RRR! I'm puma  My name is " + name + ", and I'm " + age + " years old ");
    }
}

package com.example.javaoop;

import android.util.Log;

public class Lion extends Cat{

    public String talk() {
        Log.i("talk()",  "RRRR! I'm Lion My name is " + name + ", and I'm " + age + " years old ");
        return("R-RRR! I'm Lion My name is " + name + ", and I'm " + age + " years old ");
    }

}

package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.widget.TextView;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    Cat myCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myCat = new Cat(4, "Puma","Бенгальская","Серая");
        myCat.talk();


        Cat murzik = new Cat(3,"Murzik","Домашняя","Белая");
        murzik.talk();




        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Glasha";
        glasha.number0fLegs = 4;
        Log.i( "number0fLegs", String.valueOf(glasha.number0fLegs));
        glasha.talk();

        Puma puma = new Puma();
        puma.name = "Leo";

        puma.breathe();
        puma.talk();

        puma.isAlive = true;
        Log.i("isAlive", String.valueOf(puma.isAlive));
        Log.i("breathe()",   "My name is "  + puma.name +   "and " + puma.breathe());





        TextView textView2 = (TextView) findViewById(R.id.textView);
        textView2.setText(myCat.talk());
        TextView textView3 = (TextView) findViewById(R.id.textView2);
        textView3.setText(murzik.talk());
        TextView textView4 = (TextView) findViewById(R.id.textView3);
        textView4.setText(glasha.talk());
        TextView textView5 = (TextView) findViewById(R.id.textView4);
        textView5.setText("My name is "  + puma.name +   "and " + puma.breathe());


    }
}


package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.widget.TextView;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Cat myCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat vaska = new Cat();


        Puma bagira = new Puma();


        Cat puma = new Puma();


        Cat murzik = new Lion();

        Lion lion = new Lion();


        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(vaska);
        cats.add(bagira);
        cats.add(puma);
        cats.add(murzik);
        cats.add(lion);


        Cat cat = cats.get(0);
        Cat cat1 = cats.get(1);
        Cat cat2 = cats.get(2);
        Cat cat3 = cats.get(3);
        Cat cat4 = cats.get(5);


        Puma puma1 = (Puma)cats.get(1);
        puma1.talk();

        Cat cat5 = cats.get(4);

        if(cat5 instanceof Puma){
            Puma puma2 = (Puma)cat5;
            puma2.talk();
            TextView textView3 = (TextView) findViewById(R.id.textView);
            textView3.setText(puma2.talk());
        }else{
            TextView textView3 = (TextView) findViewById(R.id.textView);
            textView3.setText("This is not Puma");
            Log.i("instanceof", "This is not Puma");
        }




        TextView textView2 = (TextView) findViewById(R.id.textView);
        textView2.setText(puma1.talk());





//        myCat = new Cat(4, "Puma","Бенгальская","Серая");
//        myCat.talk();
//
//
//        Cat murzik = new Cat(3,"Murzik","Домашняя","Белая");
//        murzik.talk();
//
//
//
//
//        Cat glasha = new Cat();
//        glasha.age = 1;
//        glasha.name = "Glasha";
//        glasha.number0fLegs = 4;
//        Log.i( "number0fLegs", String.valueOf(glasha.number0fLegs));
//        glasha.talk();
//
//        Puma puma = new Puma();
//        puma.name = "Leo";
//
//        puma.breathe();
//        puma.talk();
//
//        puma.isAlive = true;
//        Log.i("isAlive", String.valueOf(puma.isAlive));
//        Log.i("breathe()",   "My name is "  + puma.name +   "and " + puma.breathe());
//
//
//
//
//
//        TextView textView2 = (TextView) findViewById(R.id.textView);
//        textView2.setText(myCat.talk());
//        TextView textView3 = (TextView) findViewById(R.id.textView2);
//        textView3.setText(murzik.talk());
//        TextView textView4 = (TextView) findViewById(R.id.textView3);
//        textView4.setText(glasha.talk());
//        TextView textView5 = (TextView) findViewById(R.id.textView4);
//        textView5.setText("My name is "  + puma.name +   "and " + puma.breathe());
//

    }
}


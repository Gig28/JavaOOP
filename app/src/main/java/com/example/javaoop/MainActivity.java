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

        Cat cat1 = new Cat();
        TextView textView2 = (TextView) findViewById(R.id.textView);
        textView2.setText("cat1 number of legs:  "+ cat1.number0fLegs + Cat.whatCatsLike());
        Log.i("number0fLegs", "cat1 number of legs:  "+ cat1.number0fLegs + Cat.whatCatsLike());

        Lion lion = new Lion();
        lion.talk();

        TextView textView3 = (TextView) findViewById(R.id.textView2);
        textView3.setText(lion.talk());

//        cat1.numberOfLegs--;
//
//        TextView textView3 = (TextView) findViewById(R.id.textView2);
//        textView3.setText("cat1 number of legs:  "+ cat1.number0fLegs);
//        Log.i("number0fLegs", "cat1 number of legs:  "+ cat1.number0fLegs);
//
//        Cat cat2 = new Cat();
//        TextView textView4 = (TextView) findViewById(R.id.textView3);
//        textView4.setText("cat1 number of legs:  "+ cat1.number0fLegs);
//        Log.i("number0fLegs", "cat2 number of legs:  "+ cat2.number0fLegs);

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


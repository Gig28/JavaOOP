package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;


import android.os.Bundle;

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
        glasha.breed = "Египетская";
        glasha.color = "Лысая";
        glasha.talk();
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(myCat.talk());
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(murzik.talk());
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(glasha.talk());
    }
}
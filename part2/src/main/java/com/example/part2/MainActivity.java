package com.example.part2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements topfragment2.Topfraglistener {
    //private topfragment topfrag;
    private bottomFragment2 botfrag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        botfrag = new bottomFragment2();
        getSupportFragmentManager().beginTransaction().replace(R.id.bottom_fragment2, botfrag).commit();
    }

    @Override
    public void inputTopSent(CharSequence input, String img){
        botfrag.updateEditText(input,img);
    }
}

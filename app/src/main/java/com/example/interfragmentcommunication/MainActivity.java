package com.example.interfragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements topfragment.Topfraglistener {
    //private topfragment topfrag;
    private bottomFragment botfrag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botfrag = new bottomFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.bottom_fragment, botfrag).commit();
    }

    @Override
    public void inputTopSent(CharSequence input){
        botfrag.updateEditText(input);
    }
}

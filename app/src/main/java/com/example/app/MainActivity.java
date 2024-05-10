package com.example.app;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void openSignUp(View view){
        Intent in=new Intent(this,MainActivity2.class);
        startActivity(in);
    }
    public void openHomePage(View view){

        Intent in=new Intent(this, HomePage.class);
        startActivity(in);
    }


}

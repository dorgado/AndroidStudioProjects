package com.example.fellipe.bouncingball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    View bouncingBall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bouncingBall = new BouncingBallView(this);
        setContentView(bouncingBall);
    }
}

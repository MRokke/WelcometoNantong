package com.example.admin.welcometonantong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void introshow(View view) {
        Intent intent = new Intent(this, IntroActivity.class);
        startActivity(intent);
    }

    public void foodshow(View view) {
        Intent intent = new Intent(this, FoodActivity.class);
        startActivity(intent);
    }

    public void rivershow(View view) {
        Intent intent = new Intent(this, RiverActivity.class);
        startActivity(intent);
    }

    public void hillshow(View view) {
        Intent intent = new Intent(this, HillActivity.class);
        startActivity(intent);
    }


}

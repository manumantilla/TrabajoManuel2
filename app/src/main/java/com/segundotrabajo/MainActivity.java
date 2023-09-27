package com.segundotrabajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //calendario
    public void first_button (View view){
        Intent first_button = new Intent(this, segundoActivity.class);
        startActivity(first_button);
    }
    //table notes
    public void second_button (View view){
        Intent second_button = new Intent(this, activity3.class);
        startActivity(second_button);
    }

    public void third_button (View view){
        Intent third_button = new Intent(this, Activity4.class);
        startActivity(third_button);
    }

}
package com.example.udacityapplicationmiwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void openNumbers_Activity(View view) {
        startActivity(new Intent(this ,NumbersActivity.class));
    }

    public void openFamily_Activity(View view) {
        startActivity(new Intent(this, FamilyActivity.class));
    }

    public void openPhrases_Activity (View view){
        startActivity(new Intent(this, PhrasesActivity.class));
    }

    public void openColors_Activity (View view){
        startActivity(new Intent(this, ColorsActivity.class));
    }

}

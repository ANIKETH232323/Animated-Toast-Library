package com.example.animatedtoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.animetoast.AnimeToasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Wrong(View view) {
        AnimeToasty.makeToast(this,"You Passed",R.raw.checkright,
                android.R.color.transparent,AnimeToasty.LENGTH_SHORT).show();
    }

    public void Right(View view) {
    }
}
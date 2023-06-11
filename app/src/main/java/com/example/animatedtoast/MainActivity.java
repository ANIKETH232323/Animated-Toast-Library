package com.example.animatedtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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
        AnimeToasty.makeToast(this,"You Pass",R.raw.loadingwrong, R.drawable.shape,
                AnimeToasty.LENGTH_SHORT).show();
    }

    public void Right(View view) {
    }
}
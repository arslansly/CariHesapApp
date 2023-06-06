package com.arslan.dnetcarihesapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ScreenClass extends AppCompatActivity {
    public ImageButton cariButton;
    public ImageButton stockButton;
    public ImageView imageView;
    public ImageView imageView2;
    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_class);
    }

    public void stockImageView(View view) {
        Intent intent = new Intent(ScreenClass.this, stockclass.class);
        startActivity(intent);


    }

    public void cariImageView(View view) {
        Intent intent = new Intent(ScreenClass.this, cariclass.class);
        startActivity(intent);
    }
    public void satisImageView(View view){
        Intent intent = new Intent(ScreenClass.this, satisclass.class);
        startActivity(intent);

    }
    public void satinalmaImageView(View view){
        Intent intent = new Intent(ScreenClass.this, satinAlmaclass.class);
        startActivity(intent);
    }
}
package com.example.animation;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void fade(View view){
        ImageView kilua = (ImageView)findViewById(R.id.kilua);
        ImageView gon = (ImageView)findViewById(R.id.gon);
        kilua.animate().alpha(0f).setDuration(1000);
        gon.animate().alpha(1f).setDuration(1000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

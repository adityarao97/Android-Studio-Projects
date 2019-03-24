package com.example.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void makeToast(String string){
        Toast.makeText(MainActivity.this,string,Toast.LENGTH_LONG).show();
    }

    int randomValue;
    public void guess(View view){
        EditText inputValue = (EditText)findViewById(R.id.inputValue);
        int val = Integer.parseInt(inputValue.getText().toString());
        if(val>randomValue){
            makeToast("Lower");
        }
        else if(val<randomValue){
            makeToast("Hgher");
        }
        else{
            makeToast("You guessed it! Try Again!");
            Random rand = new Random();
            randomValue = rand.nextInt(20) +1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomValue = rand.nextInt(20) +1;
    }
}

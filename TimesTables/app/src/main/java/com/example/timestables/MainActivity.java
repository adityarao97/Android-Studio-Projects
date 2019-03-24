package com.example.timestables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SeekBar timesTableSeekBar = (SeekBar)findViewById(R.id.timesTableSeekBar);
        ListView timesTableListView = (ListView)findViewById(R.id.timesTableListView);
        timesTableSeekBar.setMax(20);
        timesTableSeekBar.setProgress(10);
        timesTableSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                int min=1;
                int timesTable;
                if(progress<min){
                    timesTable=min;
                    timesTableSeekBar.setProgress(min);
                }
                else{
                    timesTable=progress;
                }
                Log.i("Seeker Value",Integer.toString(timesTable));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    int timesTable = 10;
    ArrayList<String> timesTableContent = new ArrayList<String>();
    for(int i=0;i<=10;i++){
        timesTableContent.add(Integer.toString(i*timesTable));
    }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,timesTableContent);
        timesTableListView.setAdapter(arrayAdapter);
    }
}

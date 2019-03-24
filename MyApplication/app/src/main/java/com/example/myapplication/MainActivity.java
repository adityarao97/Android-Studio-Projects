package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    public void login(View view){
//        EditText username = (EditText)(findViewById(R.id.username));
//        EditText password = (EditText)(findViewById(R.id.password));
//        Log.i("username", username.getText().toString());
//        Log.i("password",password.getText().toString());
//        Toast.makeText(MainActivity.this,"Welcome " + username.getText().toString().toUpperCase(),Toast.LENGTH_LONG).show();
    //    }

//    public void currency(View view){
//        EditText valueInDollar = (EditText)findViewById(R.id.valueInDollar);
//        Double dollarAmount = Double.parseDouble(valueInDollar.getText().toString());
//        Double rupeeAmount = dollarAmount*70;
//        Toast.makeText(MainActivity.this, "value in rupee is : " + rupeeAmount.toString(),Toast.LENGTH_LONG).show();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView = findViewById(R.id.myListView);
        final ArrayList<String> myFamily = new ArrayList<String>();
        myFamily.add("Aditya");
        myFamily.add("Mohan");
        myFamily.add("Laali");
        myFamily.add("Gunju");
        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);
        myListView.setAdapter(myArrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Hello " + myFamily.get(position), Toast.LENGTH_LONG).show();
            }
        });
    }
}

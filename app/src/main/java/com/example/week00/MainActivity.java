package com.example.week00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int counter=0;
    Button b;
    class mylistener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            counter++;
            Log.d("MCK","Counter=" + counter);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= (Button) findViewById(R.id.button);

        b.setOnClickListener(new mylistener());


    }
}

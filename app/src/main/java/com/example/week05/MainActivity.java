package com.example.week05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected  void onResume(){
        super.onResume(); //Este codigo se ejecuta antes de todo

        //En este punto la aplicacion ya cargo
        //

        Toast.makeText(this,
                "Aplicación iniciada",
                Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        Toast.makeText(this,
                "Aplicacion parada",
                Toast.LENGTH_SHORT).show();

    }
}


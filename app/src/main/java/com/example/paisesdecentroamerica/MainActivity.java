package com.example.paisesdecentroamerica;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView paises;

    String[] valores = new String[]{"Guatelala","El Salvador","Honduras","Nicaragua","Costa Rica","Panama"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paises = findViewById(R.id.lsvPaises);


        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, valores);
        paises.setAdapter(adapter);

    }
}
package com.example.climaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import com.example.climaapp.ui.adapters.ListWeatherAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<String> names;
    private FloatingActionButton fab;
    private Dialog dialog;
    private EditText etNameCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lvCurrentWeathers);
        fab = findViewById(R.id.fab);

        dialog = new Dialog(this, R.style.Theme_Dialog_Translucent);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_search_city);

        //tvNameCity =

        //fab.setBackgroundColor();
        names = new ArrayList<>();
        names.add("Managua 1");
        names.add("Ciudad Sandino 2");
        names.add("Nagarote");
        names.add("Matagalpa");

        ListWeatherAdapter listWeatherAdapter = new ListWeatherAdapter(this, R.layout.list_item, names);
        listView.setAdapter(listWeatherAdapter);

        createNewWeather();
        infoPredictionWeather();
    }

    void infoPredictionWeather(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), PronosticoinfoActivity.class);
                startActivity(intent);
            }
        });
    }

    void createNewWeather(){
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.findViewById(R.id.btnCancel).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

                dialog.findViewById(R.id.btnSearch).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        etNameCity = dialog.findViewById(R.id.editNameCity);
                        Log.d("PRUEBAS","Name City: " + etNameCity.getText());
                        dialog.dismiss();
                        etNameCity.setText("");
                    }
                });


                dialog.show();
            }
        });
    }
}
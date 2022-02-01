package com.example.climaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.climaapp.ui.CurrentWeatherViewModel;
import com.example.climaapp.ui.adapters.ListWeatherAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import retrofit2.Retrofit;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<String> names;
    private FloatingActionButton fab;
    private Dialog dialog;
    private EditText etNameCity;
    private CurrentWeatherViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(CurrentWeatherViewModel.class);
        listView = (ListView) findViewById(R.id.lvCurrentWeathers);
        fab = findViewById(R.id.fab);

        dialog = new Dialog(this, R.style.Theme_Dialog_Translucent);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_search_city);


        geWeathers();
        createNewWeather();
        infoPredictionWeather();
    }

    void geWeathers(){
        viewModel.getListCity().observe(this,  listWeather ->{
            if(listWeather.size()>0){

                ListWeatherAdapter listWeatherAdapter = new ListWeatherAdapter(this, R.layout.list_item, listWeather);
                listView.setAdapter(listWeatherAdapter);
            }

        });
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
                        getCurrentWeather(etNameCity.getText().toString());
                        dialog.dismiss();
                        etNameCity.setText("");
                    }
                });
                dialog.show();
            }
        });
    }


    void getCurrentWeather(String city){
        viewModel.getCity(city).observe(this,
                currentWeather ->{
                    if(currentWeather!=null){
                        viewModel.getWeatherLocal(currentWeather.name).observe(this, weatherLocal ->{
                            if(weatherLocal==null){
                                viewModel.insertWeather(currentWeather);
                            }
                        });
                    }else{
                        Toast.makeText(MainActivity.this,city+" no fue encontrada",
                                Toast.LENGTH_LONG).show();
                    }


                }
        );
    }

  /* void message(View view){
        Snackbar snackbar = Snackbar.make(view,"Esta ciudad no se encuentra",
                Snackbar.LENGTH_SHORT);
        snackbar.show();
    }*/



}
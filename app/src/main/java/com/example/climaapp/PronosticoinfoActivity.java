package com.example.climaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.ui.adapters.ListInfoPronosticoAdapter;
import com.example.climaapp.ui.viewmodels.WeatherForecastViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PronosticoinfoActivity extends AppCompatActivity {

    private ListView listView;
    private WeatherForecastViewModel weatherForecastViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronosticoinfo);
        Intent mIntent = getIntent();


        TextView tvCity = (TextView) findViewById(R.id.tvCityInfo);
        TextView tvHumedity = (TextView) findViewById(R.id.tvHumedityInfo);
        TextView tvTemp = (TextView) findViewById(R.id.tvTempInfo);
        TextView tvWind = (TextView) findViewById(R.id.tvWindInfo);

        CurrentWeather  currentWeather= (CurrentWeather) mIntent.getSerializableExtra("City");

        tvCity.setText(currentWeather.name);
        tvHumedity.setText(String.valueOf(currentWeather.main.humidity));
        tvTemp.setText(String.valueOf(currentWeather.main.temp));
        tvWind.setText(String.valueOf(currentWeather.wind.speed));

        weatherForecastViewModel = new ViewModelProvider(this).get(WeatherForecastViewModel.class);
        listView = (ListView) findViewById(R.id.lvInfoWeather);

        getLastWeathers(currentWeather.name);

    }

    void getLastWeathers(String cityName){
        weatherForecastViewModel.getInfoNextDay(cityName).observe(this, WeathersForecast ->{
            ListInfoPronosticoAdapter listInfoPronosticoAdapter =
                    new ListInfoPronosticoAdapter(this, R.layout.list_item_pronostico, WeathersForecast.list);
            listView.setAdapter(listInfoPronosticoAdapter);
        });
    }
}
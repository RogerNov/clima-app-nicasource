package com.example.climaapp.data.datasource.local;


import android.util.Log;


import com.example.climaapp.domain.entities.ListForecast;
import com.example.climaapp.domain.entities.WeatherForecast;
import com.example.climaapp.domain.entities.WeatherForecastListForecast;
import com.example.climaapp.domain.entities.WeatherForecastListForecastCrossRef;

import java.util.List;

import javax.inject.Inject;

public class WeatherForecastLocalDataSourceImp implements WeatherForecastLocalDataSource {
    private final WeatherDatabase weatherDatabase;

    @Inject
    public WeatherForecastLocalDataSourceImp(WeatherDatabase weatherDatabase) {
        this.weatherDatabase = weatherDatabase;
    }

    @Override
    public void insertWeatherForecast(WeatherForecast weatherForecast) {

       WeatherForecastListForecastCrossRef crossRef = new WeatherForecastListForecastCrossRef ();
        weatherDatabase.weatherForecastDao().insertWeatherForecast(weatherForecast);
        Log.d("Totales en revisar", String.valueOf(weatherDatabase.weatherForecastDao().getLastForecast().idWeatherForecast));
        crossRef.idWeatherForecast = weatherDatabase.weatherForecastDao().getLastForecast().idWeatherForecast;

        for(ListForecast forecast: weatherForecast.list){
            weatherDatabase.listForecastDao().insertListForecast(forecast);
            crossRef.idListForecast = weatherDatabase.listForecastDao().getLastForecast().idListForecast;

            weatherDatabase.listForecastDao().insertListForecast(forecast);
            weatherDatabase.weatherForecastWithListForecastDao().insert(crossRef);
        }
    }

    @Override
    public WeatherForecastListForecast getWeatherForecast(String cityName) {
        WeatherForecastListForecast datas  = new WeatherForecastListForecast();

        Log.d("Rsfd", "sdfasdfasdf");
        WeatherForecast weatherForecast =  weatherDatabase.weatherForecastDao().getByName(cityName);
        if(weatherForecast!=null){
        Log.d("todo bien","asdfasdf");
            List<WeatherForecastListForecast> f = weatherDatabase.weatherForecastWithListForecastDao().getCurrent();

            if(f.size() >0){
                for(WeatherForecastListForecast wflf: f){
                    if(wflf.weatherForecast.city.name.compareTo(cityName)==0){
                        datas = wflf;
                    }
                }
            }
        }
       return  datas;
    }


}

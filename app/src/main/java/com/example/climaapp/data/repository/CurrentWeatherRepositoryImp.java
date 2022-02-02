package com.example.climaapp.data.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.climaapp.data.datasource.local.CurrentWeatherLocalDataSource;
import com.example.climaapp.data.datasource.remote.CurrentWeatherDataSource;
import com.example.climaapp.data.datasource.remote.dtos.CurrentWeatherDto;
import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.CurrentWeatherWithWeather;
import com.example.climaapp.domain.repository.WeatherRepository;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurrentWeatherRepositoryImp implements WeatherRepository {
    private final CurrentWeatherDataSource weatherDataSource;
    private final CurrentWeatherLocalDataSource currentWeatherLocalDataSource;
    MutableLiveData<Boolean> stateInsert;
    @Inject
    public CurrentWeatherRepositoryImp(
            CurrentWeatherDataSource weatherDataSource,
            CurrentWeatherLocalDataSource currentWeatherLocalDataSource
    ) {
        this.weatherDataSource = weatherDataSource;
        this.currentWeatherLocalDataSource = currentWeatherLocalDataSource;
    }

    @Override
    public LiveData<List<CurrentWeatherWithWeather>> getListCurrentWeather() {
        return currentWeatherLocalDataSource.getCurrentWeathers();
    }

    @Override
    public MutableLiveData<Boolean> insertCurrentWeather(String cityName) {
        stateInsert = new MutableLiveData<>();

        CurrentWeather currentWeather = currentWeatherLocalDataSource.getCurrentWeather(cityName);
        if(currentWeather == null){
            weatherDataSource.getCurrentWeather(cityName).enqueue(new Callback<CurrentWeatherDto>() {
                @Override
                public void onResponse(Call<CurrentWeatherDto> call, Response<CurrentWeatherDto> response) {
                    if(response.isSuccessful()){
                        currentWeatherLocalDataSource.insertCurrentWeather(response.body());
                        stateInsert.setValue(true);
                    }
                    else {
                        stateInsert.setValue(false);
                    }
                }

                @Override
                public void onFailure(Call<CurrentWeatherDto> call, Throwable t) {
                    stateInsert.setValue(false);
                }
            });
        }

        return  stateInsert;
    }

}

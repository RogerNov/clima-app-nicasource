package com.example.climaapp.ui.viewmodels;

import androidx.hilt.Assisted;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;

import com.example.climaapp.domain.entities.WeatherForecast;
import com.example.climaapp.domain.use_case.WeatherForecastUseCase;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class WeatherForecastViewModel extends ViewModel {
    private final WeatherForecastUseCase  weatherForecastUseCase;
    private final SavedStateHandle savedStateHandle;

    @Inject
    public WeatherForecastViewModel(
            WeatherForecastUseCase weatherForecastUseCase,
            @Assisted SavedStateHandle savedStateHandle) {
        this.weatherForecastUseCase = weatherForecastUseCase;
        this.savedStateHandle = savedStateHandle;
    }

    public LiveData<WeatherForecast> getInfoNextDay(String data){
        return weatherForecastUseCase.getWeatherForecastLocal(data);
    }}

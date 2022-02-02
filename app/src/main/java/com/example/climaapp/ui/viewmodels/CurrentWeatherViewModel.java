package com.example.climaapp.ui.viewmodels;

import android.util.Log;

import androidx.hilt.Assisted;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;

import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.CurrentWeatherWithWeather;
import com.example.climaapp.domain.use_case.CurrentWeatherUseCase;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;


@HiltViewModel
public class CurrentWeatherViewModel extends ViewModel {
    private final CurrentWeatherUseCase currentWeatherUseCase;
    private final SavedStateHandle savedStateHandle;
    private MutableLiveData<Boolean> estado;

    @Inject
    public CurrentWeatherViewModel(
            CurrentWeatherUseCase currentWeatherUseCase,
            @Assisted SavedStateHandle savedStateHandle) {
        this.currentWeatherUseCase = currentWeatherUseCase;
        this.savedStateHandle = savedStateHandle;
    }


    public LiveData<List<CurrentWeatherWithWeather>> getListCity(){
        return currentWeatherUseCase.getListCurrentWeather();
    }

    public LiveData<Boolean> insertWeather(String cityName){
       return currentWeatherUseCase.insertCurrentWeather(cityName);
    }

}

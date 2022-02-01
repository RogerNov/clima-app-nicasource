package com.example.climaapp.ui;

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

    public LiveData<CurrentWeather> getCity(String data){
        LiveData<CurrentWeather> currentWeather = currentWeatherUseCase.getCurrentWeatherByName(data);
        return  currentWeather;
    }
    public LiveData<List<CurrentWeatherWithWeather>> getListCity(){
        return currentWeatherUseCase.getListCurrentWeather();
    }

    public void insertWeather(CurrentWeather currentWeather){
        currentWeatherUseCase.insertCurrentWeather(currentWeather);
    }

    public LiveData<CurrentWeather> getWeatherLocal(String name){
        return currentWeatherUseCase.getCurrentWeatherLocal(name);
    }

    public LiveData<Boolean> Loaded(){
        estado = new MutableLiveData<>();
        estado.setValue(true);
        return estado;
    }
}

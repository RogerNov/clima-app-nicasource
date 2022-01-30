package com.example.climaapp.ui;

import androidx.lifecycle.ViewModel;

import com.example.climaapp.domain.use_case.CurrentWeatherUseCase;

public class CurrentWeatherViewModel extends ViewModel {
    private final CurrentWeatherUseCase useCase;

    public CurrentWeatherViewModel(CurrentWeatherUseCase useCase) {
        this.useCase = useCase;
    }

}

package com.example.climaapp.data.datasource.local;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.climaapp.data.datasource.local.entity.CurrentWeatherEntity;
import com.example.climaapp.data.datasource.local.entity.ListForecastEntity;
import com.example.climaapp.data.datasource.local.entity.MainEntity;
import com.example.climaapp.data.datasource.local.entity.WeatherEntity;
import com.example.climaapp.data.datasource.local.entity.WeatherForecastEntity;
import com.example.climaapp.data.datasource.local.entity.WindEntity;
import com.example.climaapp.data.datasource.remote.dtos.CurrentWeatherDto;
import com.example.climaapp.data.datasource.remote.dtos.ListForecastDto;
import com.example.climaapp.data.datasource.remote.dtos.MainDto;
import com.example.climaapp.data.datasource.remote.dtos.WeatherDto;
import com.example.climaapp.data.datasource.remote.dtos.WeatherForecastDto;
import com.example.climaapp.data.datasource.remote.dtos.WindDto;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(
        entities = {
                WindEntity.class,
                WeatherEntity.class,
                MainEntity.class,
                ListForecastEntity.class,
                CurrentWeatherEntity.class,
                WeatherForecastEntity.class,
        },
        version = 1
)
public abstract  class WeatherDatabase extends RoomDatabase {
    public abstract WindDto windDto();
    public abstract WeatherDto weatherDto();
    public abstract MainDto mainDto();
    public abstract ListForecastDto listForecastDto();
    public abstract CurrentWeatherDto currentWeatherDto();
    public abstract WeatherForecastDto weatherForecastDto();

    private static  volatile  WeatherDatabase INSTANCE;
    private static  final int NUMBER_OF_THREADS =4;
    static final ExecutorService databaseExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static WeatherDatabase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (WeatherDatabase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            WeatherDatabase.class, "weather_database"
                            ).build();
                }
            }
        }

        return  INSTANCE;
    }
}
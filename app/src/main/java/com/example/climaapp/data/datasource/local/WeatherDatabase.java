package com.example.climaapp.data.datasource.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.climaapp.data.datasource.local.dao.CurrentWeatherDao;
import com.example.climaapp.data.datasource.local.dao.CurrentWeatherWithWeatherDao;
import com.example.climaapp.data.datasource.local.dao.ListForecastDao;
import com.example.climaapp.data.datasource.local.dao.MainDao;
import com.example.climaapp.data.datasource.local.dao.WeatherDao;
import com.example.climaapp.data.datasource.local.dao.WeatherForecastDao;
import com.example.climaapp.data.datasource.local.dao.WeatherForecastWithListForecastDao;
import com.example.climaapp.data.datasource.local.dao.WindDao;
import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.CurrentWeatherWeatherCrossRef;
import com.example.climaapp.domain.entities.ListForecast;
import com.example.climaapp.domain.entities.Main;
import com.example.climaapp.domain.entities.Weather;
import com.example.climaapp.domain.entities.WeatherForecast;
import com.example.climaapp.domain.entities.WeatherForecastListForecastCrossRef;
import com.example.climaapp.domain.entities.Wind;

@Database(
        entities = {
                Wind.class,
                Weather.class,
                Main.class,
                ListForecast.class,
                CurrentWeather.class,
                WeatherForecast.class,
                CurrentWeatherWeatherCrossRef.class,
                WeatherForecastListForecastCrossRef.class,
        },
        version = 1,
        exportSchema = false
)
public abstract  class WeatherDatabase extends RoomDatabase {
    public abstract WindDao windDao();
    public abstract WeatherDao weatherDao();
    public abstract MainDao mainDao();
    public abstract ListForecastDao listForecastDao();
    public abstract CurrentWeatherDao currentWeatherDao();
    public abstract WeatherForecastDao weatherForecastDao();
    public abstract CurrentWeatherWithWeatherDao currentWeatherWithWeatherDao();
    public abstract WeatherForecastWithListForecastDao weatherForecastWithListForecastDao();

/*    private static  volatile  WeatherDatabase INSTANCE;
    private static  final int NUMBER_OF_THREADS =4;
    static final ExecutorService databaseExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static WeatherDatabase getDatabase(final Context context){
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
    }*/
}
package com.example.climaapp.id;

import android.content.Context;

import androidx.room.RoomDatabase;

import com.example.climaapp.core.RetrofitHelper;
import com.example.climaapp.data.datasource.local.WeatherDatabase;
import com.example.climaapp.data.datasource.local.dao.CurrentWeatherDao;
import com.example.climaapp.data.datasource.remote.CurrentWeatherDataSource;
import com.example.climaapp.data.datasource.remote.WeatherApi;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Singleton
    @Provides
    public static Retrofit providerRetrofit(){
        return RetrofitHelper.getHelper();
    }

    @Singleton
    @Provides
    public static RoomDatabase providerDatabase(@ApplicationContext Context context){
        return WeatherDatabase.getDatabase(context);
    }

    @Singleton
    @Provides
    public static WeatherApi providerWeatherApi(Retrofit retrofit){
        return retrofit.create(WeatherApi.class);
    }


}
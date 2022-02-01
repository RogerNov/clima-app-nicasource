package com.example.climaapp.id;

import android.content.Context;

import androidx.room.Room;

import com.example.climaapp.core.Constants;
import com.example.climaapp.data.datasource.local.WeatherDatabase;
import com.example.climaapp.data.datasource.remote.WeatherApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Singleton
    @Provides
    public static WeatherApi providerRetrofit(){
        return  new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(WeatherApi.class);
    }

    @Singleton
    @Provides
    public static WeatherDatabase providerDatabase(@ApplicationContext Context context){
        return Room.databaseBuilder(
                context.getApplicationContext(),
                WeatherDatabase.class, "segund_prueba")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
    }

}
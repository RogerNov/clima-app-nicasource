package com.example.climaapp.ui.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.climaapp.R;
import com.example.climaapp.domain.entities.CurrentWeatherWithWeather;

import java.util.List;

public class ListWeatherAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CurrentWeatherWithWeather> weathers;


    public ListWeatherAdapter(Context context, int layout, List<CurrentWeatherWithWeather> names){
        this.context = context;
        this.layout = layout;
        this.weathers = names;
    }
    @Override
    public int getCount() {
        return this.weathers.size();
    }

    @Override
    public Object getItem(int i) {
        return this.weathers.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.list_item, null);

        CurrentWeatherWithWeather currentWeather = weathers.get(i);

        TextView tvCity = (TextView) v.findViewById(R.id.tvCity);
        TextView tvHumedity = (TextView) v.findViewById(R.id.tvHumedity);
        TextView tvTemp = (TextView) v.findViewById(R.id.tvTemp);
        TextView tvWind = (TextView) v.findViewById(R.id.tvWind);
        TextView tvStatus = (TextView) v.findViewById(R.id.tvStatus);

        ImageView ivWeather = (ImageView) v.findViewById(R.id.ivWeather);


        tvCity.setText(currentWeather.currentWeatherEntity.name);
        tvHumedity.setText(String.valueOf(currentWeather.currentWeatherEntity.main.humidity));
        tvTemp.setText(String.valueOf(currentWeather.currentWeatherEntity.main.temp));
        tvWind.setText(String.valueOf(currentWeather.currentWeatherEntity.wind.speed));


        if(currentWeather.weathers.size() >0){
            tvStatus.setText(currentWeather.weathers.get(0).description);

            String pathImage = currentWeather.weathers.get(0).icon;

            int resId = context.getResources().getIdentifier(
                    "sw_"+pathImage.substring(0, pathImage.length()-1),
                    "drawable", context.getPackageName()
            );

            ivWeather.setImageResource(resId);
        }

        ivWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("fasfasdf", "fasdf");
            }
        });

        return v;
    }
}

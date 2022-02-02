package com.example.climaapp.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.climaapp.R;
import com.example.climaapp.domain.entities.ListForecast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class ListInfoPronosticoAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<ListForecast> listForecasts;

    public ListInfoPronosticoAdapter(Context context, int layout, List<ListForecast> listForecasts){
        this.context = context;
        this.layout = layout;
        this.listForecasts = listForecasts;
    }
    @Override
    public int getCount() {
        return this.listForecasts.size();
    }

    @Override
    public Object getItem(int i) {
        return this.listForecasts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.list_item_pronostico, null);

        ListForecast forecast = listForecasts.get(i);
        TextView tvTemp = (TextView) view.findViewById(R.id.tvTempInfo);
        TextView tvDate = (TextView) view.findViewById(R.id.tvDateInfo);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateTime = simpleDateFormat.format(calendar.getTime());

        tvTemp.setText(String.valueOf(forecast.main.temp));
        tvDate.setText(dateTime);
        return view;
    }
}

package com.example.climaapp.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.climaapp.R;

import java.util.ArrayList;

public class ListWeatherAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<String> names;

    public ListWeatherAdapter(Context context, int layout, ArrayList<String> names){
        this.context = context;
        this.layout = layout;
        this.names = names;
    }
    @Override
    public int getCount() {
        return this.names.size();
    }

    @Override
    public Object getItem(int i) {
        return this.names.get(i);
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

        String CurrentName = names.get(i);

        TextView textView = (TextView) v.findViewById(R.id.tvCity);
        textView.setText(CurrentName);
        return v;
    }
}

package com.example.climaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.climaapp.ui.adapters.ListInfoPronosticoAdapter;

import java.util.ArrayList;

public class PronosticoinfoActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronosticoinfo);

        listView = (ListView) findViewById(R.id.lvInfoWeather);

        names = new ArrayList<>();
        names.add("Fecha 1");
        names.add("Fecha 2");
        names.add("Fecha 3");
        names.add("Fecha 4");

        ListInfoPronosticoAdapter listInfoPronosticoAdapter =
                new ListInfoPronosticoAdapter(this, R.layout.list_item_pronostico, names);

        listView.setAdapter(listInfoPronosticoAdapter);

    }
}
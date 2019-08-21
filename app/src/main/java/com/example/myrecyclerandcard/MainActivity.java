package com.example.myrecyclerandcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.Recycler_View);

        adapter = new Adapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Model("Dimas Maulana", "1414370309", "123456789"));
        mahasiswaArrayList.add(new Model("Fadly Yonk", "1214234560", "987654321"));
        mahasiswaArrayList.add(new Model("Ariyandi Nugraha", "1214230345", "987648765"));
        mahasiswaArrayList.add(new Model("Aham Siswana", "1214378098", "098758124"));
    }

}

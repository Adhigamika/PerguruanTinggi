package com.adhigamika.perguruantinggi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvUniv;
    private ArrayList<Univ> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvUniv = findViewById(R.id.rv_univ);
        rvUniv.setHasFixedSize(true);

        list.addAll(UnivData.getListData());
        showRecyclerList();
        }
    private void showRecyclerList(){
        rvUniv.setLayoutManager(new LinearLayoutManager(this));
        ListUnivAdapter listUniversitasAdapter = new ListUnivAdapter(list);
        rvUniv.setAdapter(listUniversitasAdapter);

        listUniversitasAdapter.setOnItemClickCallback(new ListUnivAdapter.onItemClickCallback(){
            @Override
            public void onItemClicked(Univ univ) {
                Intent moveIntent = new Intent( MainActivity.this, DetailUnivActivity.class);
                moveIntent.putExtra(DetailUnivActivity.ITEM_EXTRA, univ);
                startActivity(moveIntent);
            }
        });
    }

}
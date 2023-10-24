package com.example.teguh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKelompok;
    private ArrayList<Anggota> anggota = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvKelompok = findViewById(R.id.rv_kelompok);
        rvKelompok.setHasFixedSize(true);

        anggota.addAll(DataAnggota.getListData());
        showRecyclerList();

    }

    private void showRecyclerList(){
        rvKelompok.setLayoutManager(new LinearLayoutManager(this));
        AdapterAnggota listAnggota = new AdapterAnggota(anggota);
        rvKelompok.setAdapter(listAnggota);
    }
}
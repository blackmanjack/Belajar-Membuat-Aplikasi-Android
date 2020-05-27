package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHp;
    private ArrayList<Hp> list = new ArrayList<>();

    private void showSelectedHp(Hp hp) {
        Toast.makeText(this, "Kamu memilih " + hp.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHp = findViewById(R.id.rv_hp);
        rvHp.setHasFixedSize(true);

        list.addAll(HpData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvHp.setLayoutManager(new LinearLayoutManager(this));
        ListHpAdapter listHpAdapter = new ListHpAdapter(list);
        rvHp.setAdapter(listHpAdapter);

        listHpAdapter.setOnItemClickCallback(new ListHpAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hp data) {
                Intent moveIntent1 = new Intent(MainActivity.this, Detail.class);
                moveIntent1.putExtra(Detail.ITEM_EXTRA, (Parcelable) data);
                startActivity(moveIntent1);
            }
        });

    }
}

package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFp;
    private ArrayList<Fp> list = new ArrayList<>();

    private void showSelectedHp(Fp fp) {
        Toast.makeText(this, "You choose " + fp.getName(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this,Detail.class);
        String[] data = {fp.getName(), fp.getDetail(), String.valueOf(fp.getPhoto()), fp.getPrice()};
        intent.putExtra("data", data);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFp = findViewById(R.id.rv_hp);
        rvFp.setHasFixedSize(true);

        list.addAll(FpData.getListData());
        showRecyclerList();
    }


    private void showRecyclerList(){
        rvFp.setLayoutManager(new LinearLayoutManager(this));
        ListFpAdapter listFpAdapter = new ListFpAdapter(list);
        rvFp.setAdapter(listFpAdapter);

        listFpAdapter.setOnItemClickCallback(new ListFpAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Fp data) {
                showSelectedHp(data);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(MainActivity.this,profile.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }

}

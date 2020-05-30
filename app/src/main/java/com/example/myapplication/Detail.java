package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends AppCompatActivity {
    private Context context;
    ImageView foto;
    TextView tvName, tvDetail, tvPrice;
    Button btn_fav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        foto = findViewById(R.id.img_item_photo);
        tvName = findViewById(R.id.tv_item_name);
        tvDetail = findViewById(R.id.tv_item_description);
        tvPrice = findViewById(R.id.tv_item_pricee);
        btn_fav = findViewById(R.id.btn_fav);

        btn_fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Detail.this, "Added to Favorite", Toast.LENGTH_SHORT).show();
            }
        });

        Intent intent = getIntent();
        String[] data = intent.getStringArrayExtra("data");

        tvName.setText(data[0]);
        tvDetail.setText(data[1]);
        tvPrice.setText(data[3]);

        Glide.with(this)
                .load(data[2])
                .apply(new RequestOptions().override(200, 200))
                .into(foto);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
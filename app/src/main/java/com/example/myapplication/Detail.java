package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDetail = findViewById(R.id.tv_item_detail);
        TextView tvPrice = findViewById(R.id.tv_item_price);

        Hp hp = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (hp != null) {
            Glide.with(this)
                    .load(hp.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(hp.getName());
            tvDetail.setText(hp.getDetail());
            tvPrice.setText(hp.getPrice());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}

package com.adhigamika.perguruantinggi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailUnivActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_univ);

        ImageView imgUniv = findViewById(R.id.imgUniv);
        TextView tvUnivName = findViewById(R.id.tvUnivName);
        TextView tvUnivDetail = findViewById(R.id.tvUnivDetail);

        Univ univ = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(univ != null){
            Glide.with( this)
                    .load(univ.getPhoto())
                    .load(imgUniv);
            tvUnivName.setText(univ.getName());
            tvUnivDetail.setText(univ.getDetail());
        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Universitas");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
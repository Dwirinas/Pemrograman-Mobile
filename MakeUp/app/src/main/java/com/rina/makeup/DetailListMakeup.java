package com.rina.makeup;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListMakeup extends AppCompatActivity {
    private int makeup_id;
    ImageView Imgdetail;
    TextView tvName, tvDesc;
    private ArrayList<Makeup> listMakeup = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_makeup);

        makeup_id = getIntent().getIntExtra("makeup_id", 0);
        tvName = findViewById(R.id.nama_makeup);
        tvDesc = findViewById(R.id.desc_makeup);
        Imgdetail = findViewById(R.id.img_detail);

        listMakeup.addAll(MakeupData.getListData());
        setLayout();
    }

    private void setLayout() {
        tvName.setText(listMakeup.get(makeup_id).getName());
        tvDesc.setText(listMakeup.get(makeup_id).getDescription());
        Glide.with(DetailListMakeup.this)
                .load(listMakeup.get(makeup_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(Imgdetail);

        getSupportActionBar().setTitle(listMakeup.get(makeup_id).getName());
    }


}

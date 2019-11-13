package com.rina.makeup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMakeup;
    private ArrayList<Makeup>list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Daftar List Make Up");
        }

        rvMakeup = findViewById(R.id.rv_makeup);
        rvMakeup.setHasFixedSize(true);

        list.addAll(MakeupData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvMakeup.setLayoutManager(new LinearLayoutManager(this));
        CardMakeupAdapter cardMakeupAdapter = new CardMakeupAdapter(this, list);
        rvMakeup.setAdapter(cardMakeupAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.tombol, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about_me:
                startActivity(new Intent(MainActivity.this, AboutMe.class));
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}

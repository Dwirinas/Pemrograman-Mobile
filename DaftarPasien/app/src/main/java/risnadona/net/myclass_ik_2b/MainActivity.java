package risnadona.net.myclass_ik_2b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnLihat = findViewById(R.id.lihatbtn);
        Button btnInput = findViewById(R.id.inputbtn);
        Button btnInfo = findViewById(R.id.infobtn);

        btnLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LihatData = new Intent(MainActivity.this, LihatData.class);
                startActivity(LihatData);
            }
        });
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InputData = new Intent(MainActivity.this, InputData.class);
                startActivity(InputData);
            }
        });
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Info = new Intent(MainActivity.this, Informasi.class);
                startActivity(Info);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu mn) {
        getMenuInflater().inflate(R.menu.menu_main, mn);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.action_profil) {
            Intent profil = new Intent(this, ProfilActivity.class);
            startActivity(profil);
            return true;
        } else if (item.getItemId() == R.id.change_language_setting) {
            Intent mIntent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(mIntent);
        }
        return super.onOptionsItemSelected(item);


    }
}


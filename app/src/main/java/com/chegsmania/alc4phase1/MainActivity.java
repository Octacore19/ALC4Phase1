package com.chegsmania.alc4phase1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String WEB_URL = "https://www.andela.com/alc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(this);
        Button profileButton = findViewById(R.id.profile_button);
        profileButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.about_button:
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                intent.putExtra(AboutActivity.INTENT_EXTRA, WEB_URL);
                startActivity(intent);
                break;
            case R.id.profile_button:
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                break;
            default:
                break;
        }
    }
}

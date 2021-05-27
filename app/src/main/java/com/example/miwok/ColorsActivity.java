package com.example.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.miwok.R;
import com.example.miwok.Word;
import com.example.miwok.WordAdapter;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ColorsFragment())
                .commit();
    }
}
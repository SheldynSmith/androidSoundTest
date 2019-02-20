package com.example.soundtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MusicNotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_notes);
    }

    public void showUnicode(View view) {
        String character = "a";
        //character.toChars(0x10400);

        Toast.makeText(this, character, Toast.LENGTH_SHORT).show();
    }
}

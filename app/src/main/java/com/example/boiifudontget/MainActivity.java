package com.example.boiifudontget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newpage(View view)
    {
        startActivity(new Intent(MainActivity.this,ndpage.class));

    }

    public void CALLPAGE(View view)
    {
        startActivity(new Intent(MainActivity.this,CallPage.class));
    }

    public void IMGEdit(View view)
    {
        startActivity(new Intent(MainActivity.this,IMGEditor.class));
    }
}
package com.example.boiifudontget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CallPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_page);
    }

    public void MakeCall(View view)
    {
        EditText phoneNumber = findViewById(R.id.etPhone);
        String ph= phoneNumber.getText().toString();
        Intent callIntent =new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse(ph));
        startActivity(callIntent);
    }
}
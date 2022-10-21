package com.example.boiifudontget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ndpage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndpage);

    }



    public void back(View view){
        startActivity(new Intent(ndpage.this, MainActivity.class));

}

    public void sendSMS(View view)
    {
        EditText message = findViewById(R.id.message);
        EditText phoneNumber = findViewById(R.id.etphone);
        String ph= phoneNumber.getText().toString();
        String msg= message.getText().toString();
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(ph, null, "msg", null, null);
    }
}
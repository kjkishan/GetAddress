package com.example.kishan.getaddress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GetAddressActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_address);
        String getData=getIntent().getStringExtra("Address");
        tv= (TextView) findViewById(R.id.tv);
        tv.setText(getData);

    }
}

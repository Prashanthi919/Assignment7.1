package com.example.prashu.assignment71;

import android.app.SearchManager;
import android.content.Intent;
import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.prashu.assignment71.R.*;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name;
    Button google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        name = (EditText)findViewById(R.id.name);
        google = (Button)findViewById(R.id.google);
        google.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        String s= name.getText().toString();
        Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
        i.putExtra(SearchManager.QUERY,s);
        startActivity(i);
    }
}

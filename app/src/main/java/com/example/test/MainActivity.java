package com.example.test;

import androidx.appcompat.app.ActionBar;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.TextView;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);

        Button login = (Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, login_page.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {

    }

}

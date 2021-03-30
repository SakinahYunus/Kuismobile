package com.example.kuismobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }
    public void ClickHome(View view) {
        recreate();
    }

    public void ClickMessage(View view) {

    }

    public void ClickLogout(View view) {
        MainActivity.logout(this);
    }

    public void ClickBack(View view) {
        Intent a = new Intent(Biodata.this, MainActivity.class);
        startActivity(a);
    }
}


package com.example.xerces.navigationdrawerdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.xerces.navigationdrawerdemo.R;

public class Registration_form extends AppCompatActivity {

    Toolbar toolbar;
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);

        setSupportActionBar(toolbar);
        toolbar = (Toolbar) findViewById(R.id.generic_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnNext = (Button)findViewById(R.id.button_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration_form.this,ActivityCourseDetail.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

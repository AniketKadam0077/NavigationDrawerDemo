package com.example.xerces.navigationdrawerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

/**
 * Created by Admin on 10/22/2016.
 */
public class ActivityCourseDetail extends AppCompatActivity {

    Button btnPayment;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_course_detail);

        setSupportActionBar(toolbar);
        toolbar = (Toolbar) findViewById(R.id.generic_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnPayment = (Button) findViewById(R.id.button_payment);
        btnPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityCourseDetail.this, ActivityPayment.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

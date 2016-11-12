package com.example.xerces.navigationdrawerdemo;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DialogTitle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class IESActivity extends AppCompatActivity {

    private TextView about,syllabus,exampattern,eligilibilty,previous_question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ies);

        initview();
    }
    public void initview(){

        about = (TextView)findViewById(R.id.txtAboutIes);
        syllabus = (TextView)findViewById(R.id.txtsyllabus);
        exampattern = (TextView)findViewById(R.id.txtExamPattern);
        eligilibilty = (TextView)findViewById(R.id.txtEligibility);
        previous_question = (TextView)findViewById(R.id.txtPreviousQues);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create custom dialog object
                final Dialog dialog = new Dialog(IESActivity.this);
                // Include dialog.xml file
                dialog.setContentView(R.layout.dialog_ies_about);
                // Set dialog title
                dialog.setTitle("About IES");

                // set values for custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.textabouties);
                text.setText("Custom dialog Android example.");
//                ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
//                image.setImageResource(R.drawable.image0);

                dialog.show();

                Button declineButton = (Button) dialog.findViewById(R.id.button_close);
                // if decline button is clicked, close the custom dialog
                declineButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Close dialog
                        dialog.dismiss();
                    }
                });


            }
        });
    }
}

package com.example.xerces.navigationdrawerdemo.Fragment;

import android.app.Dialog;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xerces.navigationdrawerdemo.R;
import com.example.xerces.navigationdrawerdemo.Registration_form;

/**
 * Created by Admin on 10/22/2016.
 */
public class Login extends Fragment {

    View view;
  private Button login,forgot_pass,new_user;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_login,container,false);
        getActivity().setTitle("Login");

        login = (Button)view.findViewById(R.id.button_login);
        forgot_pass = (Button)view.findViewById(R.id.button_forgot_password);
        new_user = (Button)view.findViewById(R.id.button_new_user);


        forgot_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Create custom dialog object
                final Dialog dialog = new Dialog(getActivity());
                // Include dialog.xml file
                dialog.setContentView(R.layout.dialog_forgot_password);
                // Set dialog title
                dialog.setTitle("Reset Password");


                // set values for custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.textDialog);
                dialog.show();

                final EditText emailValidate = (EditText)dialog.findViewById(R.id.edit_email);



                Button declineButton = (Button) dialog.findViewById(R.id.button_cancel);
                // if decline button is clicked, close the custom dialog
                declineButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Close dialog
                        dialog.dismiss();
                    }
                });
                Button sendButton = (Button) dialog.findViewById(R.id.button_send);
                // if decline button is clicked, close the custom dialog
                sendButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Close dialog
                        dialog.dismiss();
                    }
                });

            }
        });

        new_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), Registration_form.class);
                startActivity(intent);
            }
        });


        return view;
    }
}


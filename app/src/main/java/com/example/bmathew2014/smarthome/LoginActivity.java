package com.example.bmathew2014.smarthome;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bmathew2014.supportclasses.MainActivity;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;
    EditText password;
    EditText email_address;
    Button login;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        password = (EditText) findViewById(R.id.input_password);
        email_address = (EditText) findViewById(R.id.input_email);
        login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(email_address.getText().toString().equalsIgnoreCase("admin") &&
                        password.getText().toString().equalsIgnoreCase("123")){
                        Intent  intent = new Intent(getApplicationContext(),DashboardActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),"Login Sucessful",Toast.LENGTH_LONG);
                    }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG);

                }
                }
            });

        }

    }
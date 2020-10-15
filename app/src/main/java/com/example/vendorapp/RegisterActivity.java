package com.example.vendorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView toolbar_title;
    EditText edtUsername_Register, edtEmail, edtPassword_register, edtCountry, edtMobile;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        init();
        toolbar_title.setText("Register");
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
    }


    public void init() {
        toolbar = findViewById(R.id.toolbar);
        toolbar_title = toolbar.findViewById(R.id.toolbar_title);
        edtUsername_Register = findViewById(R.id.username_register);
        edtEmail = findViewById(R.id.email);
        edtPassword_register = findViewById(R.id.password_register);
        edtCountry = findViewById(R.id.country);
        edtMobile = findViewById(R.id.mobile);
        btnRegister = findViewById(R.id.btnRegister);
    }
}
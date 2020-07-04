package com.example.descuentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvUsername,tvUserPwd;
    EditText etUsername,etUserPwd;
    ImageView ivBrand;
    Button btnLogIn,btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvUsername = findViewById(R.id.tvUsername);
        tvUserPwd = findViewById(R.id.tvUserPwd);
        etUsername=findViewById(R.id.etUsername);
        etUserPwd=findViewById(R.id.etUserPwd);
        btnLogIn=findViewById(R.id.btnLogIn);

        tvUsername.setText(getResources().getString(R.string.tvusern));
        tvUserPwd.setText(getResources().getString(R.string.tvuserpwd));

        etUsername.setHint(getResources().getString(R.string.etusern));
        etUserPwd.setHint(getResources().getString(R.string.etpwd));

        btnLogIn.setText(getResources().getString(R.string.btnlogin));

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(getResources().getString(R.string.logActivity),getResources().getString(R.string.logMA_username)+etUsername.getText().toString());

                Intent intent = new Intent(MainActivity.this,PrincipalActivity.class);

                startActivity(intent);

            }
        });

    }
}

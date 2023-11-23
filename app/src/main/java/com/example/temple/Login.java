package com.example.temple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button Login,Signup;
    TextView username,passowrd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Login=findViewById(R.id.llgoin);
        Signup=findViewById(R.id.lsignup);
        username=findViewById(R.id.luname);

    }
}
package com.example.temple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Login.this, "signup now ", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Login.this,SignUp.class);
                startActivity(intent);
            }
        });

    }
}
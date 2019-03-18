package com.example.lembrets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.BootstrapButton;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    BootstrapButton Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Login = (BootstrapButton) findViewById(R.id.btnlogin);

        Login.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if(view != null) {

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

        Toast.makeText(this, "Direcionamento para tela cadastro!", Toast.LENGTH_LONG).show();

    }
}

package com.arslan.dnetcarihesapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     public Button  loginButton;
     EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();


        loginButton = (Button) findViewById(R.id.login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }
      public void loginButton (View view){

          if(username.getText().toString().equals("Dnet")&&
                  password.getText().toString().equals("123456")){
              Intent intent = new Intent(MainActivity.this, ScreenClass.class);
              startActivity(intent);

          } else {
              Toast.makeText(MainActivity.this, "Hatalı Kullanıcı veya Şifre",Toast.LENGTH_LONG).show();
          }

      }

}
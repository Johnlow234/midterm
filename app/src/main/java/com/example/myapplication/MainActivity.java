package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private EditText editUsername, editPassword;
    private Button btnLogin;
    String username= "Johnlow234" , password = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findviews();
        setLister();
    }


    private void findviews(){

       editUsername = findViewById(R.id.ET_Username);
       editPassword = findViewById(R.id.ET_Password);
       btnLogin = findViewById(R.id.Btn_login);

    }

    private  void setLister(){

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputUsername = editUsername.getText().toString();
                String inputPassword = editPassword.getText().toString();

                if(inputUsername.equals(username) && inputPassword.equals(password)){
                    Intent i = new Intent(MainActivity.this, GameActivity.class);
                    startActivity(i);
                    finish();
                }else{

                    Toast.makeText(MainActivity.this, "Invalid username / password!", Toast.LENGTH_SHORT).show();

                }

            }
        });




    }

}




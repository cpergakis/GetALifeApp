package com.mobile.pergakis.getalife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button) findViewById(R.id.button5);
    }
    public void LoginClicked(View v){
        Intent intent = new Intent(this, Landing.class);
        startActivity(intent);
    }
}

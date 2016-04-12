package com.mobile.pergakis.getalife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Landing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        Button discover = (Button) findViewById(R.id.button2);
        Button search = (Button) findViewById(R.id.button3);
        Button community = (Button) findViewById(R.id.button4);
    }

    public void DiscoverClicked(View v){
        Intent intent = new Intent(this, Discover.class);
        startActivity(intent);
    }
}

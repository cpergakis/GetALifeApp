package com.mobile.pergakis.getalife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Discover extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        Button find = (Button) findViewById(R.id.button6);
        Button pursue = (Button) findViewById(R.id.button7);

        pursue.setEnabled(false);
    }

    public void FindClicked(View v){
        Intent intent = new Intent(this, Find.class);
        startActivity(intent);
    }
}

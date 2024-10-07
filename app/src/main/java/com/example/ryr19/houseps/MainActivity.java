package com.example.ryr19.houseps;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exit = (Button) findViewById(R.id.exit);
        chk = (Button) findViewById(R.id.offStranger);

        exit.setOnClickListener(ClickListener_exit);
    }

    Button.OnClickListener ClickListener_exit = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //chk.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.stranger));
            finish();
        }
    };
}

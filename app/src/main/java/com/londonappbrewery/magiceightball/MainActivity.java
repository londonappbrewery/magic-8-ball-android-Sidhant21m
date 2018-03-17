package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button AskButton = (Button)findViewById(R.id.button_ask);
        final ImageView img = (ImageView)findViewById(R.id.BallImage);
        final int[] imgarray = {R.drawable.ball1,R.drawable.ball2,
                                R.drawable.ball3,R.drawable.ball4,
                                R.drawable.ball5};

        AskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rng = new Random();
                int no = rng.nextInt(5);
                img.setImageResource(imgarray[no]);
            }
        });


    }
}
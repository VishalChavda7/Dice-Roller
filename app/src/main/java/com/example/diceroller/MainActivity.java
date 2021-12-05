package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView hading,Result;
    ImageView imageView;
    Button Roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hading = findViewById(R.id.hading);
        Result = findViewById(R.id.Result);
        Roll = findViewById(R.id.Roll);

        Roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int r = rand.nextInt(6)+1;

                Result.setText(Integer.toString(r));

                ImageView imageView = findViewById(R.id.imageView);

                switch (r){
                    case 1 :
                        imageView.setImageResource(R.drawable.one);
                        break;
                    case 2 :
                        imageView.setImageResource(R.drawable.two);
                        break;
                    case 3 :
                        imageView.setImageResource(R.drawable.three);
                        break;
                    case 4 :
                        imageView.setImageResource(R.drawable.four);
                        break;
                    case 5 :
                        imageView.setImageResource(R.drawable.five);
                        break;
                    case 6 :
                        imageView.setImageResource(R.drawable.six);
                        break;
                }
            }
        });
    }
}
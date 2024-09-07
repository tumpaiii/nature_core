package com.example.assignments1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.assignments1.R;
import com.example.assignments1.R;

public class MainActivity extends AppCompatActivity {

    String[] quotes ={
            "I go to nature to be soothed and healed, and to have my senses put in order.",
            "And miles to go before I sleep!",
            "like an butterfly"

    };
    int[] images = {
            R.drawable.green,
            R.drawable.trees,
            R.drawable.butterfly
    };

    int currentIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = findViewById(R.id.text_about_nature);
        ImageView imageView = findViewById(R.id.nature_image);
        Button button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = (currentIndex + 1) % quotes.length;
                textView.setText(quotes[currentIndex]);
                imageView.setImageResource(images[currentIndex]);
                Toast.makeText(MainActivity.this, "Thanks For Watching!", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
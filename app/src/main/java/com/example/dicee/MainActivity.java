package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Link the views in the layout xml file to the java code
        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        Button myButton = (Button) findViewById(R.id.rollButton);

        // Store the dice images in an array (collection)
        final int[] diceArray = new int[] {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        // Tell the button to listen for clicks
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This code gets executed when the button is pressed

                // Create a random number generator
                Random randomNumberGenerator = new Random();

                // Make the random number generator spit out a new random number
                int number = randomNumberGenerator.nextInt(6);

                // Print this random number to the logcat to see it in the Android monitor
                Log.d("Dicee", "The number is " + number );

                // grab a random dice image from the diceArray. Then tell the ImageView to display
                // this image
                leftDice.setImageResource(diceArray[number]);

                // Create a new random number
                number = randomNumberGenerator.nextInt(6);

                // Set the right dice image using an image from the diceArray.
                rightDice.setImageResource(diceArray[number]);

            }
        });

    }
}
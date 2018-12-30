package com.niagacendekia.dicee;

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

        Button rollButton= (Button) findViewById(R.id.btn_roll);
        final ImageView imgLeftDice = (ImageView) findViewById(R.id.img_dice_left);
        final ImageView imgRightDice = (ImageView) findViewById(R.id.img_dice_right);

        final int[] diceArray = {R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumber = new Random();
                int numberLeft = randomNumber.nextInt(6);
                int numberRight = randomNumber.nextInt(6);

                imgLeftDice.setImageResource(diceArray[numberLeft]);
                imgRightDice.setImageResource(diceArray[numberRight]);

            }
        });
    }
}

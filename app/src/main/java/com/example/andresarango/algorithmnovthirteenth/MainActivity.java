package com.example.andresarango.algorithmnovthirteenth;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    NumberGuesser mNumberGuesser;
    private Button mTooHighButton;
    private Button mTooLowButton;
    private Button mCorrectButton;
    private TextView mGuessedNumbertv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTooHighButton = (Button) findViewById(R.id.too_high_button);
        mTooLowButton = (Button) findViewById(R.id.too_low_button);
        mCorrectButton = (Button) findViewById(R.id.correct_button);
        mGuessedNumbertv = (TextView) findViewById(R.id.guessed_number_textview);
        mNumberGuesser = new NumberGuesser(1000);
        mGuessedNumbertv.setText(Integer.toString(mNumberGuesser.getGuess()));
        mTooHighButton.setOnClickListener(getClickListener());
        mTooLowButton.setOnClickListener(getClickListener());
        mCorrectButton.setOnClickListener(getClickListener());
    }

    private View.OnClickListener getClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == mTooHighButton){
                    mNumberGuesser.isGuessTooLow(false);
                }else if(view == mTooLowButton){
                    mNumberGuesser.isGuessTooLow(true);
                }else if(view == mCorrectButton){
                    mGuessedNumbertv.setBackgroundColor(Color.parseColor("#00FF00"));
                }
                mGuessedNumbertv.setText(Integer.toString(mNumberGuesser.getGuess()));
            }
        };
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mGuessedNumbertv.setText(Integer.toString(mNumberGuesser.getGuess()));
    }

}

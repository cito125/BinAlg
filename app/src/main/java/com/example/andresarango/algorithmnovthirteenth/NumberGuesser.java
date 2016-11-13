package com.example.andresarango.algorithmnovthirteenth;

/**
 * Created by andresarango on 11/13/16.
 */

public class NumberGuesser {
    int mGuess;
    int mLowerBound;
    int mUpperBound;

    public NumberGuesser(int arraySize){
        mUpperBound = arraySize;
        mGuess = mUpperBound/2;
        mLowerBound = 0;
    }

    public int getGuess(){
       return mGuess;
    }

    public void isGuessTooLow(boolean guessIsTooLow){
        updateBounds(guessIsTooLow);
        changeGuess();
    }

    private void changeGuess() {
        mGuess = ((mUpperBound - mLowerBound)/2) + mLowerBound;
    }


    public void updateBounds(boolean guessIsTooLow){
        if(guessIsTooLow){
            mLowerBound = mGuess;
        }else{
            mUpperBound = mGuess;

        }
    }

}

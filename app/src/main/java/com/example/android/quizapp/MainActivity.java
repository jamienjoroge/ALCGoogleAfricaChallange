package com.example.android.quizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //QUESTION 1
    RadioButton question1_choice3;

    //QUESTION 2
    EditText question2_text;

    //QUESTION 3
    CheckBox question3_check1;
    CheckBox question3_check2;
    CheckBox question3_check3;
    CheckBox question3_check4;


    //QUESTION 4
    RadioButton question4_choice1;

    //QUESTION 5
    RadioButton question5_choice3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void checkScore(View view){
        String resultsScore;
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int final_score;

        /**
         * Question 1 Logic checks if the correct answer is selected
         */
        Boolean answer1;

        question1_choice3 = (RadioButton) this.findViewById(R.id.question1_choice3);
        answer1 = question1_choice3.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        /**
         * Question 2 compares the String entered to the correct answer which is Nairob
         */
        String answer2;
        question2_text = (EditText) this.findViewById(R.id.question2_text);
        answer2 = question2_text.getText().toString().toLowerCase();
        if (answer2.equals("nairobi")) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        /**
         * Question 3 check if the two correct check Boxe have been checked
         */
        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        Boolean answer3_choice4;
        question3_check1 = (CheckBox) this.findViewById(R.id.question3_check1);
        question3_check2 = (CheckBox) this.findViewById(R.id.question3_check2);
        question3_check3 = (CheckBox) this.findViewById(R.id.question3_check3);
        question3_check4 = (CheckBox) this.findViewById(R.id.question3_check4);
        answer3_choice1 = question3_check1.isChecked();
        answer3_choice2 = question3_check2.isChecked();
        answer3_choice3 = question3_check3.isChecked();
        answer3_choice4 = question3_check4.isChecked();
        if (!answer3_choice1 && answer3_choice2 && answer3_choice3 && !answer3_choice4) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        /**
         * Question 4 checks for Correct Answer
         */
        Boolean answer4;
        question4_choice1 = (RadioButton) this.findViewById(R.id.question4_choice1);
        answer4 = question4_choice1.isChecked();
        if (answer4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }
        /**
         * Question 5 Logic checks if the correct answer is selected
         */
        Boolean answer5;

        question5_choice3 = (RadioButton) this.findViewById(R.id.question5_choice3);
        answer1 = question5_choice3.isChecked();
        if (answer1) {
            answer5_score = 1;
        } else {
            answer1_score = 0;
        }

        /**
         * Calculate FinalScore
         */
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer4_score;
        if (final_score == 5) {
            resultsScore = "Perfect! You scored 5 out of 5";
        } else {
            resultsScore = "Try again. You scored " + final_score + " out of 4";
        }
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsScore, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }
}

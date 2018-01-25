package com.example.android.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view) {
        int noOfCorrectQuestions = 0;
        String incorrectQuestions = "";
        if (checkQuestion1()) {
            noOfCorrectQuestions = noOfCorrectQuestions + 1;
        } else {
            incorrectQuestions = incorrectQuestions + " 1";
        }
        if (checkQuestion2()) {
            noOfCorrectQuestions = noOfCorrectQuestions + 1;
        } else {
            incorrectQuestions = incorrectQuestions + " 2";
        }
        if (checkQuestion3()) {
            noOfCorrectQuestions = noOfCorrectQuestions + 1;
        } else {
            incorrectQuestions = incorrectQuestions + " 3";
        }
        if (checkQuestion4()) {
            noOfCorrectQuestions = noOfCorrectQuestions + 1;
        } else {
            incorrectQuestions = incorrectQuestions + " 4";
        }
        if (checkQuestion5()) {
            noOfCorrectQuestions = noOfCorrectQuestions + 1;
        } else {
            incorrectQuestions = incorrectQuestions + " 5";
        }
        String textToDisplay = getString(R.string.result_text) + " " + noOfCorrectQuestions;
        if (!incorrectQuestions.isEmpty()) {
            textToDisplay = textToDisplay + "\n" + getString(R.string.incorrect_questions) + incorrectQuestions;
        }
        Toast.makeText(getApplicationContext(),
                textToDisplay, Toast.LENGTH_LONG).show();
    }


    private boolean checkQuestion5() {
        boolean result = false;
        RadioGroup answerGroup = (RadioGroup) findViewById(R.id.q5_answer);
        RadioButton checkedButton = (RadioButton) findViewById(answerGroup.getCheckedRadioButtonId());
        String answer = checkedButton.getTag().toString();
        String correctAnswer = getString(R.string.q5_correct_answer);
        if (correctAnswer.equals(answer)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private boolean checkQuestion4() {
        boolean result = false;
        CheckBox firstBox = (CheckBox) findViewById(R.id.q4_a1);
        CheckBox secondBox = (CheckBox) findViewById(R.id.q4_a2);
        CheckBox thirdBox = (CheckBox) findViewById(R.id.q4_a3);

        String correctAnswer = getString(R.string.q4_correct_answer);
        if (correctAnswer.equals("1")) {
            result = firstBox.isChecked() && !secondBox.isChecked() && !thirdBox.isChecked();
        } else if (correctAnswer.equals("2")) {
            result = !firstBox.isChecked() && secondBox.isChecked() && !thirdBox.isChecked();
        } else if (correctAnswer.equals("3")) {
            result = !firstBox.isChecked() && !secondBox.isChecked() && thirdBox.isChecked();
        } else if (correctAnswer.equals("12")) {
            result = firstBox.isChecked() && secondBox.isChecked() && !thirdBox.isChecked();
        } else if (correctAnswer.equals("13")) {
            result = firstBox.isChecked() && !secondBox.isChecked() && thirdBox.isChecked();
        } else if (correctAnswer.equals("23")) {
            result = !firstBox.isChecked() && secondBox.isChecked() && thirdBox.isChecked();
        } else if (correctAnswer.equals("123")) {
            result = firstBox.isChecked() && secondBox.isChecked() && thirdBox.isChecked();
        }
        return result;
    }

    private boolean checkQuestion3() {
        boolean result = false;
        RadioGroup answerGroup = (RadioGroup) findViewById(R.id.q3_answer);
        RadioButton checkedButton = (RadioButton) findViewById(answerGroup.getCheckedRadioButtonId());
        String answer = checkedButton.getTag().toString();
        String correctAnswer = getString(R.string.q3_correct_answer);
        if (correctAnswer.equals(answer)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private boolean checkQuestion2() {
        boolean result = false;
        CheckBox firstBox = (CheckBox) findViewById(R.id.q2_a1);
        CheckBox secondBox = (CheckBox) findViewById(R.id.q2_a2);
        CheckBox thirdBox = (CheckBox) findViewById(R.id.q2_a3);

        String correctAnswer = getString(R.string.q2_correct_answer);
        if (correctAnswer.equals("1")) {
            result = firstBox.isChecked() && !secondBox.isChecked() && !thirdBox.isChecked();
        } else if (correctAnswer.equals("2")) {
            result = !firstBox.isChecked() && secondBox.isChecked() && !thirdBox.isChecked();
        } else if (correctAnswer.equals("3")) {
            result = !firstBox.isChecked() && !secondBox.isChecked() && thirdBox.isChecked();
        } else if (correctAnswer.equals("12")) {
            result = firstBox.isChecked() && secondBox.isChecked() && !thirdBox.isChecked();
        } else if (correctAnswer.equals("13")) {
            result = firstBox.isChecked() && !secondBox.isChecked() && thirdBox.isChecked();
        } else if (correctAnswer.equals("23")) {
            result = !firstBox.isChecked() && secondBox.isChecked() && thirdBox.isChecked();
        } else if (correctAnswer.equals("123")) {
            result = firstBox.isChecked() && secondBox.isChecked() && thirdBox.isChecked();
        }
        return result;
    }

    private boolean checkQuestion1() {
        boolean result = false;
        EditText question1Answer = findViewById(R.id.q1_a);

        String answer = question1Answer.getText().toString();

        String correctAnswer = getString(R.string.q1_correct_answer);
        if (correctAnswer.equalsIgnoreCase(answer)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

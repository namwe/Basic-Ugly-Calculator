package com.example.basiccalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button clear;
    private Button division;
    private Button minus;
    private Button multiply;
    private Button equalsButton;
    private Button addition;


    private TextView firstNumber;
    private TextView secondNumber;
    private TextView equals;
    private TextView results;
    private TextView operator;
    private ArrayList<Button> allButtons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setupButtons();
        setupTextViews();
        setupList();









       /* Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hej");
            }
        });

        */





    }

    private void setupButtons() {
        one = (Button) findViewById(R.id.button1);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eight = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);
        multiply = (Button) findViewById(R.id.buttonMultiple);
        division = (Button) findViewById(R.id.buttonDivision);
        minus = (Button) findViewById(R.id.buttonMinus);
        clear = (Button) findViewById(R.id.buttonClear);
        equalsButton = (Button) findViewById(R.id.buttonEquals);
        addition = (Button) findViewById(R.id.buttonAddition);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        multiply.setOnClickListener(this);
        division.setOnClickListener(this);
        minus.setOnClickListener(this);
        clear.setOnClickListener(this);
        equalsButton.setOnClickListener(this);
        addition.setOnClickListener(this);
    }

    private void setupTextViews() {
        firstNumber = (TextView) findViewById(R.id.firstNumber);
        secondNumber = (TextView) findViewById(R.id.secondNumber);
        operator = (TextView) findViewById(R.id.operator);
        equals = (TextView) findViewById(R.id.textViewEquals);
        results = (TextView) findViewById(R.id.textviewresults);
    }

    private void setupList() {
        allButtons = new ArrayList<>();

        allButtons.add(one);
        allButtons.add(two);
        allButtons.add(three);
        allButtons.add(four);
        allButtons.add(five);
        allButtons.add(six);
        allButtons.add(seven);
        allButtons.add(eight);
        allButtons.add(nine);
        allButtons.add(clear);
    }

    private void toggleButtons(Button button) {
        if (firstNumber.getText().equals("")) {
            firstNumber.setText(button.getText());
        } else if (secondNumber.getText().equals("")) {
            secondNumber.setText(button.getText());
        }



    }

    private void toggleOperator(TextView textView) {
        operator.setText(textView.getText());
        results.setText("");
    }

    private void calculateResults() {
        double finalResults = 0;
        try {

            if (operator.getText().equals("-")) {
                finalResults = Double.parseDouble(firstNumber.getText().toString()) - Double.parseDouble(secondNumber.getText().toString());
            } else if (operator.getText().equals("/")) {
                finalResults = Double.parseDouble(firstNumber.getText().toString()) / Double.parseDouble(secondNumber.getText().toString());
            } else if (operator.getText().equals("*")) {
                finalResults = Double.parseDouble(firstNumber.getText().toString()) * Double.parseDouble(secondNumber.getText().toString());
            } else if (operator.getText().equals("+")) {
                finalResults = Double.parseDouble(firstNumber.getText().toString()) + Double.parseDouble(secondNumber.getText().toString());
            }

            results.setText(String.valueOf(finalResults));
    } catch (Exception e) {

        }
    }

    private void clearAllField() {
        firstNumber.setText("");
        secondNumber.setText("");
        operator.setText("");
        results.setText("");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                toggleButtons(one);
                break;
            case R.id.button2:
                toggleButtons(two);
                break;
            case R.id.button3:
                toggleButtons(three);
                break;
            case R.id.button4:
                toggleButtons(four);
                break;
            case R.id.button5:
                toggleButtons(five);
                break;
            case R.id.button6:
                toggleButtons(six);
                break;
            case R.id.button7:
                toggleButtons(seven);
                break;
            case R.id.button8:
                toggleButtons(eight);
                break;
            case R.id.button9:
                toggleButtons(nine);
                break;
            case R.id.buttonMultiple:
                toggleOperator(multiply);
                break;
            case R.id.buttonDivision:
                toggleOperator(division);
                break;
            case R.id.buttonMinus:
                toggleOperator(minus);
                break;
            case R.id.buttonClear:
                clearAllField();
                break;
            case R.id.buttonEquals:
                calculateResults();
                break;
            case R.id.buttonAddition:
                toggleOperator(addition);
                break;
        }
    }


}

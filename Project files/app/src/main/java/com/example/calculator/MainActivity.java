package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editNum1 , editNum2;
    TextView answer;
    Button buttonAdd, buttonSub, buttonMul, buttonDiv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNum1=findViewById(R.id.editNum1);
        editNum2=findViewById(R.id.editNum2);
        answer= findViewById(R.id.answer);
        buttonAdd=findViewById(R.id.buttonAdd);
        buttonSub=findViewById(R.id.buttonSub);
        buttonMul=findViewById(R.id.buttonMul);
        buttonDiv=findViewById(R.id.buttonDiv);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1, num2, ans;
                num1 = Integer.parseInt(editNum1.getText().toString());
                num2 = Integer.parseInt(editNum2.getText().toString());
                ans= num1+ num2;
                answer.setText("Ans is :"+ ans);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1, num2, ans;
                num1 = Integer.parseInt(editNum1.getText().toString());
                num2 = Integer.parseInt(editNum2.getText().toString());
                ans= num1- num2;
                answer.setText("Ans is :"+ ans);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1, num2, ans;
                num1 = Integer.parseInt(editNum1.getText().toString());
                num2 = Integer.parseInt(editNum2.getText().toString());
                ans= num1* num2;
                answer.setText("Ans is :"+ ans);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1, num2, ans;
                num1 = Integer.parseInt(editNum1.getText().toString());
                num2 = Integer.parseInt(editNum2.getText().toString());
                ans= num1/ num2;
                answer.setText("Ans is :"+ ans);
            }
        });




    }
}
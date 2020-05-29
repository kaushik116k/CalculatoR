package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity
{
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button add,sub,multiply,divide,percent,dot,clear,equal;
    TextView input,output;
    final char addition = '+';
    final char subtraction = '-';
    final char into = 'x';
    final char by = '÷';
    final char equ = '0';
    final char per = '%';
    double val1 = Double.NaN;
    double val2;
    private char Action;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        percent = findViewById(R.id.percent);
        dot = findViewById(R.id.btndot);
        clear = findViewById(R.id.clear);
        equal = findViewById(R.id.equal);

        input = findViewById(R.id.input);
        output = findViewById(R.id.output);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().length()>0)
                {
                    CharSequence name = input.getText().toString();
                    input.setText(name.subSequence(0,name.length()-1));
                }
                else
                {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    input.setText(null);
                    output.setText(null);
                }
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = input.getText().toString();
                input.setText(p+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = input.getText().toString();
                input.setText(p+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = input.getText().toString();
                input.setText(p+"2");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = input.getText().toString();
                input.setText(p+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = input.getText().toString();
                input.setText(p+"5");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = input.getText().toString();
                input.setText(p+"3");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = input.getText().toString();
                input.setText(p+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = input.getText().toString();
                input.setText(p+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = input.getText().toString();
                input.setText(p+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = input.getText().toString();
                input.setText(p+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Action = addition;
                output.setText(String.valueOf(val1) + "+");
                input.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Action = subtraction;
                output.setText(String.valueOf(val1)+"-");
                input.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Action = into;
                output.setText(String.valueOf(val1)+"*");
                input.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Action = by;
                output.setText(String.valueOf(val1)+"/");
                input.setText(null);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = input.getText().toString();
                input.setText(p+".");
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Action = per;
                output.setText(String.valueOf(val1));
                input.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Action = equ;
                output.setText(String.valueOf(val1));
                input.setText(null);
            }
        });
    }
    private void compute()
    {
        if (!Double.isNaN(val1))
        {
            val2 = Double.parseDouble(input.getText().toString());
            switch (Action)
            {
                case addition:
                    val1 = val1+val2;
                    break;
                case subtraction:
                    val1 = val1-val2;
                    break;
                case into:
                    val1 = val1*val2;
                    break;
                case by:
                    val1 = val1/val2;
                    break;
                case per:
                    val1 = 0;
                    val1 = val1+(val2/100);
                    break;
                case equ:
                    break;
            }
        }
        else
        {
            val1 = Double.parseDouble(input.getText().toString());
        }
    }

}

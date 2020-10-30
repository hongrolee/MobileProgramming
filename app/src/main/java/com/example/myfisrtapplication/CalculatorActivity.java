package com.example.myfisrtapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    EditText et_num1;
    EditText et_num2;

    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;

    Button btn_sum;
    Button btn_sub;
    Button btn_mul;
    Button btn_div;

    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        et_num1 = (EditText)findViewById(R.id.et_num1);
        et_num2 = (EditText)findViewById(R.id.et_num2);

        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);

        btn_sum = (Button)findViewById(R.id.btn_sum);
        btn_sub = (Button)findViewById(R.id.btn_sub);
        btn_mul = (Button)findViewById(R.id.btn_mul);
        btn_div = (Button)findViewById(R.id.btn_div);

        tv_result = (TextView)findViewById(R.id.tv_result);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_num1.isFocused()) {
                    String temp = et_num1.getText().toString();
                    et_num1.setText(temp + "0");
                }else {
                    String temp = et_num2.getText().toString();
                    et_num2.setText(temp + "0");
                }
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_num1.isFocused()) {
                    String temp = et_num1.getText().toString();
                    et_num1.setText(temp + "1");
                }else {
                    String temp = et_num2.getText().toString();
                    et_num2.setText(temp + "1");
                }
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_num1.isFocused()) {
                    String temp = et_num1.getText().toString();
                    et_num1.setText(temp + "2");
                }else {
                    String temp = et_num2.getText().toString();
                    et_num2.setText(temp + "2");
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_num1.isFocused()) {
                    String temp = et_num1.getText().toString();
                    et_num1.setText(temp + "3");
                }else {
                    String temp = et_num2.getText().toString();
                    et_num2.setText(temp + "3");
                }
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_num1.isFocused()) {
                    String temp = et_num1.getText().toString();
                    et_num1.setText(temp + "4");
                }else {
                    String temp = et_num2.getText().toString();
                    et_num2.setText(temp + "4");
                }
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_num1.isFocused()) {
                    String temp = et_num1.getText().toString();
                    et_num1.setText(temp + "5");
                }else {
                    String temp = et_num2.getText().toString();
                    et_num2.setText(temp + "5");
                }
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_num1.isFocused()) {
                    String temp = et_num1.getText().toString();
                    et_num1.setText(temp + "6");
                }else {
                    String temp = et_num2.getText().toString();
                    et_num2.setText(temp + "6");
                }
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_num1.isFocused()) {
                    String temp = et_num1.getText().toString();
                    et_num1.setText(temp + "7");
                }else {
                    String temp = et_num2.getText().toString();
                    et_num2.setText(temp + "7");
                }
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_num1.isFocused()) {
                    String temp = et_num1.getText().toString();
                    et_num1.setText(temp + "8");
                }else {
                    String temp = et_num2.getText().toString();
                    et_num2.setText(temp + "8");
                }
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_num1.isFocused()) {
                    String temp = et_num1.getText().toString();
                    et_num1.setText(temp + "9");
                }else {
                    String temp = et_num2.getText().toString();
                    et_num2.setText(temp + "9");
                }
            }
        });


        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(et_num1.getText().toString());
                int num2 = Integer.parseInt(et_num2.getText().toString());
                int result = num1 + num2;
                tv_result.setText("계산결과 : "+Integer.toString(result));
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(et_num1.getText().toString());
                int num2 = Integer.parseInt(et_num2.getText().toString());
                int result = num1 - num2;
                tv_result.setText("계산결과 : "+Integer.toString(result));
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(et_num1.getText().toString());
                int num2 = Integer.parseInt(et_num2.getText().toString());
                int result = num1 * num2;
                tv_result.setText("계산결과 : "+Integer.toString(result));
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(et_num1.getText().toString());
                double num2 = Double.parseDouble(et_num2.getText().toString());
                double result = num1 / num2;
                tv_result.setText("계산결과 : "+Double.toString(result));
            }
        });
    }
}
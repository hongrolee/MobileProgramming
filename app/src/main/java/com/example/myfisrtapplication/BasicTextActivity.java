package com.example.myfisrtapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class BasicTextActivity extends AppCompatActivity {

    CheckBox cb_iphone;
    CheckBox cb_android;

    RadioGroup rg_phone;
    RadioButton rb_iphone;
    RadioButton rb_android;

    ImageView iv_iphone;
    ImageView iv_android;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_text);

        cb_iphone = (CheckBox)findViewById(R.id.cb_iphone);
        cb_android = (CheckBox)findViewById(R.id.cb_android);

        rg_phone = (RadioGroup)findViewById(R.id.rg_phone);
        rb_iphone = (RadioButton)findViewById(R.id.rb_iphone);
        rb_android = (RadioButton)findViewById(R.id.rb_android);

        iv_iphone = (ImageView)findViewById(R.id.iv_iphone);
        iv_android = (ImageView)findViewById(R.id.iv_android);

        rg_phone.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(rg_phone.getCheckedRadioButtonId()) {
                    case R.id.rb_iphone :
                        iv_iphone.setVisibility(View.VISIBLE);
                        iv_android.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(), "아이폰 눌렸어요", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_android :
                        iv_iphone.setVisibility(View.INVISIBLE);
                        iv_android.setVisibility(View.VISIBLE);
                        Toast.makeText(getApplicationContext(), "안드로이드 눌렸어요", Toast.LENGTH_SHORT).show();
                        break;
                    default :
                        Toast.makeText(getApplicationContext(), "핸드폰 종류를 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        /*
        rg_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(rg_phone.getCheckedRadioButtonId()) {
                    case R.id.rb_iphone :
                        iv_iphone.setVisibility(View.VISIBLE);
                        iv_android.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(), "아이폰 눌렸어요", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_android :
                        iv_iphone.setVisibility(View.INVISIBLE);
                        iv_android.setVisibility(View.VISIBLE);
                        Toast.makeText(getApplicationContext(), "안드로이드 눌렸어요", Toast.LENGTH_SHORT).show();
                        break;
                    default :
                        Toast.makeText(getApplicationContext(), "핸드폰 종류를 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        */

        /*
        cb_iphone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(cb_iphone.isChecked())
                    iv_iphone.setVisibility(View.VISIBLE);
                else
                    iv_iphone.setVisibility(View.INVISIBLE);
            }
        });

        cb_android.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(cb_android.isChecked())
                    iv_android.setVisibility(View.VISIBLE);
                else
                    iv_android.setVisibility(View.INVISIBLE);
            }
        });
         */

    }
}
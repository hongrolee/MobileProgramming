package com.example.myfisrtapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainMenuActivity extends AppCompatActivity {

    Button btn_login;
    EditText et_id;
    EditText et_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button btnGoNaver = (Button)findViewById(R.id.btn_goNaver);
        Button btnCallPolice = (Button)findViewById(R.id.btn_callPolice);
        Button btnOpenGallery = (Button)findViewById(R.id.btn_openGallery);
        Button btnFinish = (Button)findViewById(R.id.btn_finish);

        TextView tv1 = (TextView)findViewById(R.id.textView1);
        TextView tv2 = (TextView)findViewById(R.id.textView2);

        et_id = (EditText)findViewById(R.id.et_name);
        et_pw = (EditText)findViewById(R.id.et_pw);

        btn_login = (Button)findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_id = et_id.getText().toString();
                String str_pw = et_pw.getText().toString();

                if(str_id.equals("maya") && str_pw.equals("1234")) {

                }
            }
        });

        tv1.setText("안녕하세요?");
        tv1.setTextColor(Color.RED);
        tv1.setTextSize(10);
        tv1.setTypeface(Typeface.MONOSPACE);
        tv2.setSingleLine();

        btnGoNaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intent);
            }
        });

        btnCallPolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/112"));
                startActivity(intent);
            }
        });

        btnOpenGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(intent);
            }
        });

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
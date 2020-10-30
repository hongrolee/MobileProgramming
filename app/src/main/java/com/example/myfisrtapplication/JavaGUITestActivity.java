package com.example.myfisrtapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class JavaGUITestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_java_g_u_i_test);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baselayout = new LinearLayout(this);
        baselayout.setOrientation(LinearLayout.VERTICAL);
        baselayout.setBackgroundColor(Color.rgb(255,255,255));
        setContentView(baselayout,params);


        Button btn = new Button(this);
        btn.setText("로그인");
        btn.setTypeface(null, Typeface.BOLD_ITALIC);
        btn.setBackgroundColor(Color.GRAY);
        btn.setTextSize(30);
        baselayout.addView(btn);

        LinearLayout layout1 = new LinearLayout(this);
        layout1.setOrientation(LinearLayout.VERTICAL);

        layout1.setBackgroundColor(Color.rgb(100,255,255));
        baselayout.addView(layout1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"버튼이 눌렸습니다.",Toast.LENGTH_LONG).show();
            }
        });
    }
}
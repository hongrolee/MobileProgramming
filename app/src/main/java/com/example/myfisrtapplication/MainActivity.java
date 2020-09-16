package com.example.myfisrtapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivFace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        int x = 0;
        float y = 1.2f;
        double z = 1.523231;
        char a = 'a';
        String s = "안드로이드 프로그래밍 수업입니다.";
        int array[] = new int[4];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;

        if((x==0)||(y==1.2f)) {

        } else {

        }

        int array2[][] = new int[10][10];
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                array2[i][j] = i+j;
            }
        }

        for(int i: array) {
            System.out.println(i);
        }
        int cnt = 0;
        while(cnt<10) {
            cnt++;
        }
        System.out.println(cnt);

        cnt = 0;
        do {
            cnt++;
        } while(cnt<10);
        System.out.println(cnt);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivFace = (ImageView)findViewById(R.id.iv_face);
        ivFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ScrollingActivity.class);
                startActivity(intent);
            }
        });
    }

    public void myMethod() {
        ivFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
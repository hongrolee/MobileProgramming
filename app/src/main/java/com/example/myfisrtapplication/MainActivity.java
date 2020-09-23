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

        Car myCar = new Car("포르쉐", "빨강", "현대", 3);
        myCar.setModelName("제네시스");

        Car yourCar = new Car();
        yourCar.setModelName();


        Bus myBus = new Bus();
        myBus.getModelName();



        //int x = myCar.setModelName("포르쉐");
        //myCar.setType(4);


        int x = 0;
        float y = 1.2f;
        double z = 1.523231;
        char a = 'a';
        String s = "안드로이드 프로그래밍 수업입니다.";
        int array[] = new int[4];
        array[0] = 111;
        array[1] = 222;
        array[2] = 333;
        array[3] = 444;

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
package com.example.myfisrtapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivFace;
    Tiger t;
    Eagle e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

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





        new Tiger();

        t.move();

        e = new Eagle();
        e.move();
    }

    public void myMethod() {
        ivFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
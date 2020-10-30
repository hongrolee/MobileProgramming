package com.example.myfisrtapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class ClockTestActivity extends AppCompatActivity {

    DatePicker dp_birthday;
    AutoCompleteTextView atv_id;
    MultiAutoCompleteTextView mtv_pw;
    ProgressBar pb_dl;
    int progessbarStatus = 0;
    Handler hdl = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_test);

        /*
        String[] items = {"CSI-뉴욕", "CSI-라스베이가스", "CSI-마이에미", "Friends", "Fringe", "Lost"};

        dp_birthday = (DatePicker)findViewById(R.id.dp_birthday);
        atv_id = (AutoCompleteTextView)findViewById(R.id.atv_id);
        mtv_pw = (MultiAutoCompleteTextView) findViewById(R.id.mtv_pw);

        dp_birthday.getCalendarView().setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                int year = i;
                int month = i1;
                int day = i2;
                String str_year = Integer.toString(year);
                String str_month = Integer.toString(month);
                String str_day = Integer.toString(day);

                String result = "선택하신 날짜는 " + year + "년 " + month + "월 " + day + "일입니다.";
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }
        });

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, items);
        atv_id.setAdapter(adapter);

        MultiAutoCompleteTextView.CommaTokenizer tokenizer = new MultiAutoCompleteTextView.CommaTokenizer();
        mtv_pw.setTokenizer(tokenizer);
        mtv_pw.setAdapter(adapter);
        */

        pb_dl = (ProgressBar)findViewById(R.id.pb_download);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(progessbarStatus<100) {
                    progessbarStatus += 1; //progressbarStatus = progressbarStatus+1;
                    hdl.post(new Runnable() {
                        @Override
                        public void run() {
                            pb_dl.setProgress(progessbarStatus);
                        }
                    });
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();



    }
}
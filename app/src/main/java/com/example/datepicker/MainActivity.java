package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.time.Month;

public class MainActivity extends AppCompatActivity {
    TextView  cDate;
    DatePicker   dpicker;
    Button  btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dpicker =   (DatePicker) findViewById(R.id.dp);
        cDate   =   (TextView) findViewById(R.id.txt);
        btn =   (Button) findViewById(R.id.btn);
        cDate.setText("Current Date " +setcDate());

    }

    public void btnDate(View view) {
        cDate.setText("Change Date "+setcDate());

    }
    private String setcDate() {
        StringBuilder builder = new StringBuilder();
        builder.append(dpicker.getDayOfMonth() + "/");
        builder.append(dpicker.getMonth() + 1 + "/");
        builder.append(dpicker.getYear());
        return builder.toString();
    }
}
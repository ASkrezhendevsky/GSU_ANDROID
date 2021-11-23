package ru.startandroid.develop.p0261intentfilter;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActivityDate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        SimpleDateFormat format = new SimpleDateFormat("dd:MM:yyyy");
        String date = format.format(new Date(System.currentTimeMillis()));
        TextView tv = (TextView)findViewById(R.id.tvDate);
        tv.setText(date);
    }
}

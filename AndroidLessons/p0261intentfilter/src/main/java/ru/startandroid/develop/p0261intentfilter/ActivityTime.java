package ru.startandroid.develop.p0261intentfilter;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActivityTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        String time = format.format(new Date(System.currentTimeMillis()));
        TextView tv = (TextView)findViewById(R.id.tvTime);
        tv.setText(time);
    }
}

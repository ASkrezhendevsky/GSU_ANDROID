package ru.startandroid.develop.p0281intentextras;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        String fname = getIntent().getStringExtra("fname");
        String lname = getIntent().getStringExtra("lname");
        TextView tv = (TextView)findViewById(R.id.tvView);
        tv.setText("Your name is " + fname + " " + lname);
    }
}

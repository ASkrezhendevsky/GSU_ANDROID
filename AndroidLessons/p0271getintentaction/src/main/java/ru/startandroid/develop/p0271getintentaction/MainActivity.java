package ru.startandroid.develop.p0271getintentaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private final String showDateAction = "ru.startandroid.intent.action.showdate";
    private final String showTimeAction = "ru.startandroid.intent.action.showtime";
    private Button btnShowDate;
    private Button btnShowTime;

    public String getShowDateAction() {
        return showDateAction;
    }

    public String getShowTimeAction() {
        return showTimeAction;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShowTime = (Button)findViewById(R.id.btnShowTime);
        btnShowDate = (Button)findViewById(R.id.btnShowDate);
        btnShowDate.setOnClickListener(this);
        btnShowTime.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnShowDate:
                Intent showDate = new Intent(showDateAction);
                startActivity(showDate);
                break;
            case R.id.btnShowTime:
                Intent showTime = new Intent(showTimeAction);
                startActivity(showTime);
                break;
        }
    }
}

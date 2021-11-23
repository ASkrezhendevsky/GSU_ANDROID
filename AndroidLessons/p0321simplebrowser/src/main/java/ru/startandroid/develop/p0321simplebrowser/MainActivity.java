package ru.startandroid.develop.p0321simplebrowser;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnWeb;
    private EditText etAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAddress = (EditText) findViewById(R.id.etAddress);
        btnWeb = (Button) findViewById(R.id.btnWeb);
        btnWeb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http:" + etAddress.getText().toString()));
        startActivity(i);
    }
}

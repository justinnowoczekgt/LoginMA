package com.example.loginda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addButton = (Button) findViewById(R.id.buttonBTN);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText mailET= (EditText) findViewById(R.id.MailET);
                EditText passET = (EditText) findViewById(R.id.PassET);
                EditText passConfET = (EditText) findViewById(R.id.ConfPassET);
                TextView resultTV = (TextView) findViewById(R.id.ResultTV);
                resultTV.setText("Witaj "+mailET.getText().toString());
                if(!mailET.getText().toString().contains("@")) {
                    resultTV.setText("niepoprawny email");
                }
                if (!passET.getText().toString().equals(passConfET.getText().toString())) {
                    resultTV.setText("Halsa roznia");
                }


            }
        });
    }
}
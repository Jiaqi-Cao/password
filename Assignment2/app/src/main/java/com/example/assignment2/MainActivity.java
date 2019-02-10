package com.example.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt;
    TextView view;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.button);
        view = findViewById(R.id.view);
        text = findViewById(R.id.text);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(checkrule(text.getText().toString()));
            }
        });
    }

    public String checkrule (String str) {
        if (str.equals("password")) {
            return "Not Strong";
        }
        else if (str.length() < 8) {
            return "Not Strong";
        }
        else if (str.length() > 16) {
            return "Not Strong";
        }
        else if (str.contains(" ")){
            return "Not Strong";
        }
        else if (str.isEmpty()) {
            return "Not Strong";
        }
        else {
            return "Strong";
        }
    }
}

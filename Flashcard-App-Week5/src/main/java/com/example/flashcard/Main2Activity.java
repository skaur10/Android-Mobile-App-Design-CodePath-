package com.example.flashcard;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.eye_invisible_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); }
        });

        findViewById(R.id.save_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get_question = ((EditText) findViewById(R.id.line)).getText().toString();
                String get_answer = ((EditText) findViewById(R.id.line2)).getText().toString();
                Intent data = new Intent();
                data.putExtra("question", get_question );
                data.putExtra("answer", get_answer);
                setResult(RESULT_OK, data);
                finish();
            }
        });

    }
}

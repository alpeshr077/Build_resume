package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Work_history extends AppCompatActivity {

    Button btnNext2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_history);

        btnNext2 = findViewById(R.id.btnNext2);

        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Work_history.this,Education.class);
                startActivities(new Intent[]{intent});
            }
        });
    }
}
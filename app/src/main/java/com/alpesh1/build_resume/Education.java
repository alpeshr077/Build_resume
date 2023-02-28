package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Education extends AppCompatActivity {

    Button btnNext3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        btnNext3 = findViewById(R.id.btnNext3);

        btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Education.this,Hobbies.class);
                startActivities(new Intent[]{intent});
            }
        });
    }
}
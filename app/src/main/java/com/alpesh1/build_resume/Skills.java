package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Skills extends AppCompatActivity {

    Button btnNext5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        btnNext5 = findViewById(R.id.btnNext5);

        btnNext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Skills.this,My_projects.class);
                startActivities(new Intent[]{intent});
            }
        });
    }
}
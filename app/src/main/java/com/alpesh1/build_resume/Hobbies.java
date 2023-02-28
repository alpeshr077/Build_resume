package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hobbies extends AppCompatActivity {


    Button btnNext4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);

        btnNext4 = findViewById(R.id.btnNext4);

        btnNext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(Hobbies.this,Skills.class);
                startActivities(new Intent[]{intent});
            }
        });
    }
}
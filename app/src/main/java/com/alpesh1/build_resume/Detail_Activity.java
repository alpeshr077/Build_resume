package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Detail_Activity extends AppCompatActivity {

    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Detail_Activity.this,Work_history.class);
                startActivities(new Intent[]{intent});
            }
        });
    }
}
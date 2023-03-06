package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Murge_Template extends AppCompatActivity {

    ImageView Template1,Template2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_murge_template);

        Template1 = findViewById(R.id.Template1);
        Template2 = findViewById(R.id.Template2);

        Template1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(Murge_Template.this,Template_design_2.class);
                startActivity(intent);
            }
        });

        Template2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(Murge_Template.this,Templte_design_1.class);
                startActivity(intent);
            }
        });
    }
}
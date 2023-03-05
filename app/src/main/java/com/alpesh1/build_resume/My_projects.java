package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class My_projects extends AppCompatActivity {

    Button btnNext6;
    EditText edtProject;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_projects);

        btnNext6 = findViewById(R.id.btnNext6);
        edtProject = findViewById(R.id.edtProject);

        btnNext6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String project = edtProject.getText().toString();

                if (project.isEmpty()){
                    edtProject.setError("please enter projects");
                }else {

                    Intent intent = new Intent(My_projects.this, Template_design_2.class);
                    startActivities(new Intent[]{intent});

                }
            }
        });
    }
}
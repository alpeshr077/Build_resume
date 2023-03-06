package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class My_projects extends AppCompatActivity {

    Button btnNext6;
    EditText edtProject;

    SharedPreferences preferences;

    SharedPreferences.Editor editor;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_projects);

        preferences = getSharedPreferences("EData",0);
        editor = preferences.edit();

        btnNext6 = findViewById(R.id.btnNext6);
        edtProject = findViewById(R.id.edtProject);

        btnNext6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String project = edtProject.getText().toString();
                editor.putString("project",project);
                editor.commit();

                if (project.isEmpty()){
                    edtProject.setError("please enter projects");
                }else {

                    Intent intent = new Intent(My_projects.this, Murge_Template.class);
                    intent.putExtra("project",project);
                    startActivity(intent);

                }
            }
        });
    }
}
package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Skills extends AppCompatActivity {

    Button btnNext5;
    EditText edtSkill;

    SharedPreferences preferences;

    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        preferences = getSharedPreferences("EData",0);
        editor = preferences.edit();

        btnNext5 = findViewById(R.id.btnNext5);
        edtSkill = findViewById(R.id.edtSkill);

        btnNext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String skill = edtSkill.getText().toString();
                editor.putString("skill",skill);
                editor.commit();

                if (skill.isEmpty()) {
                    edtSkill.setError("Please enter skills");
                } else {

                    Intent intent = new Intent(Skills.this, My_projects.class);
                    intent.putExtra("skill",skill);
                    startActivity(intent);
                }
            }
        });
    }
}
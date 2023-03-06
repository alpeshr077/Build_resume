package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Education extends AppCompatActivity {

    Button btnNext3;
    EditText edtSchool,edtBoard,edtQual;

    SharedPreferences preferences;

    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        preferences = getSharedPreferences("EData",0);
        editor = preferences.edit();


        btnNext3 = findViewById(R.id.btnNext3);
        edtSchool = findViewById(R.id.edtSchool);
        edtBoard = findViewById(R.id.edtBoard);
        edtQual = findViewById(R.id.edtQual);

        btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String school = edtSchool.getText().toString();
                String board = edtBoard.getText().toString();
                String qual = edtQual.getText().toString();

                editor.putString("school",school);
                editor.putString("board",board);
                editor.putString("qual",qual);
                editor.commit();

                if (school.isEmpty()) {
                    edtSchool.setError("Please enter school name");
                } else if (board.isEmpty()) {
                    edtBoard.setError("Please enter board");
                } else if (qual.isEmpty()) {
                    edtQual.setError("Please enter qualification");
                } else {

                    Intent intent = new Intent(Education.this, Hobbies.class);
                    intent.putExtra("school",school);
                    intent.putExtra("board",board);
                    intent.putExtra("qual",qual);
                    startActivity(intent);
                }
            }
        });
    }
}
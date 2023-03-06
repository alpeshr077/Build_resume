package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Detail_Activity extends AppCompatActivity {

    Button btnNext;
    EditText edtName, edtNumber, edtEmail, edtDate;

    SharedPreferences preferences;

    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        preferences = getSharedPreferences("EData",0);
        editor = preferences.edit();

        btnNext = findViewById(R.id.btnNext);
        edtName = findViewById(R.id.edtName);
        edtNumber = findViewById(R.id.edtNumber);
        edtEmail = findViewById(R.id.edtEmail);
        edtDate = findViewById(R.id.edtDate);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = edtName.getText().toString();
                String number = edtNumber.getText().toString();
                String email = edtEmail.getText().toString();
                String date = edtDate.getText().toString();

                editor.putString("name",name);
                editor.putString("number",number);
                editor.putString("email",email);
                editor.putString("date",date);
                editor.commit();


                if (name.isEmpty()) {
                    edtName.setError("Please enter name");
                } else if (number.isEmpty()) {
                    edtNumber.setError("Please enter number");

                } else if (email.isEmpty()) {
                    edtEmail.setError("Please enter email");
                } else if (date.isEmpty()) {
                    edtDate.setError("Please enter date");
                } else {

                    Intent intent = new Intent(Detail_Activity.this, Work_history.class);
                    intent.putExtra("name",name);
                    intent.putExtra("number",number);
                    intent.putExtra("email",email);
                    intent.putExtra("date",date);
                    startActivity(intent);

                }

            }
        });

    }
}


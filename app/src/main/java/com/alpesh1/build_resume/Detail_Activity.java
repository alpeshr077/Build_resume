package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Detail_Activity extends AppCompatActivity {

    Button btnNext;
    EditText edtName, edtNumber, edtEmail, edtDate;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btnNext = findViewById(R.id.btnNext);
        edtName = findViewById(R.id.edtName);
        edtNumber = findViewById(R.id.edtNumber);
        edtEmail = findViewById(R.id.edtEmail);
        edtDate = findViewById(R.id.edtDate);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = edtName.getText().toString().trim();
                String number = edtNumber.getText().toString().trim();
                String email = edtEmail.getText().toString().trim();
                String date = edtDate.getText().toString().trim();

                Bundle bundle = new Bundle();
                bundle.putString("name", name);
                bundle.putString("number", number);
                bundle.putString("email", email);
                bundle.putString("date", date);


                if (name.isEmpty()) {
                    edtName.setError("Please enter name");
                } else if (number.isEmpty()) {
                    edtNumber.setError("Please enter number");

                } else if (email.isEmpty()) {
                    edtEmail.setError("Please enter email");
                } else if (date.isEmpty()) {
                    edtDate.setError("Please enter date");
                } else {

                    Intent intent = new Intent(Detail_Activity.this, Murge_Template.class);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }

            }
        });

    }
}


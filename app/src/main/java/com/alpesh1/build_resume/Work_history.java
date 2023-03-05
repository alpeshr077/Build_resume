package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Work_history extends AppCompatActivity {

    Button btnNext2;

    EditText edtDesign, edtCompany, edtExpe;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_history);

        btnNext2 = findViewById(R.id.btnNext2);
        edtDesign = findViewById(R.id.edtDesign);
        edtCompany = findViewById(R.id.edtCompany);
        edtExpe = findViewById(R.id.edtExpe);


        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String design = edtDesign.getText().toString().trim();
                String company = edtCompany.getText().toString().trim();
                String expe = edtExpe.getText().toString().trim();

                Bundle bundle = new Bundle();
                bundle.putString("design", design);
                bundle.putString("company", company);
                bundle.putString("expe", expe);

                if (design.isEmpty()) {
                    edtDesign.setError("Please enter designation");
                } else if (company.isEmpty()) {
                    edtCompany.setError("please enter company");
                } else if (expe.isEmpty()) {
                    edtExpe.setError("Please enter experience");
                } else {

                    Intent intent = new Intent(Work_history.this, Education.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });
    }
}
package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Templte_design_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templte_design1);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String name = bundle.getString("name");
            String date = bundle.getString("date");
            String number = bundle.getString("number");
            String email = bundle.getString("email");

            String design = bundle.getString("design");
            String company = bundle.getString("company");
            String expe = bundle.getString("expe");

            TextView txtName = findViewById(R.id.txtName);
            TextView txtDate = findViewById(R.id.txtDate);
            TextView txtNumber = findViewById(R.id.txtNumber);
            TextView txtEmail = findViewById(R.id.txtEmail);

            TextView txtDesign = findViewById(R.id.txtDesign);
            TextView txtCompany = findViewById(R.id.txtCompany);
            TextView txtExpe = findViewById(R.id.txtExpe);

            txtName.setText(name);
            txtDate.setText(date);
            txtNumber.setText(number);
            txtEmail.setText(email);

            txtDesign.setText(design);
            txtCompany.setText(company);
            txtExpe.setText(expe);
        }
    }
}
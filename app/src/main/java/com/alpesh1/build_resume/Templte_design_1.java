package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class Templte_design_1 extends AppCompatActivity {

    TextView txtName,txtDesign,txtNumber,txtEmail,txtCompany,txtExpe,txtDate,MyHobby;

    TextView txtSchool,txtBoard,txtQual;

    TextView txtSkill,txtProject;

    CheckBox Reading,Writing,Photography,Music,Blog,Video,Travel,Singing;

    SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templte_design1);

        preferences = getSharedPreferences("EData",0);

        txtName = findViewById(R.id.txtName);
        txtDesign = findViewById(R.id.txtDesign);
        txtNumber = findViewById(R.id.txtNumber);
        txtEmail = findViewById(R.id.txtEmail);

        txtCompany = findViewById(R.id.txtCompany);
        txtExpe = findViewById(R.id.txtExpe);
        txtDate = findViewById(R.id.txtDate);

        txtSchool = findViewById(R.id.txtSchool);
        txtBoard = findViewById(R.id.txtBoard);
        txtQual = findViewById(R.id.txtQual);

//        Reading = findViewById(R.id.Reading);
//        Writing = findViewById(R.id.Writing);
//        Photography = findViewById(R.id.Photography);
//        Music = findViewById(R.id.Music);
//        Blog = findViewById(R.id.Blog);
//        Video = findViewById(R.id.Video);
//        Travel = findViewById(R.id.Travel);
//        Singing = findViewById(R.id.Singing);

        txtSkill = findViewById(R.id.txtSkill);

        txtProject = findViewById(R.id.txtProject);

        String name = preferences.getString("name","");
        String number = preferences.getString("number","");
        String email = preferences.getString("email","");
        String date = preferences.getString("date","");

        String design = preferences.getString("design","");
        String company = preferences.getString("company","");
        String expe = preferences.getString("expe","");

        String school = preferences.getString("school","");
        String board = preferences.getString("board","");
        String qual = preferences.getString("qual","");

//        String reading = preferences.getString("reading","");
//        String writing = preferences.getString("writing","");
//        String photography = preferences.getString("photography","");
//        String music = preferences.getString("music","");
//        String blog = preferences.getString(" blog","");
//        String video = preferences.getString("video","");
//        String travel = preferences.getString("travel","");
//        String singing = preferences.getString("singing","");

        String skill = preferences.getString("skill","");

        String project = preferences.getString("project","");

        txtName.setText(name);
        txtNumber.setText(number);
        txtEmail.setText(email);
        txtDate.setText(date);

        txtDesign.setText(design);
        txtCompany.setText(company);
        txtExpe.setText(expe);

        txtSchool.setText(school);
        txtBoard.setText(board);
        txtQual.setText(qual);

//        MyHobby.setText(reading);
//        MyHobby.setText(writing);
//        MyHobby.setText(photography);
//        MyHobby.setText(music);
//        MyHobby.setText(blog);
//        MyHobby.setText(video);
//        MyHobby.setText(travel);
//        MyHobby.setText(singing);

        txtSkill.setText(skill);

        txtProject.setText(project);

    }
}
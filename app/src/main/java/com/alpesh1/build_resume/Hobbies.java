package com.alpesh1.build_resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Hobbies extends AppCompatActivity {


    Button btnNext4;

    TextView MyHobby;

    CheckBox Reading, Writing, Photography, Music, Blog, Video, Travel, Singing;

    SharedPreferences preferences;


    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);

        preferences = getSharedPreferences("EData", 0);
        editor = preferences.edit();

        Binding();


        btnNext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String reading = Reading.getText().toString();
                String writing = Writing.getText().toString();
                String photography = Photography.getText().toString();
                String music = Music.getText().toString();
                String blog = Blog.getText().toString();
                String video = Video.getText().toString();
                String travel = Travel.getText().toString();
                String singing = Singing.getText().toString();

                editor.putString("reading", reading);
                editor.putString("writing", writing);
                editor.putString("photography", photography);
                editor.putString("music", music);
                editor.putString("blog", blog);
                editor.putString("video", video);
                editor.putString("travel", travel);
                editor.putString("singing", singing);
                editor.commit();


                String s = "";
                if (Reading.isChecked()) {
                    s += "Reading\n";
                }
                if (Writing.isChecked()) {
                    s += "Writing\n";
                }
                if (Photography.isChecked()) {
                    s += "Photography\n";
                }
                if (Music.isChecked()) {
                    s += "Music\n";
                }
                if (Blog.isChecked()) {
                    s += "Blog\n";
                }
                if (Video.isChecked()) {
                    s += "Video\n";
                }
                if (Travel.isChecked()) {
                    s += "Travel\n";
                }
                if (Singing.isChecked()) {
                    s += "Singing\n";
                } else {

                    Intent intent = new Intent(Hobbies.this, Skills.class);
                    intent.putExtra("reading",reading);
                    intent.putExtra("writing",writing);
                    intent.putExtra("photography",photography);
                    intent.putExtra("music",music);
                    intent.putExtra("blog",blog);
                    intent.putExtra("video",video);
                    intent.putExtra("travel",travel);
                    intent.putExtra("singing",singing);
                    startActivity(intent);



                }
                MyHobby.setText("Hobyy \n"+s);
            }
        });
    }

    private void Binding() {
        btnNext4 = findViewById(R.id.btnNext4);
        Reading = findViewById(R.id.Reading);
        Writing = findViewById(R.id.Writing);
        Photography = findViewById(R.id.Photography);
        Music = findViewById(R.id.Music);
        Blog = findViewById(R.id.Blog);
        Video = findViewById(R.id.Video);
        Travel = findViewById(R.id.Travel);
        Singing = findViewById(R.id.Singing);
        MyHobby = findViewById(R.id.MyHobby);
    }
}
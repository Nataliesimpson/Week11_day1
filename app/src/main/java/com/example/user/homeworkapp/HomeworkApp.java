package com.example.user.homeworkapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

/**
 * Created by user on 15/08/2016.
 */
public class HomeworkApp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("homework app","onCreatecalled");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final ImageView imageView = new ImageView(this);
//        imageView.setImageResource(R.drawable.ic_action_name);
//        setContentView(imageView);
    }
}

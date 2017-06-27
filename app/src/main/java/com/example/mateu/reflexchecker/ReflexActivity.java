package com.example.mateu.reflexchecker;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static android.R.color.holo_red_dark;

/**
 * Created by Mateu on 27.06.2017.
 */

public class ReflexActivity extends AppCompatActivity {

    boolean isAlreadyRunning;
    Button manageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reflex_activity);
        isAlreadyRunning=false;
        manageButton=(Button)findViewById(R.id.challagneManage);
        manageChallange(manageButton);
    }
    public void manageChallange(View v)
    {
        if (isAlreadyRunning)
        {
            manageButton.setText("Break");
            manageButton.setTextColor(Color.parseColor("#ff0000"));
        }
        else
        {
            manageButton.setText("Run");
            manageButton.setTextColor(Color.parseColor("#000000"));

        }
        isAlreadyRunning=!isAlreadyRunning;
    }

    public void NavigateBack(View v)
    {
        finish();
    }


}

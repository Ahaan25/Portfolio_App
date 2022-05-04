package com.example.portfoliokekw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class Experience extends AppCompatActivity {

    float x1, x2, y1, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);
    }

    public boolean onTouchEvent(MotionEvent touchevent){
        switch (touchevent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1=touchevent.getX();
                y1=touchevent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2=touchevent.getX();
                y2= touchevent.getY();
                if(y1<y2){
                    Intent i=new Intent(Experience.this, MainActivity.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }

}
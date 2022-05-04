package com.example.portfoliokekw;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class Projects extends AppCompatActivity {

    TextView rescu, bhelp, guitarstrum, omnitrix, anonforum;
    float x1, x2, y1, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        /*
        rescu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("http://nbtc.naco.gov.in/");
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        bhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("http://nbtc.naco.gov.in/");
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        guitarstrum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("http://nbtc.naco.gov.in/");
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        omnitrix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("http://nbtc.naco.gov.in/");
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        anonforum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("http://nbtc.naco.gov.in/");
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        */

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
                if(y2>y1&&x1>x2){
                    Intent i=new Intent(Projects.this, MainActivity.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }

}
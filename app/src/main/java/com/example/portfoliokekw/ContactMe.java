package com.example.portfoliokekw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.Toast;

public class ContactMe extends AppCompatActivity {

    float x1, x2, y1, y2;
    EditText name, id, phone, message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_me);

        Toast.makeText(ContactMe.this, "Swipe screen in any direction to go back.",Toast.LENGTH_SHORT).show();

        name=findViewById(R.id.editTextTextPersonName);
        id=findViewById(R.id.editTextTextPersonName2);
        phone=findViewById(R.id.editTextTextPersonName3);
        message=findViewById(R.id.editTextTextMultiLine);

    }

    public boolean onTouchEvent(MotionEvent touchevent){
        switch (touchevent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1=touchevent.getX();
                y1=touchevent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2=touchevent.getX();
                y2=touchevent.getY();
                if(x1<x2&&y1<y2){
                    Intent i=new Intent(ContactMe.this, MainActivity.class);
                    startActivity(i);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                }
                else if(y1<y2&&x2<x1) {
                    Intent i=new Intent(ContactMe.this, MainActivity.class);
                    startActivity(i);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                }
                else if(x2<x1&&y2<y1) {
                    Intent i=new Intent(ContactMe.this, MainActivity.class);
                    startActivity(i);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                }
                else if(y2<y1&&x1<x2) {
                    Intent i=new Intent(ContactMe.this, MainActivity.class);
                    startActivity(i);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                }
                break;
        }
        return false;
    }

}
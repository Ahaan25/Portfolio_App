package com.example.portfoliokekw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView git, link, insta, fb, mail;
    float x1, x2, y1, y2;
    TextView contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "Swipe screen diagonally to view more information.",Toast.LENGTH_SHORT).show();

        git=findViewById(R.id.imageView2);
        link=findViewById(R.id.imageView4);
        insta=findViewById(R.id.imageView3);
        fb=findViewById(R.id.imageView5);
        mail=findViewById(R.id.imageView6);
        contact=findViewById(R.id.textView16);

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ContactMe.class);
                startActivity(i);
            }
        });

        git.setOnHoverListener(new View.OnHoverListener() {
            @Override
            public boolean onHover(View v, MotionEvent event) {
                return false;
            }
        });

        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("http://github.com/Ahaan25/");
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("http://www.linkedin.com/in/ahaan-shaikh-123340223/");
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("http://www.instagram.com/78781515102.10230305454/");
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("http://www.facebook.com/ahaan.10230305454/");
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("http://www.facebook.com/ahaan.10230305454/");
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "ahaan25092002@gmail.com" });
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });

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
                    Intent i=new Intent(MainActivity.this, SkillsTools.class);
                    startActivity(i);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                }
                else if(y1<y2&&x2<x1) {
                    Intent i=new Intent(MainActivity.this, AboutMe.class);
                    startActivity(i);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                }
                else if(x2<x1&&y2<y1) {
                    Intent i=new Intent(MainActivity.this, Experience.class);
                    startActivity(i);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                }
                else if(y2<y1&&x1<x2) {
                    Intent i=new Intent(MainActivity.this, Projects.class);
                    startActivity(i);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                }
                break;
        }
        return false;
    }

}
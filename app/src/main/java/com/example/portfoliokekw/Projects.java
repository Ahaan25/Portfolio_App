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
import android.widget.Toast;

public class Projects extends AppCompatActivity {

    TextView rescu, bhelp, guitarstrum, omnitrix, anonforum;
    float x1, x2, y1, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
        Toast.makeText(Projects.this, "Press and hold for more information",Toast.LENGTH_LONG).show();

        rescu=findViewById(R.id.textView7);
        rescu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Projects.this);
                builder.setCancelable(true);
                builder.setTitle("Description");
                builder.setMessage("This project is an all you can think of emergency app with customizable emergencies, custom messages and emergency contacts. \nAll just a click away");

                builder.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.setPositiveButton("Open GitHub repo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Uri uri=Uri.parse("https://github.com/Ahaan25/RescU");
                        Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });
                builder.show();
                return false;
            }
        });

        bhelp=findViewById(R.id.textView9);
        bhelp.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Projects.this);
                builder.setCancelable(true);
                builder.setTitle("Description");
                builder.setMessage("This project is a records management, booking with automated email service and location for nearest hospitals app.");

                builder.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.setPositiveButton("Open GitHub repo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Uri uri=Uri.parse("https://github.com/Ahaan25/BloodDonation");
                        Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });
                builder.show();
                return false;
            }
        });

        guitarstrum=findViewById(R.id.textView10);
        guitarstrum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Projects.this);
                builder.setCancelable(true);
                builder.setTitle("Description");
                builder.setMessage("App made to do the job of a guitarist without actually needing a guitar or a guitarist! \nJust specify the chords and strumming pattern, et voila! It will play the music for you");

                builder.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.setPositiveButton("Open GitHub repo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Uri uri=Uri.parse("https://github.com/Ahaan25/GuitarStrum");
                        Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });
                builder.show();
                return false;
            }
        });

        omnitrix=findViewById(R.id.textView11);
        omnitrix.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Projects.this);
                builder.setCancelable(true);
                builder.setTitle("Description");
                builder.setMessage("First project on android wear, created to mimic the omnitrix watch from the show Ben 10. \nIt creates custom watch faces with sound effects");

                builder.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.setPositiveButton("Open GitHub repo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Uri uri=Uri.parse("https://github.com/Ahaan25/Omnitrix");
                        Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });
                builder.show();
                return false;
            }
        });

        anonforum=findViewById(R.id.textView12);
        anonforum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Projects.this);
                builder.setCancelable(true);
                builder.setTitle("Description");
                builder.setMessage("This project was made to be an anonymous forum page for the students of VITB to ask doubts and questions without restrictions. Obviously some content will be monitored.");

                builder.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.setPositiveButton("Open GitHub repo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Uri uri=Uri.parse("https://github.com/Ahaan25/AnonForum");
                        Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });
                builder.show();
                return false;
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
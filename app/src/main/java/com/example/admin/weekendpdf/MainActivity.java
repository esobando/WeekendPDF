package com.example.admin.weekendpdf;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        PDFActivity pdf = new PDFActivity();

//            pdf();
//        pdfBtn.setOnClickListener(new View.OnClickListener(){

//          SMS();



        }




    public void Alert() {
        AlertDialog.Builder myAlert  = new AlertDialog.Builder(this);
        myAlert.setMessage("Danger Will Robinson")
                .setPositiveButton("Continue ..", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which){
                        dialog.dismiss();
                    }
                })
                .setTitle("Welcome")
                .setIcon(R.drawable.icon)
                .create();
        myAlert.show();
    }


//        Intent intent = new Intent(MainActivity.this, SMSActivity.class);
//        startActivity(intent);
//        btnSMS.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v){
//                Intent  intent = new Intent(MainActivity.this,SMSActivity.class);
//
//                startActivity(intent);
//            }
//        });



    public void showPdf(View view) {
        Intent  intent = new Intent(MainActivity.this,PDFActivity.class);
        startActivity(intent);
    }

    public void showSMS(View view) {

        Intent intent = new Intent(MainActivity.this, SMSActivity.class);
        startActivity(intent);

    }

    public void Alert(View view) {
        AlertDialog.Builder myAlert  = new AlertDialog.Builder(this);
        myAlert.setMessage("Danger Will Robinson")
                .setPositiveButton("Continue ..", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which){
                        dialog.dismiss();
                    }
                })
                .setTitle("Welcome")
                .setIcon(R.drawable.icon)
                .create();
        myAlert.show();
    }

    public void showNotification(View view)
    {
        Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
        startActivity(intent);
    }
}


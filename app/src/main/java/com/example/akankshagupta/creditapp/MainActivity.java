package com.example.akankshagupta.creditapp;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DataBaseHelper dataBaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataBaseHelper= new DataBaseHelper(this);

        Button button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ViewAllUsers.class);
                startActivity(i);

            }
        });
        addUsers();
    }



   public void addUsers()
   {
       boolean isInserted1 = dataBaseHelper.insertData("Rajiv","Khanna","9019216645","23");
       boolean isInserted2 = dataBaseHelper.insertData("Joey","Watson","9944616640","50");
       boolean isInserted3 = dataBaseHelper.insertData("Christi","Radcliffe","9919219975","43");
       boolean isInserted4 = dataBaseHelper.insertData("Pranav","Gupta","9009216095","57");
       boolean isInserted5 = dataBaseHelper.insertData("Annie","Khanna","8139216645","30");
       boolean isInserted6 = dataBaseHelper.insertData("Shaum","Sharma","7049212342","67");
       boolean isInserted7 = dataBaseHelper.insertData("Danny","Cruise","9919216648","74");
       boolean isInserted8 = dataBaseHelper.insertData("Tom","Wilton","9758943795","40");
       boolean isInserted9 = dataBaseHelper.insertData("Ellie","Maddie","9000716662","19");
       boolean isInserted10 = dataBaseHelper.insertData("Gokul","Patel","9034217045","78");


       if(isInserted1 == true && isInserted2 == true && isInserted3 == true &&isInserted4 == true &&isInserted5 == true &&isInserted6 == true &&isInserted7 == true &&
               isInserted8 == true &&isInserted9 == true &&isInserted10 == true )
           return;
       else
           Toast.makeText(MainActivity.this,"Data not Inserted",Toast.LENGTH_LONG).show();
   }




}

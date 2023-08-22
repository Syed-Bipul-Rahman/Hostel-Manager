package com.mpi.hostel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
//declaring global variables
    CardView infopage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //calling init method

        initall();


        //sending to hostel info page
        infopage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,HostelInfoActivity.class));
            }
        });

    }

    private void initall() {
        infopage=findViewById(R.id.sentinfo);

    }
}
package com.example.activitylabtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class LabActivity2 extends MainActivity {
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8 ;
    //public int counter1=0;
    //public int counter2=0;
    //public int counter3=0;
   // public int counter4=0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2);
        t5=(TextView)findViewById(R.id.t1);
        Log.i("On create invoked","1");
        super.counter1 ++;
        String h = "On create call:" + counter1;
        t5.setText(h);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("On restart invoked","1");
        t8 = (TextView) findViewById(R.id.t4);
        super.counter2++;
        String m="on restart calls:"+super.counter2;
        t8.setText(m);
}

    @Override
    protected void onStart() {
        super.onStart();
        t6 = (TextView) findViewById(R.id.t2);
        Log.i("On start invoked","1");
        super.counter3++;
        String g="on start calls:"+super.counter3;
        t6.setText(g);
    }
    @Override
    protected void onResume() {
        super.onResume();
        t7 = (TextView) findViewById(R.id.t3);
        Log.i("On resume invoked","1");
        super.counter4++;
        String a="onResume calls :"+super.counter4;
        t7.setText(a);
    }
    }
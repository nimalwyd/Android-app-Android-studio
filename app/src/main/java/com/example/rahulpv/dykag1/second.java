package com.example.rahulpv.dykag1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import  android.widget.RelativeLayout.LayoutParams;


public class second  extends Activity{
    RelativeLayout l1,l2,l3,l4,l5,l6,l7,l8,l9;
    ImageView i1;
    EditText e1,e2,e3,e4,e5,e6,e7;
    Button ic1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);


        Display display = getWindowManager().getDefaultDisplay();
       int width = display.getWidth();
        int height = display.getHeight();
        /*int h1=(height/10)*6;*/

        ic1= (Button) findViewById(R.id.ic1);
        ic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent obj1=new Intent(second.this,third.class);
                startActivity(obj1);

            }
        });











    }
}

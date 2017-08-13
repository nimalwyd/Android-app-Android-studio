package com.example.rahulpv.dykag1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class third extends ListActivity {

    String[] players={"Mr. Fix It Tech LLC","Mr. Fix It Tech LLC","Mr. Fix It Tech LLC","Mr. Fix It Tech LLC","Mr. Fix It Tech LLC"  };
    int[] images={R.drawable.t,R.drawable.t,R.drawable.t,R.drawable.t,R.drawable.t};
    String datas[]={"INTERIOR","INTERIOR","INTERIOR","INTERIOR","INTERIOR","INTERIOR","INTERIOR",};
    int[] images1={R.drawable.border};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);


        //create and setup  adapter
        customadapterclass adapter=new customadapterclass(this, players, datas,images,images1);
        setListAdapter(adapter);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        Toast.makeText(this, "this", Toast.LENGTH_LONG).show();
    }



}
package com.example.rahulpv.dykag1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customadapterclass extends ArrayAdapter<String>{

    Context c;
    String[] players;
    String[] datas;
    int[] images;
    int[] images1;
    LayoutInflater inflater;






    public customadapterclass(Context context, String[] players,String[] datas , int[] images, int[] images1) {
        super(context, R.layout.rowmodel,players);
        // TODO Auto-generated constructor stub


        this.c=context;
        this.players=players;
        this.images=images;
        this.images1=images1;
        this.datas=datas;


    }




    //this inner class holds views
    public class viewholder{

        TextView nametv;
        ImageView img;
        ImageView img1;
        TextView nametv1;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        // check if view is null if so create it
        if(convertView==null){
            inflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.rowmodel, null);

        }
        //otherwise
        viewholder holder =new viewholder();
        //initialize views
        holder.nametv=(TextView) convertView.findViewById(R.id.nametv);
        holder.nametv1=(TextView) convertView.findViewById(R.id.nametv1);
        holder.img=(ImageView) convertView.findViewById(R.id.imageview1);
        holder.img1=(ImageView) convertView.findViewById(R.id.imageview2);
        //assign them the data
        holder.nametv.setText(players[position]);
        holder.nametv1.setText(datas[position]);
        holder.img.setImageResource(images[position]);
        holder.img1.setImageResource(images1[0]);

        return convertView;
    }
}

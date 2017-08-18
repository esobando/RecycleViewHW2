package com.example.admin.recycleviewhw2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Admin on 8/17/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>
{
    Context c;
    ArrayList<Spacecraft>spacecrafts;

    public MyAdapter(Context c, ArrayList<Spacecraft> spacecrafts){
        this.c =c;
        this.spacecrafts=spacecrafts;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(c).inflate(R.layout.row_layout, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Spacecraft e=spacecrafts.get(position);
        holder.propellanttxt.setText(e.getPropellent());
        holder.img.setImageResource(e.getImage());
        holder.nameText.setText(e.getName());
    }

    @Override
    public int getItemCount() {
        return spacecrafts.size();
    }
}

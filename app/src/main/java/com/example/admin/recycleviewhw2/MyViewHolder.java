package com.example.admin.recycleviewhw2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder
{
    TextView nameText, propellanttxt;
    ImageView img;

    public MyViewHolder(View itemView) {
        super(itemView);

        nameText=(TextView) itemView.findViewById(R.id.nameText);
        propellanttxt=(TextView) itemView.findViewById(R.id.propellenttxt);
        img = (ImageView) itemView.findViewById(R.id.icon);
    }
}
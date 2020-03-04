package com.example.traveling;

import android.app.LauncherActivity;
import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myadapter extends RecyclerView.Adapter<myadapter.ViewHolder> {
    private List<recycleritem> listItems;

    public myadapter(List<recycleritem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    private Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(parent.getContext())
               .inflate(R.layout.ritem,parent, false);
       return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
recycleritem recycleritem=listItems.get(position);
holder.txthead.setText(recycleritem.getHead());
holder.txtdesc.setText(recycleritem.getDesc());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txthead;
        public TextView txtdesc;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txthead=(TextView)itemView.findViewById(R.id.textviewHead);
            txtdesc=(TextView)itemView.findViewById(R.id.desc);
        }
    }
}

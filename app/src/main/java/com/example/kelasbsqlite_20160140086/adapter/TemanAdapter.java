package com.example.kelasbsqlite_20160140086.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kelasbsqlite_20160140086.R;
import com.example.kelasbsqlite_20160140086.database.Teman;

import java.util.ArrayList;

public class TemanAdapter extends RecyclerView.Adapter<com.example.kelasbsqlite_20160140086.adapter.TemanAdapter.TemanViewHolder> {
    private ArrayList<Teman> listData;

    public TemanAdapter(ArrayList<Teman> listData) {
        this.listData = listData;
    }

    @Override
    public TemanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInf = LayoutInflater.from(parent.getContext());
        View view = layoutInf.inflate(R.layout.row_data_teman,parent,false);
        return new TemanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TemanViewHolder holder, int position) {
        String nm,tlp;

        nm = listData.get(position).getNama();
        tlp = listData.get(position).getTelpon();

        holder.namaTxt.setText(nm);
        holder.telponTxt.setText(tlp);
        holder.namaTxt.setTextColor(Color.BLUE);
        holder.namaTxt.setTextSize(20);
    }

    @Override
    public int getItemCount() {
        return (listData != null)?listData.size() : 0;
    }

    public class TemanViewHolder extends RecyclerView.ViewHolder {
        private CardView cardku;
        private TextView namaTxt,telponTxt;
        public TemanViewHolder(View view) {
            super(view);
            cardku = (CardView) view.findViewById(R.id.kartuku);
                    namaTxt = (TextView) view.findViewById(R.id.textNama);
                    telponTxt = (TextView) view.findViewById(R.id.textTelpon);
        }
    }
}

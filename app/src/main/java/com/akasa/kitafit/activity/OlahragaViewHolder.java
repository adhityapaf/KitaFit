package com.akasa.kitafit.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.akasa.kitafit.R;

public class OlahragaViewHolder extends RecyclerView.ViewHolder {

    public TextView t1;
    TextView deskripsi;
    TextView durasi;
    TextView fokus_area;
    TextView kalori;
    TextView sumber;
    public ImageView i1;
    public View v;


    public OlahragaViewHolder(@NonNull View itemView) {
        super(itemView);

        t1 = itemView.findViewById(R.id.nama);
        i1 = itemView.findViewById(R.id.gambar);
        deskripsi = itemView.findViewById(R.id.deskripsi_olahraga);
        durasi = itemView.findViewById(R.id.durasi);
        fokus_area = itemView.findViewById(R.id.fokus);
        kalori = itemView.findViewById(R.id.kalori);
        sumber = itemView.findViewById(R.id.sumber);
        v = itemView;


    }
}
package com.example.teguh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class AdapterAnggota extends RecyclerView.Adapter<AdapterAnggota.ListViewHoder> {
    private ArrayList<Anggota> anggota;
    public AdapterAnggota(ArrayList<Anggota> data){
        this.anggota = data;
    }
    @NonNull
    @Override
    public AdapterAnggota.ListViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.anggota_kelompok, parent,false);
        return new ListViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAnggota.ListViewHoder holder, int position) {
        Anggota temp = anggota.get(position);
        Glide.with(holder.itemView.getContext()).load(temp.getPhoto()).apply(new RequestOptions().override(55,55)).into(holder.gambar);
        holder.nama.setText(temp.getNama());
        holder.detail.setText(temp.getDetail());
    }

    @Override
    public int getItemCount() {
        return anggota.size();
    }

    public class ListViewHoder extends RecyclerView.ViewHolder {
        ImageView gambar;
        TextView nama, detail;
        public ListViewHoder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.gambar_anggota);
            nama = itemView.findViewById(R.id.nama_anggota);
            detail = itemView.findViewById(R.id.detail_anggota);
        }
    }
}

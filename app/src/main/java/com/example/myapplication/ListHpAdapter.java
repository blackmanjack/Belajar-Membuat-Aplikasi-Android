package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
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

public class ListHpAdapter extends RecyclerView.Adapter<ListHpAdapter.ListViewHolder> {

    private Context context;
    private ArrayList<Hp> listHp;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListHpAdapter(ArrayList<Hp> list) {

        this.listHp = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_hp, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int i) {

        final Hp hp = listHp.get(i);
        Glide.with(holder.itemView.getContext())
                .load(hp.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(hp.getName());
        holder.tvDetail.setText(hp.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, DetailActivity.class)
                        .putExtra(DetailActivity.INTENT_DATA, hp.get(i)));
                onItemClickCallback.onItemClicked(listHp.get(holder.getAdapterPosition()));
            }
        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(Hp data);
    }

    @Override
    public int getItemCount() {
        return listHp.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

}
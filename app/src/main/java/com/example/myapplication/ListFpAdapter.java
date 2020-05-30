package com.example.myapplication;

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

public class ListFpAdapter extends RecyclerView.Adapter<ListFpAdapter.ListViewHolder> {

    private ArrayList<Fp> listFp;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListFpAdapter(ArrayList<Fp> list) {

        this.listFp = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_fp, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int i) {

        final Fp fp = listFp.get(i);
        Glide.with(holder.itemView.getContext())
                .load(fp.getPhoto())
                .apply(new RequestOptions().override(60, 60))
                .into(holder.imgPhoto);
        holder.tvName.setText(fp.getName());
        holder.tvDetail.setText(fp.getDetail());
        holder.tvIncome.setText(fp.getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(fp);
            }
        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(Fp data);
    }

    @Override
    public int getItemCount() {
        return listFp.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvIncome;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvIncome = itemView.findViewById(R.id.tv_item_income);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

}
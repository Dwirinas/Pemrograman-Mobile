package com.rina.makeup;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardMakeupAdapter extends RecyclerView.Adapter<CardMakeupAdapter.ListViewHolder> {
    private ArrayList<Makeup> listMakeup;
    private Context context;

    public CardMakeupAdapter(Context context, ArrayList<Makeup> list){
        this.listMakeup = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CardMakeupAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_makeup, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardMakeupAdapter.ListViewHolder holder, int position) {
        final Makeup makeup = listMakeup.get(position);
        Glide.with(holder.itemView.getContext())
                .load(makeup.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);
        holder.tvName.setText(makeup.getName());
        holder.tvDesc.setText(makeup.getDescription());
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent de = new Intent(context, DetailListMakeup.class);
                de.putExtra("makeup_id", makeup.getId());
                context.startActivity(de);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMakeup.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_makeup_list);
            tvName = itemView.findViewById(R.id.name_list_makeup);
            tvDesc = itemView.findViewById(R.id.desc_makeup_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}

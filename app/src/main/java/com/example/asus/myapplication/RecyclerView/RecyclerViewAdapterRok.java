package com.example.asus.myapplication.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.myapplication.Contact;
import com.example.asus.myapplication.DialogHome;
import com.example.asus.myapplication.R;

import java.util.List;

public class RecyclerViewAdapterRok extends RecyclerView.Adapter <RecyclerViewAdapterRok.MyViewHolder>{

    private Context mContext;
    private List<Contact> mData;

    public RecyclerViewAdapterRok(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.card_view_dress,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tv_Nama.setText(mData.get(position).getName());
        holder.img_photo.setImageResource(mData.get(position).getPhoto());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(mContext, DialogHome.class);
                i.putExtra("image",mData.get(position).getPhoto());
                i.putExtra("nama",mData.get(position).getName());
                i.putExtra("harga",mData.get(position).getHarga());
                mContext.startActivity(i);


            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_Nama;
        ImageView img_photo;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_Nama = (TextView) itemView.findViewById(R.id.book_title_id);
            img_photo = (ImageView) itemView.findViewById(R.id.book_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardView_id);

        }
    }
}

package com.example.asus.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    Context mContext;
    List<Contact> mData;
    Dialog myDialog;

    public RecyclerViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_home,parent,false);
        final MyViewHolder vHolder = new MyViewHolder(v);

//        myDialog = new Dialog(mContext);
//        myDialog.setContentView(R.layout.activity_dialog_home);
//
//
//        vHolder.item_home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TextView dialog_nama_tv = (TextView) myDialog.findViewById(R.id.dialog_nama);
//                TextView dialog_harga_tv = (TextView) myDialog.findViewById(R.id.dialog_harga);
//                ImageView dialog_home_img = (ImageView) myDialog.findViewById(R.id.dialog_img);
//                dialog_nama_tv.setText(mData.get(vHolder.getAdapterPosition()).getName());
//                dialog_harga_tv.setText(mData.get(vHolder.getAdapterPosition()).getHarga());
//                dialog_home_img.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhoto());
//                myDialog.show();
//            }
//        });


        return vHolder;

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {


        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_harga.setText(mData.get(position).getHarga());
        holder.img.setImageResource(mData.get(position).getPhoto());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,DialogHome.class);
                intent.putExtra("image",mData.get(position).getPhoto());
                intent.putExtra("nama",mData.get(position).getName());
                intent.putExtra("harga",mData.get(position).getHarga());
                mContext.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private Button btnPesan;
        private LinearLayout item_home;
        private TextView tv_name;
        private TextView tv_harga;
        private ImageView img;
        private RelativeLayout relativeLayout;


        public MyViewHolder(View itemView) {
            super(itemView);

            btnPesan = (Button) itemView.findViewById(R.id.dialog_btn_pesan);
            item_home = (LinearLayout) itemView.findViewById(R.id.contact_item_id);
            tv_name = (TextView) itemView.findViewById(R.id.name_contact);
            tv_harga = (TextView) itemView.findViewById(R.id.harga_contact);
            img = (ImageView) itemView.findViewById(R.id.img_contact);
            relativeLayout= (RelativeLayout) itemView.findViewById(R.id.relativlayout_id);


        }
    }
}

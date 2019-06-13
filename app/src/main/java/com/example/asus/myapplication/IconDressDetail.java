package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.asus.myapplication.RecyclerView.RecyclerViewAdapterDress;

import java.util.ArrayList;
import java.util.List;

public class IconDressDetail extends AppCompatActivity {

    List<Contact> lstContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.icon_dress_detail);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Chick Black","150.000",R.drawable.chicblackdress));
        lstContact.add(new Contact("Allsaint UK","350.000",R.drawable.allsaintsuk));
        lstContact.add(new Contact("Blue Plus","150.000",R.drawable.blueplussizedress));
        lstContact.add(new Contact("Denim Mini Dress","250.000",R.drawable.denimminidress));
        lstContact.add(new Contact("Leopard Dress","850.000",R.drawable.leopardshirtdress));
        lstContact.add(new Contact("Maxi Dress","250.000",R.drawable.maxi));
        lstContact.add(new Contact("Spring Dress","350.000",R.drawable.springdress));
        lstContact.add(new Contact("Chick Black","150.000",R.drawable.chicblackdress));
        lstContact.add(new Contact("Allsaint UK","350.000",R.drawable.allsaintsuk));
        lstContact.add(new Contact("Blue Plus","150.000",R.drawable.blueplussizedress));
        lstContact.add(new Contact("Denim Mini Dress","250.000",R.drawable.denimminidress));
        lstContact.add(new Contact("Leopard Dress","850.000",R.drawable.leopardshirtdress));
        lstContact.add(new Contact("Maxi Dress","250.000",R.drawable.maxi));
        lstContact.add(new Contact("Spring Dress","350.000",R.drawable.springdress));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapterDress myAdapter = new RecyclerViewAdapterDress(this,lstContact);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);

    }
}

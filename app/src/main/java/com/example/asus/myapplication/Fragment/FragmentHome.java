package com.example.asus.myapplication.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.myapplication.Contact;
import com.example.asus.myapplication.R;
import com.example.asus.myapplication.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;

    public FragmentHome() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.home_fragment,container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclearview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Gresya Top","100.000",R.drawable.gambar));
        lstContact.add(new Contact("Gresya Top Navy","100.000",R.drawable.gresyatopnavy));
        lstContact.add(new Contact("Gresya Top Pink","100.000",R.drawable.gresyatoppink));
        lstContact.add(new Contact("Gresya Top Sea Green","100.000",R.drawable.gresyatopseagreen));
        lstContact.add(new Contact("Arqena Dress Grew","250.000",R.drawable.arqenadressgrew));
        lstContact.add(new Contact("Arqena Dress Pink","250.000",R.drawable.arqenadresspink));
        lstContact.add(new Contact("Arqena Dress Sand","250.000",R.drawable.arqenadresssand));
        lstContact.add(new Contact("Arqena Dress Snow","250.000",R.drawable.arqenadresssnow));
        lstContact.add(new Contact("Haifa Top Dove","150.000",R.drawable.haifatopdove));
        lstContact.add(new Contact("Haifa Top Pink","150.000",R.drawable.haifatoppink));
        lstContact.add(new Contact("Haifa Top Sky Blue","150.000",R.drawable.haifatopskyblue));
        lstContact.add(new Contact("Kwina Top Grey","150.000",R.drawable.karinatopgrey));
        lstContact.add(new Contact("kwina Top Orcid","150.000",R.drawable.kewinatoporcid));
        lstContact.add(new Contact("Kwina Top","150.000",R.drawable.kwinatop));
        lstContact.add(new Contact("Meya Shirt Custard","150.000",R.drawable.meyashirtcustard));
        lstContact.add(new Contact("Gresya Top","100.000",R.drawable.gambar));
        lstContact.add(new Contact("Gresya Top Navy","100.000",R.drawable.gresyatopnavy));
        lstContact.add(new Contact("Gresya Top Pink","100.000",R.drawable.gresyatoppink));
        lstContact.add(new Contact("Gresya Top Sea Green","100.000",R.drawable.gresyatopseagreen));
        lstContact.add(new Contact("Arqena Dress Grew","250.000",R.drawable.arqenadressgrew));
        lstContact.add(new Contact("Arqena Dress Pink","250.000",R.drawable.arqenadresspink));
        lstContact.add(new Contact("Arqena Dress Sand","250.000",R.drawable.arqenadresssand));
        lstContact.add(new Contact("Arqena Dress Snow","250.000",R.drawable.arqenadresssnow));
        lstContact.add(new Contact("Haifa Top Dove","150.000",R.drawable.haifatopdove));
        lstContact.add(new Contact("Haifa Top Pink","150.000",R.drawable.haifatoppink));
        lstContact.add(new Contact("Haifa Top Sky Blue","150.000",R.drawable.haifatopskyblue));
        lstContact.add(new Contact("Kwina Top Grey","150.000",R.drawable.karinatopgrey));
        lstContact.add(new Contact("kwina Top Orcid","150.000",R.drawable.kewinatoporcid));
        lstContact.add(new Contact("Kwina Top","150.000",R.drawable.kwinatop));
        lstContact.add(new Contact("Meya Shirt Custard","150.000",R.drawable.meyashirtcustard));
        lstContact.add(new Contact("Gresya Top","100.000",R.drawable.gambar));
        lstContact.add(new Contact("Gresya Top Navy","100.000",R.drawable.gresyatopnavy));
        lstContact.add(new Contact("Gresya Top Pink","100.000",R.drawable.gresyatoppink));
        lstContact.add(new Contact("Gresya Top Sea Green","100.000",R.drawable.gresyatopseagreen));
        lstContact.add(new Contact("Arqena Dress Grew","250.000",R.drawable.arqenadressgrew));
        lstContact.add(new Contact("Arqena Dress Pink","250.000",R.drawable.arqenadresspink));
        lstContact.add(new Contact("Arqena Dress Sand","250.000",R.drawable.arqenadresssand));
        lstContact.add(new Contact("Arqena Dress Snow","250.000",R.drawable.arqenadresssnow));
        lstContact.add(new Contact("Haifa Top Dove","150.000",R.drawable.haifatopdove));
        lstContact.add(new Contact("Haifa Top Pink","150.000",R.drawable.haifatoppink));
        lstContact.add(new Contact("Haifa Top Sky Blue","150.000",R.drawable.haifatopskyblue));
        lstContact.add(new Contact("Kwina Top Grey","150.000",R.drawable.karinatopgrey));
        lstContact.add(new Contact("kwina Top Orcid","150.000",R.drawable.kewinatoporcid));
        lstContact.add(new Contact("Kwina Top","150.000",R.drawable.kwinatop));
        lstContact.add(new Contact("Meya Shirt Custard","150.000",R.drawable.meyashirtcustard));

    }
}

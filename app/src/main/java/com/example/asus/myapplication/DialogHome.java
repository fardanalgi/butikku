package com.example.asus.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DialogHome extends AppCompatActivity {

    private Button btnPesan;
    private ImageView img;
    private TextView nama,harga;
    int Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_home);

        img = (ImageView) findViewById(R.id.dialog_img);
        nama = (TextView) findViewById(R.id.dialog_nama);
        harga = (TextView) findViewById(R.id.dialog_harga);
        Image=getIntent().getIntExtra("image",0);
        img.setImageResource(Image);
        nama.setText(getIntent().getStringExtra("nama"));
        harga.setText(getIntent().getStringExtra("harga"));

        btnPesan = (Button) findViewById(R.id.dialog_btn_pesan);
        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uriUrl = Uri.parse("https://api.whatsapp.com/send?phone=6287848491962&text=Permisi%20min%20saya%20mau%20pesan");

                Intent intentWA = new Intent(Intent.ACTION_VIEW, uriUrl);

                startActivity(intentWA);

            }
        });


    }
}

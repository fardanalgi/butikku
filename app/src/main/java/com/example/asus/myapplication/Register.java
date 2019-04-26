package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }
    public void onRegisterClick (View v) {
        if (v.getId() == R.id.Bregister) {
            EditText name = (EditText) findViewById(R.id.TFname);
            EditText email = (EditText) findViewById(R.id.TFemail);
            EditText uname = (EditText) findViewById(R.id.TFuname);
            EditText pass1 = (EditText) findViewById(R.id.TFpass1);
            EditText pass2 = (EditText) findViewById(R.id.TFpass2);

            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String unamestr = uname.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();

            if (namestr.length() == 0) {
                name.setError("Nama kosong, mohon di isi");
            } else if (emailstr.length() == 0) {
                email.setError("Email kosong, mohon di isi");
            } else if (unamestr.length() == 0) {
                uname.setError("username kosong, mohon di isi");
            } else if (!pass1str.equals(pass2str)) {
                Toast.makeText(Register.this, "Password Unmatch",
                        Toast.LENGTH_SHORT).show();
            } else {
                Contact c = new Contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setUname(unamestr);
                c.setPass(pass1str);
                helper.insertContact(c);
                finish();
                Toast.makeText(Register.this,
                        "Username & password berhasil dibuat",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}

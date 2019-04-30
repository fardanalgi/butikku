package com.example.asus.myapplication;

public class Contact {
    String name, email, uname, pass, Harga;
    int Photo;

    public Contact(){
    }

    public Contact(String name, String harga, int photo) {
        this.name = name;
        Harga = harga;
        Photo = photo;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String phone) {
        Harga = phone;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUname() {
        return this.uname;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return this.pass;
    }

}

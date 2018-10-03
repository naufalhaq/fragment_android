package com.example.naufalhaq.modul2_fragment;

import android.content.Context;

/**
 * Created by Naufal Haq on 17/09/2018.
 */

public class Resep {
    private String nama_makanan;
    private String detail_makanan;
    private int gambar_;

    public static final Resep[] resepmakanan = {
            new Resep("Black Panther", "Black Panther adalah film pahlawan super Amerika berdasarkan karakter Marvel Comics dengan nama sama. Diproduksi oleh Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures, film ini merupakan film kedelapan belas dari Marvel Cinematic Universe.",R.drawable.black),
            new Resep("Captain America", "Captain America: The First Avenger merupakan sebuah film pahlawan super Amerika Serikat yang dirilis pada tahun 2011. Film yang disutradarai oleh Joe Johnston ini pemainnya antara lain oleh Chris Evans, Tommy Lee Jones dan masih banyak lagi.",R.drawable.captain),
            new Resep("Deadpool", "Deadpool adalah sebuah film pahlawan super Amerika yang berdasarkan pada karakter Marvel Comics dengan nama yang sama. Film tersebut merupakan instalmen kedelapan dalam serial film X-Men.",R.drawable.deadpol),
            new Resep("Iron Man", "Iron Man adalah sebuah film yang berdasarkan tokoh Marvel Comics Iron Man. Film ini disutradarai oleh Jon Favreau dan dibintangi Robert Downey Jr., Gwyneth Paltrow, Terrence Howard, dan Jeff Bridges. Film ini dirilis pada 2 Mei 2008 di Amerika Serikat.",R.drawable.iron),
            new Resep("Thor", "Thor adalah film pahlawan super Amerika 2011 berdasarkan karakter Marvel Comics dengan nama yang sama, diproduksi oleh Marvel Studios dan didistribusikan oleh Paramount Pictures. Ini adalah film keempat di Marvel Cinematic Universe.",R.drawable.thor),
    };
    public Resep(String nama, String detail, int gambar){
        this.nama_makanan = nama;
        this.detail_makanan = detail;
        this.gambar_ = gambar;
    }

    public String getDetail_makanan() {
        return detail_makanan;
    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public int getGambar_() {
        return gambar_;
    }

    @Override
    public String toString() {
        return this.nama_makanan;
    }
}

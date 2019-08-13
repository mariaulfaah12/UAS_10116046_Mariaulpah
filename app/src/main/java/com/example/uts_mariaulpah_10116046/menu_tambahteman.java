package com.example.uts_mariaulpah_10116046;
/*Tanggal Pengerjaan : 10 Mei 2019
 * NIM : 10116046
 * Nama : Maria ulpah
 * Kelas : AKB-1*/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class menu_tambahteman extends AppCompatActivity {
    public static String inf = "Maria Ulpah";
    public static String info = "Info";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tambahteman);
        Intent menu_tambahteman = getIntent();
        String getNama = menu_tambahteman.getStringExtra(menu_list.EXTRA_MESSAGE);
        String getKelas = menu_tambahteman.getStringExtra(menu_list.EXTRA_MSG);
        String getTelepon = menu_tambahteman.getStringExtra(menu_list.EXTRA_Test);
        String getEmail = menu_tambahteman.getStringExtra(menu_list.test);
        String getSocmed = menu_tambahteman.getStringExtra(menu_list.test2);
        TextView nama = findViewById(R.id.hasilNama);
        TextView kelas = findViewById(R.id.hasilKelas);
        TextView telepon = findViewById(R.id.hasilTelepon);
        TextView email = findViewById(R.id.hasilEmail);
        TextView socmed = findViewById(R.id.hasilSosialmedia);
        nama.setText("Nama : "+ getNama);
        kelas.setText("Kelas : "+getKelas);
        telepon.setText("Telepon : "+getTelepon);
        email.setText("E-Mail : "+getEmail);
        socmed.setText("Instagram : "+getSocmed);
    }
}

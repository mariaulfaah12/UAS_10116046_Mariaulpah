package com.example.uts_mariaulpah_10116046;
/*Tanggal Pengerjaan : 10 Mei 2019
 * NIM : 10116046
 * Nama : Maria ulpah
 * Kelas : AKB-1*/

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent viewpage = new Intent(MainActivity.this, viewpage.class);
                startActivity(viewpage);
                finish();
            }
        }, waktu_loading);
    }
}

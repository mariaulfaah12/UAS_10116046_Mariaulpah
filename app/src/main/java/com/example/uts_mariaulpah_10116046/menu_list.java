package com.example.uts_mariaulpah_10116046;
/*Tanggal Pengerjaan : 10 Mei 2019
 * NIM : 10116046
 * Nama : Maria ulpah
 * Kelas : AKB-1*/

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class menu_list extends AppCompatActivity {
    public static String EXTRA_MESSAGE = "Maria Ulpah";
    public static String EXTRA_MSG = "Ul";
    public static String EXTRA_Test = "Ulpah";
    public static String test = "Maria ulpah";
    public static String test2 = "Mariaulpah";



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent menu_utama = new Intent(menu_list.this, Menu_Utama.class);
                    startActivity(menu_utama);
                    finish();
                    return true;
                case R.id.navigation_dashboard:
                    Intent menu_kontak = new Intent(menu_list.this, Menu_Kontak.class);
                    startActivity(menu_kontak);
                    finish();
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    public void kirimData (View view){
        Intent menu_tambahteman = new Intent (menu_list.this, menu_tambahteman.class);
        EditText nama = findViewById(R.id.nama);
        EditText kelas = findViewById(R.id.kelas);
        EditText telepon = findViewById(R.id.telepon);
        EditText email = findViewById(R.id.email);
        EditText sosmed = findViewById(R.id.sosialmedia);
        String msgnama = nama.getText().toString();
        String msgkelas = kelas.getText().toString();
        String msgtelepon = telepon.getText().toString();
        String msgemail = email.getText().toString();
        String msgsosmed = sosmed.getText().toString();
        menu_tambahteman.putExtra(EXTRA_MESSAGE, msgnama);
        menu_tambahteman.putExtra(EXTRA_MSG, msgkelas);
        menu_tambahteman.putExtra(EXTRA_Test, msgtelepon);
        menu_tambahteman.putExtra(test, msgemail);
        menu_tambahteman.putExtra(test2, msgsosmed);
        startActivity(menu_tambahteman);
    }

}

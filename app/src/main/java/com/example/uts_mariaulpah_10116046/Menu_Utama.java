package com.example.uts_mariaulpah_10116046;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
/*Tanggal Pengerjaan : 10 Mei 2019
 * NIM : 10116046
 * Nama : Maria ulpah
 * Kelas : AKB-1*/

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Menu_Utama extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    Intent menu_kontak = new Intent(Menu_Utama.this, Menu_Kontak.class);
                    startActivity(menu_kontak);
                    finish();
                    return true;
                case R.id.navigation_notifications:
                    Intent menu_list = new Intent(Menu_Utama.this, menu_list.class);
                    startActivity(menu_list);
                    finish();
                    return true;
            }
            return false;
        }
    };
    Button btn_logout;
    SharedPreferences sharedpreferences;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__utama);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        btn_logout = (Button) findViewById(R.id.btnLogout);
        btn_logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                logout();
            }
        });
    }
    private void logout(){
        sharedpreferences = getSharedPreferences(LoginActivity.my_shared_preferences, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putBoolean(LoginActivity.session_status, false);
        editor.putString(LoginActivity.TAG_ID, null);
        editor.putString(LoginActivity.TAG_EMAIL, null);
        editor.putString(LoginActivity.TAG_NAME, null);
        editor.putString(LoginActivity.TAG_PHONE, null);
        editor.commit();
        intent = new Intent(Menu_Utama.this, LoginActivity.class);
        finish();
        startActivity(intent);
    }

}

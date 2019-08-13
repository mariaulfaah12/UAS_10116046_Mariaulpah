package com.example.uts_mariaulpah_10116046;
/*Tanggal Pengerjaan : 10 Mei 2019
 * NIM : 10116046
 * Nama : Maria ulpah
 * Kelas : AKB-1*/

import android.content.Context;
import android.content.SharedPreferences;

public class TampilManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;
    int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "intro_slider-welcome";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    public TampilManager(viewpage viewpage) {

    }

    public TampilManager (Context context){
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public boolean isFirstTimeLaunch() { return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true );
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }
}

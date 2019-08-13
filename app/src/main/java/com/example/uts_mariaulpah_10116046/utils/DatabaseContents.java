package com.example.uts_mariaulpah_10116046.utils;
/*Tanggal Pengerjaan : 10 Mei 2019
 * NIM : 10116046
 * Nama : Maria ulpah
 * Kelas : AKB-1*/

public enum DatabaseContents {
    DATABASE("loginsederhana.db"),
    TABLE_USERS("tbl_users");
    private String name;
    private DatabaseContents(String name) {
        this.name = name;
    }
    public String toString(){
        return name;
    }
}

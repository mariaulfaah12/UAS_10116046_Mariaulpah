package com.example.uts_mariaulpah_10116046.controllers;
/*Tanggal Pengerjaan : 10 Mei 2019
 * NIM : 10116046
 * Nama : Maria ulpah
 * Kelas : AKB-1*/

import android.content.ContentValues;

import com.example.uts_mariaulpah_10116046.utils.Database;
import com.example.uts_mariaulpah_10116046.utils.DatabaseContents;

import java.util.List;

public class UserController {
    private static Database database;
    private static UserController instance;
    private UserController(){}
    public static UserController getInstance(){
        if(instance==null)
            instance = new UserController();
        return instance;
    }
    public static void setDatabase(Database db) {
        database = db;
    }
    public ContentValues getDataByEmail(String email) {
        String queryString = "SELECT * FROM " + DatabaseContents.TABLE_USERS + " WHERE email = '"+ email +"'";
        List<Object> contents = database.select(queryString);

        if (contents.isEmpty()) {
            return null;
        }

        ContentValues content = (ContentValues) contents.get(0);
        return content;
    }
    public Object getUsers() {
        List<Object> contents = database.select("SELECT * FROM " + DatabaseContents.TABLE_USERS);

        return contents;
    }
    public int register(ContentValues content) {
        int id = database.insert(DatabaseContents.TABLE_USERS.toString(), content);

        return id;
    }
    public boolean update(ContentValues content) {
        boolean update = database.update(DatabaseContents.TABLE_USERS.toString(), content);

        return update;
    }
}

package com.example.sinhvien.sqlite;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final  String db_name ="sinhvien";
    public static final  int db_version =1;

    public DBHelper(Context context) {
        super(context,db_name,null,db_version);
    }

    public void onCreate(SQLiteDatabase sqLiteDatabase){
        String sql = "CREATE TABLE sinhvien(id char primary key,name text not null," + "salary integer not null)";
        sqLiteDatabase.execSQL(sql);
    }

    public void  onUpgrade(SQLiteDatabase sqLiteDatabase,int i, int i1){
        String sql ="DROP TABLE IF EXISTS sinhvien";
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }
}
package com.example.traveling;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Help extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Person_db";
    public static final String DATA_TABLE="person_table";
    public static final String cl1="PID";
    public static final String cl2="NAME";
    public static final String cl3="Email";
    public Help(@Nullable Context context) {
        super(context,DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+ DATA_TABLE +"(PID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,Email TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DATA_TABLE);
        onCreate(db);
    }
    public boolean putData(String n,String e){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(cl2,n);
        contentValues.put(cl3,e);
        long result=db.insert(DATA_TABLE,null,contentValues);
        if (result==-1)
            return false;
            else
                return true;
    }
}

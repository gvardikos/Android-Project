package com.example.mike.courseval;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class StudentDbHelper extends SQLiteOpenHelper {

    //needs to be incremented when changes to schema
    private static final int DATABASE_VERSION = 1;

    static final String DATABASE_NAME = "student.db";

    public StudentDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_STUDENT_TABLE = "CREATE TABLE IF NOT EXISTS " + StudentEntry.TABLE_STUDENT +
                                                "(" + StudentEntry.STUDENT_ID + " INTEGER," +
                                                      StudentEntry.STUDENT_FNAME + "VARCHAR," +
                                                      StudentEntry.STUDENT_LNAME + "VARCHAR," +
                                                      StudentEntry.COURSE_CODE + "VARCHAR, " +
                                                      "PRIMARY KEY (" + StudentEntry.STUDENT_ID + ", " + StudentEntry.COURSE_CODE + ")";

        final String SQL_CREATE_COURSE_TABLE = "CREATE TABLE IF NOT EXISTS " + StudentEntry.TABLE_COURSE +
                "(" + StudentEntry.COURSE_ID+ " INTEGER PRIMARY KEY," +
                      StudentEntry.COURSE_NAME + "VARCHAR)";


        db.execSQL(SQL_CREATE_STUDENT_TABLE);
        db.execSQL(SQL_CREATE_COURSE_TABLE);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
      //db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}

package com.example.mike.courseval;

import android.provider.BaseColumns;



/* Contract class */
public class StudentEntry implements BaseColumns {

    //table names
    public static final String TABLE_STUDENT = "student";

    public static final String TABLE_COURSE = "course";


    //Student table
    public static final String _ID = "id";

    public static final String STUDENT_ID = "student_id";

    public static final String STUDENT_FNAME = "fname";

    public static final String STUDENT_LNAME = "lname";

    public static final String NUM_OF_COURSES = "numofcourses";

    public static final String COURSE_CODE = "course_code";

//    public static final String IS_DONE = "done";


    //Course table
    public static final String COURSE_ID = "course_id";

    public static final String COURSE_NAME = "course_name";

    public static final String IS_DONE = "done";

}

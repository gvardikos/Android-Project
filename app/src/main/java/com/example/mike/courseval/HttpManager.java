package com.example.mike.courseval;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class HttpManager {

    public static final String TAG = "HttpManager";


    //webservice to GET
    public static String getData(String uri) {

        BufferedReader reader = null;
        try {
            URL url = new URL(uri);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //with these two lines i read one line at a time
            StringBuilder sb = new StringBuilder();
            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null )
                sb.append(line + "\n");
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return "2";
                }
            }
        }
    }

}

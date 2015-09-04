package com.lifees.shopping;

import android.os.AsyncTask;

import org.apache.http.client.HttpClient;


/**
 * Created by cl8m on 9/4/2015.
 */
public class HttpData extends AsyncTask<String,Void,String>{

    private HttpClient httpClient;

    private String url;
    public HttpData(String url) {
        this.url =url;
    }

    @Override
    protected String doInBackground(String... strings) {

        return null;
    }
}

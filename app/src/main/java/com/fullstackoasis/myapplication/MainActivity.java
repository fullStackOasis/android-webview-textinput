package com.fullstackoasis.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = this.getApplicationContext();
        WebView myWebView = new WebView(applicationContext);
        setContentView(myWebView);
        myWebView.loadUrl("https://www.example.com");
        //setContentView(R.layout.activity_main);
    }
}

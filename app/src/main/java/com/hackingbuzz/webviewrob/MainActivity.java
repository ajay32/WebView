package com.hackingbuzz.webviewrob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView vv = (WebView) findViewById(R.id.webView);  //need Internet Permission

        vv.getSettings().setJavaScriptEnabled(true);  // for brower to work correctly we must enable JavaScript
        vv.setWebViewClient(new WebViewClient());  // it will create the kind of brower in our own App ..if you dont set it up...for opening google it will go to your phone browser
     //   vv.loadUrl("https://www.google.com");
        vv.loadData("<html><body><h1>THis is google Kind oF</h1><p>Its just a short Story</p></body></html>", " text/html" , "UTF-8");
    }
}

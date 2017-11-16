package com.student.taruc.lab31;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView webViewAbout = (WebView)findViewById(R.id.webViewAbout);
        webViewAbout.loadUrl("https://www.geforce.com/hardware/desktop-gpus/geforce-gtx-960/specifications");
    }
}

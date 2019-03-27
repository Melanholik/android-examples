package ru.forliho.p0321_simplebrowser;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BrowserActivity extends AppCompatActivity {

    WebView wvWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        wvWeb = (WebView) findViewById(R.id.wvWeb);
        Uri data = getIntent().getData();
        wvWeb.loadUrl(data.toString());

    }
}

package com.kashipro.ml.browsertry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Browser;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kashipro.ml.inappbrowser.LocalBrowser;

public class MainActivity extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LocalBrowser.setUrl(getApplicationContext(), "https://www.google.com").setUrlViewVisibility(false).start();

    }

    @Override
    public void onBackPressed() {
        webview.goBack();
    }
}

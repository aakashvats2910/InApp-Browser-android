package com.kashipro.ml.inappbrowser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

public class BrowserActivity extends AppCompatActivity {

    private WebView mWebView;
    private Toolbar mTopBar;
    private TextView mUrlView;
    private ProgressBar mWebProgress;
    private String mUrl;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        mWebView = findViewById(R.id.web_view);
        mTopBar = findViewById(R.id.top_bar);
        mUrlView = findViewById(R.id.url_view);
        mWebProgress = findViewById(R.id.web_progress);

        if (getIntent().hasExtra("url")) {
            mUrl = getIntent().getStringExtra("url");
        }

        if (getIntent().hasExtra("urlVisibility")) {
            boolean bool = getIntent().getBooleanExtra("urlVisibility", true);
            if (!bool)
                mTopBar.setVisibility(View.GONE);
        }

        mWebView.setWebViewClient(new WebViewClient());
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        mWebView.loadUrl(mUrl);

        mUrlView.setText(mUrl);

        // Starting the listener for the progress.
        mWebView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                mWebProgress.setProgress(newProgress);
            }
        });

    }
}

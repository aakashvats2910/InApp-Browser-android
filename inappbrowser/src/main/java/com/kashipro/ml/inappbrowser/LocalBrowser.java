package com.kashipro.ml.inappbrowser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class LocalBrowser {

    private LocalBrowser() {}

    private static Intent mIntent;
    private static Context context;

    public static LocalBrowser setUrl(Context context, String url) {
        LocalBrowser.context = context;
        mIntent = new Intent(context, BrowserActivity.class);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mIntent.putExtra("url", url);
        return new LocalBrowser();
    }

    public LocalBrowser setUrlViewVisibility(boolean visibility) {
        mIntent.putExtra("urlVisibility", visibility);
        return this;
    }

    public void start() {
        context.startActivity(mIntent);
    }

}

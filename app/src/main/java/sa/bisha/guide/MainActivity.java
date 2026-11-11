package sa.bisha.guide;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(android.graphics.Color.rgb(73,49,31));
        getWindow().setNavigationBarColor(android.graphics.Color.rgb(73,49,31));
        WebView web = new WebView(this);
        web.setBackgroundColor(android.graphics.Color.rgb(246,240,229));
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setDatabaseEnabled(true);
        web.setWebViewClient(new WebViewClient());
        setContentView(web);
        web.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed() {
        View v = getWindow().getDecorView();
        if (v instanceof WebView && ((WebView)v).canGoBack()) ((WebView)v).goBack();
        else super.onBackPressed();
    }
}

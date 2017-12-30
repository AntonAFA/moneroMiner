package com.miner.videominer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kaltura.playersdk.KPPlayerConfig;
import com.kaltura.playersdk.PlayerViewController;

public class VideoActivity extends AppCompatActivity {

    private WebView mMiningWebview;
    PlayerViewController mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_video);

        findViews();
        setMiningWebView();
        initKaltruaPlayer();
    }

    private void initKaltruaPlayer() {
        mPlayer.loadPlayerIntoActivity(this);
        KPPlayerConfig config = new KPPlayerConfig("http://cdnapi.kaltura.com", "26698911", "1831271");
        config.setEntryId("1_o426d3i4");
        mPlayer.initWithConfiguration(config);
    }

    private void setMiningWebView() {
//        String newUA = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
//        mMiningWebview.getSettings().setUserAgentString(newUA);
        mMiningWebview.getSettings().setJavaScriptEnabled(true);
        mMiningWebview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        mMiningWebview.setFocusable(true);
        mMiningWebview.setFocusableInTouchMode(true);
        mMiningWebview.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        mMiningWebview.getSettings().setDomStorageEnabled(true);
        mMiningWebview.getSettings().setDatabaseEnabled(true);
        mMiningWebview.getSettings().setAppCacheEnabled(true);
        mMiningWebview.setWebViewClient(new WebViewClient());
        mMiningWebview.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Log.v("mining", consoleMessage.message());
                return super.onConsoleMessage(consoleMessage);
            }
        });
        mMiningWebview.loadUrl("file:///android_asset/miner.html");
    }

    private void findViews() {
        mMiningWebview = findViewById(R.id.miningWebview);
        mPlayer = findViewById(R.id.player);
    }
}
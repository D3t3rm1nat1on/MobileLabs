package com.mirea.chekushin.mireaproject.ui.browser;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.mirea.chekushin.mireaproject.AppPreference;
import com.mirea.chekushin.mireaproject.R;

import static com.mirea.chekushin.mireaproject.AppPreference.*;
import static com.mirea.chekushin.mireaproject.AppPreference.Preferences.*;

public class BrowserFragment extends Fragment {

    WebView web;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.browser_fragment, container, false);
        web = root.findViewById(R.id.ww);
        web.setWebViewClient(new WebViewClient());
        String uri = getPreference(BROWSER_SEARCH);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        Uri data = intent.getData();
        web.loadUrl(data.toString());
        return root;
    }

}
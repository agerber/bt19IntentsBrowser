package edu.uchicago.cs.gerber.cats;

import java.net.MalformedURLException;
import java.net.URL;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyBroswerActivity extends Activity {
	WebView web;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.browser);
		web = (WebView) findViewById(R.id.web);
		
		
		Bundle bnd = getIntent().getExtras();
		
//        Intent itn = new Intent(Intent.ACTION_WEB_SEARCH );
//        itn.putExtra(SearchManager.QUERY, "http://www.google.com/");
//        startActivity(itn);
		//bnd.getString(SearchManager.QUERY);

	//	Uri uri = getIntent().getData();
		

		web.getSettings().setJavaScriptEnabled(true);
		web.setWebViewClient(new WebViewClient());
		web.loadUrl(bnd.getString(SearchManager.QUERY));
		
		
	}

}
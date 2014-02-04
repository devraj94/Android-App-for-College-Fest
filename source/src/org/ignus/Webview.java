package org.ignus;

import org.ignus.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;
 
public class Webview extends Activity {
 
	private WebView webView;
    Context mycontext=null;
    Thread thread=null;
    TextView txt=null;
    
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
       mycontext=this.getApplicationContext();
 	  Bundle incoming=this.getIntent().getExtras();
 	  txt=(TextView)findViewById(R.id.webview_text);
 	  txt.setText("Loading... \n Please Wait");
 	  String url=incoming.getString("url").toString();
 	  thread = new Thread()
		{
		    @Override
		    public void run() {
		        try {
		            	 sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		    }

		};
		webView = (WebView) findViewById(R.id.webview1);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl(url);
 
		webView.setWebViewClient(new WebViewClient(){
			public void onPageFinished(WebView view, String url) {
			

				txt.setText("THANK YOU! \n Action Completed Successfully.");
				thread.start();
				
			     Intent myintent=new Intent(mycontext,Ignus_main.class);
			     startActivity(myintent);
			     Webview.this.finish();

			    }
		});
	}
	
 
}
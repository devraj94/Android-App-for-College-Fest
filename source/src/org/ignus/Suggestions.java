package org.ignus;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.ignus.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.SQLException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Suggestions extends Activity{

	static Context myContext=null;
	String email,name,suggestion=null;
	EditText email1,name1,sugg1=null;
	Button go=null;
	Suggestions a=null;
	String greeting="";

	AlertDialog.Builder adb=null;
	AlertDialog ad=null;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.suggestions_layout);
		myContext=this.getApplicationContext();
		email1=(EditText)findViewById(R.id.email_suggestions);
		name1=(EditText)findViewById(R.id.name_suggestions);
		sugg1=(EditText)findViewById(R.id.suggestion_suggestions);
		go=(Button)findViewById(R.id.button_suggestions);
		a=this;
		setProgressBarVisibility(false);
		go.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setProgressBarVisibility(true);
				email=email1.getText().toString();
				name=name1.getText().toString();
				suggestion=sugg1.getText().toString();
				if(email!=null && name!=null && suggestion!=null){
					 new DWB(a).execute("http://home.iitj.ac.in/~kuchanamaharsh/bus_app/inst_1.txt");
					 
					 
						   
				  
				
				}else{
					  greeting="Please Enter all The Credentials";
				  }
				}
		});
		
	/*	adb=new AlertDialog.Builder(this);
		adb.setCancelable(false);
		adb.setNeutralButton("Close", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface di, int id) {
				// TODO Auto-generated method stub
				ad.dismiss();
				if(greeting.compareTo("Please Enter all The Credentials")==0){
				Intent myintent=new Intent(a,Ignus_main.class);
				startActivity(myintent);
				}
			}
		});
		View dialog_layout = getLayoutInflater().inflate(R.layout.suggestions_alert_layout, null);
		TextView asd=(TextView)findViewById(R.id.greeting_suggestion);
		asd.setText(greeting);
		adb.setView(dialog_layout);
		ad=adb.create();
		ad.setTitle("Report :"); */
		
	}
	
	public void endactivity(){
		 
		 Intent myintent=new Intent(myContext,Webview.class);
		 myintent.putExtra("url", "http://ignus.org/suggestions.php?email="+email+"&name="+name+"&suggestion="+suggestion);
		 
		 startActivity(myintent);
	}
	
}

class DWB extends AsyncTask<String, Void, String> {

    Context myContext= Suggestions.myContext;
    Suggestions j=null;
    DWB(Suggestions m){
    	j=m;
    }
  
    
    
    @Override
    protected String doInBackground(String... urls) {
          
        return downloadUrl(urls[0]);
    }
    private String downloadUrl(String myUrl) {
		// TODO Auto-generated method stub
    	if(hasActiveInternetConnection(myContext)==true){
			try {
			    String str = "";
			    final URL url = new URL("http://ignus.org/suggestions.php?email="+j.email+"&name="+j.name+"&suggestion="+j.suggestion);
                try {
                	URLConnection connection=(URLConnection)url.openConnection();
                	connection.connect();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
              
			} catch (MalformedURLException e1) {
			}
	    	
	    	
		}
		return "";
	}
	// onPostExecute displays the results of the AsyncTask.
    @Override
    protected void onPostExecute(String result) {

    	j.greeting="Thanks for your Valuable Suggestion";
    	j.endactivity();
   }
    
    public static boolean hasActiveInternetConnection(Context myContext) {
	    if (isNetworkAvailable(myContext)) {
	        try {
	            HttpURLConnection urlc = (HttpURLConnection) (new URL("http://home.iitj.ac.in/~kuchanamaharsh/bus_app/").openConnection());
	            urlc.setRequestProperty("User-Agent", "Test");
	            urlc.setRequestProperty("Connection", "close");
	            urlc.setConnectTimeout(1500); 
	            urlc.connect();
	            return (urlc.getResponseCode() == 200);
	        } catch (IOException e) {
	        }
	    } else {
	    }
	    return false;
	}
	
	private static boolean isNetworkAvailable(Context myContext) {
	    ConnectivityManager connectivityManager = (ConnectivityManager) myContext.getSystemService(Context.CONNECTIVITY_SERVICE);
	    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
	    return activeNetworkInfo != null;
	} 
	
} 

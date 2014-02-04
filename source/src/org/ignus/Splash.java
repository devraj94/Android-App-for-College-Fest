package org.ignus;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.ignus.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Splash extends Activity{

	ImageView ignus_name=null;
	static Context myContext=null;
	TextView text,update_text=null;
	Animation anim2=null;
	int flag=0;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_layout);
		myContext=this.getApplicationContext();
		ignus_name=(ImageView)findViewById(R.id.ignus_splash_pic); 
		Animation anim1=AnimationUtils.loadAnimation(myContext, R.anim.splash_anim);
		 anim2=AnimationUtils.loadAnimation(myContext, R.anim.splash_anim_2);
		ignus_name.startAnimation(anim2); 
		text=(TextView)findViewById(R.id.iitj_text);
		update_text=(TextView)findViewById(R.id.update_text);
		text.startAnimation(anim1);
		Toast.makeText(myContext, "You need active net connection for an update...", Toast.LENGTH_LONG).show();
		setProgressBarVisibility(true);
		new DownloadWebpageTask(this).execute("http://home.iitj.ac.in/~kuchanamaharsh/bus_app/inst_1.txt");

		anim2.setAnimationListener(new AnimationListener(){
			@Override
			public void onAnimationEnd(Animation animation) {
				update_text.setText("Updating...");
					if(flag==1){
						Intent myIntent=new Intent(myContext,Ignus_main.class);
						startActivity(myIntent);
						Splash.this.finish();
					}
				
				}

			@Override
			public void onAnimationRepeat(Animation arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onAnimationStart(Animation arg0) {
				// TODO Auto-generated method stub
				
			}
		}); 
	}
	
	public void endactivity(){
		flag=1;
		if(anim2.hasEnded()){
			Intent myIntent=new Intent(myContext,Ignus_main.class);
			startActivity(myIntent);
			Splash.this.finish();
		}
	}
}

class DownloadWebpageTask extends AsyncTask<String, Void, String> {

    Context myContext= Splash.myContext;
    Splash j=null;
    DownloadWebpageTask(Splash m){
    	j=m;
    }
  
    
    
    @Override
    protected String doInBackground(String... urls) {
          
        return downloadUrl(urls[0]);
    }
    private String downloadUrl(String myUrl) {
		// TODO Auto-generated method stub
    	if(hasActiveInternetConnection(myContext)==true){
			String text ="";
            FileOutputStream fos=null;
            DataOutputStream dos=null;
			try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/cult.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("cult.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/cult1.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("cult1.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/cult2.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("cult2.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/cult3.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("cult3.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/cult4.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("cult4.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/tech.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("tech.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/tech1.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("tech1.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/tech2.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("tech2.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/tech3.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("tech3.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/tech4.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("tech4.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/prakriti.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("prakriti.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/day1.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("day1.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/day2.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("day2.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/day3.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("day3.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/day4.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("day4.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	try {
			    String str = "";
			    URL url = new URL("http://home.iitj.ac.in/~kuchanamaharsh/ignus/Livefeed.txt");

			    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			    while ((str = in.readLine()) != null) {
			         text=text+str+"\n";
			    }
			    try{
			    	fos=myContext.openFileOutput("Livefeed.txt", myContext.MODE_PRIVATE);
			    	dos=new DataOutputStream(fos);
			    	dos.write(text.getBytes());
			    	dos.close();
			    	}catch(IOException ioe){
			    	}
			    in.close();
			} catch (MalformedURLException e1) {
			} catch (IOException e) {
			}
	    	text="";
	    	
	    	
		}
		return "";
	}
	// onPostExecute displays the results of the AsyncTask.
    @Override
    protected void onPostExecute(String result) {

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

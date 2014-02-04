package org.ignus;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.ignus.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Register extends Activity{
	
	AutoCompleteTextView eventname=null;
	EditText username,password,number=null;
	ImageView img=null;
	Button go=null;
	String user_name,pass,event_name,greeting="";
	int number_1=0;
	Register a=null;
	static Context myContext=null;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register_layout);
		 myContext=this.getApplicationContext();
		 img = (ImageView)findViewById(R.id.sponsors_anim_register);
		 img.setBackgroundResource(R.drawable.sponsors_animation);
        a=this;
        Toast.makeText(myContext, "Should be Registered for IGNUS 2014 through ignus.org", Toast.LENGTH_SHORT).show();
		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
		 frameAnimation.start();
		username = (EditText) findViewById(R.id.register_user);
		password = (EditText) findViewById(R.id.register_password);
		number = (EditText) findViewById(R.id.register_no_of_part);
		go=(Button)findViewById(R.id.register_go_button);
		String event[]=new String[]{"Mega Quiz","Tech Expo","Creative Writing","Ad-ology","Duo Dance","Singing Icon","Bol Vachan","Robo War","Telescope Workshop","Chrome extension","Obfuscator","HURDLES","JAM","MELA QUIZ","GROUP DANCE","NUKKAD NATAK","PROXY THE CHEAT","SHASTROKTA","THE RANGER","WEB CRAFT","AURA","PUMP PUMP AWAY","Tell A Tale","AAKRITI","The Extinguisher","API","BOLT","Wooden Hawk","Sci-Tech Quiz","Duo Optimus","JAM","Kaagaz Aur Kalam","Lets make our own World","Nirmaan","Avishkar","Shout","Kavya Madhavan","Fun-O-Mania","Abhivyakti","On D Spot","Park","Ultimate Tic Tac Toe","Salamander","Prayas","Aagaz"};
		eventname = (AutoCompleteTextView) findViewById(R.id.register_event_name);
		ArrayAdapter<String> adapter_event = 
		        new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, event);
		eventname.setAdapter(adapter_event);
go.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setProgressBarVisibility(true);
				user_name=username.getText().toString();
				pass=password.getText().toString();
				event_name=eventname.getText().toString();
				number_1=Integer.parseInt(number.getText().toString());
				if(user_name!=null && pass!=null && event_name!=null && number_1!=0){
					 
					 Intent myintent=new Intent(myContext,Webview.class);
					 myintent.putExtra("url", "http://ignus.org/event_register_ignus14_app.php?igno="+user_name+"&number="+number_1+"&event="+event_name+"&pass="+pass);
					 
					 startActivity(myintent);
				  
				
				}else{
					  greeting="Please Enter all The Credentials";
				  }
				}
		});
		
	}
}

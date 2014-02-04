package org.ignus;

import java.util.List;

import org.ignus.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Ignus_main extends Activity {

	ImageView schedule,Results,livefeed,contact,img,register,suggestion,proshows,venuemap,sponsors=null;
	Context mycontext=null;
	AlertDialog.Builder adb=null;
	AlertDialog ad=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ignus_main);
		mycontext=getApplicationContext();
		schedule=(ImageView)findViewById(R.id.schedule_button_main);
		Results=(ImageView)findViewById(R.id.results_button_main);
		contact=(ImageView)findViewById(R.id.contacts_button_main);
		register=(ImageView)findViewById(R.id.register_button_main);
		livefeed=(ImageView)findViewById(R.id.livefeed_button_main);
		suggestion=(ImageView)findViewById(R.id.suggestions_button_main);
		sponsors=(ImageView)findViewById(R.id.sponsors_button_main);
		proshows=(ImageView)findViewById(R.id.proshows_button_main); 
		venuemap=(ImageView)findViewById(R.id.venuemap_button_main);
		 img = (ImageView)findViewById(R.id.sponsors_anim); 
		 img.setBackgroundResource(R.drawable.sponsors_animation);

		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		 frameAnimation.start();
		 
		
		 
		schedule.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent=new Intent(mycontext,Events.class);
				startActivity(myintent);
			}
		});
       Results.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent=new Intent(mycontext,Results.class);
				startActivity(myintent);
			}
		});
		contact.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent=new Intent(mycontext,Contacts.class);
				startActivity(myintent);
			}
		});
		
       register.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent=new Intent(mycontext,Register.class);
				startActivity(myintent);
			}
		});
       proshows.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent=new Intent(mycontext,Proshows.class);
				startActivity(myintent);
			}
		});
       sponsors.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent=new Intent(mycontext,Sponsors.class);
				startActivity(myintent);
			}
		});
       venuemap.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent=new Intent(mycontext,Venuemap.class);
				startActivity(myintent);
			}
		});
		 
        livefeed.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent=new Intent(mycontext,Livefeed.class);
				startActivity(myintent);
			}
		});
        
       suggestion.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent=new Intent(mycontext,Suggestions.class);
				startActivity(myintent);
			}
		});
		
		adb=new AlertDialog.Builder(this);
		adb.setCancelable(false);
		adb.setNeutralButton("Close", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface di, int id) {
				// TODO Auto-generated method stub
				ad.dismiss();
			}
		});
		View dialog_layout = getLayoutInflater().inflate(R.layout.alertdialog_layout, null);
		TextView a=(TextView)findViewById(R.id.app_name);
		TextView b=(TextView)findViewById(R.id.Version);
		TextView c=(TextView)findViewById(R.id.credits);
		TextView d=(TextView)findViewById(R.id.name1);
		TextView e=(TextView)findViewById(R.id.name2);
		adb.setView(dialog_layout);
		ad=adb.create();
		ad.setTitle("About :");
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ignus_main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	public boolean onOptionsItemSelected(MenuItem mi){
		if(mi.getItemId()==R.id.about){
			ad.show();
			return true;
		}
		if(mi.getItemId()==R.id.update){
			Intent intent=new Intent(this,Splash.class);
			startActivity(intent);
			this.finish();
			return true;
		}
	return true;
	}
	
}
